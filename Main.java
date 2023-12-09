import java.util.Scanner;
class Main {  
  public static void main(String[] args) {

    //Variables in this Java code.
    String isVegetarian; 
    String isVegan;
    String isGluten_Free;
    /*Create a Scanner object called Keyboard to 
     * read keyboard input*/
    Scanner keyboard = new Scanner (System.in);

    /*Display instructions on how to use the program
     * to the user*/
    System.out.println("Enter 'Yes' or 'No' as your answer to the following" +
                       " questions: ");
    System.out.println();

    //Ask if anyone in the party is vegetarian.
    System.out.println("Is anyone in your party a vegetarian?");
    isVegetarian = keyboard.nextLine();

    //Ask if anyone in the party is vegan.
    System.out.println();
    System.out.println("Is anyone in your party a vegan?");
    isVegan = keyboard.nextLine();

    //Ask if anyone in the party is gluten-free.
    System.out.println();
    System.out.println("Is anyone in your party gluten-free?");
    isGluten_Free = keyboard.nextLine();

    System.out.println();
    System.out.println();
    System.out.println("Here are your restaurant choices:");
    
    //These restaurants accepts all groups of people.
    System.out.println("Corner Café");
    System.out.println("The Chef's Kitchen");

    //Can be taken to Joe's Gourmet Burgers.
    if (isVegetarian.equalsIgnoreCase("NO") && isVegan.equalsIgnoreCase("NO") 
       && isGluten_Free.equalsIgnoreCase("NO"))
    {
      System.out.println("Joe's Gourmet Burgers");
    }

    //Can be taken to Main Street Pizza Company.
    if (isVegetarian.equalsIgnoreCase("YES") && isVegan.equalsIgnoreCase("NO") 
       && isGluten_Free.equalsIgnoreCase("YES"))
    {
      System.out.println("Main Street Pizza Company");
    }

    //Can be taken to Mama's Fine Italian.
    if (isVegetarian.equalsIgnoreCase("YES") && isVegan.equalsIgnoreCase("NO") 
       && isGluten_Free.equalsIgnoreCase("NO"))
    {
      System.out.println("Mama's Fine Italian");
    }

    keyboard.close();
  }
}