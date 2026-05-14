package practice;

import java.util.ArrayList;

public class Studentop {
		ArrayList<Student>students=new ArrayList<Student>();
		public void addStudent(Student s)
		{
			students.add(s);
		}
		public void viewStudent() {
			for(Student s:students)
			{
				System.out.println(s);
			}
			
		}
       public void searchStudent(int searchId)
       {
    	   for(Student s:students)
    	   {
    		   if(s.getId()==searchId)
    		   {
    			   System.out.println(s);
    			   return;
    		   }
    		  
    	   }
    	   System.out.println("student not found");
       }
       public void updateStudent(int updateId,String newname,int newmarks) {
    	   for(Student s:students)
    	   {
    		   if(s.getId()==updateId)
    		   {
    			   s.setName(newname);
    			   s.setMarks(newmarks);
    			   System.out.println("student not found");
    			   return;
    		   }
    	   }
    	   System.out.println("student not found");
  
       }
       public void deleteStudent(int delId)
	   {
		   for(Student s:students)
		   {
			   if(s.getId()==delId)
			   {
				  students.remove(s);
				  return;
			   }
				
		   }
		   System.out.println("student not found");
	   }
}
