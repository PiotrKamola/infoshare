public class U1 extends Rocket{
    U1(){
        rocketCostInMillion = 100;
        rocketWeightInTonnes = 10;
        maxWeightWithCargo = 18;
        baseChanceOfLaunchExplosion = 0.05;
        baseChanceOfLandingCrash = 0.01;
    }
    boolean launch(double cargoCarried){
        double chance = 0.05 * ( cargoCarried / maxWeightWithCargo );
        return true;
    }
    boolean land(double cargoCarried){
        double chance = 0.01 * ( cargoCarried / maxWeightWithCargo );
        return true;
    }
}
