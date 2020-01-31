import java.util.Scanner;

public class helloworld {

	
	static boolean Isodd(int x) {
		if(x % 2 == 0 )
			return false; 
		else 
			return true;
	}
	
	
	static void Isodd2(int x) {
		if(x % 2 == 0 )
			System.out.println(false); 
		else 
			System.out.println(true);
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a;
		while((a= scanner.nextInt()) != 0)
		{
			Isodd2(a);
			System.out.println("Give me a number:");
		}
		//boolean b = Isodd(a);
		//System.out.println(b);
	}
	
	
	
}






