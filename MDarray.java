public class MDarray {
	public static void main(String args[]) {
		int[][] scores = { {75, 88, 78, 86}, {95, 92, 89, 97}, {73, 89, 92, 91},{83, 83, 83, 84}, {86, 65, 83, 91} };
		for(int row = 0; row < scores.length; row++){
			for(int col = 0; col < scores[0].length; col++){
				System.out.print(scores[row][col] + " ");
			}
		System.out.println();
		}
	}
}
