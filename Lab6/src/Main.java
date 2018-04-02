import java.util.Scanner;

public class Main {

	static int a;
	static int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter");
		Scanner scanner = new Scanner(System.in);
		String a1 = scanner.next();
		String b1 = scanner.next();
		//System.out.println(a1+" "+b1);
	
		a=Integer.parseInt(a1);	
		b=Integer.parseInt(b1);
		
		
		System.out.println(run(a,b));

		
		
		


	}
	
	public static String run(int a, int b){
		//System.out.println(0);
		int n=0;

		if(a==b) {		//System.out.println(1);

		return "0";
		}
		else
			while(a<b){
				//System.out.println(2);
				if(a*3<=b){
					while(a+3<b){
					//System.out.println(4);
					a=mult(a);
					n++;
					}
				}
				if(a-b>0&&a-b<2)
					
					System.out.println(3);
					a=plus(a);
					n++;

			}
		return (n+" - "+a);
	}
	
	public static int plus(int a) {
		return a=a+1;
	}
	public int min(int a) {
		return a=a-1;
	}
	public int div(int a){
		return a=a/3;
	}
	public static int mult(int a){
		return a=a*3;
	}

}
