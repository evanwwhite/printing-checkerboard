//Evan White
import java.util.Scanner;
public class CheckerboardActivity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		printCheckerboard(6,4);
		
		printCheckerboard(4,3);
		
		printCheckerboard(8,8);	
	}
	public static void printCheckerboard(int height, int width) {
		
		int Rows = height;
	    int Columns = width;
		
	    for (int row=0; row<Rows; row++)
	    {
	    	for(int col=0; col<Columns; col++)
	    	{
	    		if(row % 2 == 0 && col % 2 == 0)
	    			System.out.print("#");
	    		if(row % 2 == 0 && col % 2 == 1)
	    			System.out.print(" ");
	    		if(row % 2 == 1 && col % 2 == 0)
	    			System.out.print(" ");
	    		if(row % 2 == 1 && col % 2 == 1)
	    			System.out.print("#");
	    	}
	    	System.out.println("");    	
	    }
	    	System.out.println("");
	}
	
}
/*
# # 
 # #
# # 
 # #
# # 
 # #

# #
 # 
# #
 # 

# # # # 
 # # # #
# # # # 
 # # # #
# # # # 
 # # # #
# # # # 
 # # # #
*/