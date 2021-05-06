# Funkcionális specifikáció

- [Funkcionális specifikáció](#funkcionális-specifikáció)
  - [Bevezetés](#bevezetés)
  - [Célok](#célok)
  - [Jelenlegi helyzet](#jelenlegi-helyzet)
  - [Követelménylista](#követelménylista)
  - [Használati esetek](#használati-esetek)
  - [Képernyőtervek](#képernyőtervek)
  - [Forgatókönyvek](#forgatókönyvek)
  - [Fogalomszótár](#fogalomszótár)


## Bevezetés

## Célok

## Jelenlegi helyzet

## Követelménylista

## Használati esetek
A rendszer használata automatikus. A megadott stratégia alapján indulásától kezdve folyamatos API hivások segitségével monitorozza az éppen aktuális kripto valuta árfolyam mozgásokat és a megadott stratégia alapján önmagától végzi a kereskedést.

Képesnek kell lennie:
- valutát eladni
- valutát venni
- reagálni az árfolyam változásaira
- ezáltal (ha a megadott stratégia helyes) képesnek kell lennie felismernie ha az éppen használt valutával való kereskedés nem jövedelmező
- nem deficittel dolgozni

A rendszer üzemeltetője az adminisztrátor, aki a bot visszajelzései alapján képes módositani az éppen használt stratégiát, vagy lehetősége van újat megadni.
## Képernyőtervek

## Forgatókönyvek
A bot alapesetben konzol commandok képében ad visszajelzést a működéséről. Jelzi ha vett, vagy ha eladott valutát, illetve megadott időintervallum elteltével jelez az ez idő alatt végbe ment tranzakciókról. Ha ezek mérlege negativ, akkor figyelmeztet, hogy a jelenleg használt stratégiát érdemes felülvizsgálni.
## Fogalomszótár
.