import java.util.ArrayList;

public class Simulation {
    ArrayList loadItems(){

    }

    ArrayList loadU1(){

    }

    ArrayList loadU2(){

    }

    boolean runSimulation(ArrayList rockets){
        if(!launch()){
            return false;
        }else if(land()){
            return false;
        }else{
            return true;
        }
    }
}
