public interface SpaceShip {
    static boolean launch(double cargoCarried){
        return true;
    }
    static boolean land(double cargoCarried){
        return true;
    }
    static boolean canCarry(double cargoCarried){
        return false;
    }
}
