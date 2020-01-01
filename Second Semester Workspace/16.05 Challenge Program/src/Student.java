import java.util.HashMap;

public class Student
{
	private String name;
	private int qz1;
	private int qz2;
	private int qz3;
	private int qz4;
	private int qz5;	
	
	public Student(String name, int qz1, int qz2, int qz3, int qz4, int qz5)
	{
		this.name = name;
		this.qz1 = qz1;
		this.qz2 = qz2;
		this.qz3 = qz3;
		this.qz4 = qz4;
		this.qz5 = qz5;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getQuiz(int quizNumber)
	{
		int ret;
		switch(quizNumber)
		{
		case 1:
			ret = this.qz1;
			break;
		case 2:
			ret = this.qz2;
			break;
		case 3:
			ret = this.qz3;
			break;
		case 4:
			ret = this.qz4;
			break;
		case 5:
			ret = this.qz5;
			break;
		default:
			ret = -1;
		}
		return ret;
	}
	
	public void setQuiz(int quizNumber, int score)
	{
		switch(quizNumber)
		{
		case 1:
			this.qz1 = score;
			break;
		case 2:
			this.qz2 = score;
			break;
		case 3:
			this.qz3 = score;
			break;
		case 4:
			this.qz4 = score;
			break;
		case 5:
			this.qz5 = score;
			break;
		}
	}
	
	public String toString()
	{
		return String.format("%-16s%-8d%-8d%-8d%-8d%-8d", this.getName() + ":", this.getQuiz(1), this.getQuiz(2), this.getQuiz(3), this.getQuiz(4), this.getQuiz(5));
	}
}
