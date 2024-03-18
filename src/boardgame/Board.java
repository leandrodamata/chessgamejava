package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		//Criar matriz com número de linhas e colunas informados
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//Este método retorna a peça localizada na posição especificada pelas coordenadas
	//row (linha) e column (coluna) do tabuleiro
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	//O método utiliza o objeto Position para obter as coordenadas da posição e chama
	//o método piece(int row, int column) para retornar a peça naquela posição.
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}

}
