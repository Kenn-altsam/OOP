package Lab2.Problem2;

public class Rook extends Piece {
    public Rook(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!isValidPosition(b) || a.equals(b)) {
            return false;
        }

        return (a.getRow() == b.getRow()) || (a.getCol() == b.getCol());
    }

    @Override
    public String toString() {
        return "R";
    }
}