
public class model extends TicTacToe  {
	  
	//hasWon returns true if there was a win or a cat game.
	   public static boolean hasWon( int [][] matrix ){
	      //Variable holds the "result" of hasWon. True if a winner was found.
	      boolean retVal = false;
	      
	      //Check for horizontal win
	      for( int row = 0; row < matrix.length; row++ ){
	         int sum = 0;
	         for( int col = 0; col < matrix[0].length; col++ ){
	            sum += matrix[row][col];
	         }
	         //Check to see if the sum of that row was 3 or -3, a win...
	         if( sum == 3 ){
	            System.out.println("X wins.");
	            retVal = true;
	         } else if ( sum == -3 ) {
	            System.out.println("O wins.");
	            retVal = true;
	         }
	      }
	      
	      //Check for vertical win
	      for( int col = 0; col < matrix[0].length; col++ ){
	         int sum = 0;
	         for( int row = 0; row < matrix.length; row++ ){
	            sum += matrix[row][col];
	         }
	         //Check to see if the sum of that column was 3 or -3, a win...
	         if( sum == 3 ){
	            System.out.println("X wins.");
	            retVal = true;
	         } else if ( sum == -3 ) {
	            System.out.println("O wins.");
	            retVal = true;
	         }
	      }
	      
	      //Check for diagonal win
	      if( (matrix[0][0] + matrix[1][1] + matrix[2][2]) == 3 ){
	         System.out.println("X wins.");
	         retVal = true;
	      } else if ( (matrix[0][0] + matrix[1][1] + matrix[2][2]) == -3 ) {
	         System.out.println("O wins.");
	         retVal = true;
	      }
	      if( (matrix[0][2] + matrix[1][1] + matrix[2][0]) == 3 ){
	         System.out.println("X wins.");
	         retVal = true;
	      } else if ( (matrix[0][2] + matrix[1][1] + matrix[2][0]) == -3 ) {
	         System.out.println("O wins.");
	         retVal = true;
	      }
	      
	      //Check for cat game
	      boolean foundSpace = false;
	      for( int row = 0; row < matrix.length; row++ ){
	         for( int col = 0; col < matrix[0].length; col++ ){
	            if( matrix[row][col] == 0 ) 
	               foundSpace = true;
	         }
	      }
	      if( foundSpace == false ){
	         System.out.println("Ends in tie.");
	         retVal = true;
	      }
	      
	      return retVal;
	   }
	   

}
