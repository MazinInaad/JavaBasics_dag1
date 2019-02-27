package Extra_Opdrachten.rekenmachine;

public class Berekening_D {

    public int som(int i, int j) {
        int k = i + j;
        return k;
    }

    public int product(int i, int j) {
        int k = i * j;
        return k;
    }

    public int verschil(int i, int j) {
        int k = i - j;
        return k;
    }

    public double quotient(double i, double j) {
        double k = i / j;
        return k;
    }

    public static void main(String[] args) {
        Berekening_D berekening = new Berekening_D();
        int eenLeukeNaam = 66;
        int eenLeukeNaam2 = 4;
        int somResultaat = berekening.som(eenLeukeNaam, eenLeukeNaam2);
        int productResultaat = berekening.product(eenLeukeNaam, eenLeukeNaam2); // schrijf de missende methodes en roep ze aan
        int verschilResultaat = berekening.verschil(eenLeukeNaam, eenLeukeNaam2);
        double quotientResultaat = berekening.quotient(eenLeukeNaam, eenLeukeNaam2);
        System.out.println("Het resultaat van " + eenLeukeNaam + " + " + eenLeukeNaam2 + " = " + somResultaat);
        System.out.println("Het resultaat van " + eenLeukeNaam + " * " + eenLeukeNaam2 + " = " + productResultaat);
        System.out.println("Het resultaat van " + eenLeukeNaam + " - " + eenLeukeNaam2 + " = " + verschilResultaat);
        System.out.println("Het resultaat van " + eenLeukeNaam + " / " + eenLeukeNaam2 + " = " + quotientResultaat);
    }

}
