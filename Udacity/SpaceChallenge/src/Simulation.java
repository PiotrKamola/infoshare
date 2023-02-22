import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
public class Simulation {

    static ArrayList<Item> loadItems(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        ArrayList<Item> result = new ArrayList();

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            int helpIndex = line.indexOf("=");
            String name = line.substring(0, helpIndex);
            int weight = Integer.parseInt(line.substring(helpIndex+1));

            Item itemToAdd = new Item(name, weight);
            result.add(itemToAdd);
        }
        return result;
    }


    static ArrayList<U1> loadU1(ArrayList<Item> items){
        ArrayList<U1> U1RocketsNeeded = new ArrayList();
        U1 newU1Rocket = new U1();
        for (Item item : items) {
            //System.out.println(item.name +" "+ item.weight);
            if(newU1Rocket.canCarry(item)){
                newU1Rocket.carry(item);
            }else{
                U1RocketsNeeded.add(newU1Rocket);
                newU1Rocket = new U1();
            }
        }
        return U1RocketsNeeded;
    }

    static ArrayList<U2> loadU2(ArrayList<Item> items){
        ArrayList<U2> U2RocketsNeeded = new ArrayList();
        U2 newU2Rocket = new U2();
        for (Item item : items) {
            //System.out.println(item.name +" "+ item.weight);
            if(newU2Rocket.canCarry(item)){
                newU2Rocket.carry(item);
            }else{
                U2RocketsNeeded.add(newU2Rocket);
                newU2Rocket = new U2();
            }
        }
        return U2RocketsNeeded;
    }
    int runSimulation(ArrayList<Rocket> rockets){
        int budget = 0;
        for (Rocket rocket : rockets) {
            boolean isSuccess = true;
            budget = budget + rocket.rocketCostInMillion;
            while(isSuccess) {
                if(rocket.launch() && rocket.land()) {
                    isSuccess = false;
                }else{
                    budget = budget + rocket.rocketCostInMillion;
                }
            }
        }
        return budget;
    }
}
