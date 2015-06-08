package bron;

public class Pistolety extends Bron {
	protected boolean tlumik;
	protected int szybkoscruchu;
	protected String kolor;
	
	public Pistolety()
	{
		super();
	}
	public Pistolety(String nazwa , int zasieg , int ciezar,int magazynek ,int dmg, int ilosc_naboi, int rozrzut , boolean tlumik , String kolor)
	{
		super(nazwa , zasieg, ciezar ,dmg ,ilosc_naboi ,rozrzut);
		this.tlumik=tlumik;
		this.kolor=kolor;
	}
	public void rozrzut_tlumik()
	{
		if(tlumik= true)
		{
			rozrzut=rozrzut/2;
		}
	}
	
	public int getObrazenia() 
	{
		return super.dmg;
	}

	
	public int getCiezar() 
	{
		return super.ciezar;
	}
	@Override
	public int obrazenia() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int ciazar() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
