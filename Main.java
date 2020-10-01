import java.util.Scanner;

/**
 *This is the example code for nested if and switch statements
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner variable
    Scanner input = new Scanner(System.in);

    //promts user with first quesiton
    System.out.println("Does your animal have feathers? yes/no");
    String feathers = input.nextLine();

    //does the animal have feathers
    if(feathers.equals("yes")){
      //what colour are the feathers
      System.out.println("Are the feathers blue or red?");
      String featherColour = input.nextLine();
      //check to see what color they entered
      if(featherColour.equals("red")){
        System.out.println("This is a cardinal");
      }else if(featherColour.equals("blue")){
        System.out.println("This is a blue jay");
      }
      
    }else{
      //fur or scales
      System.out.println("Does the animal have scales or fur?");
      String outside = input.nextLine();


    }
         // get the selection from the user
    System.out.println("Which snack would you like (1-6) ?");
    String userChoice = input.nextInt();

    switch ( userInput ) {
      case 1:
        System.out.prinlnt("Here are your chips!");
        break;
      case 2:
        System.out.prinlnt("Here are your cookies!");
        break;
      case 3:
        System.out.prinlnt("Here is your chocolate bar!");
        break;
     case 4:
        System.out.prinlnt("Here are your gummy bears!");
        break;
     case 5:
        System.out.prinlnt("Here is your licorice!");
       break;
    default:
       System.out.prinlnt("That is an invalid choice");
        break;

  }

}
