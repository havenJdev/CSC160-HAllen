package txtadv;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Player {
	
	enum Direction {
		NORTH,
		EAST,
		SOUTH,
		WEST
	}
	
	private List<Item> inventory;
	private GridPos pos;
	
	public Player() {
		inventory = new ArrayList<Item>();
		pos = new GridPos();
	}
	
	public boolean take(Item item) {
		return true;
	}
	
	public void move(Direction dir) {
		switch (dir) {
		case NORTH: {
			break;
		}
		case EAST: {
			break;
		}
		case SOUTH: {
			break;
		}
		case WEST: {
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + dir);
		}
	}
	
	public void setPos(int x, int y) {
		pos.set(x, y);
	}
}
