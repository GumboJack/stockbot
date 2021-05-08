## Teszt jegyzőkönyv



| Projekt név:    | Készítette   | Dokumentáció célja | Dátum|Talált hibák|
| :-------- | :-------: | ----:  | ----:  |---:|
| Stock bot | Szelei Attila | Tesztelés dokumentálása  | 2021.05.08 |3


| Verzió    | Modul | Megjegyzés | Teszt OK/NOK |
| :-------- | :-------: | ----:  | ----:  |
|V:1.0|database| adatbázis kapcsolat probléma - hibernate konfigurálásakor |NOK|
|V:1.0|database|Sikeres kapcsolat esetén logolva van hogy sikeres a kapcsolat.|OK|
|V:1.0|API|Minden egyes API hívásnál  (Lunarcrush API) a console-on logolva van a hívás ideje, sikeres volt-e. |OK|
|V:1.0|API|Az API adattömbjében túl sok nem releváns adat van jelen, ezért az adatstruktúra megszűrve kerül az adatbázisba, tárhelyoptimalizálás végett| OK |
|V:1.0|API|Az API hívásoknál be kell állítani hogy hány másodpercenként hívja azt a programunk. A kereskedés szempontjából elég ha 5 percenként hívja azt.|OK|
|V:1.1|database| Adatbázis kapcsolat probléma elhárítva |OK|
|V:1.0|API|Az API túl sok adatot szolgáltat ezért ki kell szednünk, a számunkra fontos adatokat.| OK |
|V:1.0|WEB| A webfelületen az adatok nem jelentek meg, vagy csak az egyik diagrammon jelentke meg, ennek az oka, hogy az y tengely max értéke statikusan volt beállítva.|NOK|
|V:1.0|database|Amelyik adatokat az API szolgáltatok JSONARRAY ben feldolgozásra kerül és továbbítja az adatbázisnak.|OK|
|V:1.0|database|Adatbázisban lévő adatok - A consolon látható hogy az adatbáziba milyen adatok kerültek bele. |OK|
|V:1.0|WEB |Deploy során a Tomcat megkettőzve hívta be a chron dependecyt, ami miatt a compiler futásidőben nem ismerte fel az dependency osztályait|NOK|
|V:1.1|WEB|A böngészőben - Az adatok megjelenítése sikeres volt.|OK|
|V:1.0|WEB| Gyenge hálózati sávszélesség esetén az API hívás timeoutolt, mivel a http kliens osztály a default timout értéket használta.|OK|

 
 

 





