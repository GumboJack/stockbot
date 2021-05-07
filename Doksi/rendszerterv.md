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
||Funkció / Story | Feladat / Task | Prioritás | Becslés | Aktuális becslés | Elteltidő | Hátralévő idő ||
|-|---------------|----------------|-----------|---------|------------------|-----------|---------------|-|
||Követelmény specifikáció|        |         1 |      9  |               6  |        9  |             0 ||
||Funkcionális specifikáció|       |         1 |      8  |               6  |        8  |             0 ||
||Rendszerterv|                    |         1 |      11 |               8 |         10|             1 ||
||Webszerver|apache2 TOMCAT impl|       1 |       3 |                4 |         4 |             0 ||
||Adattárolás|Adatmodell megtervezése|       1 |       1 |                1 |         1 |             0 ||
||Adattárolás|PostgreSQL|       1 |       2 |                4 |         3 |             1 ||
||Adatbázis kapcsolat| Hibernate |             1 |       3 |                5 |         5 |             0 ||
||API hívás |LUNARCRUSH |1 |  3 |                3 |         0 |             3 ||
||Website|Képernyőtervek elkészítése|        2 |       8 |                5 |         0 |             8 ||
||Program|Tesztelés|                         2 |      16 |               11 |         0 |            11 ||

### 2.4 Mérföldkövek

- A prototipus bemutatása
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

### 4.2 Nemfunkcionális követelmények

### 4.3 Törvényi előírások, szabványok

## 5. Funkcionális terv

## 6. Fizikai környezet
### 6.1 Vásárolt softwarekomponensek és külső rendszerek
Szoftverkomponensek vásárlása nem szükséges.
### 6.2 Hardver és hálózati topológia
- Az alkalmazás webes technológiákon alapszik
- API hivások segitségével tölti fel az adatbázits
- Az adatbázisban tárolt adatok és a megadott kereskedési stratégiák segitségével kriptovalutákad ad és vesz
- Az adatbázisban tárolt adatokat webes felületen megjeleniti
- A végzett tevékenységekről visszajelzést ad (CLI)
### 6.3 Fizikai alrendszerek
- Lunarcrush API
- Webszerver (Tomcat)
- Adatbázis (PostgreSQL)
- Kliens gép (A web UI megjelenitésére alkalmas eszköz)
### 6.4 Fejlesztői eszközök
- IntelliJ IDEA
- PG Admin
## 7. Architekturális terv
 Egy külső API segitségével adatokat nyerünk a követett kriptovaluták árfolyam mozgásairól. Ezt egy adatbázisban tároljuk, ez alapján a bot kereskedik a szóban forgó valutákkal. A tárolt adatokat webes felületen megjeleniti, az árfolyam változások könnyű nyomonkövethetősége érdekében.
### 7.1 Az alkalmazás rétegei, fő komponensei, ezek kapcsolatai
#### Lunarcrush API
Ez egy külső API, ami bárkinek ingyenesen elérhető, és a legfontosabb kriptovaluták árfolyamairól lehet real time adatokat lekérni. Az árfolyam változásokon túl elérhetőek például olyan adatok is, mint hogy hány twitter/reddit emlitése volt adott időszakban a keresett kriptovalutának, ezáltal összetett döntések meghozatalára is alkalmas mesterséges intelligenciát hasnzáló bot kiszolgálására is alkalmas lehet.
#### Tomcat server
Az Apache Tomcat egy tisztán Java nyelven készült webszerver, amely implementálja a Sun-féle Java Servlet és a JavaServer Pages specifikációkat. E specifikációkat támogató webszervereket szokás a servlet container, a servlet engine illetve a web engine összetételekkel is illetni. Mivel tisztán java nyelvet használ a webszerver, igy a bot funkcióit a backendbe épitve meg tudjuk valósitani. Ez az egész alkalmazás központja, itt történik a kommunikáció a külső API-al, az adatbázissal és a frontendel is.
#### PostgreSQL adatbázis
Ez egy ingyenes és nyilt forráskodú relációs adatbázis, ami stabiul és skálázható, és rendkivül gördulenkenyen mukodik egyutt a tomcat serverrel.
#### Frontend
A frontend JavaServer Pages (röviden JSP) felhasználásával lett kivitelezve. E technológia segítségével a szoftverfejlesztő dinamikusan tud generálni HTML, XML vagy egyéb dokumentumokat HTTP kérésekre reagálva. A JSP tekinthető a servlet réteg feletti absztrakciós szintnek. A JSP oldalból java servlet forráskód generálódik
### 7.3 Változások kezelése
Változás esetén mind a szerver mind a kliens oldalon szükséges módosítani a szoftvert annak érdekében, hogy továbbra is együtt tudjon működni a rendszer. Ha a változás nem érinti a szerver-kliens interfészt, például csak a felhasználói felületet kívánjuk módosítani, elegendő a kliens kódját változtatni.

## 8. Adatbázis terv
**Table** : ScopesCoin - *Amiket a bot megfigyel crypto valuták*

    mezők: 
      id(kulcs),
      név 
**Table** : CoinName_data - *Amikor bekerül egy coin az adatbáziba akkor egyből csinál egy táblát a röviditett nevével_data.*

    mezők:
      id(key),
      timestamp,
      price: $

## 9. Implementációs terv: