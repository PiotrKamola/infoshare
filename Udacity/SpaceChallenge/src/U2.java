public class U2 extends Rocket{
    U2(){
        rocketCostInMillion = 120;
        actualWeightInKg = 18000;
        maxCargoWeight = 11000;
    }

    public boolean launch(){
        //System.out.println("U2 launch");
        //Chance of launch explosion = 4% * (cargo carried / cargo limit)
        double chance = (4 * (this.actualCargoWeightInKg / this.maxCargoWeight));    //% chance of explosion on launch
        int random = (int) (Math.random() * 100) + 1;
        if(random <= chance){
            return false;
        }else{
            return true;
        }
    }

    public boolean land(){
        //System.out.println("U2 land");
        //Chance of landing crash = 8% * (cargo carried / cargo limit)
        double chance = (8 * (this.actualCargoWeightInKg / this.maxCargoWeight));    //% chance of crash on land
        int random = (int) (Math.random() * 100) + 1;
        if(random <= chance){
            return false;
        }else{
            return true;
        }
    }
}
