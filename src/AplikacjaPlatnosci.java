public interface AplikacjaPlatnosci {

	/**
	 * 
	 * @param zakupy
	 */
	void realizacja_platnosci(Zakupy zakupy);

	/**
	 * 
	 * @param zakupy
	 */
	void drukuj_paragon(Zakupy zakupy);

	void drukuj_potwierdzenie();

}