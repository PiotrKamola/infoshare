public class Queen extends Piece{
    boolean isValidMove(Position newPosition) {
        if ((newPosition.column == this.position.column || newPosition.row == this.position.row) ||
        (Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row))){
            System.out.println("Yes, I can move there.");
            return true;
        } else {
            System.out.println("Nope, can't do!");
            return false;
        }

    }
}
