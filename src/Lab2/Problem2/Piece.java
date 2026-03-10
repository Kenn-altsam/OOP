package Lab2.Problem2;

public abstract class Piece {
    protected Position a;

    public Piece(Position a) {
        this.a = a;
    }

    public Position getPosition() {
        return a;
    }

    public void setPosition(Position a) {
        this.a = a;
    }

    public abstract boolean isLegalMove(Position b);

    protected boolean isValidPosition(Position p) {
        return p.getRow() >= 0 && p.getRow() < 8 && p.getCol() >= 0 && p.getCol() < 8;
    }

    protected int getRowDifference(Position b) {
        return Math.abs(a.getRow() - b.getRow());
    }

    protected int getColDifference(Position b) {
        return Math.abs(a.getCol() - b.getCol());
    }
}