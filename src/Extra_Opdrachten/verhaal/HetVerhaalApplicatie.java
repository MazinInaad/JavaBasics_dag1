package Extra_Opdrachten.verhaal;
public class HetVerhaalApplicatie {

	public static void main(String[] args) {
		HetVerhaal verhaal = new HetVerhaal("jongen", 5, "Basic");
		System.out.println(verhaal.getVerhaal("Hij", "hij"));
	}
}
