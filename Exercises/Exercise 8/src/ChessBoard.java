import java.util.Hashtable;

public class ChessBoard {
    private Hashtable<String, ICommandChessPiece> pieces;

    public ChessBoard() {
        pieces = new Hashtable<>();
        pieces.put("PAWN", new Pawn(0, 0));
        pieces.put("KNIGHT", new Knight(1, 0));
        pieces.put("ROOK", new Rook(2, 0));
        pieces.put("BISHOP", new Bishop(3, 0));
        pieces.put("KING", new King(4, 0));
        pieces.put("QUEEN", new Queen(5, 0));

        System.out.println("A new chess game has begun!");
        System.out.println(pieces.get("PAWN"));
        System.out.println(pieces.get("KNIGHT"));
        System.out.println(pieces.get("ROOK"));
        System.out.println(pieces.get("BISHOP"));
        System.out.println(pieces.get("KING"));
        System.out.println(pieces.get("QUEEN"));
    }

    public ICommandChessPiece GetPiece(String pieceIdentifier) {
        pieceIdentifier = pieceIdentifier.toUpperCase();
        return pieces.get(pieceIdentifier);
    }

    public boolean MovePiece(String pieceName) {
        ICommandChessPiece piece = GetPiece(pieceName);

        if (piece == null) {
            System.out.println("ERROR: Invalid piece!");
            return false;
        }

        piece.move();
        System.out.println("MOVE: " + piece);

        return true;
    }

    public boolean UndoMove(String pieceName) {
        ICommandChessPiece piece = GetPiece(pieceName);

        if (piece == null) {
            System.out.println("ERROR: Invalid piece!");
            return false;
        }

        piece.undo();
        System.out.println("UNDO: " + piece);

        return true;
    }
}
