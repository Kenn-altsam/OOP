package Lab2.Problem2;

public class Bishop extends Piece {
    public Bishop(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!isValidPosition(b) || a.equals(b)) {
            return false;
        }
        int rowDiff = getRowDifference(b);
        int colDiff = getColDifference(b);

        return rowDiff == colDiff && rowDiff > 0;
    }

    @Override
    public String toString() {
        return "B";
    }
}