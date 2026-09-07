package no.oslomet.cs.algdat;

public class opg {

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
    static void main() {
        int[] a = {1,3,9,2,7,5};
        maks(a);
        System.out.println(maks(a));
    }
}
