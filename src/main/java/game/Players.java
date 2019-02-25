package game;

import pieces.*;
import board.*;

public class Players {
	public void movePiece(Piece piece, Position position) {
		piece.position = position;
	}
}
