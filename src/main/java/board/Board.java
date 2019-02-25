package board;


import java.util.ArrayList;


public class Board{
	Board(){
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				Position position = new Position(i, j);
				board.add(position);
			}
		}
	}
	
	static ArrayList<Position> board = new ArrayList<Position>();
	
	public static Position getPositionByXY(int x, int y) {
		for (Position position:board) {
			if(position.row == x && position.col == y) {
				return position;
			}
		}
		
		return null;
	}
	
	
}
