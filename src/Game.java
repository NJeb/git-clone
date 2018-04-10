import java.util.Scanner;

public class Game {

	public static void main(String[] arges) {
		
		String s = "The adventure of the barren moor";
		System.out.println(s);
		
		player p= new player();
		player i= new player();
		player j= new player();
		Treasure t= new Treasure();
		i.position();
		j.position();
		Grid g= new Grid();
		
		
		System.out.println("Your position is: " + p.position());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose direction: ");
		String userInput = sc.nextLine();
		
		switch(userInput) {
		
			
			case "right":
				
				
				//change the x or y coord of the player object
				//redraw grid to reflect this
				
				
				System.out.println("you just moved right");
				break;
			case "left":
				//for (i=0; i <= 10 ; i--)
				System.out.println("You just moved left");
				break;
			case "up":
				//for (j=0; j <= 10 ; j++)
				System.out.println("You just moved up");
				break;
			case "down":
				//for (j=0; j <= 10 ; j++)
				System.out.println("You just moved down");
				break;
				
		}
		
  }
}

