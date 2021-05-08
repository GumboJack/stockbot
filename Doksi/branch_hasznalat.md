# Branch-ek létrehozása, kezelése

## Branch röviden

Az éppen aktuálisan kiválasztott ág (általában master) egy másolatát lemásoljuk egy külön ágba, hogy ott aztán elkülönítve dolgozhassunk rajta. Érdemes valamilyen feature alapján létrehozni azt.

Érdemes lehet a csoportosítást használni, pl.:
- Javítás: fix/abc-xyz
- Módosítás: modify/abc-xyz
- Doksi: doksi/abc-xyz
- stb.

## Branch létrehozása

### Terminálban / parancssorban

Váltsunk a fő águnkra (általában master):
```
git checkout master
```

Hozzunk létre egy új ágat:
```
git branch ujag
```

Váltsunk át a most létrehozott ágra:
```
git checkout ujag
```

### Alkalmazásban

#### Sourcetree

1. Kattintsunk kettőt (a baloldalon található BRANCHES alatt lévő ágak közül) a fő águnkra (általában master).
2. Kattintsunk a **Branch** gombra a fenti eszköztáron.
3. Adjuk meg az új branch nevét.
4. Kattintsunk a **Create Branch** gombra.
5. A program létrehozza és automatikusan át is vált az új branch-ünkre.

## Branch kezelése

A branch-ek segítségével jobban szétválaszthatóak az egyes folyamatok, feature-ök. Az adott ágon nyugodtan dolgozhatunk. Amikor úgy érezzük készen vagyunk, akkor a branch-ünkből **pull request**-et készíthetünk. Ezt a kérést az arra jogosult befűzheti (merge) a főágba.

Ilyenkor a GitHub ellenőrzi, hogy van-e probléma (conflict), azaz van-e olyan kódrészlet, ami valamilyen okból ütközik. A legtöbb ilyet automatikusan feltudja oldani, de vannak esetek, amikor ez csak kézi beavatkozással lehetséges.
