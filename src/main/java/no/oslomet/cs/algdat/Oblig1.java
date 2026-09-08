package no.oslomet.cs.algdat;

public class Oblig1 {

    private Oblig1() {}

    // Oppgave 0
    public static int gruppeMedlemmer() {
        return 1;
    }

    // Oppgave 1
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

    // Oppgave 2
    public static int antallUlikeSortert(int[] a) {
        if (a.length < 1) return 0; //Returnerer 0 for tom tabell
        int j = 0; //Variabel for indeksnummer
        int sum = 1; //Teller antall ulike.
        for (int i=1; i < a.length;i++) {
            if (a[j] > a[i]) throw new IllegalStateException("Tabellen er ikke sortert i stigende rekkefølge!");
            if (a[j] < a[i]) sum++;
            j++;
        }
        return sum;
    }

    // Oppgave 3
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


    // Oppgave 4
    public static void sorter(int[] a, int fra, int til) {
        if ( til > a.length || fra < 0) throw new IndexOutOfBoundsException("Øver grense for intervall er for høy!");

        for (int intervall = til-fra; intervall > 1; intervall--) {
            for (int i = fra + 1; i < til; i++) { //Til -1 for å ikke inkludere grenseindeksen.
                int temp; //Holder verdi midlertidig
                if (a[i] < a[i - 1]) {
                    temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }

            }
        }
    }

    // Oppgave 5
    public static void delsortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 6
    public static void rotasjon(char[] a) {throw new UnsupportedOperationException();}

    // Oppgave 7
    public static void rotasjon(char[] a, int k) {throw new UnsupportedOperationException();}

    // Oppgave 8
    public static String flett(String s, String t) {throw new UnsupportedOperationException();}

    public static String flett(String... s) {throw new UnsupportedOperationException();}

    // Oppgave 9
    public static int[] indeksSortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 10
    public static int[] tredjeMin(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 11
    public static boolean inneholdt(String a, String b) {throw new UnsupportedOperationException();}
}