# Tartalomjegyzék

1. [Rövid bevezető](#Rövid-bevezető)
1. [Az MD használata](#Az-MD-használata)
1. [Szerkesztésre alkalmas programok](#Szerkesztésre-alkalmas-programok)
    1. [Notepad++](##Notepad++)
    1. [Markdown Preview Enhanced](##Markdown-Preview-Enhanced)
1. [Formázások](#Formázások)
    1. [Címsorok](##Címsorok)
    1. [Bekezdés](##Bekezdés)
    1. [Sortörés](##Sortörés)
    1. [Escape karakter](##Escape-karakter)
    1. [Félkövér szöveg](##Félkövér-szöveg)
    1. [Dőlt szöveg](##Dőlt-szöveg)
    1. [Félkövér és dőlt szöveg](##Félkövér-és-dőlt-szöveg)
    1. [Blockquotes - idézet, ajánlás](##Blockquotes---idézet,-ajánlás)
    1. [Rendezett lista](##Rendezett-lista)
    1. [Rendezetlen lista](##Rendezetlen-lista)
    1. [Kód írása](#Kód-írása)
    1. [Vízszintes vonal](#Vízszintes-vonal)
    1. [Linkek](##Linkek)
        1. [Honlapra mutató link](###Honlapra-mutató-link)
        1. [Referencia link](###Referencia-link)
    1. [Kép beillesztése](##Kép-beillesztése)
    1. [Táblázat](##Táblázat)
    1. [Szöveg áthúzása](##Szöveg-áthúzása)
    1. [Feladatlista](##Feladatlista)
    1. [Emoji](##Emoji)
1. [Néhány hasznos link](#Néhány-hasznos-link)

# Rövid Bevezető

Ez a rövid dokumentáció azért jött létre,hogy ismertesse az MD fájlok írásával, szerkesztésével kapcsolatos tudnivalókat.

# Az MD használata

Az *.md fájlokat* manapság a programozók használják, mivel a régimódi dokumentációkhoz képest sokkal **egyszerűbb az elsajátítása** és ezért könnyeb is ráérezni, pontosan ezért terjedt el a nagy **multinacionális cégek** körében és használják a **nagyvállalatok** is előszeretettel. Az *.md fájlokat* nagyon univerzálisan lehet felhasználni manapság és a eléggé könnyen szerkeszthető. Az *MD* a **Markdown Documentation** rövidítése, amely azt jelenti, hogy egy leíró dokumentációt készítünk, amit az *egyes programozók* által ***népszerű programok is többnyire ismernek***.

# Szerkesztésre alkalmas programok

## Notepad++

A notepad++ elsősorban weboldalak **HTML,CSS,PHP és Javascript** file-jainak a szerkesztésére szokták használni a programozók,*viszont .md kiterjesztésű file megnyitására* is képes. [A notepad ++ letöltése.](https://notepad-plus-plus.org/downloads/)
A notepad++ alapjáraton engedélyezi a fájlok megnyitását, szerkesztését. Amennyiben *preview*ra lenne szükségünk, arra létezik plugin. Ezt az alábbi linken lehet elérni: [Notepad++ plugin](https://github.com/nea/MarkdownViewerPlusPlus).

## Visual Studio Code

A Visual Studio Code szintén szimpla szövegszerkesztő, melynek funkciói *extension*ök letöltésével bővíthető.

Letöltési link: [link](https://visualstudio.microsoft.com/downloads/)

Letöltendő *extension*ök az MD fájlok könnyűszerű szerkesztéséhez, és *preview* nézethez:

1. Markdownlint
2. Markdown Preview Enhanced

# Formázások

## Címsorok

Ahhoz, hogy egy szöveg címsor (*header*) legyen, a **hashmark**(\#) jelet kell a sor elején használni. Többszintű címsor használatához, növeljük a hashmarkok számát. Mint HTML-ben, itt is 6 szintet különböztetünk meg. (A hashmark után szóköz)

## Bekezdés

Új bekezdés írásához 1 db **üres sor** használatos.

## Sortörés

Sortörés **Enter** leütésekor történik, ahogy megszokhattuk más-más szövegszerkesztő programok esetén.
>Megj.: A HTML-ből ismert **\<br>** használata is elfogadott.

## Escape karakter

Ha szövegbe foglalnánk egy speciális karaktert, és nem a hatását szeretnénk érvényesíteni, akkor elé kell írjunk egy **\\** karaktert.

## Félkövér szöveg

Félkövér szöveget dupla csillag közés zárjuk: **félkövér**

## Dőlt szöveg

Szöveg dőltté tételéhez a szöveget egy-egy csillaggal kell közrefognunk. Pl.: *dőlt szöveg*

## Félkövér és dőlt szöveg

Ha kombinálni szeretnénk az előző két formázást, azt három darab csillaggal tehetjük meg: ***félkövé és dőlt szöveg***

## Blockquotes - idézet, ajánlás

Használatához minden sort **\>** jellel kell kezdeni. Ha szükséges, akkor ezen a blokkon belül használhatjuk a formázás eszközeit.

Példák:
> Ez egy blockquote.

> # Ez egy
>> több soros,
>>
>> egymásba ágyazott
> blokk
>
> - felsorolással
> - és **egyéb** formázással.

## Rendezett lista

Rendezett listákat sorszámozással hozhatunk létre, illetve dinamikusan.

Számozással:

1. Első listaelem
2. Második listaelem
    1. Második listaelem első allistaeleme
    2. Második listaelem második allistaeleme

Dinamikusan:

1. Első listaelem
1. Második listaelem
    1. Második listaelem első allistaeleme
    1. Második listaelem második allistaeleme

## Rendezetlen lista

Többféle karakterrel kezdhetjük ezen sorainkat: **\-**, **\***, **\+**. De ajánlott a "*\-*"-t használni.

- Első listaelem
- Második listaelem
  - Második listaelem első allistaeleme
  - Második listaelem második allistaeleme

>A rendezett és rendezettlen listákat kombinálhatjuk is.

## Kód írása

Ha programkódot használunk a dokumentumunkban, a helyes formázás végett 4 db space-el, vagy egy **tab** kell beljebb kezdeni.

    <html>
    <head>
        <title>My First page</title>
    </head>
    <body>
        <p>This is a paragraph</p>
    </body>

Ha formázott kódot írnánk, akkor 3 db *backtick* vagy *tilde*(\~) közé írjuk a kódblokkot, illetve hogy megfeleljenek a programnyelvnek a kiemelések, azt is megadhatjuk:

```json
{
  "firstName": "John",
  "lastName": "Smith",
  "age": 25
}
```

Inline kód esetén az AltGr + 7 aposztrófot (*backtick*) használhatjuk: `<br>`.

## Vízszintes vonal

Vízszintes vonalat is meg lehet jeleníteni, két sortőrés közt három **\-** jellel.

---

## Linkek

### Honlapra mutató link

A szöveget melyet linkké teszünk **\[ \]** jelek közé írjuk, a honlap elérhetőségét **\() \)** jelek közt jelenítjük meg. Opcionálisan a honlap elérhetősége után szóközzel elválasztva, idézőjelek közt megjeleníthetjük a tooltippet, hogy mit írjon ki, ha ráviszi a felhasználó az egeret.

[GitHub](https://github.com/ "Please click me!")

Ha egyszerű linket, vagy **email** címet szeretnénk  megjeleníteni, azt kacsacsőrök közt tehetjük meg.

<https://github.com/>

### Referencia link

Referencia linket használhatunk a címsorokra például. A szóköz helyett kötőjelet kell használjuk.

[redezett lista fejezetre muatató link](#rendezett-lista)

De a különböző címsorokat saját IDval  is elláthatjuk:
#### Példa {#ez-egy-pelda-id}

Ezek után így hivatkozhatunk rá: [hivatkozás](#ez-egy-pelda-id})

## Kép beillesztése

Felkiáltójellel kezdünk, majd a linkelés szerinti szintaxist használjuk. Külső honlapről és lokális helyről egyaránt beilleszthetünkl képet.

![Bitcoin](https://miro.medium.com/max/2400/1*huoX84n7u2fNs5B4Px8zlg.png "Bitcoin")

Ha át szeretnénk méretezni, akkor a HTML szerinti szintaxist használhatjuk:

<img src="https://miro.medium.com/max/2400/1*huoX84n7u2fNs5B4Px8zlg.png" alt="Bitcoin" width="200" height="50"/>

## Táblázat

Az oszlopokat tunnel jellel (**\|**) választhatjuk el, a headert a bodytól vízszintes vonallal (minimum 3 **\-**).

| Col 1     | Col 2     |
| --------- | --------- |
| Col1 Row1 | Col2 Row1 |
| Col1 Row2 | Col2 Row2 |

A szövegigazítást is állíthatjuk:

| Balra     | Középre   | Jobbra |
| :-------- | :-------: | ----:  |
| Col1 Row1 | Col2 Row1 | C3 R1  |
| Col1 Row2 | Col2 Row2 | C3 R2  |

[Táblázat generátor](https://www.tablesgenerator.com/markdown_tables)

## Szöveg áthúzása

Az áthuzandó szöveget két **tilde** jel közé tesszük: ~~Áthúzott szöveg.~~

## Feladatlista

Ennek használatával checkboxokat jelenítünk meg, melyeknek két állapota van: elvégzett, elvégzendő.

- [x] Elvégzett feladat
- [ ] Még elvégzendő feladat

>Ez most egy teszt feltöltés, mert Visual Studio Codeban nem jelenik meg a checkbox.

## Emoji

Használhatunk emojikat is szövegírás közben.

Néhány példa:

- :blush:
- :tent:
- :joy:

[Elvileg ezeket támogatja](https://gist.github.com/rxaviers/7360908)

>Ezeket sem támogatja a Visual Studio Code. Ellenőrizni!

# Néhány hasznos link

- https://www.markdownguide.org/cheat-sheet/
- https://www.markdownguide.org/basic-syntax/
- https://www.markdownguide.org/extended-syntax/
- https://github.github.com/gfm/