package exceptionHandling;

public class NullPointerException extends Student {
Student Obj_Student;
	   public void school()
	   {
		   try
	      {
          Obj_Student.getId();
	      }catch(Exception e)
	      {
	           System.out.println("Null Pointer ");
	      }
	   }
	}
