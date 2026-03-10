package Lab2.Problem2;

public class Pawn extends Piece {
    private boolean isWhite;

    // Constructor
    public Pawn(Position a, boolean isWhite) {
        super(a);
        this.isWhite = isWhite;
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!isValidPosition(b) || a.equals(b)) {
            return false;
        }

        int rowDiff = getRowDifference(b);
        int colDiff = getColDifference(b);

        if (isWhite) {
            return isWhitePawnMove(rowDiff, colDiff, b);
        } else {
            return isBlackPawnMove(rowDiff, colDiff, b);
        }
    }

    private boolean isWhitePawnMove(int rowDiff, int colDiff, Position b) {

        if (rowDiff == 1 && colDiff == 0) {
            return b.getRow() == a.getRow() - 1;
        }


        if (rowDiff == 2 && colDiff == 0) {
            boolean isStartingRow = (a.getRow() == 6);
            return isStartingRow && b.getRow() == a.getRow() - 2;
        }


        if (rowDiff == 1 && colDiff == 1) {
            return b.getRow() == a.getRow() - 1;
        }

        return false;
    }


    private boolean isBlackPawnMove(int rowDiff, int colDiff, Position b) {
        if (rowDiff == 1 && colDiff == 0) {
            return b.getRow() == a.getRow() + 1;
        }

        if (rowDiff == 2 && colDiff == 0) {
            boolean isStartingRow = (a.getRow() == 1);
            return isStartingRow && b.getRow() == a.getRow() + 2;
        }

        if (rowDiff == 1 && colDiff == 1) {
            return b.getRow() == a.getRow() + 1;
        }

        return false;
    }

    @Override
    public String toString() {
        return "P";
    }
}