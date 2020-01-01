public class StudentData
{
	private String firstName;
	private String lastName;
	private double[] testScores;
	private char grade;
	
	public StudentData(String firstName, String lastName, double[] testScores)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		if (firstName.equals("") || lastName.equals(""))
		{
			throw new IllegalArgumentException("First name or last name cannot be empty");
		}
		
		this.testScores = testScores;
		courseGrade(testScores);
	}
	
	@Override
	public String toString()
	{
		String s = this.firstName + "    " + this.lastName + "    ";
		for (double d : testScores)
		{
			s += String.format("%.2f%s", d, " ");
		}
		s += this.grade;
		return s;
	}
	
	public void courseGrade(double[] list)
	{
		int total = 0;
		int avg = 0;
		if (list.length == 0)
		{
			throw new IllegalArgumentException("Grades list cannot be empty");
		}
		else
		{
			for (double d : list)
			{
				total += d;
			}
			avg = total / list.length;
		}
		if (avg >= 90)
		{
			this.grade = 'A';
		}
		else if (avg >= 80)
		{
			this.grade = 'B';
		}
		else if (avg >= 70)
		{
			this.grade = 'C';
		}
		else if (avg >= 60)
		{
			this.grade = 'D';
		}
		else if (avg >= 50)
		{
			this.grade = 'F';
		}
	}
}