# Funkcionális specifikáció

- [Funkcionális specifikáció](#funkcionális-specifikáció)
  - [Célok](#célok)
  - [Követelménylista](#követelménylista)
  - [Használati esetek](#használati-esetek)
  - [Képernyőtervek](#képernyőtervek)
  - [Forgatókönyvek](#forgatókönyvek)
  - [Fogalomszótár](#fogalomszótár)


## Célok

A projekt célja egy olyan kereskedő bot megalkotása, aminek segítségével profitot termelhetünk minimális kockázattal.

Ezt legegyszerűbben úgy tudjuk elérni, hogy stratégiákat, algoritmusokat alkalmazunk amiket a programunkban implementálunk. Emellett fontos, hogy az általunk kiválasztott kriptovaluta megfeleljen különböző szempontoknak. A valutának  stabilnak kell lennie és fejlődő tendenciát kell hogy mutasson. Továbbá érdemes figyelni azt, hogy az egyes cégek mennyi és milyen részvényekbe fektetik bele a pénzüket. Egyre népszerűbbek azok a "centes" cryptovaluták amiknek az értékük úgy emelkedik minél többen "Tweetelik", és "hypolják" egyes platformokon.  Manapság elég sokan arany és ezüst helyett a pénzüket inkább kriptorészvénybe fektetik. Mint például:

> - Bitcoin
> - Ethereum
> - Litecoin
> - Tether
> - Ripple
> - Binance coin
> - Cardano
> - Litecoin

## Követelménylista


## Használati esetek

A rendszer használata automatikus. A megadott stratégia alapján indulásától kezdve folyamatos API hívások segítségével monitorozza az éppen aktuális kripto valuta árfolyam mozgásokat és a megadott stratégia alapján önmagától végzi a kereskedést.

Képesnek kell lennie:
- valutát eladni
- valutát venni
- reagálni az árfolyam változásaira
- ezáltal (ha a megadott stratégia helyes) képesnek kell lennie felismernie ha az éppen használt valutával való kereskedés nem jövedelmező
- nem deficittel dolgozni
- az aktualis arfolyam mozgasokat megjeleniti webes felületen

A rendszer üzemeltetője az adminisztrátor, aki a bot visszajelzései alapján képes módosítani az éppen használt stratégiát, vagy lehetősége van újat megadni.

## Képernyőtervek

## Forgatókönyvek

A bot alapesetben konzol commandok képében ad visszajelzést a működéséről. Jelzi ha vett, vagy ha eladott valutát, illetve megadott időintervallum elteltével jelez az ez idő alatt végbe ment tranzakciókról. Ha ezek mérlege negatív, akkor figyelmeztet, hogy a jelenleg használt stratégiát érdemes felülvizsgálni.
A bot képes megjeleniteni egy webes felületen az adatbázisban tárolt adatokat, hogy könnyebben átlátható legyen az adattömeg, illetve annak változásai. Ennek segitségével könnyebben módositható a használt stratégia.

## Fogalomszótár

- Kriptovaluta: A kriptovaluta olyan digitális pénz, aminél titkosítást használnak a fizetések biztonságossága érdekében. A legtöbb kriptovaluta decentralizált, ami azt jelenti, hogy nem egy központi bank vagy cég működteti, hanem a felhasználók számítógépein elosztva üzemel. A legismertebb kriptovaluta a Bitcoin.
- Kereskedő bot: A kereskedő bot egy olyan szoftveres program, amely közvetlenül kapcsolódik a pénzügyi tőzsdékhez és a felhasználó nevében helyeznek el eladási vagy vásárlási megrendeléseket a piaci adatok értelmezésének függvényében.
- API: Az API alatt egy olyan programozási interfészt, programozási felületet és annak részletes dokumentációját értjük, amelynek segítségével egy rendszer egy másik programhoz csatlakozhat. Ennek révén a másik programrendszer szolgáltatási használhatóak, anélkül, hogy a program belső részleteit ismerni kellene.
