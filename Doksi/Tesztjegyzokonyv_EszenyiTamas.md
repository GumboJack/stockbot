## Teszt jegyzőkönyv

| Projekt név | Készítette    | Dokumentáció célja       | Dátum       | Talált hibák |
| :---------- | :-------:     | ----:                    | ----:       | ---:         |
| Stock bot   | Eszényi Tamás | Tesztelés dokumentálása  | 2021.05.07. |            1 |

| Verzió    | Modul     | Megjegyzés | Teszt OK/NOK |
| :-------- | :-------: | ----:     | ----:  |
| V:1.0     | web       | A webfelületen nem működött a javascript és a css. (Böngésző: Vivaldi, Edge) | NOK |
| V:1.1     | web       | A webfelületen nem működött a javascript és a css, ennek az oka, hogy a Tomcat-ben nem volt engedéleyzve a .js és .css kiterjesztésű fájlok kiszolgálása. | OK |
| V:1.0     | api       | API hívás sikertelen.  | NOK |
| V:1.1     | api       | Minden egyes API hívásnál a console-on logolva van a hívás ideje, sikeres volt-e.  | OK |
| V:1.0     | database  | Adatbázis kapcsolat: sikeres kapcsolat esetén logolva van hogy sikeres a kapcsolat. | OK |
| V:1.0     | web       | A böngészőben az adatok megjelenítése sikeres volt. | OK |
| V:1.0     | web       | A webfelületen nem jelent meg a grafikon, vagy csak az egyiken jelent meg. (Böngésző: Vivaldi, Edge) | NOK |
| V:1.1     | web       | A webfelületen nem jelent meg a grafikon, vagy csak az egyiken jelent meg. Oka: A maximum értéke statikusan volt beállítva. | OK |
| V:1.0     | web       | A webfelületen az adatokat megjelenítő grafikonok nem a helyes értékeket mutatták. | OK |
| V:1.0     | api       | Az API-nak nem sikerült jsonarray adattömböt átadni. | NOK |
| V:1.1     | api       | Az API-nak nem sikerült jsonarray adattömböt átadni, ennek az okat, hogy a Tomcat nem engedélyez különleges karaktereket a paraméterlistában (esetünkben szögletes zárójeleket). Ezt a beállítást módosíthatjuk a %TOMCAT_HOME%/conf/server.xml fileban. | OK |
| V:1.0     | database  | Adatbázisban lévő adatok - A consolon látható hogy az adatbáziba milyen adatok kerültek bele.  | OK |

