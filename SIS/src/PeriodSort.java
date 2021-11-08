
public class PeriodSort
	{
		public static void pSort()
		{
			for(int i=0; i<RunSIS.listOfStudents.size();i++)
				{
if(RunSIS.listOfStudents.get(i).getFirstClass().equals("Algebra"))
	{
		System.out.println("Algebra");
		System.out.println(RunSIS.listOfStudents.get(i).getFirstName() +RunSIS.listOfStudents.get(i).getLastName());
	}
else if(RunSIS.listOfStudents.get(i).getFirstClass().equals("English") )
	{
		
	}
else if(RunSIS.listOfStudents.get(i).getFirstClass().equals("Biology") )
	{
		
	}	
		
				}	
	}
	}
