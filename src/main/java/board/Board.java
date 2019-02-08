package board;

import java.util.ArrayList;

import pieces.*;

public class Board{
	Board(){
		board = new ArrayList<>();
		
		//Composição de 64 casas: 8 linhas e 8 colunas;
		for(int y = 0; y < 9; y++) {
			for(int x = 0; x < 9; x++) {
				Position position = new Position(x,y);
				board.add(position);
				
			}
		
		}
		
		setBoard();
	}
	
	ArrayList<Position> board;
	
	public Position findPosition(int x, int y) {
		Position found = null;
		for(Position position:board) {
			if(position.getRow() == x && position.getCol() == y){
				found = position;
				break;
			}
		}
		return found;
	}
	
	//Criar classe de "board setter"?
	private void setBoard() {
		//posicionar peões
		Pawn pawn;
		for(int i = 0; i < 8; i++) {
			pawn = new Pawn(true);
			findPosition(2,i).setPiece(pawn);
			pawn = new Pawn(false);
			findPosition(7,i).setPiece(pawn);
			
		}
		
		//posicionar torres
			Rook rook; //Torre branca
			rook = new Rook(true);
			findPosition(1,1).setPiece(rook);
			rook = new Rook(true);
			findPosition(1,8).setPiece(rook);
			rook = new Rook(false);
			findPosition(8,1).setPiece(rook);
			rook = new Rook(false);
			findPosition(8,8).setPiece(rook);
		
		//posicionar cavalos
			Knight knight; //Torre branca
			knight = new Knight(true);
			findPosition(1,2).setPiece(knight);
			knight = new Knight(true);
			findPosition(1,7).setPiece(knight);
			knight = new Knight(false);
			findPosition(8,2).setPiece(knight);
			knight = new Knight(false);
			findPosition(8,7).setPiece(knight);
		
		//posicionar bispos
			Bishop bishop;
			bishop = new Bishop(true);
			findPosition(1,3).setPiece(bishop);
			bishop = new Bishop(true);
			findPosition(1,6).setPiece(bishop);
			bishop = new Bishop(false);
			findPosition(8,3).setPiece(bishop);
			bishop = new Bishop(false);
			findPosition(8,6).setPiece(bishop);
			
		//posicionar rainha
			Queen queen;
			queen = new Queen(true);
			findPosition(1,4).setPiece(queen);
			queen = new Queen(false);
			findPosition(8,4).setPiece(queen);
			
		//posicionar rei
			King king;
			king = new King(true);
			findPosition(1,5).setPiece(king);
			queen = new Queen(false);
			findPosition(8,5).setPiece(king);
			
	}
}
