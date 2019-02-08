package pieces;

//import board.Position;

public class Piece {
	Piece(){	
	}
	
	
	private boolean isWhite; //Cor da peça: True = branca, False = preta;
	
	public boolean getIsWhite() {
		return isWhite;
	}
	
	public void setIsWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}
}
	
