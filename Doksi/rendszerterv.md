# Rendszerterv
- [Rendszerterv](#rendszerterv)
  - [1. A rendszer célja](#1-a-rendszer-célja)
  - [2. Projektterv](#2-projektterv)
    - [2.1 Projektszerepkörök, felelősségek](#21-projektszerepkörök-felelősségek)
    - [2.2 Projektmunkások és felelősségeik](#22-projektmunkások-és-felelősségeik)
    - [2.3 Ütemterv](#23-ütemterv)
    - [2.4 Mérföldkövek](#24-mérföldkövek)
  - [3. Üzleti folyamatok modellje](#3-üzleti-folyamatok-modellje)
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
||Követelmény specifikáció|        |         0 |      6  |               6  |        6  |             0 ||
||Funkcionális specifikáció|       |         0 |      6  |               5  |        6  |             0 ||
||Rendszerterv|                    |           |      11 |               11 |         12|             2 ||
||Adattárolás|Adatmodell megtervezése|       0 |       3 |                4 |         4 |             4 ||
||Website|Adatbázis létrehozása|             2 |       7 |                6 |         0 |             5 ||
||Adattárolás|Hibernate|1 |  1 |                1 |         0 |             1 ||
||API hívás |LUNARCRUSH |1 |  1 |                1 |         0 |             1 ||
||Website|Képernyőtervek elkészítése|        2 |       8 |                3 |         0 |             8 ||
||Program|Tesztelés|                         2 |      16 |               11 |         0 |            16 ||

### 2.4 Mérföldkövek

- A prototipus bemutatása
- Az elkészült szoftver átadása

## 3. Üzleti folyamatok modellje


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

## 8. Adatbázis terv

# 9. Implementációs terv: