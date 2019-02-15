package board;

import pieces.Piece;

public class Position {
	Position(int x, int y){
		this.pieceOver = null;
		
	}
	
	private Piece pieceOver;
	int row;
	int col;
	Position upperSquare = Board.getPositionByXY(this.row, this.col + 1);
	Position lowerSquare = Board.getPositionByXY(this.row, this.col - 1);
	Position rightSquare = Board.getPositionByXY(this.row + 1, this.col);
	Position leftSquare = Board.getPositionByXY(this.row - 1, this.col + 1);
	
	
}
