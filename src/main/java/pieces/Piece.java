package pieces;

import java.util.ArrayList;

import board.*;

public abstract class Piece{
	
	
	public ArrayList<Position> allValid = new ArrayList<Position>();
	public boolean isWhite;
	public Position position;
	
	Piece(){
	
	}
	
}
	
