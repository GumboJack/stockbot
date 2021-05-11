## Teszt jegyzőkönyv

| Projekt név | Készítette    | Dokumentáció célja       | Dátum       | Talált hibák |
| :---------- | :-------      | :----                    | ----:       | ---:         |
| Stock bot   | Bakos Martin | Tesztelés dokumentálása  | 2021.05.07. |            1 |

| Verzió    | Modul     | Megjegyzés | Teszt OK/NOK |
| :-------- | :-------: | :----     | :----:  |
| V:1.0     | web       | A webfelületen nem működött a javascript és a css. (Böngésző: Firefox) | NOK |
| V:1.0     | web       | A webfelületen nem működött a javascript és a css, ennek az oka, hogy a Tomcat-ben nem volt engedéleyzve a .js és .css kiterjesztésű fájlok kiszolgálása. | NOK |
| V:1.0     | web       | A webfelületen nem jelent meg a grafikon, vagy csak az egyiken jelent meg. (Böngésző: Firefox) | NOK |
| V:1.0     | web       | A webfelületen nem jelent meg a grafikon, vagy csak az egyiken jelent meg. Oka: A maximum értéke statikusan volt beállítva. | NOK |
| V:1.0     | web       | A webfelületen az adatokat megjelenítő grafikonok nem a helyes értékeket mutatták. | NOK |
| V:1.1     | web       | A böngészőben az adatok megjelenítése sikeres volt. (hibák kijavitva.) | OK |
| V:1.0     | api       | API hívás sikertelen.  | NOK |
| V:1.1     | api       | Minden egyes API hívásnál a console-on logolva van a hívás ideje, és hogy sikeres volt-e.  | OK |
| V:1.0     | api       | Az API-nak nem sikerült jsonarray adattömböt átadni. | NOK |
| V:1.1     | api       | Az API-nak nem sikerült jsonarray adattömböt átadni, ennek az okát kijavitottuk, ami az volt, hogy a Tomcat nem engedélyez különleges karaktereket a paraméterlistában (esetünkben szögletes zárójeleket). Ezt a beállítást módosíthatjuk a %TOMCAT_HOME%/conf/server.xml fileban. | OK |
| V:1.0     | database  | Adatbázisban lévő adatok - A consolon látható hogy az adatbáziba milyen adatok kerültek bele.  | OK |
| V:1.0     | database  | Adatbázis kapcsolat: sikeres kapcsolat esetén logban megjelenik a sikeres kapcsolat. | OK |

