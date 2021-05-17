## Teszt jegyzőkönyv



| Projekt név:    | Készítette   | Dokumentáció célja | Dátum|Talált hibák|
| :-------- | :-------: | ----:  | ----:  |---:|
| Stock bot | Lőrincz Marcell | Tesztelés  | 2021.05.07 |2


| Verzió    | Modul | Megjegyzés | Teszt OK/NOK |
| :-------- | :-------: | :----  | :----:   |
|V:1.0|WEB| Gyenge hálózati sávszélesség esetén az API hívás timeoutolt, mivel a http kliens osztály a default timout értéket használta.|OK|
|V:1.0|database|Sikeres kapcsolat esetén logolva van hogy, sikeres a kapcsolat.|OK|
|V:1.0|API|Minden egyes API hívás (Lunarcrush API) eredménye logolva van a consolera. |OK|
|V:1.0|API|Az API hívások rendszerességét be kell állítani hogy milyen gyakran hívja azt a programunk. 5 percenként optimális az API hívás.|OK|
|V:1.0|API|Az API adattömbjében redundáns információk is vannak, ezért az adatstruktúra megszűrve kerül az adatbázisba, tárhelyoptimalizálás miatt.| OK |
|V:1.0|database|Adatbázisban lévő adatok - A consolon látható hogy az adatbáziba milyen adatok kerültek bele és milyen parancsal. |OK|
|V:1.0|API|Az API túl sok adatot szolgáltat ezért ki kell szednünk, a számunkra fontos adatokat.| OK |
|V:1.0|WEB| A webfelületen az adatok nem jelentek meg, vagy csak az egyik diagrammon jelentke meg, ennek az oka, hogy az y tengely max értéke statikusan volt beállítva.|NOK|
|V:1.0|database|Amelyik adatokat az API szolgáltatok JSONARRAY ben feldolgozásra kerül és továbbítja az adatbázisnak.|OK|
|V:1.0|WEB |Deploy során a Tomcat megkettőzve hívta be a chron dependecyt, ami miatt a compiler futásidőben nem ismerte fel az dependency osztályait|NOK|
|V:1.1|WEB|A böngészőben - Az adatok megjelenítése sikeres volt.|OK|


 
 

 





