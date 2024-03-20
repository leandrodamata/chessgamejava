package boardgame;

public abstract class Piece {
	
	//Protected para não ser visível na camada Chess (é visível apenas dentro de Boardgame)
	protected Position position;
	private Board board;
	
	//Constructors sem position porque inicialmente a peça é iniciada como nula
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	//Apenas o Get porque não devemos permitir alterações no tabuleiro com o Set
	//Protected para ser acessado apenas pelas classes de boardgame e subclasses de Piece - ChessPiece e King, Queen, Pawn, etc
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
		


}
