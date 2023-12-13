import java.util.Date;

public class Atrakcja {

	private int id_atrakcji;
	private String nazwa_atrakcji;
	private String lokalizacja;
	private String godziny_otwarcia;
	private String opis_atrakcji;
	private float cena = 0;
	private Boolean rezerwowalne;
	private RezerwacjaAtrakcja rezerwacja_atrakcja;

	/**
	 * 
	 * @param id_atrakcja
	 * @param nazwa_atrakcji
	 * @param lokalizacja
	 * @param godziny_otwarcia
	 * @param opis_atrakcji
	 * @param cena
	 * @param rezerwowalne
	 */
	public Atrakcja Atrakcja(int id_atrakcja, String nazwa_atrakcji, String lokalizacja, String godziny_otwarcia, String opis_atrakcji, float cena, Boolean rezerwowalne) {
		// TODO - implement Atrakcja.Atrakcja
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_atrakcja
	 * @param nazwa_atrakcji
	 * @param lokalizacja
	 * @param godziny_otwarcia
	 * @param opis_atrakcji
	 * @param cena
	 * @param rezerwowalne
	 */
	public Atrakcja modyfikuj_atrakcje(int id_atrakcja, String nazwa_atrakcji, String lokalizacja, String godziny_otwarcia, String opis_atrakcji, float cena, Boolean rezerwowalne) {
		// TODO - implement Atrakcja.modyfikuj_atrakcje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param termin
	 */
	public Boolean sprawdz_dostepny_termin(Date termin) {
		// TODO - implement Atrakcja.sprawdz_dostepny_termin
		throw new UnsupportedOperationException();
	}

}