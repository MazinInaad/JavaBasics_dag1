package Extra_Opdrachten.verhaal;

public class HetVerhaal {

	private String geslacht;
	private int leeftijd;
	private String taal;
	private String naam;

	public HetVerhaal(String geslacht, int leeftijd, String taal, String naam) {
		this.geslacht = geslacht;
		this.leeftijd = leeftijd;
		this.taal = taal;
		this.naam = naam;
	}

	public String getVerhaal(String geslachtMetHoofdletter, String geslachtMetKleineLetter) {
		return paragraaf1(geslachtMetHoofdletter) + paragraaf2a(geslachtMetKleineLetter) + paragraaf2b(geslacht) + paragraaf4();
	}

	private String paragraaf4() {
		return "EINDE.";
	}

	private String paragraaf1(String geslacht) {
		return "Er was eens een " + this.geslacht + " van " + leeftijd + " jaar, die een computer had. " + geslacht
				+ " wilde leren wat je allemaal met die computer kunt doen.\n";
	}

	private String paragraaf2a(String geslacht) {
		return "Om dit te leren ging " + geslacht + " een programmeercursus in " + taal + " doen. "
				+"Bij de eerste opdracht verschenen al snel de woorden \"Hallo, wereld.\" op de\nverschillende beeldschermen. "
				+"Na een aantal vele andere opdrachten en cursussen, werd " + geslacht + " gevraagd voor de eerste opdracht...\n";
	}

	private String paragraaf2b(String geslacht) {
		return "Om dit te leren ging " + naam + " spelen met de " + taal + ". Binnen een korte tijd verschenen de woorden "
				+ "\"Hallo, wereld\" op het scherm.\nNa vele regels code, tijd en moeite had " + geslacht + " " + taal + " goed onder"
				+ "de knie om de wereld van de professionele IT'er in te stappen...\n";
	}

}
