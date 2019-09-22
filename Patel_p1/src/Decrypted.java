import java.util.Scanner; 

public class Decrypted {

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
		
		System.out.println("Encrypted integer is: " + swap);
	
// Now we replace each digit through subtracting 7 and dividing by 10 which will leave us with the remainder 
		
		first_digit  = (first_digit + 3) % 10;
		second_digit = (second_digit + 3) % 10;
		third_digit  = (third_digit + 3) % 10;
		fourth_digit = (fourth_digit + 3) % 10;
	
	int reswap = (third_digit * 1000 + fourth_digit * 100 + first_digit * 10 + second_digit); // have to swap back to original location 
	
		System.out.println("Decrypted integer here: " + reswap); 
	}
}