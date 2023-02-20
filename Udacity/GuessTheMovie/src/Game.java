import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;
import java.io.File;
public class Game {
    private static String randomTitle = "";
    private static String guessing = "";
    private static int howManyWrongGuess = 0;
    static String wrongLetters = "";

    static void prepareGame() throws Exception {
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);

        int helpInt = 1;
        int randomMovieLine = (int) (Math.random() * 25) + 1; // generate random number 1-25

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            helpInt++;
            if(helpInt == randomMovieLine){ // setting random title to line with that random number
                //System.out.println(line);
                randomTitle = line;
                break;
            }
        }

        randomTitle = "samurai test movie" ;   // for tests
        //System.out.println("Random title is: " + randomTitle + ".");    // for tests

        for(int i=0; i<randomTitle.length(); i++){  // setting our guessing to _ and spaces to spaces
            if(randomTitle.charAt(i) == ' '){
                guessing = guessing + " ";
            }else {
                guessing = guessing + "_";
            }
        }
    }

    public static void guessLetter(char guessedLetter){
        String helpString = randomTitle;
        boolean wasLetterThere = false;

        for(int i = 0; i < randomTitle.length(); i++){  // i used loop because i've got problem when there was more
            // than one character
            if(randomTitle.charAt(i) == guessedLetter) {
                guessing = guessing.substring(0, i) + randomTitle.charAt(i) +
                        guessing.substring(i + 1);
                wasLetterThere = true;
            }
        }

        if(!wasLetterThere){
            if(wrongLetters.indexOf(guessedLetter) == -1){
                System.out.println("No such letter in title (" + guessedLetter + ").");
                howManyWrongGuess++;
                wrongLetters = wrongLetters + " " + guessedLetter;
            }
        }
    }

    public static void printStatus(){
        System.out.println("\nYou are guessing: " + Game.getGuessing());
        System.out.println("You guessed (" + howManyWrongGuess + ") wrong letters: "+ wrongLetters);
    }

    public static boolean isWin(){
        if(Objects.equals(guessing, randomTitle)){
            return true;
        }else{
            return false;
        }
    }

    public static String getGuessing(){
        return guessing;
    }

    public static String getRandomTitle(){
        return randomTitle;
    }

    public static int getHowManyWrongGuess(){
        return howManyWrongGuess;
    }
}
