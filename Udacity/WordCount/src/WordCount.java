import java.io.File;
import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) throws Exception{
        File file = new File("book.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        String line;
        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            words += line.split(" ").length;
        }
        System.out.println("There is about " + words + " words.");
    }
}
