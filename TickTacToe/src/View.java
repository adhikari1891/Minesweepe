
public class View  extends TicTacToe {
	static final int X = 1;
	   static final int O = -1;
	public static void printBoard( int [][] matrix ){
	      
	      for( int row = 0; row < matrix.length; row++ ){
	         for( int col = 0; col < matrix[row].length; col++ ){
	            // Uses the "global" constants to print out appropriate letter.
	            if( matrix[row][col] == X )
	               System.out.print("X ");
	            else if(matrix[row][col] == O )
	               System.out.print("O ");
	            else 
	               System.out.print(". ");
	          }
	          // Goes to new line after printing each row
	          System.out.println("");
	       }
	   }


}
