class BasicProgram 
{
	public static void main(String[] args) 
	{
		Program p = new Program();
		p.areaOfRectangle();
		p.Product();
		p.Ascii();
		p.DoubleToInt();
		p.AddToAscii();
		p.Decimal();
		p.Square();
		p.Cube();
	}
}

class Program
{
	void areaOfRectangle(){
		int l=3, b=2;
		System.out.println("\nTo find the area of triangle of length "+l+" and breath "+b+" is : "+(l*b));
	}
	void Product(){
		double a=8.2, b=6.;
		System.out.println("\nThe product of two numbers "+a+" and "+b+" is : "+ (a*b));
	}
	void Ascii(){
		char c = 'H';
		int i = c;
		System.out.println("\nThe ASCII value if "+c+" is : "+ i);
	}
	void DoubleToInt(){
		double d =100.235;
		int i = (int)d;
		//int l = (int)Math.round(d);
		System.out.println("\nConvert the double value "+d+" to int value : "+i);
	}
	void AddToAscii(){
		char c1 = 'D';
		//int i = c1+3;
		char c2 = (char)(c1+3);
		System.out.println("\nAdd 3 to the ASCII value of "+c1+" : "+ c2);
	}
	void Decimal(){
		int i=5;
		double f1 = 6.2;
		System.out.print("\nAdd "+i+" and "+f1+" then print upto 3 decimals : ");
		System.out.printf("%.3f",i+f1);
	}
	void Square(){
		double d1 = 3.9;
		double d2 = Math.pow(d1,2);
		System.out.println("\n\nSquare of the number "+ d1+ " is : "+d2);
	}
	void Cube(){
		double d1 = 3.2;
		double d2 = Math.pow(d1,3);
		System.out.println("\nCube of the number "+ d1+ " is : "+d2 + "\n");
	}
}