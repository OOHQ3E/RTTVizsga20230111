# Rendszerek Tervezése és Tesztelése Vizsga 2023.01.11

## 1. feladat : teszt írás

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

## 2.Feladat: szóbeli + kis írás rész

szóbeli rész: mi a DIP?
miben használatos a DIP, miért jó?

### plantUML-ben egy alap DIP rajzolása:
```@startuml
hide empty members
interface FelsoSzintService

class AlsoSzintA
class AlsoSzintB
class AlsoSzintN
class FelsoSzint

FelsoSzint -right-> FelsoSzintService 
AlsoSzintA -up-|>  FelsoSzintService 
AlsoSzintB -up-|>  FelsoSzintService
AlsoSzintN -up-|> FelsoSzintService
 
@enduml
```
![Alap DIP](https://github.com/OOHQ3E/RTTVizsga20230111/blob/main/images/defaultDIPuml.png)

### Mi a kedvenc design pattern?
választott: state
state pattern elmagyarázása, benne a DIP hogyan jelenik meg
### state pattern UML

```
@startuml
hide empty fields
class Context{
void request()
}

interface State{
void handle()
}

class ConcreteStateA{
void handle()
}
class ConcreteStateB {
void handle()
}

note "state.handle()" as ContextNote
Context *-right- State
ConcreteStateA -up-|> State
ConcreteStateB -up-|> State
Context .. ContextNote
@enduml
```
![Alap State Pattern](https://github.com/OOHQ3E/RTTVizsga20230111/blob/main/images/defaultStatePatternUML.png)

### konkrét State megvalósítás:

```
@startuml
hide empty members
interface State{
  void changeState(Phone phone)
}
class Phone{
  State state
  void changeState(Phone phone)
  void press()
}

class OnState{
  void changeState(Phone phone)
}
class OffState{
  void changeState(Phone phone)
}


Phone *-right> State
OffState -up-|> State
OnState -up-|> State
@enduml
```

![Alap plantuml](https://github.com/OOHQ3E/RTTVizsga20230111/blob/main/images/phoneStatePatternUML.png)
