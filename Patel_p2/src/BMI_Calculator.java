import java.util.Scanner; 

public class BMI_Calculator {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
			
			int input;
			double BMI, weight, height;
			
		System.out.print ("Input your weight in Pounds here: ");
			weight = scan.nextDouble();
		System.out.print ("Input your height in inches here: ");
			height = scan.nextDouble();
		System.out.print("Pick one of the following equation: \n");
		
	System.out.println("input 1 to pick the following equation: ");
				System.out.print ("BMI = (703 * weight) / (height * height) \n");
	System.out.println("input 2 to pick the following equation: ");
				System.out.print("BMI = Weight / (height * height) ");
		input = scan.nextInt();
		scan.close();
		
		if (input == 1) 
		{
			BMI = (703 * weight) / (height * height);
			System.out.println("The BMI of yours is "+ BMI);
		}
		if (input == 2)
		{
			weight = weight * 0.453592; // conversion from pounds to kilograms. 
			height = height * 0.0254;  //  conversion from inches to meters. 
			BMI = (weight) / (height * height);
		System.out.println("The BMI of yours is  " + BMI);
		}
		else 
		{
			System.out.println ("Error: please input x or y to pick your equation");
		}
		
        System.out.println ("BMI VALUES");
        System.out.println ("Underweight: less than 18.5");
        System.out.println ("Normal:      between 18.5 and 24.9");
        System.out.println ("Overweight:  between 25 and 29.9");
        System.out.println ("Obese:       30 or greater");
       
       
    }
}