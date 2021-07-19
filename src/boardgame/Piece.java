package boardgame;

public class Piece {

    // Proteced pq não quero que seja visível na parte do xadrez
    protected Position position;
    private Board board;

    // Inicialmente a posição vai valer nula para indicar o início do jogo
    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }
}
