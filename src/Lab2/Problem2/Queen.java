package Lab2.Problem2;

public class Queen extends Piece {
    public Queen(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!isValidPosition(b) || a.equals(b)) {
            return false;
        }
        int rowDiff = getRowDifference(b);
        int colDiff = getColDifference(b);

        return (a.getRow() == b.getRow()) || (a.getCol() == b.getCol()) || (rowDiff == colDiff);
    }

    @Override
    public String toString() {
        return "Q";
    }
}
