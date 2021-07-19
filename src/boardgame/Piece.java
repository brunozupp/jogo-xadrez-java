package boardgame;

public abstract class Piece {

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

    public abstract boolean[][] possibleMoves();

    // Chamando de Hook Methods - método que faz um gancho com a subclasse
    // Chamando uma possível implementação da classe Piece
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(mat[i][j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
