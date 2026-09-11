# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastruktorer.
Oppgaven er levert av følgende studenter:
* s341921 - s341921@oslomet.no

## Oppgavebeskrivelser

### Oppgave 1
Fulgte fremgangsmåten fra eksempel 1.1.2 i læreboken og modifiserte koden i henhold til oppgaven. 
Metoden består av en for-løkke som sammenligner to og to tabell-elementer og bytter de om det venstre tallet er
høyere enn det høyre. Dermed "dyttes" den til enhver tid høyest observerte verdien lengre og lengre til høyre
i tabellen. Når hele tabellen er traversert returneres verdien i siste indeks helt til høyre da det vil være maksverdien.

Den andre metoden gjør akkurat det samme, men den teller i tilegg antall ganger det byttes.

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
Skrev bare algoritmen rett frem. Som en omskriving av metoden fra opg.1. Siden tabellen er sortert så samnneligner metoden
bare to og to elementer og teller hvor mange av de som er ulike. Fikk feil i første versjon da 
sum-variabelen startet på 0. Skjønte da at denne må starte på 1 siden enhver ikke-tom tabell har hvertfall 1 tall også
må man telle hvor mange flere ulike det er.

### Oppgave 3
Her er det benyttet et nested for-loop siden alle elementene må sjekkes opp mot samtlige andre element før man kan si om 
de er unike eller ikke. Den indre løkken har en break statement som bryter den om den duplikater oppdages. Om det ikke oppdages
vil den fullføres slik at i == j vil være sant og summen av ulike element inkrementeres. 
Brukte denne artikkelen som hjelp med løsningen:
https://www.geeksforgeeks.org/dsa/count-distinct-elements-in-an-array/

### Oppgave 4
Brukte først boblesortering fra delkapitel 1.3.3. Det fungerte, men brukte utrolig lang tid. Satt meg ned med penn og papir og tegnet den opp for å prøve
å effektivisere den. Det gikk ikke så lette i læreboken etter andre metoder og fant kvikksort. Fikk implementert en versjon av
det etter litt om og men og det fungerte. Metoden bruker en enkel-pivot som er satt til bakerste element. Valget av element var
tilfeldig, måtte bare velge noe. Slet litt med å få til rekursjonen til siste. Det er eneste gang i obligen jeg spurte en LLM om et tips. 

### Oppgave 5
Brukte lærebok delkap.1.3.3 for sortering. Første versjon feilet tester for edge cases for kun par/oddetall
og for tid. Gikk videre med andre oppgaver og kom tilbake til den etter jeg også hadde utbedret opg.4 på tidsbruk. 
Da leste jeg oppgaveteksten igjen og skjønte man kunne kalle metoden i opg.4. Utbedret også partisjoneringen med samme
fremgangsmåte som sorteringen. 

### Oppgave 6
Brukte læreboken delkap.1.3.13 og artikkelen https://www.geeksforgeeks.org/dsa/c-program-cyclically-rotate-array-one/
Metoden lagrer verdien i siste indeks. Deretter traverserer den tabellen og gir hver indeks verdien som ligger i den foregående indeksen.
Deretter legges den lagrede verdien fra siste indeks inn i første indeks.

### Oppgave 8
Brukte læreboken delkap.1.3.13
Metoden sjekker først om en eller begge strengene er tomme og håndterer de tilfellene. Deretter implementeres en while-løkke
som legger annenhver karakter fra de to strengene inn i den samlede strengen inntil en av de tar slutt. Til sist er det en while-løkke
som håndterer resterende karakterer om en av strengene var lengre enn den andre.
