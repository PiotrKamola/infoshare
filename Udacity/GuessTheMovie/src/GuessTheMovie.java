import java.util.Scanner;
public class GuessTheMovie {
    public static void main(String[] args) throws Exception {
        Game.prepareGame();

        Scanner scanner = new Scanner(System.in);

        boolean stillPlaying = true;
        char chosenLetter;

        Game.printStatus();
        while(stillPlaying){
            chosenLetter = scanner.next().charAt(0);
            Game.guessLetter(chosenLetter);
            Game.printStatus();
            if(Game.isWin()){
                System.out.println("You win!");
                System.out.println("You have guessed '" + Game.getGuessing() + "' correctly.");
                break;
            }else if(Game.getHowManyWrongGuess() == 10){
                System.out.println("You lose!");
                System.out.println("You have NOT guessed '" + Game.getRandomTitle() + "'.");
                break;
            }
        }

    }
}
