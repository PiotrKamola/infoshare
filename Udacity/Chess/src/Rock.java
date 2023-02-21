public class Rock extends Piece{
    public Rock() {
        super();
        //this.name = "rock";
    }

    boolean isValidMove(Position newPosition){
        // First call the parent's method to check for the board bounds
        if(!super.isValidMove(position)){
            return false;
        }
        // If we passed the first test then check for the specific rock movement
        if(newPosition.column == this.position.column && newPosition.row == this.position.row){
            return true;
        }
        else{
            return false;
        }
    }
}
