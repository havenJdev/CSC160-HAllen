package txtadv;

import java.util.ArrayList;
import java.util.List;

import txtadv.Player.Direction;
import txtadv.items.ItemKey;
import txtadv.objects.ObjectDoor;

public class TextAdventureGame {
	
	// Global list containing all Items
	public static List<Item> ITEMS = new ArrayList<>();
	public static List<ObjectInteractable> OBJECTS = new ArrayList<>();
	public static List<Room> ROOMS = new ArrayList<>();
	
	// Created Items
	public static final ItemKey ITEM_DUNGEON_KEY = new ItemKey("keys", "dungeonkey", "Key", "A gold key",getItemUID());
	
	// Created Objects
	public static final ObjectDoor DOOR_DUNGEON = new ObjectDoor("dungeon","entrance_door","Dungeon Door", "The door to a dungeon",
															ITEM_DUNGEON_KEY, getObjectUID());
	
	// Created Rooms
	public static final Room ROOM_BEACH = new Room("outside", "beach", "Beach", 
			"A beach with pale sand", getRoomUID());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player = new Player();
		player.move(Direction.NORTH);
		System.out.println(Long.MAX_VALUE);
//		System.out.println(
//			DOOR_DUNGEON.use(ITEM_DUNGEON_KEY)
//		);
//		ROOM_BEACH.addObject(DOOR_DUNGEON);
//		ROOM_BEACH.addItem(ITEM_DUNGEON_KEY);
	}

	private static int getItemUID() {
		return ITEMS.size()+1;
	}
	private static int getObjectUID() {
		return OBJECTS.size()+1;
	}
	private static int getRoomUID() {
		return ROOMS.size()+1;
	}
	
}
