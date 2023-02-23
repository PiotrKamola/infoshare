import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Simulation testSimulation = new Simulation();
        ArrayList phase1 = testSimulation.loadItems("phase-1.txt");
        ArrayList phase2 = testSimulation.loadItems("phase-2.txt");

        ArrayList<Rocket> rocketU1Phase1 = new ArrayList<>();
        ArrayList<Rocket> rocketU1Phase2 = new ArrayList<>();
        ArrayList<Rocket> rocketU2Phase1 = new ArrayList<>();
        ArrayList<Rocket> rocketU2Phase2 = new ArrayList<>();

        int costForPhase1;
        int costForPhase2;
        int totalCost;

        System.out.println("U1 Rockets (10 tests to see better results):");
        for(int i = 0; i<10; i++) {
            rocketU1Phase1 = Simulation.loadU1(phase1);
            rocketU1Phase2 = Simulation.loadU1(phase2);
            costForPhase1 =testSimulation.runSimulation(rocketU1Phase1);
            costForPhase2 =testSimulation.runSimulation(rocketU1Phase2);
            totalCost = costForPhase1 + costForPhase2;

            System.out.println("Phase1 (cost in Millions) = "+ costForPhase1 +
                    " | Phase2 (cost in Millions) = "+ costForPhase2 +
                    " | Total cost in Million is = " + totalCost);
        }

        System.out.println("\nU2 Rockets (10 tests to see better results):");
        for(int i = 0; i<10; i++) {
            rocketU2Phase1 = Simulation.loadU2(phase1);
            rocketU2Phase2 = Simulation.loadU2(phase2);
            costForPhase1 =testSimulation.runSimulation(rocketU2Phase1);
            costForPhase2 =testSimulation.runSimulation(rocketU2Phase2);
            totalCost = costForPhase1 + costForPhase2;

            System.out.println("Phase1 (cost in Millions) = "+ costForPhase1 +
                    " | Phase2 (cost in Millions) = "+ costForPhase2 +
                    " | Total cost in Millions is = " + totalCost);
        }
    }
}
