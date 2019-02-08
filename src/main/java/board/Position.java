package board;

import pieces.Piece;

public class Position {
	Position(int x, int y){
		setRow(x);
		setCol(y);
		setPiece(null);
	}
	private int row;
	private int col;
	private Piece piece;
	
	public int getRow() {
		return row;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getCol() {
		return col;
	}
	
	public void setCol(int col) {
		this.row = col;
	}
	
	public Piece getPiece() {
		return piece;
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
}
