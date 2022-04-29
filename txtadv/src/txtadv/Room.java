package txtadv;

import java.util.ArrayList;
import java.util.List;

public class Room {
	private List<ObjectInteractable> objects;
	private List<Item> items;
	
	public Room() {
		objects = new ArrayList<>();
		items = new ArrayList<>();
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
			if(item.namespacedID) {
				this.items.remove(item);
				break;
			}
		}	
	}
}
