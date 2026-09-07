package no.oslomet.cs.algdat;

public class opg {

    //Oppgave 1
    /*
    public static int maks(int[] a) {
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

    } */

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


    static void main() {
        int[] a = {3, 5, 4, 3, 5, 6, 7, 9, 7, 8};

        System.out.println(antallUlikeUsortert(a));
    }
}
