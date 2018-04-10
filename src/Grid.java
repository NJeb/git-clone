import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grid {

	int[][] gameGrid = new int[10][10];

	{

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				gameGrid[i][j] = 0;
				System.out.print(gameGrid[i][j] + " ");
			}
			System.out.println(" ");

		}

	}
}
