import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args){
        int randomNumber = (int) (Math.random() * 100) + 1;
        int chosenNumber;
        //System.out.println(randomNumber);

        Scanner scanner = new Scanner(System.in);
        boolean hasWon = false;

        System.out.println("I've just generated a random number between 1 and 100.");
        System.out.println("Can you guess it? You have 10 tries");

        for(int i=9; i>=0; i--){
            chosenNumber = scanner.nextInt();

            if(chosenNumber > randomNumber){
                System.out.println("The chosen number is too big. ( "+ i +" tries left.)");
            }else if(chosenNumber < randomNumber){
                System.out.println("The chosen number is too small. ( "+ i +" tries left.)");
            }else{
                hasWon = true;
                break;
            }
        }

        if(hasWon){
            System.out.println("Congratulation you win, the number was "+ randomNumber +".");
        }else{
            System.out.println("Too bad, you lose, the number was "+ randomNumber +".");
        }
    }
}
