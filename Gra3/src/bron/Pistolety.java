package bron;
/**
 * 
 * @author Maciej Kulikiewicz
 *
 */

public class Pistolety extends Bron {
	/**
	 * @param tlumik
	 * @param szybkoscruchu
	 * @param kolor
	 */
	protected boolean tlumik;
	protected int szybkoscruchu;
	protected String kolor;
	/**
	 * Konstruktor domyslny
	 */
	public Pistolety()
	{
		super();
	}
	/**
	 * Konstruktor 9 argumentowy
	 * @param nazwa
	 * @param zasieg
	 * @param ciezar
	 * @param magazynek
	 * @param dmg
	 * @param ilosc_naboi
	 * @param rozrzut
	 * @param tlumik
	 * @param kolor
	 */
	public Pistolety(String nazwa , int zasieg , int ciezar,int magazynek ,int dmg, int ilosc_naboi, int rozrzut , boolean tlumik , String kolor)
	{
		super(nazwa , zasieg, ciezar ,dmg ,ilosc_naboi ,rozrzut);
		this.tlumik=tlumik;
		this.kolor=kolor;
	}
	/**
	 * Metoda wystepuje jezeli bron ma t³umik
	 */
	public void rozrzut_tlumik()
	{
		if(tlumik= true)
		{
			rozrzut=rozrzut/2;
		}
	}
	/**
	 * Metoda zwraca obrazenia
	 * @return obrazenia
	 */
	
	public int obrazenia() 
	{
		return super.dmg;
	}

	/**
	 *  Metoda zwraca ciezar broni
	 *  @return ciezar
	 */
	public int ciazar() 
	{
		return super.ciezar;
	}

	public void wyswietl_specyfikacje()
	{
		System.out.println(toString());
	}
	public void strzelaj(int x , int y ,int z)
	{
		if()
	};
}
