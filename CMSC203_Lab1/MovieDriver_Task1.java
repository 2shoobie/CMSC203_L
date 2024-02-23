import java.util.Scanner;

public class MovieDriver{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String repeat = "Y";
		/*title of the movie*/
		while (repeat.equalsIgnoreCase("Y")) {
			System.out.println("Enter the name of a Movie");
			String title = scanner.nextLine();
			/*rating of the movie*/
			System.out.println("Enter the rating of the movie");
			String rating = scanner.nextLine();
			/*tickets that were sold */
			int soldTickets;
			System.out.println("Enter the number of tickets sold for this movie");
			soldTickets = scanner.nextInt(); 
			scanner.nextLine();
			/*the results of what the user entered*/
			Movie theMovie = new Movie(title,rating,soldTickets);
			System.out.println(theMovie);
			System.out.println("Do you want to enter another? (Y or N)");
			repeat = scanner.nextLine();
		}
		System.out.println("Goodbye");
		scanner.close();
		}
	}
