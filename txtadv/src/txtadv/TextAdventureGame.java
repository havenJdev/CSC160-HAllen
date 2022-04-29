package txtadv;

import java.util.ArrayList;
import java.util.List;

import txtadv.items.ItemKey;
import txtadv.objects.ObjectDoor;

public class TextAdventureGame {
	
	// Global list containing all Items
	public static List<Item> ITEMS = new ArrayList<>();
	public static List<ObjectInteractable> OBJECTS = new ArrayList<>();
	
	// Created Items
	public static final ItemKey ITEM_DUNGEON_KEY = new ItemKey("keys", "dungeonkey", "Key", "A gold key",getItemUID());
	
	// Created Objects
	public static final ObjectDoor DOOR_DUNGEON = new ObjectDoor("Dungeon Door", "The door to a dungeon",
															ITEM_DUNGEON_KEY, getObjectUID());

	
	// Created Rooms

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
			DOOR_DUNGEON.use(ITEM_DUNGEON_KEY)
		);
	}

	private static int getItemUID() {
		return ITEMS.size()+1;
	}
	private static int getObjectUID() {
		return OBJECTS.size()+1;
	}
	
}
