import java.util.*; //Imports Scanner.
import java.lang.*; //Imports Math and Exit languages.


public class ArrayGame {
	public static void main(String[] args) {
		String[][] game = { {"O", "O", "O", "O"}, {"O", "O", "O", "O"}, {"O", "O", "O", "O"}, {"O", "O", "O", "O"}, }; //Declares game board array.
		String O = "O";
		String direction = ""; //Indicates which direction the user goes, but this only declares the variable.
		game[0][0] = ("x"); //Sets the "x" sprite's position.
		int winx = (int) (Math.random() * 3 + 1); //declares the x coordinate of "*".
		int winy = (int) (Math.random() * 3 + 1); //declares the y coordinate of "*".
		int losex = (int) (Math.random() * 3 + 1); //declares the x coordinate of "#".
		int losey = (int) (Math.random() * 3 + 1); //declares the y coordinate of "#".
		game[winx][winy] = ("*"); //Creates the "*" sprite.
		game[losex][losey] = ("#"); //Creates the "#" sprite.
		System.out.println("Welcome to the Array Game! Move your sprite \"x\" to the \"*\" to win. If you touch the \"#\", you lose."); //Welcome message.
		for(int row = 0; row < game.length; row++){
			for(int col = 0; col < game[0].length; col++){
				System.out.print(game[row][col] + " ");
			}	
			System.out.println(); //Prints the array to screen.
		}	
	gamePlay(winx, winy, losex, losey, game); //Calls the actual gameplay method.
	}
	public static void gamePlay(int winx, int winy, int losex, int losey, String game[][]) {
		int x = 0; //Declares the starting x coordinate.
		int y = 0; //Declares the starting y coordinate.
	for ( ;(winx!=x||winy!=y); ) { //Runs through program until the coordinates of "x" and "*" match.
		if (losex==x && losey==y){ //When the coordinates of "x" and "#" match, you lose!
			System.out.println("\nSorry, you have lost!");
			System.exit(0); //Exits the loop.
		}
		Scanner kin = new Scanner(System.in); //Creates Scanner.
		System.out.print("\nWhich direction would you like to move? ");
		String direction = kin.nextLine(); //Collects user's direction input (up, down, left, right)
		if (direction.equals("up")) { //Makes sprite go up
			game[x][y] = "O";
			x = x - 1;
			if (x < 0) {
				System.out.println("Invalid Input");
				x = x + 1;
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}
			} else {
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}	
			}
		}
		if (direction.equals("down")) { //Makes sprite go down
			game[x][y] = "O";
			x = x + 1;
			if (x > 3) {
				x = x - 1;
				game[x][y] = "x";
				System.out.println("Invalid Input");
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}
			} else {
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}	
			}
		}
		if (direction.equals("left")) { //Makes sprite go left
			game[x][y] = "O";
			y = y - 1;
			if (y < 0) {
				System.out.println("Invalid Input");
				y = y + 1;
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}
			} else {
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}	
			}
		}
		if (direction.equals("right")) { //Makes sprite go right
			game[x][y] = "O";
			y = y + 1;
			if (y > 3) {
				System.out.println("Invalid Input");
				y = y - 1;
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}
			} else {
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}	
			}
		}	
	} System.out.println("\nCongrats, you have won!"); //Winning situation
		
	}
}

