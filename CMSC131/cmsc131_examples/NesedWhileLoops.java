package cmsc131_examples;

public class NesedWhileLoops {
	public static void main(String[] args) {
		int row = 1;
		while (row <= 5){
			int col = 1;
			while (col <= 5) {
				System.out.println(row+", "+col+ " ");
				col++;
			}
			System.out.println(" ");
			row++;
		}	
	}
}
