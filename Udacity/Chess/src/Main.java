public class Main {
    public static void main(String[] args){
        Queen queen = new Queen();
        Position testPosition1 = new Position(4,5);
        queen.isValidMove(testPosition1);

        Position testPosition2 = new Position(5,0);
        queen.isValidMove(testPosition2);

        Position testPosition3 = new Position(0,5);
        queen.isValidMove(testPosition3);

        Position testPosition4 = new Position(5,5);
        queen.isValidMove(testPosition4);
    }
}
