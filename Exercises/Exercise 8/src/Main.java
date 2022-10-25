public class Main {
    public static void main(String[] args) {
        PlayerMoveReceiver chessPlayer = new PlayerMoveReceiver();
        chessPlayer.PerformMoveWithPiece("Knight");
        chessPlayer.PerformMoveWithPiece("Pawn");
        chessPlayer.PerformMoveWithPiece("Knight");
        chessPlayer.UndoMove();
        chessPlayer.PerformMoveWithPiece("rook");
        chessPlayer.UndoMove();
        chessPlayer.PerformMoveWithPiece("PAWN");
        chessPlayer.UndoMove();
        chessPlayer.PerformMoveWithPiece("kNiGhT");
        chessPlayer.PerformMoveWithPiece("bishop");
        chessPlayer.PerformMoveWithPiece("king");
        chessPlayer.PerformMoveWithPiece("queen");
    }
}