package Lab2.Problem2;

public class Knight extends Piece {
    public Knight(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!isValidPosition(b) || a.equals(b)) {
            return false;
        }
        int rowDiff = getRowDifference(b);
        int colDiff = getColDifference(b);

        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }

    @Override
    public String toString() {
        return "N";
    }
}