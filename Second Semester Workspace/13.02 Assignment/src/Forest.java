
public class Forest extends Terrain
{
	private int numTrees;
	private String landName = "Forest";

	public Forest(int l, int w, int numTrees)
	{
		super(l, w);
		this.numTrees = numTrees;
	}
	
	public String forestData()
	{
		return this.landName + " " + this.terrainSize() + " and has " + this.numTrees + " trees.";
	}
}
