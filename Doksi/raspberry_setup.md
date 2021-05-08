# Tartalomjegyzék

0. [Hardware ismertető](#Hardware-ismertető)
1. [Rendszer telepítés](#Rendszer-install)
2. [Szükséges szoftverek telepítése](#Egyéb-szoftverek)
3. [Tomcat8 telepítés / konfigurálás](#Apache-Tomcat8-config)
4. [Adatbázis telepítés / konfigurálás](#Database-Config)

# Hardware ismertető

A Raspberry Pi egy bankkártya méretű, egyetlen áramköri lapra/kártyára integrált BCM2835 alapú egykártyás számítógép, amelyet az Egyesült Királyságban fejlesztettek oktatási célokra. A gép különböző Linux-disztribúciókkal működtethető, illetve elérhető egy RISC OS verzió is. Az eredeti két változat (A és B) kiadása óta már több továbbfejlesztése is kiadásra került. Az eredeti A változat nem rendelkezik Ethernet csatolóval, csak egy USB portja volt és a rendszer memóriája 256 MB. A B modell 2 db USB porttal, 512 MB memóriával és integrált Ethernet csatolóval rendelkezett. A hivatalosan ajánlott operációs rendszer a laphoz a Raspbian, ami a Debian Linux kifejezetten Raspberry Pi-re optimalizált változata. A Sony cégnek a welsi Pencoedban működő üzeme gyártja. Következő modellje a Raspberry Pi 4 Model B, amely 2019. június 24-én jelent meg. Ez 1,5 GHz-es, 64 bites, négymagos ARM A72 processzorral, integrált WiFi-vel és Bluetooth 5-tel, USB 3 csatlakozóval és 4K-s dupla HDMI monitor csatlakozóval rendelkezik. A Pi 4 az első modell, amely különböző nagyságú RAM-mal szerelve, háromféle változatban (1, 2 és 4 GB) volt elérhető a kiadása idején. Az 1 GB-os változatot később kivezették a piacról. 2020. május 28-án megjelent a 8 GB-os verzió.
<img src="https://www.piday.org/wp-content/uploads/2018/09/word-image-2.png" alt="Bitcoin"/>
# Rendszer install

Telepítsük a Raspberry Pi Imager legújabb verzióját. Ez letölthető innen: [Raspberry Pi Imager letöltése](https://www.raspberrypi.org/software/)
<img src="https://www.raspberrypi.org/homepage-9df4b/static/md-82e922d180736055661b2b9df176700c.png" alt="Bitcoin"/>
Megfelelő rendszer és sd kártya kiválasztása után autómatikusan formáz és megírja a bootolható adathordozót. Esetünkben: "Raspberry Pi OS Lite" mivel nincs szükség asztali környezetre.

# Egyéb szoftverek
Update:
~~~
    sudo apt-get update
~~~
SSH távoli eléréshez (ha nincs fent alapból):
~~~
    sudo apt-get install ssh
    sudo systemctl daemon-reload
    sudo systemctl ssh start
    sudo systemctl ssh enable
~~~
Az installálás sikerességét ellenőrizhetjük:
~~~
    service ssh status
~~~
Java JDK:
~~~
    sudo apt-get install default jdk -y
~~~

## Apache Tomcat8 config

Létrehozunk a tomcat számára egy felhasználót, adunk neki egy mappát
~~~
    sudo groupadd tomcat
    sudo useradd -s /bin/false -g tomcat -d /opt/tomcat tomcat
~~~
Ha nincs curl az alaprendszeren:
~~~
    sudo apt-get install curl -y
~~~
Telepítjünk a tomcat szoftverét curl segítségével
~~~
    cd /tmp
    curl -O https://downloads.apache.org/tomcat/tomcat-8/v8.5.65/bin/apache-tomcat-8.5.65.tar.gz
    sudo mkdir /opt/tomcat
    sudo tar xzvf apache-tomcat-8*tar.gz -C /opt/tomcat --strip-components=1
~~~
Beállítjuk a jogosultságokat
~~~
    cd /opt/tomcat
    sudo chgrp -R tomcat /opt/tomcat
    sudo chmod -R g+r conf
    sudo chmod g+x conf
    sudo chown -R tomcat webapps/ work/ temp/ logs/
~~~

Megkeressük a java könyvtárat, és másoljuk az outputját
~~~
    sudo update-java-alternatives -l
~~~
Esetünkben az output
~~~
    /usr/lib/jvm/java-1.8.0-openjdk-amd64
~~~
Majd kiegészítjük prefix és suffixxel:
~~~
    Enviroment=/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre
~~~
Szerkesztjünk a tomcat service konfigját
~~~
    sudo nano /etc/systemd/system/tomcat.service
~~~
Használjunk az alábbi configot (megfelelő helyre beillesztjük a konfig részletet):
~~~
    [Unit]
    Description=Apache Tomcat Web Application Container
    After=network.target
    
    [Service]
    Type=forking
    
    Environment=JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre
    Environment=CATALINA_PID=/opt/tomcat/temp/tomcat.pid
    Environment=CATALINA_HOME=/opt/tomcat
    Environment=CATALINA_BASE=/opt/tomcat
    Environment='CATALINA_OPTS=-Xms512M -Xmx1024M -server -XX:+UseParallelGC'
    Environment='JAVA_OPTS=-Djava.awt.headless=true -Djava.security.egd=file:/dev/./urandom'
    
    ExecStart=/opt/tomcat/bin/startup.sh
    ExecStop=/opt/tomcat/bin/shutdown.sh
    
    User=tomcat
    Group=tomcat
    UMask=0007
    RestartSec=10
    Restart=always
    
    [Install]
    WantedBy=multi-user.target
~~~

Majd újraindítjuk a szolgáltatást
~~~
    sudo systemctl daemon-reload
    sudo systemctl start tomcat
    sudo systemctl status tomcat
~~~

Ezután a [http://localhost:8080](http://localhost:8080) keresztül ellenőrizhetjük hogy elindult-e a szolgáltatás