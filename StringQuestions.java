class StringQuestions 
{
	public static void main(String[] args) 
	{
		Str s = new Str();
		System.out.println("\n**************Assignment-1*****************\n");
		s.character();
		System.out.println("\n**************Assignment-2*****************\n");
		s.palin();
		System.out.println("\n**************Assignment-3*****************\n");
		s.remov();
	}
}
class Str
{
	//Assignment-1 Check whether the string is palindrome or not.
	void palin(){
		StringBuffer s2 = new StringBuffer("madam") ;
		int b = s2.length();
		int out = 0;
		for(int j=0; j<(b/2); j++){
			if((s2.charAt(j) == (s2.charAt((b-1)-j))) ){
				out++;
			}
			else{
				System.out.println(s2+" is not a palindrome\n");
				break;
			}
		}
		if(out == (b/2)){
			System.out.println(s2+" is a palindrome\n");
		}
	}
	//Assignment-2 Print the index of each letter
	void character(){
		String s1 = "Java is a Programming Language";
		int a = s1.length();
		for(int i=0; i<a; i++){
			System.out.println("Character at "+ (i+1)+ " is : "+ s1.charAt(i));
		}
	}
	//Assignment-3 Remove a paticular character from the string.
	void remov(){
		StringBuffer s3 = new StringBuffer("ajaykarthi");
		System.out.println("Orginal String : "+s3);
		char c = 'a';
		System.out.println(c+" is the letter to be removed");
		int a = s3.length();
		for (int i=0; i<a; i++)
		{
			if(s3.charAt(i)==c){
				s3.deleteCharAt(i);
				i--;
				a = s3.length();
			}
		}
		System.out.println("Output String : "+s3);
	}
}
