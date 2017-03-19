package szoftlab;

public class TunnelEntrace {

	private boolean active=false;
	private String Name;
	
	public TunnelEntrace(boolean act)
		{active=act;}
	
	public String toString()
		{
			return "Name: " + Name + " Activities:" +active; 
		}
	
	public void activate()
		{
			active=true;
		}
	
	public void deactivate()
		{
			active=false;
		}
	
	public boolean GetActive()
		{
			return active;
		}

	public String GetName()
	{
		return Name;
	}
	
}
