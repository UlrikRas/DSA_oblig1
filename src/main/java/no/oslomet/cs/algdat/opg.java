
package no.oslomet.cs.algdat;

public class opg {

    //Oppgave 1

    public static int maks(int[] a) {
        if (a.length < 1) throw new java.util.NoSuchElementException("Tabellen er tom");

        int indeks = 0; //Indeks for sammenligning
        int temp;
        for (int i=1; i < a.length; i++) {
            if (a[indeks] > a[i] ) {
                temp = a[indeks]; //Holder verdi av største tall midlertidig
                a[indeks] = a[i]; //Legger verdi av minste tall i lavere indeks
                a[i] = temp; //Legger verdi av største tall i høyere indeks
            }
            indeks++;
        }
        return  a[a.length -1];
    }

    public static int ombyttinger(int[] a) {
        if (a.length < 1) throw new java.util.NoSuchElementException("Tabellen er tom");

        int indeks = 0; //Indeks for sammenligning
        int temp; //Variabel som holder verdi midlertidig
        int bytt = 0; //Teller for ombytter
        for (int i=1; i < a.length; i++) {
            if (a[indeks] > a[i] ) {
                temp = a[indeks]; //Holder verdi av største tall midlertidig
                a[indeks] = a[i]; //Legger verdi av minste tall i lavere indeks
                a[i] = temp; //Legger verdi av største tall i høyere indeks
                bytt++;
            }
            indeks++;
        }
        return bytt;
    }
    /*
    a) Siden hver sammenligning involverer to tall trengs det en sammenligning for n=2.
    Deretter øker antall sammenligninger lineært med n. Så antallet som en funksjon av n er: antall = n-1

    b) Det blir færrest ombyttinger om tabellen allerede er sortert slik at den ikke inneholder noen inversjoner.
    c) Det blir flest ombyttinger om maksverdien ligger i indeks [0]. Da betyr det ikke noe hvordan resten av
    tabellen er sortert for hver sammenligning vil føre til et ombytte.

    d) Antallet ombyttinger avgjøres av startposisjonen til maksverdien. Den kan starte i alle posisjoner fra 1 til n.
    Ligger den i n blir det 0 ombyttinger. Ligger den i 1 blir det n-1 ombyttinger. FOr hver posisjon den går fra 1 mot n
    blir det en ombytting mindre. Snittet blir da summen av antall ombytter for de ulike posisjonene til maxverdien,
    delt på antallet elementer i tabellen. Så antall ombytter blir n-1 + n-2 + ... + 1 (Når n ligger nest sist) delt på n.

     */

    //Oppgave 2

    public static int antallUlikeSortert(int[] a) {
            if (a.length < 1) return 0;
            int j = 0; //Variabel for indeksnummer
            int sum = 1; //Teller antall ulike
            for (int i=1; i < a.length;i++) {
                if (a[j] > a[i]) throw new IllegalStateException("Tabellen er ikke sortert i stigende rekkefølge!");
                if (a[j] < a[i]) sum++;
                j++;
            }
            return sum;
    }

    //Oppgave 3

    public static int antallUlikeUsortert(int[] a) {
        if (a.length < 1) return 0;
        int sum = 1; //Teller antall ulike.
        int lengde = a.length; //Hjelpevariabel lik tabellens lengde

        for (int i = 1; i < lengde; i++) {
            int j;
            for (j = 0; j <i; j++) {
                if (a[i] == a[j]) break;
            }

            if (i == j) sum++;
        }
        return sum;
        }

    //Oppgave 4
    public static void sorter(int[] a, int fra, int til) {
        if ( til > a.length || fra < 0) throw new IndexOutOfBoundsException("Øver grense for intervall er for høy!");

        if (fra >= til-1) return;
        int pivotIndeks = til-1; //Velger siste tabellelement som indeks
        int pivotVerdi = a[pivotIndeks]; //Holder verdi av pivotelement
        int temp; //Variabel for swapping
        int i = fra-1;
        for (int j=fra; j < pivotIndeks; j++) {
            if (a[j] < pivotVerdi) { //Sammenligner element med pivot.
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[pivotIndeks] = a[i+1];
        a[i+1] = pivotVerdi;

        int pi= i+1; //Indeks til pivot etter bytte

        sorter(a,fra, pi);
        sorter(a,pi+1, til);
    }

    //Oppgave 5
    public static void delsortering(int [] a) {
        if (a.length < 2) return;
        int odde=0; //Peker på indeks for siste observerte odddtall
        int temp; //Holder swap verdi

        for (int i=0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                temp = a[i];
                a[i] = a[odde];
                a[odde] = temp;
                odde++;
            }
        }

        sorter(a,0,odde);
        sorter(a,odde,a.length);

    }
    //Oppgave 6
    public static void rotasjon(char[] a) {
        if (a.length < 2) return;
        char temp = a[a.length-1]; //Tar vare på siste verdi
        //Tilegener hver indeks verdien til foregående indeks
        for ( int i = a.length-1; i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0] = temp; //Legger lagret verdi inn på starten
    }

    //Oppgave8a
    public static String flett(String s, String t) {
        String flettet = ""; //Blir den nye strengen
        int i = 0, j = 0;
        //Håndtering av tom streng
        if (s.isEmpty()) {
            flettet = t;
            return flettet;
        }
        else if (t.isEmpty()) {
            flettet = s;
            return flettet;
        }
        else if (t.isEmpty() && s.isEmpty())  {
            return flettet;
        }
        while ( i < s.length() && j < t.length() ) {
            flettet += s.charAt(i);
            i++;
            flettet += t.charAt(j);
            j++;
        }
        //løkke for resterennde karakterer
        while (i < s.length()) {
            flettet += s.charAt(i);
            i++;
        }
        while (j < t.length()) {
            flettet += t.charAt(j);
            j++;
        }

        return flettet;
    }

    //Oppgave8b
    public static String flett(String... s) {
        String flettet = "";

        for (int i=0; i < s.length; i++) {

            for (int j=0; j < s.length; j++) {
                if (s[j].length()-1 < i) continue;
                flettet += s[j].charAt(i);
            }
        }

        return flettet;
    }

    static void main() {
        int[] a = {6, 10, 9, 4, 1, 3, 8, 5, 2, 7};
        //int[] a = {10,80,30,90,40};
        delsortering(a);
        System.out.println(java.util.Arrays.toString(a));
    }

}
