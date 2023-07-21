import java.util.Scanner;
public class tall {
	public static void main(String[] args) {
		System.out.println("tallest height runk");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your height : ");
		int size = scanner.nextInt();
		int[] tall = new int[size];
		
			System.out.println("height :" + tall);
		if ( tall.length >= 3 ){
			int tallest = tall[0] ;
        	for (int i = 0; i < size; i++) {
				tall[i] = scanner.nextInt();
				if (tall[i] > tallest)
			 	tallest = tall[i];
        	}
			int tallesttwo = Integer.MIN_VALUE;
        	for (int i = 0; i < size; i++) {
				
				if (tall[i] > tallesttwo && tall [i] < tallest)
            	tallesttwo = tall[i];
			}
			int tallestthree = Integer.MIN_VALUE;
			for (int i = 0; i < size; i++) {
				if (tall[i] > tallesttwo && tall [i] < tallest)
            	tallestthree = tall[i];
			}
			System.out.println("3 tallest : " + tallestthree  + tallesttwo + tallest);
        }
		else {

		}
	}
}