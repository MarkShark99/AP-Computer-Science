/**
PROJECT TITLE: 16.05 Challenge Program
PURPOSE OF PROJECT: To practice using arrays
VERSION or DATE: 4/16/17
AUTHORS: Mark Washington

**************************** P M R *********************************************
 
<+s>: This program was very easy to write
           
*******************************************************************************
In the future: Use what I've learned when modifying arrays
*/

public class TestStudent
{
	static Student[] myClass = 
		{
				new Student("Mark Kennedy", 70, 80, 90, 100, 90),
				new Student("Max Gerard", 80, 85, 90, 85, 80),
				new Student("Jean Smith", 50, 79, 89, 99, 100),
				new Student("Betty Farm", 85, 80, 85, 88, 89),
				new Student("Dilbert Gamma", 70, 70, 90, 70, 80)
		}; //Array of students
	public static void main(String[] args)
	{
		System.out.println("Starting Gradebook\n");
		printBook();
		
		System.out.println("Changing Betty's name to Betty Boop\n");
		replaceName("Betty Farm", "Betty Boop");
		printBook();
		
		System.out.println("Changing Jean's quiz 1 score to 80\n");
		replaceQuiz("Jean Smith", 1, 80);
		printBook();
		
		System.out.println("Replacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90\n");
		replaceStudent("Dilbert Gamma", new Student("Mike Kappa", 80, 80, 80, 90, 90));
		printBook();
		
		System.out.println("Inserting Lily Mu: 85, 95, 70, 0, 100 before Betty:\n");
		insertStudent("Betty Boop", new Student("Lily Mu", 85, 95, 70, 0, 100));
		printBook();
		
		System.out.println("Deleting Max Gerard\n");
		deleteStudent("Max Gerard");
		printBook();
	}
	
	public static void printBook()
	{
		System.out.println("Student name    Q1      Q2      Q3      Q4      Q5");
		System.out.println("----------------------------------------------------");
		for (Student s : myClass)
		{
			System.out.println(s.toString());
		}
		System.out.println();
	}
	
	public static void replaceName(String name, String newName)
	{
		for (Student s : myClass)
		{
			if (s.getName().equals(name))
			{
				s.setName(newName);
			}
		}
	}
	
	public static void replaceQuiz(String name, int quizNumber, int score)
	{
		for (Student s : myClass)
		{
			if (s.getName().equals(name))
			{
				s.setQuiz(quizNumber, score);
			}
		}
	}
	
	public static void replaceStudent(String name, Student replacementStudent)
	{
		for (int i = 0; i < myClass.length; i++)
		{
			if (myClass[i].getName().equals(name))
			{
				myClass[i] = replacementStudent;
			}
		}
	}

	public static void insertStudent(String name, Student newStudent)
	{
		int position = 0;
		for (int i = 0; i < myClass.length; i++)
		{
			if (myClass[i].getName().equals(name))
			{
				position = i;
				break;
			}
		}
		
		Student[] newStudentArray = new Student[myClass.length + 1];
		for (int i = 0; i < myClass.length; i++)
		{
			newStudentArray[i] = myClass[i];
		}
		
        for(int i = newStudentArray.length - 1; i > position; i--)
        {
            newStudentArray[i] = myClass[i - 1];
        }
        newStudentArray[position] = newStudent;
        myClass = newStudentArray;
	}
	
	public static void deleteStudent(String name)
	{
		int index = -1;
		for (int i = 0; i < myClass.length; i++)
		{
			if (myClass[i].getName().equals(name))
			{
				index = i;
				break;
			}
		}
		if (index != -1)
		{
			int insertIndex = 0;
			myClass[index] = null;
			
			Student[] newMyClass = new Student[myClass.length - 1];
			for (int i = 0; i < myClass.length; i++)
			{
				if (myClass[i] != null)
				{
					newMyClass[insertIndex] = myClass[i];
					insertIndex++;
				}
			}
			myClass = newMyClass;
		}
		else
		{
			System.out.println("Couldn't replace name.");
		}
	}
}