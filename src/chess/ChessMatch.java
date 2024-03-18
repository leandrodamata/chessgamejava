package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	//Método que retorna uma matriz contendo as peças ChessPieces no ChessMatch
	public ChessPiece[][] getPieces(){
		//quantidade de linhas e colunas contidas no tabuleiro
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				//downcasting para ChessPiece - peça de xadrez e não Piece
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
