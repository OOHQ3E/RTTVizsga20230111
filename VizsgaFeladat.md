hevesbe megalakul az alma termék tanács , és az alma termék tanács úgy dönt, hogy az almákat különböző osztályokba sorolják
ha a termés átlag több mint (>=) 2 tonna, akkor harmadosztályú az alma
ha a termés átlag több mint 1.5 (<=), de kevesebb mint (<) 2 akkor másodosztály
ha a termés átlag >= 1.2 tonna, de kevesebb, mint < 1.5, akkor elsőosztályú az alma
ha a termés átlag kevesebb mint 1.2, akkor az alma lehet szuperminősígű, de csak akkor, ha a hibák száma átlagosan kevesebb, mint 3

egyébként első osztályú

feladat: 
írjunk programot, ami képes osztályozni az átlagos hibaszámból és a termés átlagból
úgy kell megoldani, hogy könnyen változtatható legyen, (könnyen eladható legyen a szabolcsi almatermesztőnek) -> határok könnyű átállítása
OCP, SRP, DIP, hogy ha indokolt, ha nem használunk DIP-et akkor indokolni
ahol csak lehetséges akkor enumokat használjunk
törekedni, hogy minél kevesebb if/switch legyen

(nehéz feladat: törekedni arra hogy a programban egyetlen if legyen)
(ha 10 if van, akkor bizonyosan elrontva van)

feladat: 
írjon a hevesieknek unit tesztet, ami vagy paraméteres, vagy repeated tesztet használ

érdekes kérdések: betartottam az OCP/SRP-t?
kellett-e használni DIP-et? ha igen/nem, miért

ha a tanácsból kitalálják, hogy az egyik feltételt változtatják, akkor hogyan változtatom

HATÁRÉRTÉK TESZTELÉS megvalósítás

