
public class WinterMountain extends Mountain
{
	private double temperature;
	private String landName = "Winter Mountain";
	WinterMountain(int l, int w, double temperature, int numMountains)
	{
		super(l, w, numMountains);
		this.temperature = temperature;
	}
	
	public String winterMountainData()
	{
		return this.landName + " " + this.terrainSize() + " and has temperature " + this.temperature + " and " + this.numMountains + " mountains.";
	}
}
