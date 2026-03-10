package Lab2.Problem2;

public class TestChess {
    public static void main(String[] args) {
        System.out.println("Chess Pieces Legal Move Tests\n");

        // Test Rook
        System.out.println("Rook Tests");
        Piece rook = new Rook(new Position(4, 4));
        System.out.println("Rook at (4,4):");
        System.out.println("  Move to (4,7) [same row]: " + rook.isLegalMove(new Position(4, 7))); // true
        System.out.println("  Move to (0,4) [same col]: " + rook.isLegalMove(new Position(0, 4))); // true
        System.out.println("  Move to (5,5) [diagonal]: " + rook.isLegalMove(new Position(5, 5))); // false
        System.out.println("  Move to (4,4) [same pos]: " + rook.isLegalMove(new Position(4, 4))); // false
        System.out.println();

        // Test Knight
        System.out.println("Knight Tests");
        Piece knight = new Knight(new Position(4, 4));
        System.out.println("Knight at (4,4):");
        System.out.println("  Move to (6,5) [2 down, 1 right]: " + knight.isLegalMove(new Position(6, 5)));
        System.out.println("  Move to (2,3) [2 up, 1 left]: " + knight.isLegalMove(new Position(2, 3)));
        System.out.println("  Move to (5,5) [1 down, 1 right]: " + knight.isLegalMove(new Position(5, 5)));
        System.out.println("  Move to (4,4) [same pos]: " + knight.isLegalMove(new Position(4, 4)));
        System.out.println();

        // Test Bishop
        System.out.println("Bishop Tests");
        Piece bishop = new Bishop(new Position(4, 4));
        System.out.println("Bishop at (4,4):");
        System.out.println("  Move to (7,7) [diagonal]: " + bishop.isLegalMove(new Position(7, 7)));
        System.out.println("  Move to (1,1) [diagonal]: " + bishop.isLegalMove(new Position(1, 1)));
        System.out.println("  Move to (4,7) [same row]: " + bishop.isLegalMove(new Position(4, 7)));
        System.out.println("  Move to (4,4) [same pos]: " + bishop.isLegalMove(new Position(4, 4)));
        System.out.println();

        // Test Queen
        System.out.println("\nQueen Tests");
        Piece queen = new Queen(new Position(4, 4));
        System.out.println("Queen at (4,4):");
        System.out.println("  Move to (4,7) [same row]: " + queen.isLegalMove(new Position(4, 7)));
        System.out.println("  Move to (0,4) [same col]: " + queen.isLegalMove(new Position(0, 4)));
        System.out.println("  Move to (7,7) [diagonal]: " + queen.isLegalMove(new Position(7, 7)));
        System.out.println("  Move to (4,4) [same pos]: " + queen.isLegalMove(new Position(4, 4)));

        // Test King
        System.out.println("King Tests");
        Piece king = new King(new Position(4, 4));
        System.out.println("King at (4,4):");
        System.out.println("  Move to (5,5) [1 diagonal]: " + king.isLegalMove(new Position(5, 5)));
        System.out.println("  Move to (4,5) [1 right]: " + king.isLegalMove(new Position(4, 5)));
        System.out.println("  Move to (4,7) [3 right]: " + king.isLegalMove(new Position(4, 7)));
        System.out.println("  Move to (4,4) [same pos]: " + king.isLegalMove(new Position(4, 4)));

        // Test Pawn
        System.out.println(" Pawn Tests ");
        Piece whitePawn = new Pawn(new Position(6, 4), true);
        System.out.println("White Pawn at (6,4):");
        System.out.println("  Move to (5,4) [1 forward]: " + whitePawn.isLegalMove(new Position(5, 4)));
        System.out.println("  Move to (4,4) [2 forward from start]: " + whitePawn.isLegalMove(new Position(4, 4)));
        System.out.println("  Move to (5,5) [diagonal capture]: " + whitePawn.isLegalMove(new Position(5, 5)));
        System.out.println("  Move to (7,4) [backward]: " + whitePawn.isLegalMove(new Position(7, 4)));

        Piece blackPawn = new Pawn(new Position(1, 4), false);
        System.out.println("\nBlack Pawn at (1,4):");
        System.out.println("  Move to (2,4) [1 forward]: " + blackPawn.isLegalMove(new Position(2, 4)));
        System.out.println("  Move to (3,4) [2 forward from start]: " + blackPawn.isLegalMove(new Position(3, 4)));
        System.out.println("  Move to (2,5) [diagonal capture]: " + blackPawn.isLegalMove(new Position(2, 5)));
        System.out.println("  Move to (0,4) [backward]: " + blackPawn.isLegalMove(new Position(0, 4)));
    }
}
