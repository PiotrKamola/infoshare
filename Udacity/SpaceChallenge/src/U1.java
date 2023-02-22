public class U1 extends Rocket{
    U1(){
        rocketCostInMillion = 100;
        actualWeightInKg = 10000;
        maxCargoWeight = 8000;
    }

    public boolean launch(){
        //System.out.println("U1 launch");
        //Chance of launch explosion = 5% * (cargo carried / cargo limit)
        double chance = (5 * (this.actualCargoWeightInKg / this.maxCargoWeight));    //% chance of explosion on launch
        int random = (int) (Math.random() * 100) + 1;
        if(random <= chance){
            return false;
        }else{
            return true;
        }
    }

    public boolean land(){
        System.out.println("U1 land");
        //Chance of landing crash = 1% * (cargo carried / cargo limit)
        double chance = (1 * (this.actualCargoWeightInKg / this.maxCargoWeight));    //% chance of crash on land
        int random = (int) (Math.random() * 100) + 1;
        if(random <= chance){
            return false;
        }else{
            return true;
        }
    }
}
