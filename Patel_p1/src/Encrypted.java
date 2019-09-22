import java.util.Scanner;

public class Encrypted {

	public static void main(String[] args) {
		
	int four_digits; 
	
	System.out.println("Input four digit number here: ");
	
	Scanner scan = new Scanner(System.in);
	four_digits = scan.nextInt();
	scan.close();
	
	// getting each digit by itself so I can I add 7 to each term and then get module of 10
	int n = four_digits;
	int first_digit  = n / 1000;
	int second_digit = (n % 1000) / 100;
	int third_digit  = (n % 100) / 10;
	int fourth_digit = n % 10;
	
	first_digit  = (first_digit + 7) % 10;
	second_digit = (second_digit + 7) % 10;
	third_digit  = (third_digit + 7) % 10;
	fourth_digit = (fourth_digit + 7) % 10;

	int swap = (third_digit * 1000 + fourth_digit * 100 + first_digit *10 + second_digit); // swapping the first term with third and the second term with fourth
	
	System.out.print("Encrypted integer is: " + swap);
	}
}