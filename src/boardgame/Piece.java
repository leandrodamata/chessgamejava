package boardgame;

public class Piece {
	
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


}
