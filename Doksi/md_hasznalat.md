# Tartalomjegyzék

1. Rövid bevezető
1. Az MD használata
1. Szerkesztésre alkalmas programok
    1. Notepad++
    1. Markdown Preview Enhanced
1. Formázások
    1. Címsorok
    1. Bekezdés
    1. Sortörés
    1. Félkövér szöveg
    1. Dőlt szöveg
    1. Félkövér és dőlt szöveg

# 1. Rövid Bevezető

Ez a rövid dokumentáció azért jött létre,hogy ismertesse az MD fájlok írásával, szerkesztésével kapcsolatos tudnivalókat.

# 2. Az MD használata

Az *.md fájlokat* manapság a programozók használják, mivel a régimódi dokumentációkhoz képest sokkal **egyszerűbb az elsajátítása** és ezért könnyeb is ráérezni, pontosan ezért terjedt el a nagy **multinacionális cégek** körében és használják a **nagyvállalatok** is előszeretettel. Az *.md fájlokat* nagyon univerzálisan lehet felhasználni manapság és a eléggé könnyen szerkeszthető. Az *MD* a **Markdown Documentation** rövidítése, amely azt jelenti, hogy egy leíró dokumentációt készítünk, amit az *egyes programozók* által ***népszerű programok is többnyire ismernek***.

# 3. Szerkesztésre alkalmas programok

## 3.1 Notepad++

A notepad++ elsősorban weboldalak **HTML,CSS,PHP és Javascript** file-jainak a szerkesztésére szokták használni a programozók,*viszont .md kiterjesztésű file megnyitására* is képes. [A notepad ++ letöltése.](https://notepad-plus-plus.org/downloads/)
A notepad++ alapjáraton engedélyezi a fájlok megnyitását, szerkesztését. Amennyiben *preview*ra lenne szükségünk, arra létezik plugin. Ezt az alábbi linken lehet elérni: [Notepad++ plugin](https://github.com/nea/MarkdownViewerPlusPlus).

## 3.2 Visual Studio Code

A Visual Studio Code szintén szimpla szövegszerkesztő, melynek funkciói *extension*ök letöltésével bővíthető.

Letöltési link: [link](https://visualstudio.microsoft.com/downloads/)

Letöltendő *extension*ök az MD fájlok könnyűszerű szerkesztéséhez, és *preview* nézethez:

1. Markdownlint
2. Markdown Preview Enhanced

# 4. Formázások

## 4.1 Címsorok

Ahhoz, hogy egy szöveg címsor (*header*) legyen, a **hashmark**(\#) jelet kell a sor elején használni. Többszintű címsor használatához, növeljük a hashmarkok számát. Mint HTML-ben, itt is 6 szintet különböztetünk meg. (A hashmark után szóköz)

## 4.2 Bekezdés

Új bekezdés írásához 1 db **üres sor** használatos.

## 4.3 Sortörés

Sortörés **Enter** leütésekor történik, ahogy megszokhattuk más-más szövegszerkesztő programok esetén.
>Megj.: A HTML-ből ismert **\<br>** használata is elfogadott.

## 4.4 Félkövér szöveg

Félkövér szöveget dupla csillag közés zárjuk: **félkövér**

## 4.5 Dőlt szöveg

Szöveg dőltté tételéhez a szöveget egy-egy csillaggal kell közrefognunk. Pl.: *dőlt szöveg*

## 4.6 Félkövér és dőlt szöveg

Ha kombinálni szeretnénk az előző két formázást, azt három darab csillaggal tehetjük meg: ***félkövé és dőlt szöveg***

## 4.7 Blockquotes - idézet, ajánlás

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

## 4.8 Rendezett lista

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

## 4.9 Rendezetlen lista

Többféle karakterrel kezdhetjük ezen sorainkat: **\-**, **\***, **\+**. De ajánlott a "*\-*"-t használni.

- Első listaelem
- Második listaelem
  - Második listaelem első allistaeleme
  - Második listaelem második allistaeleme
