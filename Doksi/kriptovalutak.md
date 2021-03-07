# Tartalomjegyzék

- [Tartalomjegyzék](#tartalomjegyzék)
- [Kriptovaluták](#kriptovaluták)
- [Blokklánc](#blokklánc)
- [Fontosabb kriptovaluták](#fontosabb-kriptovaluták)
  - [Bitcoin](#bitcoin)

# Kriptovaluták

A kriptovaluta olyan digitális eszköz, mely csereeszközként vagy manapság fizetőeszközként is funkcionál. Kriptográfiát (titkosítást) használ a tranzakciók biztonságossága érdekében. A kriptovaluták a digitális valuták egy részhalmazát képviselik, de besorolhatók az alternatív valuták vagy a virtuális valuták csoportjába is. A legtöbb kriptovaluta közös jellemzője a decentralizáció, azaz a központi felügyelet nélküli működés (hasonlóan az Internethez) melynek köszönhetően országhatárokon keresztüli fizetőeszközként lehet használni.

A Bitcoin a legelső és legismertebb kriptovaluta, 2009-ben került kibocsátásra egy Satoshi Nakamoto álnéven ismert ember által. Azóta számos kriptovaluta jelent meg a piacon. Ezeket gyakran altcoinoknak is nevezik, a Bitcoin+alternative szavak összekapcsolásának eredményeként. A Bitcoin és alternatívái decentralizáltak a hagyományos, centralizált bankrendszerrel szemben. A decentralizált ellenőrzés a blockchain használatához kapcsolódik, mely egy elosztott főkönyvi technológia. Lényege, hogy az egymással kapcsolatban lévő emberek elektronikus pénzt tudnak fogadni és küldeni mindenféle központosítás nélkül.

# Blokklánc

A blokklánc (angolul block chain vagy blockchain) egy elosztott adatbázis, amely egy folyamatosan növekvő, adatblokkokból álló lista nyilvántartását végzi, a hamisítást és módosítást kizáró módon.

A blokkok a kezdeti megvalósításokban csak adatot tároltak, de a modern megvalósítások (például az Ethereum) már futtatható kódok tárolására is alkalmasak. Egy blokk tranzakciók listáját és benne tárolt programok által végzett műveletek eredményeit tartalmazza, valamint metaadatokat, amik időponthoz és az előző blokkhoz kapcsolják.

A blokkláncot a Bitcoin legfőbb technológiai újításának tartják, ahol egy nyilvános főkönyvként működik, amely rögzíti az összes bitcoin-tranzakciót. A Bitcoin egy peer-to-peer protokoll, ahol bárki csatlakozhat a hálózathoz, kezdeményezhet tranzakciókat, és hitelesítheti is azokat, blokkok létrehozásával, ezért hívják "engedélyek nélküli" protokollnak. Az eredeti koncepció több kriptopénzhez, illetve elosztott adatbázishoz is ihletül szolgált.

A Bitcoin elosztott főkönyvének blokkjai minden esetben tartalmazzák:

>az előző blokk kriptográfia segítségével titkosított hash-ét (ezzel hivatkoznak az előző blokkokra),
>egy timestamp-et (időbélyeget),
>és a tranzakciós adatot (általában merkel tree root hash-ként van reprezentálva).

Az legfontosabb funkciója a blockchain alapú adattárolásnak, hogy az adatokat nagyon nehéz megváltoztatni / megmásítani, mivel arra találták fel, hogy peer-to-peer (P2P) azaz több fél által futtathatóan és ellenőrizhető módon legyen használva.

A blokklánc az elosztott főkönyvi technológia egyik implementációja. Ez az innováció számos információtechnológiai újítást hozott, és a jövőben sok új felhasználási területe lehet.

# Fontosabb kriptovaluták

## Bitcoin

2008-ban látott napvilágot egy Satoshi Nakamoto által jegyzett 9 oldalas dokumentum, egy új, elektronikus készpénzrendszer bevezetésének elképzeléséről. A tanulmány szerzőjének vagy szerzőinek kilétét máig homály fedi. A Nakamoto által jegyzett, White paper[1] elnevezésű dokumentumban a szerző(k) rögzíti(k) a Bitcoin-rendszer alapjait. Ennek lényege, hogy a rendszer a hagyományoshoz képest alternatív megoldást nyújt pénzügyi tranzakciók végrehajtásához és nyilvántartásához.

A megoldás attól alternatív, hogy

- megoldja a korábban a digitális információ másolásakor minden esetben létrejövő duplikáció kérdését, ezáltal lehetővé teszi az információ másolását oly módon, hogy elküldése után az információ csak és kizárólag a címzettnél létezzen, a kiindulási ponton viszont megszűnjön;
- az elszámolás nem központosított, a tranzakciók végrehajtásához harmadik fél bevonása nem szükséges;
- a rendszer bárki számára nyitott, tetszőlegesen lehet csatlakozni, vagy kiszállni;
- a könyvelés nem egy központi helyen vezetett főkönyvben történik, hanem minden egyes hálózatba kapcsolt csomópont értesül minden egyes tranzakcióról, ezen felül minden egyes csomópont el is tárol minden tranzakciót – ez az elosztott főkönyv;
- a tranzakciók titkosítottak;
- a tranzakciók egybegyűjtése, titkosítási folyamata ún. blokkokat, illetve blokkok láncolatát hozza létre (blokklánc-technológia); a technológiának köszönhetően az új tranzakciók mindig a régiekhez kapcsolódva kerülnek szétküldésre a hálózatban, tehát a teljes tranzakciós történet újra és újra elküldésre kerül, kizárva ezzel a visszamenőleges hamisítás lehetőségét is;
- a rendszer működtetésében, azaz a titkosítások elvégzésében résztvevőket az általa kibocsájtott digitális pénzzel jutalmazza, biztosítva ezzel a hálózat működését és fenntartását.

Tehát 2009-től már nem csak információ áramoltatására képes az internet, hanem értékek áramoltatására is. Létrejött tehát az értékek hálózata, és rajta az új technológiát használó Bitcoin-rendszer.

>A Bitcoin rendszer White paper szerinti pontos definíciója „Bitcoin: A peer-to-peer Electronic Cash System” (Bitcoin: Egy végpontok közötti készpénzrendszer” {ford.: a tanulmány szerzője}). A rendszer peer-to-peer, azaz nem központosított hálózat, hanem egyenrangú, és egymástól független csomópontok kapcsolatrendszere. A csomópontok az interneten keresztül kapcsolódnak egymáshoz, s földrajzilag bárhol elhelyezkedhetnek.

A hálózatot a felhasználó szempontjából 3 jelzővel lehet jellemezni: globális, azonnali és decentralizált, azaz közvetítő nélküli.

A Bitcoinnal kapcsolatban sokszor említik, hogy a központosított rendszerekhez képest lassú. Nagyságrendileg ez azt jelenti, hogy a pénztárcák között a hálózaton másodpercenként mindössze 5-7 tranzakciót végeznek, míg a Visa hálózatán a másodpercenkénti tranzakciók száma kb. 1700-2000.