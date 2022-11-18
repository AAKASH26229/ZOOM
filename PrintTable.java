package Day4;
//Wap to print table between 2 to 6 
// Using nested for loop
import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		System.out.println("Enter any two number you want table of ");
		Scanner s = new Scanner(System.in);
		n1 = s.nextInt();
		n2 = s.nextInt();
		for(int n=n1;n<=n2;n++) {
			System.out.println("Table number of " +n);
				for(int i=1;i<=10;i++)
			      {
					System.out.println(n+" * "+ i +" = "+ n*i);
			      }
		}
	}

}
