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
	
	public Snajperska()
	{
		super("AWP" , 1000, 60  ,100 ,30 ,100);
	}
	
	public Snajperska(String nazwa , int zasieg , int ciezar,int magazynek ,int dmg, int ilosc_naboi, int rozrzut , int dlugosc_kolby){
		super(nazwa , zasieg, ciezar ,dmg ,ilosc_naboi ,rozrzut);
		this.dlugosc_kolby = dlugosc_kolby;
		this.magazynek = magazynek;
	}
	
	void przybliz()
	{	
		if(prawy_przycisk = true)
		{
		 screen = screen *2;
		}		
	}
	
	public int obrazenia() 
	{
		return super.dmg;
	}
	
	public int ciazar() 
	{
		return super.ciezar;
	}
	
	public String toString()
	{
		return("To Jest Broñ snajperska po jednym szczele w gowie trup na miejscu ");
	}
	
}
