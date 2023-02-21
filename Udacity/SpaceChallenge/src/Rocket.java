public class Rocket implements SpaceShip{
    int rocketCostInMillion;
    int rocketWeightInTonnes;
    int maxWeightWithCargo;
    double baseChanceOfLaunchExplosion;
    double baseChanceOfLandingCrash;

    boolean launch(double cargoCarried) {
        return true;
    }

    boolean land(double cargoCarried){
        return true;
    };
}
