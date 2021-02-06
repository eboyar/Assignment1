import java.util.Scanner;

public class IntPlusOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any number: ");
        int num1 = scan.nextInt();
        num1++;
        
        scan.close();
        
        System.out.println(num1);
    }
}
