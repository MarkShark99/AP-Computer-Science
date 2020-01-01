
public class Mountain extends Terrain
{
	protected int numMountains;
	private String landName = "Mountain";

	Mountain(int l, int w, int numMountains)
	{
		super(l, w); //length, width
		this.numMountains = numMountains;
	}
	
	public String mountainData()
	{
		return this.landName + " " + this.terrainSize() + " and has " + this.numMountains + " mountains.";
	}
}
