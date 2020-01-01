public class Catapult
{
	/**
	 * Default Contructor
	 */
	Catapult()
	{
		
	}
	
	/**
	 * Method to launch the catapult
	 * @param degrees Angle to launch at
	 * @param velocity Velocity to launch at
	 * @return Range of launch
	 */
	public double launch(int degrees, int velocity)
	{
		return (Math.pow(velocity, 2) * Math.sin(2 * Math.toRadians(degrees))) / 9.8;
	}
}
