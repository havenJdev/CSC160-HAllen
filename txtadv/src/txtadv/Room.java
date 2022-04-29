package txtadv;

import java.util.ArrayList;
import java.util.List;

public class Room {
	public final String name;
	public final String description;
	public final int uniqueID;
	public final String namespacedID;
	private List<ObjectInteractable> objects;
	private List<Item> items;
	
	public Room(String namespace, String stringID, String name, String description, int uniqueID) {
		this.name = name;
		this.description = description;
		this.uniqueID = uniqueID;
		this.namespacedID = namespace + ":" + stringID;
		objects = new ArrayList<>();
		items = new ArrayList<>();
		TextAdventureGame.ROOMS.add(this);
	}

	public List<ObjectInteractable> getObjects() {
		return objects;
	}

	public void setObjects(List<ObjectInteractable> objects) {
		this.objects = objects;
	}
	
	public void addObject(ObjectInteractable object) {
		this.objects.add(object);
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public void removeItem(int uid) {
		for(Item item : this.items) {
			if(item.uniqueID == uid) {
				this.items.remove(item);
				break;
			}
		}
	}
	
	public void removeItem(String namespacedID) {
		for(Item item : this.items) {
			if(item.namespacedID.equals(namespacedID)) {
				this.items.remove(item);
				break;
			}
		}	
	}

	public String toString() {
		return "Room [objects=" + objects + ", items=" + items + "]";
	}
}
