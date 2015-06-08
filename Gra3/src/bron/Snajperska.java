package bron;

/**
 * 
 * @author Maciej Kulikiewcz
 *
 */
public class Snajperska extends Bron {
	/**
	 * @param celownik
	 * @param prawy_przycisk
	 * @param dlugosc_kolby
	 * 
	 */
	boolean celownik = false;
	boolean prawy_przycisk;
	int dlugosc_kolby;
	int magazynek;
	int screen;
	/**
	 * Konstruktor Domyslny
	 */
	public Snajperska()
	{
		super("AWP" , 1000, 60  ,100 ,30 ,100);
	}
	/**
	 * Konstruktor 8 argumentowy
	 * @param nazwa
	 * @param zasieg
	 * @param ciezar
	 * @param magazynek
	 * @param dmg
	 * @param ilosc_naboi
	 * @param rozrzut
	 * @param dlugosc_kolby
	 */
	public Snajperska(String nazwa , int zasieg , int ciezar,int magazynek ,int dmg, int ilosc_naboi, int rozrzut , int dlugosc_kolby){
		super(nazwa , zasieg, ciezar ,dmg ,ilosc_naboi ,rozrzut);
		this.dlugosc_kolby = dlugosc_kolby;
		this.magazynek = magazynek;
	}
	/**
	 * Metoda przybliza ekran
	 */
	protected void przybliz()
	{	
		if(prawy_przycisk = true)
		{
		 screen = screen *2;
		}		
	}
	/**
	 * Metoda zwraca obrazenia
	 *@return obrazenia
	 */
	public int obrazenia() 
	{
		return super.dmg;
	}
	/**
	 * Metoda zwraca ciezar
	 * @return ciezar
	 */
	public int ciazar() 
	{
		return super.ciezar;
	}
	/**
	 * Przeslonieta metoda toString
	 */
	public String toString()
	{
		return("To Jest Broñ snajperska po jednym szczele w gowie trup na miejscu ");
	}
	/**
	 * Metoda wyswietla specyfikacje
	 */
	public void wyswietl_specyfikacje()
	{
		System.out.println(toString());
	}
	public void strzelaj(int x, int y, int z) {
		
		
	}
}
