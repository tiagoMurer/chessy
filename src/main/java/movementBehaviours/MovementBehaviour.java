package movementBehaviours;
import board.Position;

public interface MovementBehaviour {
	public Position[] validPositions(Position position);
	public void changePosition(Position position);
}
