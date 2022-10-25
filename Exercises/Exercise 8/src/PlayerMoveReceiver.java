import java.util.ArrayList;

public class PlayerMoveReceiver {
    private ChessBoard _chessBoard;
    private ArrayList<String> _movedPieces;

    public PlayerMoveReceiver()
    {
        _chessBoard = new ChessBoard();
        _movedPieces = new ArrayList<>();
    }

    public void PerformMoveWithPiece(String pieceName) {
        if (_chessBoard.MovePiece(pieceName))
            _movedPieces.add(pieceName.toUpperCase());
    }

    public void UndoMove() {
        int lastIndex = _movedPieces.size() - 1;
        String lastMove = _movedPieces.get(lastIndex);

        _movedPieces.remove(lastMove);

        _chessBoard.UndoMove(lastMove);
    }
}
