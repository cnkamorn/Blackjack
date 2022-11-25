import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");

        scan.nextLine();
        
        int userCard1 = randomNum();
        int userCard2 = randomNum();
        System.out.println("You get a \n" + drawRandomCard(userCard1) + "\n and a \n" + drawRandomCard(userCard2));
        
        int userTotal = Math.min(userCard1, 10) + Math.min(userCard2, 10);
        System.out.println("Your total is : " + userTotal);

        int daelerCard1 = randomNum(); 
        int dealerCard2 = randomNum();

        System.out.println("\nThe dealer shows \n" + drawRandomCard(daelerCard1) + "\n and has a card facing down \n" + faceDown());
        
        int computerTotal = Math.min(daelerCard1, 10) + Math.min(dealerCard2, 10);
        System.out.println("\nThe dealer's total is hidden");

        
        while (true) {
            String ask = hitOrStay();
            if (ask.equals("stay")) {
                System.out.println("Your total is : " + userTotal);
                break;
            }

            if (ask.equals("hit")) {
                int newCard = randomNum();
                System.out.println("You get a \n" + drawRandomCard(newCard));
        
               userTotal += Math.min(newCard, 10);

                System.out.println("Your total is : " + userTotal);
            
            }  
            if (userTotal > 21) {
                System.out.println("Bust! Player loses");
                System.exit(0);
            }}

        System.out.println("\nDealer's turn");
        System.out.println("\n The dealer's cards are \n" + drawRandomCard(daelerCard1) 
        + "\n and a \n" + drawRandomCard(dealerCard2));
            while (computerTotal < 17) {
                int dealerNewCard = randomNum();
                System.out.println("the dealer get a \n" + drawRandomCard(dealerNewCard));
                computerTotal += Math.min(dealerNewCard, 10);

                if (computerTotal > 21) {
                    System.out.println("Bust! Dealer loses");
                    System.out.println("Dealer's total is " + computerTotal);
                    System.exit(0);
                }
            }

            if (userTotal > computerTotal) {
                System.out.println("Dealer's total is " + computerTotal);
                System.out.println("Player wins!");
            } else {
                System.out.println("Dealer's total is " + computerTotal);
                System.out.println("Dealer wins!");

            }

         scan.close();
        

    }

    public static int randomNum() {
        double randomNumber = Math.random() * 13 + 1;
        int convert = (int) randomNumber;
        return convert;
    }

        
    public static String drawRandomCard(int card) {
        switch(card) {
            case 1 : return 
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
            case 2 : return  "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";
            case 3 : return         "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";
            case 4 : return   "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";
            case 5 : return "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";
            case 6 : return  
            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";

            case 7 : return  
      
            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";
  
            case 8 : return  
    
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
     
            case 9 : return  
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";

            case 10 : return  
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
    
            case 11 : return  

            "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";
    
            case 12 : return  

            "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";
      
            case 13 : return   
            "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";


            default : return " ";
        }
    }


    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    

     public static String hitOrStay() {
        System.out.println("hit or stay?");
        String answer = scan.nextLine();
        while (true) {
            if (answer.equals("hit") || answer.equals("stay")) {
                break;
            } else {
                System.out.println("Please write 'hit' or 'stay'");
            answer = scan.nextLine();
            }
        }
        return answer;
            
        
     }
}
    

