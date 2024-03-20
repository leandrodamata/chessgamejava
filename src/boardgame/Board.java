package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at leat 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		//Criar matriz com número de linhas e colunas informados
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	//Este método retorna a peça localizada na posição especificada pelas coordenadas
	//row (linha) e column (coluna) do tabuleiro
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("position does not exist on the board");
		}
		return pieces[row][column];
	}
	
	//O método utiliza o objeto Position para obter as coordenadas da posição e chama
	//o método piece(int row, int column) para retornar a peça naquela posição.
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("position does not exist on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//Método q pega a matriz de peças declarada aqui no Board na posição dada e atribuindo a peça
	//informada, e informando que a peça não está mais em null
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece at " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("position does not exist on the board");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		//retorna peça q foi retirada
		return aux;
		
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("position does not exist on the board");
		}
		return piece(position) != null;
	}

}
