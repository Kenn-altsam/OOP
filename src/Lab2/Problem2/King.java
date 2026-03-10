package Lab2.Problem2;

public class King extends Piece {
    public King(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!isValidPosition(b) || a.equals(b)) {
            return false;
        }
        int rowDiff = getRowDifference(b);
        int colDiff = getColDifference(b);

        return rowDiff <= 1 && colDiff <= 1;
    }

    @Override
    public String toString() {
        return "K";
    }
}
