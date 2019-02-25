package pieces;

import board.*;


public class Rook extends Piece {
	public Rook(int x, int y){
		this.position = Board.getPositionByXY(x, y);
	}

	public void getValids(){
		int x = this.position.row;
		int y = this.position.col;
		while(x < 8){
			x++;
			Position got = Board.getPositionByXY(x,y);
			this.allValid.add(got);
		}

		while(x > 0){
			x--;
			Position got = Board.getPositionByXY(x,y);
			this.allValid.add(got);
		}

		while(y < 8){
			y--;
			Position got = Board.getPositionByXY(x,y);
			this.allValid.add(got);
		}

		while(y > 0){
			y--;
			Position got = Board.getPositionByXY(x,y);
			this.allValid.add(got);
		}
	}
	
	
}
