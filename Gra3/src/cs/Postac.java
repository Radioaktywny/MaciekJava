package cs;
/**
 * 
 * @author Maciej Kulikiewicz
 *
 */
import java.util.*;
public abstract class Postac {
	
	/**
	 * @param nazwa_postaci nazwa postaci
	 * @param zycie
	 * @param lewy przycisk myszy
	 */
	private Scanner znak=new Scanner(System.in);
	protected String nazwa_postaci;
	protected int zycie;
	boolean lewy_przycisk_myszy;
	/**
	 * Metoda odpowiedzialna za strzelanie
	 */
	public void strzelaj()
	{	
		
	
		if (lewy_przycisk_myszy==true)
		{
		
		}
	}
	/**
	 * Metoda odpowiedzialana za chodzinie gracza  
	 * @param znak pobiera znak z klawiatury
	 * @param x przechowuje wspolrzedna x gracza
	 * @param y	przechowuje wspolrzedna y gracza
	 */
	int znaki;
	public void idz(int x , int y) 
	{
		
		
	 switch (znak.next().charAt(0))
	 {
		 case 'w':
		 {	
			 y++;
			 System.out.println("Ide do przodu :D");
			 break;
		 }
		 case 's':
		 {	
			 y--;
			 break;
		 } 
		 case 'd':
		 {	
			 x++;
			break;
		 } 
		 case 'a':
		 {	
			 x--;
			 break;
		 }
	 }
		
	}
	/**
	 * 
	 * @param magazynek
	 */
	public static void strzelaj(int magazynek)
	{
		try
		{
			int liczba_naboi=30;
			liczba_naboi=liczba_naboi/magazynek;
		}
		catch(ArithmeticException example)
		{
			System.out.println("Nie ma wiecej kul\n");
		}
		
		while(magazynek<0)
		  {	
			System.out.println(" Strzal ! zostalo" + magazynek + " kul" );
			magazynek--;
		  }
	}
}
