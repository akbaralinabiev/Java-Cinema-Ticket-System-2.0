import java.util.Scanner;

      public class CinemaTicketSystem {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Cinema Ticket System");
        System.out.println("Please select a movie to watch");
        System.out.println("1 - The Dark Knight");
        System.out.println("2 - Inception");
        System.out.println("3 - Matrix");

        int movieChoice = sc.nextInt();
        String[] movieNames = {"The Dark Knight", "Inception", "Matrix"};
        String movieName = "";

        String[] movieTimeDarkKnight = {"12:00 PM", "3:00 PM", "6:00 PM", "9:00 PM"};
        String[] movieTimeInception = {"1:00 PM", "4:00 PM", "7:00 PM", "10:00 PM"};
        String[] movieTimeMatrix = {"2:00 PM", "5:00 PM", "8:00 PM", "11:00 PM"};
        String movieTime = "";

        if (movieChoice == 1) {
            movieName = movieNames[0];
            System.out.println("You have selected " + movieName + ". Please select a time.");
            for (int i = 0; i < movieTimeDarkKnight.length; i++) {
                System.out.println((i + 1) + ". " + movieTimeDarkKnight[i]);
            }
            int movieTimeChoice = sc.nextInt();
            movieTime = movieTimeDarkKnight[movieTimeChoice - 1];
        } else if (movieChoice == 2) {
            movieName = movieNames[1];
            System.out.println("You have selected " + movieName + ". Please select a time.");
            for (int i = 0; i < movieTimeInception.length; i++) {
                System.out.println((i + 1) + ". " + movieTimeInception[i]);
            }
            int movieTimeChoice = sc.nextInt();
            movieTime = movieTimeInception[movieTimeChoice - 1];
        } else if (movieChoice == 3) {
            movieName = movieNames[2];
            System.out.println("You have selected " + movieName + ". Please select a time.");
            for (int i = 0; i < movieTimeMatrix.length; i++) {
                System.out.println((i + 1) + ". " + movieTimeMatrix[i]);
            }
            int movieTimeChoice = sc.nextInt();
            movieTime = movieTimeMatrix[movieTimeChoice - 1];
        }

        System.out.println("You have selected " + movieName + " at " + movieTime + ". Please select a ticket type.");
        System.out.println("1 - Adult");
        System.out.println("2 - Child");
        System.out.println("3 - Student");
        System.out.println("4 - Family");

        int ticketTypeChoice = sc.nextInt();
        String[] tickettypes = {"Adult", "Child", "Student", "Family"};
        String ticketType = "";

        if (ticketTypeChoice == 1) {
          ticketType = tickettypes[0];
        } else if (ticketTypeChoice == 2) {
            ticketType = tickettypes[1];
        } else if (ticketTypeChoice == 3) {
          ticketType = tickettypes[2];
        } else if (ticketTypeChoice == 4) {
            ticketType = tickettypes[3];
        }

        double ticketPrice = 0;
        //String ticketTypeName = "";
        if (movieChoice == 1) {
            ticketPrice = 12.50;
        } else if (movieChoice == 2) {
            ticketPrice = 15.00;
        } else if (movieChoice == 3) {
            ticketPrice = 18.00;
        } else {
             System.out.println("Invalid ticket type. Please select a ticket type from the list, type 1, 2, 3, 4, ");
        }


        System.out.println("Do you have any discount code? (yes/no)");
    String discountCode = sc.next();
    double discountAmount = 0.0;
    if (discountCode.equalsIgnoreCase("yes")) {
        System.out.println("Please enter your discount code");
        String code = sc.next();
        if (code.equalsIgnoreCase("AEHSTUDENT")) {
            discountAmount = ticketPrice * 0.10;
            ticketPrice -= discountAmount;
            System.out.println("Discount applied.");
        } else {
            System.out.println("Invalid discount code. No discount applied." + "\n" + "________________________________");
        }
    }


        System.out.println("Please select a seat from the following seating chart:");
        System.out.println("   1   2   3   4   5");
        System.out.println("A [ ] [ ] [ ] [ ] [ ]");
        System.out.println("B [ ] [ ] [ ] [ ] [ ]");
        System.out.println("C [ ] [ ] [ ] [ ] [ ]");
        System.out.println("D [ ] [ ] [ ] [ ] [ ]");
        System.out.println("E [ ] [ ] [ ] [ ] [ ]");
        System.out.println("Please enter the seat row (A-E)");
        String seatRow = sc.next();
        System.out.println("Please enter the seat number (1-5)");
        int seatNumber = sc.nextInt();
        //System.out.println("Your seat is: " + seatRow + seatNumber);
        //System.out.println("Your total price: " + ticketPrice + "$");
        System.out.println("\n" + "Your Ticket: " + "\n" + "Movie - " + movieName + "\n" + "Ticket type - " + ticketType + "\n" + "Time - " + movieTime + "\n" + "Seat - " +  seatRow + seatNumber + "\n" + "___________________" + "\n" + "Total Price - " + ticketPrice + " USD" + "\n");
        

        sc.close();
    }
}


