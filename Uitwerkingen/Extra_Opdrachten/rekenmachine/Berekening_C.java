package Extra_Opdrachten.rekenmachine;

public class Berekening_C {

    public int som(int i, int j) {
        int k = i + j;
        return k;
    }

    public int product(int i, int j) {
        int k = i * j;
        return k;
    }

    public static void main(String[] args) {
        Berekening_C berekening = new Berekening_C();
        String invoer = "Het product van 18 * 4 = ";
        int i = berekening.product(19, 4);
        System.out.println(invoer+i);
    }

}
