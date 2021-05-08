# Követelményspecifikáció

1. [Bevezetés](#Bevezetés)
1. [Jelenlegi helyzet](#Jelenlegi-helyzet)
1. [Vágyálomrendszer](#Vágyálomrendszer)
1. [Megrendelői követelmény](#Megrendelői-követelmény)
1. [Rendszerre vonatkozó törvények, szabványok, ajánlások](#Rendszerre-vonatkozó-törvények,-szabványok,-ajánlások)
    1. [Szerzői jogszabályok](#Szerzői-jogszabályok)
    1. [Adatvédelmi jogszabályok](#Adatvédelmi-jogszabályok)
1. [Jelenlegi üzleti folyamatok modellje](#Jelenlegi-üzleti-folyamatok-modellje)
1. [Igényelt üzleti folyamatok](#Igényelt-üzleti-folyamatok)
1. [Követelménylista](#Követelménylista)
1. [Fogalom szótár](#Fogalom-szótár)

## Bevezetés
A projekt célja egy olyan kereskedő bot megalkotása, aminek segítségével profitot termelhetünk minimális kockázattal.

Ezt legegyszerűbben úgy tudjuk elérni, hogy stratégiákat, algoritmusokat alkalmazunk amiket a programunkban implementálunk. Emellett fontos, hogy az általunk kiválasztott kriptovaluta megfeleljen különböző szempontoknak. A valutának  stabilnak kell lennie és fejlődő tendenciát kell hogy mutasson. Továbbá érdemes figyelni azt, hogy az egyes cégek mennyi és milyen részvényekbe fektetik bele a pénzüket. Manapság elég sokan arany és ezüst helyett a pénzüket inkább kriptorészvénybe fektetik. Mint például:
> - Bitcoin
> - Ethereum
> - Litecoin
> - Tether
> - Ripple
> - Binance coin
> - Cardano
> - Litecoin

## Jelenlegi helyzet

Manapság a kriptovaluta kereskedés nagyon népszerű téma miután a pár forintról induló bitcoin értéke elérte már a  18 millió forintot is. A kriptovaluta egy digitális valuta, amely nem köthető egyetlen hagyományos valutához vagy centralizált szervezethez sem. Nem áll tehát egyetlen bank, szövetségi rendszer vagy kormány tulajdonában sem, így független az eurótól, a dollártól, de még az ezüsttől és az aranytól is. A csalás megelőzése és a biztonságos bitcoin pénzkeresés érdekében a kriptoválutával történő tranzakciók egy ún. blokkláncban kerülnek digitálisan rögzítésre, ami a gerince és egyben a kulcsa is a kriptovaluta sikerének. A blokklánc a “papír könyvelés” digitális változata a tranzakciókról vagy nyugtákról.
A tranzakciók egy szigorú visszaigazoló folyamaton mennek keresztül, így biztosítják, hogy csak valódi tranzakciókat adnak hozzá a blokklánchoz, az egyének számára pedig azt, hogy bevételt szerezhetnek az interneten kereskedés, befektetés, bányászat, vagy valuta vásárlás folyamán.

Csak úgy, mint a hagyományos pénztárca, a kripto pénztárca is értéket tárol: de a coinjaid mellett egy saját privát kulcsot is hordoz, ennek segítségével vásárolhatsz és értékesíthetsz kriptovalutát. Ez tartja biztonságban a kriptovalutádat. A privát kulcs egy azonosító kártyához hasonlítható az egyedi sorozatszámával. Amikor vásárolsz vagy értékesítesz, a privát kulccsal adsz engedélyt a kriptovaluta mozgásra a saját kriptovaluta pénztárcád és az üzleti partnered között.

Ugyanúgy, mint a fizikailag létező pénztárca, a digitális pénztárca is pontosan megmondja neked, hogy melyik kriptoból mennyi van benne, tárolhatod benne az újonnan szerzett coinokat és kifizethetsz másokat. 

## Vágyálomrendszer

A cél egy olyan program, ami az általunk meghatározott stratégiák használatával profitot termel a kiválasztott kriptovaluták esetében. A rendszer figyelje a tendenciákat és a valuta stabilitását, illetve további egyéni, általunk meghatározott szempontokat. Nagy cégek részvény befektetéseit is érdemes monitoroznia a végleges programnak, hogy ez által is pontosabb legyen a döntés.

## Megrendelői követelmény

- A program automatikusan működjön.
- Tudjon valutát eladni és venni.
- Figyelje az árfolyam változásokat.
- Kövessen egy vagy több stratégiát.

## Rendszerre vonatkozó törvények, szabványok, ajánlások

Budapest, 2020. február 14. – Az MNB nem felügyeli a kriptovalutákhoz kötődő kereskedelmi ügyleteket, a – magyar jogrendben ismeretlen – nyereségrészesedési jog forgalmazása pedig akár jogosulatlan betét/pénzeszköz gyűjtésének minősülhet. Ezen eszközök árfolyama kiszámíthatatlan, hiányoznak a károsultakat védő garanciaintézmények, s bűncselekmények elkövetésére is felhasználhatják őket. Átlagos pénzügyi ismeretekkel rendelkező fogyasztóknak kockázatos ezekbe fektetni.

Az immár az amerikai hatóságok által vizsgált OneCoin befektetési csalás ismételten rávilágít arra: az átlagos pénzügyi tudással bíró fogyasztók számára rendkívül kockázatos ismeretlen befektetési eszközökbe fektetni. Bár a OneCoin nem volt valódi kriptovaluta (nem lehetett vele ténylegesen kereskedni, nem rendelkezett a valamiféle ellenőrizhetőséget segítő blokklánccal és valós árfolyammal), a közel hasonló kockázatok minden egyéb, a pénzügyi felügyeletek/jegybankok által nem ellenőrzött befektetési formánál megvannak. Ez akkor szűnik meg, ha – a valóban hasznos, a fogyasztók érdekét is szolgáló – innováció szabályozott keretek között működik.

A fizetésre használható virtuális eszközöknek (kriptovalutáknak, pl. Bitcoin) nincs hivatalos kibocsátójuk, nem tartoznak a világ legtöbb országa hatósága, jegybankja – így a Magyar Nemzeti Bank (MNB) – felügyelete alá sem. Jogi helyzetük világszerte ma még szabályozatlan, a sokszor előforduló fizetési probléma, visszaélés vagy lopás esetén nem védik a befektetőket betét- vagy befektetővédelmi garanciaintézmények. Hiányoznak a felelősségi és kárviselési előírások is. A kriptovaluták árfolyam-ingadozása gyakorta kiszámíthatatlan, az átlagos befektetők számára ismeretlen események mozgatják.

A károsultak ráadásul csak polgári perben, bűncselekmény gyanúja esetén pedig büntetőfeljelentéssel próbálhatják érvényesíteni jogaikat – sokszor külföldön, idegen jogi és nyelvi környezetben. Minderről az MNB az elmúlt öt évben többször – így 2015-ben, 2016-ban és 2017-ben, s külön az ICO-k témájában és a kriptovalutákkal eladni próbált piramisjáték-gyanús MLM-rendszer ügyében is – tett közzé írásos figyelmeztetéseket, illetve publikálta az Európai Bankfelügyeleti Hatóság (EBA) figyelmeztetését is.

A nyereségrészesedési jogot kínáló társaságok gyakorta különböző start-up cégek, magyar feltalálók által fejlesztett, jól csengő „világraszóló találmányok” (például zéróponti víz, tűzálló fa, Rubik-kocka méretű kazán) vagy más innovációk fejlesztése és piacra vitele céljából gyűjtenek forrást.

A befektetők kültagként vagy kisebbségi tulajdonosként szerezhetnek nyereségrészesedési jogot az ezek kiaknázására létrehozott befektetési társaságokban, a szervező beltag vagy többségi tulajdonos cég mellett. A forrásgyűjtést végző gazdasági társaság a kültagokat jellemzően hosszú távon megtérülő mesés osztalék ígéretével igyekszik befektetésre ösztönözni.

A nyereségrészesedési jog a hatályos magyar jogszabályok által nem ismert jogintézmény. Előfordulhat, hogy a szervező cég e tevékenység örve alatt ténylegesen visszafizetési kötelezettség vállalása mellett üzletszerűen betéteket vagy más visszafizetendő pénzeszközöket gyűjt a befektetőktől. Mivel ez az MNB engedélyéhez kötött, a jegybank ilyen esetekben piacfelügyeleti intézkedést hoz a jogosulatlan pénzügyi szolgáltatóval szemben. További részletek az MNB honlapjának megújult figyelemfelhívó aloldalán olvashatók.

<https://www.mnb.hu/sajtoszoba/sajtokozlemenyek/2020-evi-sajtokozlemenyek/kriptovaluta-nyeresegreszesedesi-jog-fokozott-befektetoi-kockazatok>

### Szerzői jogszabályok

**Magyar jogszabályok**

*1999. évi LXXVI. törvény* a szerzői jogról

*2016. évi XCIII. törvény* a szerzői jogok és a szerzői joghoz kapcsolódó jogok közös kezeléséről

*216/2016. (VII. 22. ) Korm. rendelet* a közös jogkezelő szervezetek és a független jogkezelő szervezetek működésének és a jogkezeléssel kapcsolatos eljárások részletes szabályairól

*26/2010. (XII. 28.) KIM rendelet* a Szellemi Tulajdon Nemzeti Hivatala által vezetett önkéntes műnyilvántartás részletes szabálya

*156/1999. (XI. 3.) Korm. rendelet* a Szerzői Jogi Szakértő Testület szervezetéről és működéséről

*19/2016. (IX. 5.) IM rendelet* a közös jogkezelő szervezetek és a független jogkezelő szervezetek jogkezelési tevékenységének bejelentésével, valamint a reprezentatív közös jogkezelő szervezetként végzett közös jogkezelési tevékenység engedélyezésével kapcsolatos eljárásokért fizetendő igazgatási szolgáltatási díjra vonatkozó szabályokról

*117/2004. (IV.28.) Korm. rendelet* a szerzői jogról szóló 1999. évi LXXVI. törvény 38. §-ának (5) bekezdésében szabályozott szabad felhasználás esetében a nyilvánosság egyes tagjaihoz való közvetítés és a számukra történő hozzáférhetővé tétel módjának és feltételeinek meghatározásáról 

*2001. évi CVIII. törvény* az elektronikus kereskedelmi szolgáltatások, valamint az információs társadalommal összefüggő szolgáltatások egyes kérdéseiről

A *2013. évi V. törvény* a Polgári törvénykönyvről teljes szövege 

Szellemi tulajdonjogok megsértése miatt indított perben hozott határozat végrehajtása - a bírósági végrehajtásról szóló *1994. évi LIII. törvény 184/A. §-a*

**Európai uniós jogszabályok**

Az Európai Parlament és a Tanács 2017/1128 rendelete (2017. június 14.) az online tartalomszolgáltatásoknak a belső piacon való, határokon átnyúló hordozhatóságáról

Az Európai Parlament és a Tanács 2011/77/EU irányelve (2011. szeptember 27.) a szerzői jog és egyes szomszédos jogok védelmi idejéről szóló 2006/116/EK irányelv módosításáról

Az Európai Parlament és a Tanács 2009/24/EK irányelve a számítógépi programok jogi védelméről

A Tanács 93/83/EGK irányelve a műholdas műsorsugárzásra és a vezeték útján történő továbbközvetítésre alkalmazandó szerzői jogra és a szerzői joggal kapcsolatos jogokra vonatkozó egyes szabályok összehangolásáról

A Parlament és a Tanács 96/9/EK irányelve az adatbázisok jogi védelméről

A Parlament és a Tanács 2001/29/EK irányelve az információs társadalommal kapcsolatos szerzői és szomszédos jogokról

Az Európai Parlament és a Tanács 2001/84/EK irányelve (2001. szeptember 27.) az eredeti műalkotás szerzőjét megillető követő jogról

Az Európai Parlament és a Tanács 2012/28/EU irányelve (2012. október 25.) az árva művek egyes megengedett felhasználási módjairól

Az Európai Parlament és a Tanács 2004/48/EK irányelve a szellemi tulajdonjogok érvényesítéséről

Az Európai Parlament és a Tanács 2006/116/EK irányelve (2006. december 12.) a szerzői jog és egyes szomszédos jogok védelmi idejéről

**Nemzetközi jogszabályok**

Egyetemes Szerzői Jogi Egyezmény
(Kihirdette az 1975. évi 3. törvényerejű rendelet)

A szellemi tulajdon kereskedelemmel összefüggő kérdéseit szabályozó egyezmény (TRIPS Megállapodás)
*1998. évi IX. törvény* az Általános Vám- és Kereskedelmi Egyezmény (GATT) keretében kialakított, a Kereskedelmi Világszervezetet létrehozó Marrakesh-i Egyezmény és mellékletének kihirdetéséről
(Kihirdette az 1998. évi IX. törvény)


### Adatvédelmi jogszabályok

Az Európai Parlament és a Tanács (EU) *2016/679 *rendelete a természetes személyeknek a személyes adatok kezelése tekintetében történő védelméről és az ilyen adatok szabad áramlásáról, valamint a 95/46/EK irányelv hatályon kívül helyezéséről

*2011. évi CXII.* törvény az információs önrendelkezési jogról és az információszabadságról
  

## Jelenlegi üzleti folyamatok modellje
**Üzleti szereplők:** 
-   vevő (Aki megveszi a kereskedő botot)
-   broker (Aki figyeli a tőzsdei híreket) 

**Üzleti munkatárs:** 
-   Kereskedő BOT

**Üzleti entitások:**
-   Kriptovaluták
    -   Ethereum
    -   Bitcoin
    -   Raven
    -   LiteCoin

**Üzleti folyamatok:** 

**Vevő számára:** 
    A vevő megvásárolta a kereskedő botot amit ha futtat akkor képes, profitot termelni különböző stratégiák alkalmazásakor. 

## Igényelt üzleti folyamatok

**Üzleti szereplők:** 
-   Futtató (Aki futtatja a kereskedő botot.)

**Üzleti munkatárs:** 
-   Kereskedő bot

**Üzleti entitások:**
-   Kriptovaluták
    -   Ethereum
    -   Bitcoin
    -   Raven
    -   LiteCoin 

**Üzleti folyamatok:** 

**Online folyamatok kereskedő számára:**

A kriptovaluta kereskedő futtatja a kripto botot, ami egy adott stratégia alapján elad vagy vesz valutákat, és által profitot termel.

## Követelménylista
ID|Verzió|Név|Kifejtés
--|------|---|--------
K01|V1.0|API hívás|A program meghívja bizonyos időnként a Lunarcrush API-t. 
K01|V1.0|Adatok tárolása|Az API álltal szolgáltatott adatokat, egy adatbázisban el kell tárolni (PostgreSQL). 
K01|V1.0|consolos megjelenítés|apihívások eredményei, mikor, milyen adatokat kér le az API-tól logolja a consolra.
K01|V1.0|Adatmegjelenítés webfelületen|Chart segítségével diagramm megjelenítés az idő és a profit függvényében. 

## Fogalom szótár

- Kriptovaluta: A kriptovaluta olyan digitális pénz, aminél titkosítást használnak a fizetések biztonságossága érdekében. A legtöbb kriptovaluta decentralizált, ami azt jelenti, hogy nem egy központi bank vagy cég működteti, hanem a felhasználók számítógépein elosztva üzemel. A legismertebb kriptovaluta a Bitcoin.
- Kereskedő bot: A kereskedő bot egy olyan szoftveres program, amely közvetlenül kapcsolódik a pénzügyi tőzsdékhez és a felhasználó nevében helyeznek el eladási vagy vásárlási megrendeléseket a piaci adatok értelmezésének függvényében.