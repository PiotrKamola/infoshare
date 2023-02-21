public class U2 extends Rocket{
    U2(){
        rocketCostInMillion = 120;
        rocketWeightInTonnes = 18;
        maxWeightWithCargo = 29;
        baseChanceOfLaunchExplosion = 0.04;
        baseChanceOfLandingCrash = 0.08;
    }

    boolean launch(double cargoCarried){
        double chance = 0.04 * ( cargoCarried / maxWeightWithCargo );
        return true;
    }
    boolean land(double cargoCarried){
        double chance = 0.08 * ( cargoCarried / maxWeightWithCargo );
        return true;
    }
}
