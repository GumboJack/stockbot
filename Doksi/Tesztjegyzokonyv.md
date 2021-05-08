## Teszt jegyzőkönyv

A tesztelést végezte: Szelei Attila

Operációs rendszer : Win 10 64 bit 

Böngésző: Google Chrome

Dátum: 2021. 05. 07.

Talált hibák száma: 3

-   Minden egyes API hívásnál  (Lunarcrush API) a console-on logolva van a hívás ideje, sikeres volt-e. 

-   Az API adattömbjében túl sok nem releváns adat van jelen, ezért az adatstruktúra megszűrve kerül az adatbázisba, tárhelyoptimalizálás végett

- Az api hívásoknál be kell állítani hogy hány másodpercenként hívja azt a programunk. A kereskedés szempontjából elég ha 5 percenként hívja azt.

-   Adatbázis kapcsolat -  Sikeres kapcsolat esetén logolva van hogy sikeres a kapcsolat.

-   Az API túl sok adatot szolgáltat ezért ki kell szednünk, a számunkra fontos adatokat.

-   A webfelületen az adatok nem jelentek meg, vagy csak az egyik diagrammon jelentke meg, ennek az oka, hogy az y tengely max értéke statikusan volt beállítva.

- Amelyik adatokat az API szolgáltatok JSONARRAY ben feldolgozásra kerül és továbbítja az adatbázisnak.

-   Adatbázisban lévő adatok - A consolon látható hogy az adatbáziba milyen adatok kerültek bele. 

-   A böngészőben - Az adatok megjelenítése sikeres volt.

-   Deploy során a Tomcat megkettőzve hívta be a chron dependecyt, ami miatt a compiler futásidőben nem ismerte fel az dependency osztályait

-   A webfelületen az adatok nem jelentek meg, vagy csak az egyik diagrammon jelentek meg, ennek az oka, hogy az y tengely max értéke statikusan volt beállítva.

-   Gyenge hálózati sávszélesség esetén az API hívás timeoutolt, mivel a http kliens osztály a default timout értéket használta.

-   Az API-nak nem sikerült jsonarray adattömböt átadni, ennek az okat, hogy a Tomcat nem engedélyez különleges karaktereket a paraméterlistában (esetünkben szögletes zárójeleket). Ezt a beállítást módosíthatjuk a %TOMCAT_HOME%/conf/server.xml fileban.



