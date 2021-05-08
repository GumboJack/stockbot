# Rendszerterv
- [Rendszerterv](#rendszerterv)
  - [1. A rendszer célja](#1-a-rendszer-célja)
  - [2. Projektterv](#2-projektterv)
    - [2.1 Projektszerepkörök, felelősségek](#21-projektszerepkörök-felelősségek)
    - [2.2 Projektmunkások és felelősségeik](#22-projektmunkások-és-felelősségeik)
    - [2.3 Ütemterv](#23-ütemterv)
    - [2.4 Mérföldkövek](#24-mérföldkövek)
  - [3. Üzleti folyamatok modellje](#3-üzleti-folyamatok-modellje)
    - [3.1 Üzleti szereplők](#31-Üzleti-szereplők)
    - [3.2 Üzleti folyamatok](#32-Üzleti-folyamatok)
    - [3.3 Üzleti entitások](#33-Üzleti-entitások)
 
  - [4. Követelmények](#4-követelmények)
    - [4.1 Funkcionális követelmények](#41-funkcionális-követelmények)
    - [4.2 Nemfunkcionális követelmények](#42-nemfunkcionális-követelmények)
    - [4.3 Törvényi előírások, szabványok](#43-törvényi-előírások-szabványok)
  - [5. Funkcionális terv](#5-funkcionális-terv)
  - [6. Fizikai környezet](#6-fizikai-környezet)
    - [6.1 Vásárolt softwarekomponensek és külső rendszerek](#61-vásárolt-softwarekomponensek-és-külső-rendszerek)
    - [6.2 Hardver és hálózati topológia](#62-hardver-és-hálózati-topológia)
    - [6.3 Fizikai alrendszerek](#63-fizikai-alrendszerek)
    - [6.4 Fejlesztői eszközök](#64-fejlesztői-eszközök)
  - [7. Architekturális terv](#7-architekturális-terv)
    - [7.1 Az alkalmazás rétegei, fő komponensei, ezek kapcsolatai](#71-az-alkalmazás-rétegei-fő-komponensei-ezek-kapcsolatai)
      - [Lunarcrush API](#lunarcrush-api)
      - [Tomcat server](#tomcat-server)
      - [PostgreSQL adatbázis](#postgresql-adatbázis)
      - [Frontend](#frontend)
    - [7.3 Változások kezelése](#73-változások-kezelése)
  - [8. Adatbázis terv](#8-adatbázis-terv)
  - [9. Implementációs terv:](#9-implementációs-terv)

## 1. A rendszer célja
A projekt célja egy olyan kereskedő bot megalkotása, aminek segítségével profitot termelhetünk minimális kockázattal.

## 2. Projektterv

### 2.1 Projektszerepkörök, felelősségek
Scrum master: Lőrincz Marcell

Feladata állandó kommunikáció a csapat tagjaival, a különböző tevékenységek összehangolása,a sprint időszakán belül a napi
és leendő feladatok átbeszélése, akadályok (impediment) feltárása, lehetőség szerinti elhárítása.

Product owner: Andrási Norbert
A megrendelő szerepét tölti be, ő a felelős azért, hogy a csapat mindig azt a részét fejlessze a terméknek, amely éppen a legfontosabb, vagyis a felhasználói sztorik fontossági sorrendbe állítása a feladata a Product Backlog-ban. A Product Owner és a Scrum Master nem lehet ugyanaz a személy.

Csapat (team) : Szelei Attila, Eszényi Tamás, Bakos Martin
Aktuális sprintre bevállalt feladatokat elvégezzék

### 2.2 Projektmunkások és felelősségeik
Frontend:
- Lőrincz Marcell
- Andrási Norbert
- Szelei Attila
- Eszényi Tamás
- Bakos Martin

Felhasználói felület,

Backend:
- Lőrincz Marcell
- Andrási Norbert
- Szelei Attila
- Eszényi Tamás
- Bakos Martin

Adatbázis kapcsolat, API hivás

Tesztelés:
- Lőrincz Marcell
- Andrási Norbert
- Szelei Attila
- Eszényi Tamás
- Bakos Martin

Esetleges hibák detektálása, kijavítása

### 2.3 Ütemterv
|Funkció / Story          | Feladat / Task           | Prioritás | Becslés | Aktuális becslés | Elteltidő | Hátralévő idő |
|-------------------------|--------------------------|-----------|---------|------------------|-----------|---------------|
|Követelmény specifikáció |                          |         1 |       9 |                6 |         9 |             0 |
|Funkcionális specifikáció|                          |         1 |       8 |                6 |         8 |             0 |
|Rendszerterv             |                          |         1 |      11 |                8 |        10 |             1 |
|Webszerver               |apache2 TOMCAT impl       |         1 |       3 |                4 |         4 |             0 |
|Adattárolás              |Adatmodell megtervezése   |         1 |       1 |                1 |         1 |             0 |
|Adattárolás              |PostgreSQL                |         1 |       2 |                4 |         3 |             1 |
|Adatbázis kapcsolat      |Hibernate                 |         1 |       3 |                5 |         5 |             0 |
|API hívás                |LUNARCRUSH                |         1 |       3 |                3 |         0 |             3 |
|Website                  |Képernyőtervek elkészítése|         2 |       8 |                5 |         0 |             8 |
|Program                  |Tesztelés                 |         2 |      16 |               11 |         0 |            11 |

### 2.4 Mérföldkövek

- A prototípus bemutatása
- Az elkészült szoftver átadása

## 3. Üzleti folyamatok modellje

### 3.1 Üzleti szereplők
A rendszert egy user fogja futtatni ahol egy kriptovaluta kereskedő bot fogja adni/venni a valutákat, bizonyos stratégiák szerint.

### 3.2 Üzleti folyamatok
A fejlesztői környezet IntelliJ IDEA, amiben történik az **API** hivás. Lunarcrush API használunk.
- A LunarCRUSH egy közösségi figyelő platform, amely segít a kriptovaluta   befektetőknek megérteni a több mint 2000 kriptovaluta valódi értékét.

**Adatbázis** az adatokat PostgreSQL-ben tároljuk hibernate segítségével.
Minden egyes új kriptovalutához külön tábla generálódik (pl. Bitcoin_data). 

-   A Hibernate egy objektum-relációs leképezést (ORM) megvalósító programkönyvtár Java platformra (a Hibernate-nek létezik egy .NET platformra szánt verziója is NHibernate néven). Segítségével osztályokat és a relációs adatbázisok tábláit tudjuk egymásba leképezni, az adatbázisban lévő rekordokat objektumokként kezelhetjük, és az objektumainkat egyszerűen tárolhatjuk állapotmegőrző módon adattáblákban. A Hibernate egy adatlekérdező nyelvet is biztosít (HQL - Hibernate Query Language), melynek segítségével adatbázis-kezelő rendszerek között hordozható lekérdezéseket írhatunk (ugyanakkor támogatja a natív SQL lekérdezések írását is)

Tomcat **Webszervert** használunk. 
-   Az Apache Tomcat egy tisztán Java nyelven készült webszerver, amely implementálja a Sun-féle Java Servlet és a JavaServer Pages specifikációkat
 

### 3.3 Üzleti entitások 
-   Kriptovaluta

## 4. Követelmények

### 4.1 Funkcionális követelmények

ID |Verzió|Név                          |Kifejtés
---|------|-----------------------------|--------
K01|V1.0  |API hívás                    |A program meghívja bizonyos időnként a Lunarcrush API-t. 
K01|V1.0  |Adatok tárolása              |Az API álltal szolgáltatott adatokat, egy adatbázisban el kell tárolni (PostgreSQL). 
K01|V1.0  |consolos megjelenítés        |apihívások eredményei, mikor, milyen adatokat kér le az API-tól logolja a consolra.
K01|V1.0  |Adatmegjelenítés webfelületen|Chart segítségével diagramm megjelenítés az idő és a profit függvényében. 

### 4.2 Nemfunkcionális követelmények

* Termék követelmények
    * Használhatósági követelmények: A fejlesztésre kerülő szoftver könnyen tanulható és használható, minimális informatikai tudással is alkalmazható. 
    * Megbízhatósági követelmények: A kialakítandó szisztéma statisztikái webes felületen keresztül érhetőek el, maga a program háttérben fut.
    * Hatékonysági követelmények:
      * Teljesítmény követelmények: A rendszert egyidőben használók létszáma a bevezetést követő néhány hónapban előreláthatólag nem haladja meg az egy főt. A jól skálázhatóság következtében ennél jóval nagyobb létszám kiszolgálására is alkalmas a struktúra. 
      * Méret követelmények: A szoftver mérete nem haladja meg az 200 MB-ot.
    * Hordozhatósági követelmények: Amennyiben a rendszer fizikai környezete megváltozik, pl. hardverfejlesztés, bővítés zajlik, a rendszer az új környezetben is felhasználható lesz.
    
  * Szervezeti követelmények
    * Szállítási követelmények: A szoftver a szerződésben meghatározott időpontig kerül átadásra, ellenkező esetben a szerződésben található kötbér illeti meg a megrendelőt.
    * Implementációs követelmények: A program a szerződésben meghatározott gépekre kerül telepítésre.
    * Szabványügyi követelmények: A vonatkozó szabványügyi kritériumok Törvényi előírások, a szabványok fejezetben találhatók.
      
  * Külső követelmények
    * Együttműködési követelmények: A szoftverfejlesztő cég szakemberei és a megrendelő közötti kapcsolattartást a szerződésben meghatározott személyek végzik. Szükség esetén mindkét oldalról bevonnak további szakembereket az együttműködés optimalizálása céljából.
    * Etikai követelmények: A szoftverfejlesztő cég munkatársainak a jóváhagyott etikai kódex alapján kell viselkedniük.
    * Jogi követelmények:
      * Titokvédelmi követelmények: E téren a törvényi előírások az irányadók. A program semmiféle személyes vagy statisztikai adatot nem gyűjt, így azok nem kerülhetnek harmadik félhez. A fejlesztő cég munkatársai vállalják, hogy a sikeres átadás átvételt követően a nem üzleti jellegű adatokat megsemmisítik.

### 4.3 Törvényi előírások, szabványok

Szerzői jogi törvény (1999. évi LXXVI. törvény; röviden: Szjt.), illetve a 

* A 2016. évi XCIII. törvény A szerzői jogok és a szerzőijoghoz kapcsolódó jogok közös kezeléséről  

* A 2018. évi LIV. törvény az üzleti titok védelméről

* A 2015. évi CCXXII. törvény az elektronikus ügyintézés és a bizalmi szolgáltatások általános szabályairól

* A 1995. évi LXVI. törvény a köziratokról, a közlevéltárakról és a magánlevéltári anyag védelméről

* A 73/2018. (IV. 20.) Korm. rendelet a helyi közszolgáltatás információs rendszerről

* A 187/2015. (VII. 13.) Korm. rendelet az elektronikus információs rendszerek biztonsági felügyeletét ellátó hatóságok, valamint az információbiztonsági felügyelő feladat- és hatásköréről, továbbá a zárt célú elektronikus információs rendszerek meghatározásáról

* Az ISO / IEC 12207 a nemzetközi szabvány, amely tartalmazza a szoftver életciklusának kiválasztási, bevezetési és ellenőrzési módszerét.

* Az ISO 9000 leírja a termékek előállításának hivatalosan szervezett folyamatát, valamint az előrehaladás irányításának és nyomon követésének módszereit.

* Az ISO / IEC 24744 szoftverfejlesztés - Metamodel for Development Methodologies, egy Powertype-alapú metamodell szoftverfejlesztési módszertanhoz.

* ISO / IEC 15504 Információs technológia — folyamatértékelés, más néven a szoftverfolyamat-fejlesztési képesség meghatározása (SPICE), "a szoftverfolyamatok értékelésének kerete".

## 5. Funkcionális terv

## 6. Fizikai környezet

### 6.1 Vásárolt softwarekomponensek és külső rendszerek
Szoftverkomponensek vásárlása nem szükséges.

### 6.2 Hardver és hálózati topológia
- Az alkalmazás webes technológiákon alapszik
- API hivások segítségével tölti fel az adatbázist
- Az adatbázisban tárolt adatok és a megadott kereskedési stratégiák segítségével kriptovalutákat ad és vesz
- Az adatbázisban tárolt adatokat webes felületen megjeleníti
- A végzett tevékenységekről visszajelzést ad (CLI)
### 6.3 Fizikai alrendszerek
- Lunarcrush API
- Webszerver (Tomcat)
- Adatbázis (PostgreSQL)
- Kliens gép (A web UI megjelenítésére alkalmas eszköz)
### 6.4 Fejlesztői eszközök
- IntelliJ IDEA
- PG Admin
## 7. Architekturális terv
 Egy külső API segítségével adatokat nyerünk a követett kriptovaluták árfolyam mozgásairól. Ezt egy adatbázisban tároljuk, ez alapján a bot kereskedik a szóban forgó valutákkal. A tárolt adatokat webes felületen megjeleníti, az árfolyam változások könnyű nyomonkövethetősége érdekében.
### 7.1 Az alkalmazás rétegei, fő komponensei, ezek kapcsolatai
#### Lunarcrush API
Ez egy külső API, ami bárkinek ingyenesen elérhető, és a legfontosabb kriptovaluták árfolyamairól lehet real time adatokat lekérni. Az árfolyam változásokon túl elérhetőek például olyan adatok is, mint hogy hány twitter/reddit emlitése volt adott időszakban a keresett kriptovalutának, ezáltal összetett döntések meghozatalára is alkalmas mesterséges intelligenciát használó bot kiszolgálására is alkalmas lehet.
#### Tomcat server
Az Apache Tomcat egy tisztán Java nyelven készült webszerver, amely implementálja a Sun-féle Java Servlet és a JavaServer Pages specifikációkat. E specifikációkat támogató webszervereket szokás a servlet container, a servlet engine illetve a web engine összetételekkel is illetni. Mivel tisztán java nyelvet használ a webszerver, így a bot funkcióit a backendbe építve meg tudjuk valósítani. Ez az egész alkalmazás központja, itt történik a kommunikáció a külső API-al, az adatbázissal és a frontendel is.
#### PostgreSQL adatbázis
Ez egy ingyenes és nyílt forráskódú relációs adatbázis, ami stabil és skálázható, és rendkívűl gördülékenyen működik együtt a Tomcat serverrel.
#### Frontend
A frontend JavaServer Pages (röviden JSP) felhasználásával lett kivitelezve. E technológia segítségével a szoftverfejlesztő dinamikusan tud generálni HTML, XML vagy egyéb dokumentumokat HTTP kérésekre reagálva. A JSP tekinthető a servlet réteg feletti absztrakciós szintnek. A JSP oldalból java servlet forráskód generálódik
### 7.3 Változások kezelése
Változás esetén mind a szerver mind a kliens oldalon szükséges módosítani a szoftvert annak érdekében, hogy továbbra is együtt tudjon működni a rendszer. Ha a változás nem érinti a szerver-kliens interfészt, például csak a felhasználói felületet kívánjuk módosítani, elegendő a kliens kódját változtatni.

## 8. Adatbázis terv
**Table** : ScopesCoin - *Amiket a bot megfigyel crypto valuták*

    mezők: 
      id(kulcs),
      név 
**Table** : CoinName_data - *Amikor bekerül egy coin az adatbázisba akkor egyből csinál egy táblát a röviditett nevével_data.*

    mezők:
      id(key),
      timestamp,
      price: $

## 9. Implementációs terv: