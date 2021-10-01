import java.util.*;
class CapsOrSmall 
{
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		System.out.print("Enter a character  : ");
		char c = s.next().charAt(0);

		if(c>64 && c<91){
			System.out.println("\nInput character in upper case.\n");
		}
		else if(c>96 && c<123){
			System.out.println("\nInput character in lower case.\n");
		}
		else{
			System.out.println("\nEnter a valid character\n");
		}
	}
}

