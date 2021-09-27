class PatternQuestions
{
	public static void main(String[] args) 
	{
		Patt p = new Patt();
		System.out.println("PATTERN : 1");
		p.ptn_1();
		System.out.println("*****************************************************");
		System.out.println("PATTERN : 2");
		p.ptn_2();
		System.out.println("*****************************************************");
		System.out.println("PATTERN : 3");
		p.ptn_3();
		System.out.println("*****************************************************");
		System.out.println("PATTERN : 4");
		p.ptn_4();
		System.out.println("*****************************************************");
		System.out.println("PATTERN : 5");
		p.ptn_5();
		System.out.println("*****************************************************");
		System.out.println("PATTERN : 6");
		p.ptn_6();
		System.out.println("*****************************************************");
		System.out.println("PATTERN : 7");
		p.ptn_7();
		System.out.println("*****************************************************");
		System.out.println("PATTERN : 8");
		p.ptn_8();
		System.out.println("*****************************************************");
		System.out.println("PATTERN : 9");
		p.ptn_9();
		System.out.println("*****************************************************");
		System.out.println("PATTERN : 10");
		p.ptn_10();
		System.out.println("*****************************************************");
	}
}
class Patt
{
	int a = 5;
	//PATTERN NUMBER : 1
	public void ptn_1(){
		int b , out;
		for (int i=1; i<=a ; i++)
		{
			System.out.print(i+" ");
			b = a;
			out = i;
			for (int j=1; j<i ; j++)
			{
				b--;
				out = out + b;
				System.out.print(out+" ");
			}
			out = 0;
			System.out.println("");
		}
	}
	//PATTERN NUMBER : 2
	public void ptn_2(){
		for(int i = a; i>0; i--){
			for(int j = 1; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	//PATTERN NUMBER : 3
	public void ptn_3(){
		for(int i = a; i>0; i--){
			for(int j = ((a-i)+1); j<=a; j++){
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	//PATTERN NUMBER : 4
	public void ptn_4(){
		for(int i = a; i>0; i--){
			for(int j = a; j>=((a-i)+1); j--){
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	//PATTERN NUMBER : 5
	public void ptn_5(){
		for(int i = 1; i<=a; i++){
			for(int j = ((a-i)+1); j<=a; j++){
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	//PATTERN NUMBER : 6
	public void ptn_6(){
		for(int i = 1; i<=a; i++){
			for(int j = i; j>0; j--){
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	//PATTERN NUMBER : 7
	public void ptn_7(){
		for(int i = a; i>0; i--){
			for(int j = a; j>=i; j--){
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	//PATTERN NUMBER : 8
	public void ptn_8(){
		for(int i = 1; i<=a; i++){
			for(int j = i; j<=a; j++){
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
	//PATTERN NUMBER : 9
	public void ptn_9(){
		for(int i = 1; i<=a; i++){
			for(int j = 1; j<=i; j++){
				if(((i+j)%2)==0){
					System.out.print("1 ");
				}
				else{
					System.out.print("0 ");
				}
			}
			System.out.println("");
		}
	}
	//PATTERN NUMBER : 10
	public void ptn_10(){
		for(int i = a; i>0; i--){
			int x = a-i;
			for(int j = ((a-i)+1); j<=a; j++){
				System.out.print((j+x) +" ");
				x++;
			}
			System.out.println("");
		}
	}
}

