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
            int sum = 1; //Teller antall ulike.
            for (int i=1; i < a.length;i++) {
                if (a[j] > a[i]) throw new IllegalStateException("Tabellen er ikke sortert i stigende rekkefølge!");
                if (a[j] < a[i]) sum++;
                j++;
            }
            return sum;
    }

    static void main() {
        int[] a = {3, 3, 4, 5, 5, 6, 7, 7, 7, 8};

        System.out.println(antallUlikeSortert(a));
    }
}
