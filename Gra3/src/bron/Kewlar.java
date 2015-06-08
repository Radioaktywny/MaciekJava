package bron;

public class Kewlar extends Bron {
	/**
	 * Konstruktor domyslny
	 */
	public Kewlar()
	{
		super("Brak Kewlaru ", 0 , 0 , 0 );
	}
	/**
	 * Konstruktor 4 argumentowy
	 * @param nazwa
	 * @param dmg
	 * @param typ
	 * @param ciezar
	 */
	public Kewlar(String nazwa , int dmg , int  typ , int ciezar)
	{
		super(nazwa ,dmg , typ ,ciezar);
	}
	/**
	 * Metoda zmniejszenia obrazen
	 */
	protected void zmniejsz_obrazenia()
	{
		switch (typ)
		{	
			case 0 : 
			{
			break;	
			}
			case 1 :
			{
			super.dmg = super.dmg - 10;
			break;
			}
			case 2 :
			{
			super.dmg = super.dmg - 20;
			break;
			}
			case 3 :
			{
			super.dmg = super.dmg - 30;
			break;
			}
		}
	}
	/**
	 * Metoda zwraca obrazenia
	 * @return obrazenia
	 */
	public int obrazenia() {
		return super.dmg;
	}
	/**
	 * Metoda zwraca ciezar
	 * @return ciezar
	 */
	public int ciazar() {
		return super.ciezar;
	}

	public void strzelaj(int x, int y, int z) {
		
		
	}
}
