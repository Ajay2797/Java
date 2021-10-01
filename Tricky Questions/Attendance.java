import java.util.*;
class Attendance 
{
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		System.out.print("classes held  : ");
		int totalClassHeld = s.nextInt();
		System.out.print("\nclasses attended  : ");
		int totalClassAttended = s.nextInt();
		int p;

		if(totalClassHeld >= totalClassAttended && totalClassHeld > 0 && totalClassAttended > 0){

			p = (int)((totalClassAttended/(float)totalClassHeld)*100);
			System.out.println("\nHe attended "+p+"% of the classes\n");

			if(p>=75){
				System.out.println("He have "+p+"% of attendence, so he is allowed to take the exam\n");
			}
			else{
				System.out.println("He is not allowed to take the exam since his attendence is less than 75%\n");
			}
		}
		else{
			System.out.println("Enter a valid input\n");
		}
	}
}
