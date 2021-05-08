## Teszt jegyzőkönyv

A tesztelést végezte: Eszényi Tamás

Operációs rendszer: Windows 10 (64 bit)

Böngésző: Vivaldi, Edge

Dátum: 2021.05.07.

Talált hibák száma: 1

- A webfelületen nem működött a javascript és a css, ennek az oka, hogy a Tomcat-ben nem volt engedéleyzve a .js és .css kiterjesztésű fájlok kiszolgálása.

- Minden egyes API hívásnál a console-on logolva van a hívás ideje, sikeres volt-e. 

- Adatbázis kapcsolat: sikeres kapcsolat esetén logolva van hogy sikeres a kapcsolat.

- A böngészőben az adatok megjelenítése sikeres volt.

- A webfelületen nem jelent meg a grafikon, vagy csak az egyiken jelent meg. Oka: A maximum értéke statikusan volt beállítva.

- A webfelületen az adatokat megjelenítő grafikonok nem a helyes értékeket mutatták.

-   Az API-nak nem sikerült jsonarray adattömböt átadni, ennek az okat, hogy a Tomcat nem engedélyez különleges karaktereket a paraméterlistában (esetünkben szögletes zárójeleket). Ezt a beállítást módosíthatjuk a %TOMCAT_HOME%/conf/server.xml fileban.

- Adatbázisban lévő adatok - A consolon látható hogy az adatbáziba milyen adatok kerültek bele. 

