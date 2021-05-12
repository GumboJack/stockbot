# Teszt jegyzőkönyv

| Projekt név:    | Készítette   | Dokumentáció célja | Dátum|Talált hibák|
| :-------- | :-------: | ----:  | ----:  |---:|
| Stock bot | Andrási Norbert | Tesztelés dokumentálása  | 2021.05.09 |3
| Verzió    | Modul | Megjegyzés | Teszt OK/NOK |
| :-------- | :-------: | :----  | :----:   |
|V:1.0|Database | adatbázis kapcsolat probléma - hibernate konfigurálásakor |NOK|
|V:1.1|Database | Adatbázis kapcsolat probléma elhárítva |OK|
|V:1.1|Web      | Webfelület - js, css nem töltött be. Megoldás: a Tomcat-ben nem volt engedéleyzve a .js és .css kiterjesztésű fájlok kiszolgálása |OK|
|V:1.0|Database | Log - sikeres kapcsolat esetén |OK|
|V:1.1|Web      | Böngésző - Adat megjelenítés sikeres volt |OK|
|V:1.0|Web      | API hívás timeoutolt, mivel a http kliens osztály a default timeout értéket használta |OK|
|V:1.0|Database | API adatokat szolgáltat jsonarrayben feldolgozásra került és továbbította az adatbázisnak |OK|
|V:1.0|Database | Adatbázisba került adatok látszódnak consoleon |OK|
|V:1.0|Web      | Tomcat - duplán hívta be a chron dependecyt, emiatt a compiler futásidőben nem ismerte fel az dependency osztályait |NOK|
|V:1.1|Web      | Böngésző - adatok megjelenítése sikeres volt |OK|
