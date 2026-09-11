# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastruktorer.
Oppgaven er levert av følgende studenter:
* s341921 - s341921@oslomet.no

## Arbeidsfordeling
Oppgaven er løst av en person.

## Oppgavebeskrivelser

### Oppgave 1
Fulgte fremgangsmåten fra eksempel 1.1.2 i læreboken og modifiserte koden i henhold til oppgaven.

a) Siden hver sammenligning involverer to tall trengs det en sammenligning for n=2.
Deretter øker antall sammenligninger lineært med n. Så antallet som en funksjon av n er: antall = n-1

b) Det blir færrest ombyttinger om tabellen allerede er sortert slik at den ikke inneholder noen inversjoner.
c) Det blir flest ombyttinger om maksverdien ligger i indeks [0]. Da betyr det ikke noe hvordan resten av
    tabellen er sortert for hver sammenligning vil føre til et ombytte.

d) Antallet ombyttinger avgjøres av startposisjonen til maksverdien. Den kan starte i alle posisjoner fra 1 til n.
    Ligger den i n blir det 0 ombyttinger. Ligger den i 1 blir det n-1 ombyttinger. FOr hver posisjon den går fra 1 mot n
    blir det en ombytting mindre. Snittet blir da summen av antall ombytter for de ulike posisjonene til maxverdien,
    delt på antallet elementer i tabellen. Så antall ombytter blir n-1 + n-2 + ... + 1 (Når n ligger nest sist) delt på n. 

### Oppgave 2
Skrev bare algoritmen rett frem. Som en omskriving av metoden fra opg.1. Fikk feil i første versjon da 
sum-variabelen startet på 0. Skjønte da at denne må starte på 1 siden den kun teller 1 for de første
to ulike tallene.

### Oppgave 3
https://www.geeksforgeeks.org/dsa/count-distinct-elements-in-an-array/

### Oppgave 4
Benyttet boblesortering fra delkapitel 1.3.3. Feilet på tid. Satt meg ned med penn og papir og tegnet den opp.
Første versjon brukte 28833 ms hvor kravet var 100ms. Så ikke bare ineffektiv...
Implementer

### Oppgave 5
Lærebok delkap.1.3.3 for sortering. Feilet edge cases for kun par/oddetall. Feilet på tid.
https://www.youtube.com/watch?v=ep8yXQ7xVcE

### Oppgave 6
Lærebok delkap.1.x.x for ...... https://www.geeksforgeeks.org/dsa/c-program-cyclically-rotate-array-one/

### Oppgave 8
Delkap 1.3.11. syntax for chatAt på w3