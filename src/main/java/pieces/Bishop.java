package pieces;

import board.Board;
import board.Position;

public class Bishop extends Piece {
	public Bishop(){


		public void getValids(){
			int x = this.position.row;
			int y = this.position.col;

			while(x < 8 && y < 8){
				x++;
				y++;
				Position got = Board.getPositionByXY(x,y);
				this.allValid.add(got);
			}

			while(x < 8 && y > 0){
				x++;
				y--;
				Position got = Board.getPositionByXY(x,y);
				this.allValid.add(got);
			}

			while(x > 0 && y > 0){
				x--;
				y--;
				Position got = Board.getPositionByXY(x,y);
				this.allValid.add(got);
			}

			while(x > 0 && y < 8){
				x--;
				y++;
				Position got = Board.getPositionByXY(x,y);
				this.allValid.add(got);
			}
		}
	}

}
