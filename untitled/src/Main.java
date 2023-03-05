import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello world!");
        Menu menu1 = new Menu(10, "text");
        System.out.println(menu1.number);
        System.out.println(menu1.text);
        menu1.test();
        menu1.gClass();

        menu1.setNumber(100);
        menu1.setText("inny text");
        System.out.println(menu1.getNumber());
        System.out.println(menu1.getText());

        System.out.println("");

        System.out.println(menu1.testInt);
        System.out.println(menu1.testInteger);

        System.out.println("");

        Day myDay = Day.MONDAY;
        Day myDay2 = Day.MONDAY;
        myDay = null;
        System.out.println(myDay);
        System.out.println(myDay2);

        System.out.println("");

        LocalTime time = LocalTime.now();
        System.out.println(time.getSecond());
        if(time.getSecond()%2 == 0){
            System.out.println("Parzysta");
        }else{
            System.out.println("Nieparzysta");
        }

        LocalTime time = LocalTime.now();
        int timeSecond = time.getSecond();
        System.out.println(timeSecond);
        switch(timeSecond % 2){
            case 0:
                System.out.println("Parzysta");
                break;
            case 1:
                System.out.println("Nieparzysta");
                break;
        }

        String[] animals = new String[] {"Dog", "Cat", "Hamster"};
        for(int i = 0; i<animals.length; i++){
            System.out.println(animals[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println("For:");
        for(int n=0; n<x; n++){
            if(n%2 == 1){
                System.out.println(n + " nieparzysta");
            }
        }

        System.out.println("\nWhile:");

        int n=0;
        while(n<x){
            if(n%2 == 1){
                System.out.println(n + " nieparzysta");
            }
            n++;
        }
        */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int xySum = x+y;
        System.out.println(x + " + " + y + " = " + xySum);
        System.out.println(x + " + " + y + " = " + (x+y));
    }
}