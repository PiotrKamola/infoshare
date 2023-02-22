public class Rocket implements SpaceShip{
    int rocketCostInMillion;
    double actualWeightInKg;
    double maxCargoWeight;
    double actualCargoWeightInKg;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land(){
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        if(this.actualCargoWeightInKg + item.weight < maxCargoWeight){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void carry(Item item) {
        this.actualCargoWeightInKg = this.actualCargoWeightInKg + item.weight;
    }
}
