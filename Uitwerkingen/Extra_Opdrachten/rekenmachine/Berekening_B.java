package Extra_Opdrachten.rekenmachine;

public class Berekening_B {
	
	public int som(int i, int j) {
		int k = i + j;
		return k;
	}
	
	public static void main(String[] args) {
		Berekening_B berekening = new Berekening_B();
		String invoer = "Het som van 6 + 12 = ";
		int a = berekening.som(6,12);
		System.out.println(invoer + a);
	}
	
}
