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
			System.out.println("North");
			break;
		}
		case EAST: {
			System.out.println("East");
			break;
		}
		case SOUTH: {
			System.out.println("South");
			break;
		}
		case WEST: {
			System.out.println("West");
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
