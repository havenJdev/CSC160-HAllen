package txtadv.items;

import txtadv.Item;
import txtadv.objects.ObjectDoor;

public class ItemKey extends Item {

	public ItemKey(String name, String description, int uID) {
		super(name, description, uID);
		// TODO Auto-generated constructor stub
	}
	
	public boolean use(Object other) {
		if(other instanceof ObjectDoor) {
			if(this.equals(((ObjectDoor)other).key)) {
				return true;
			}
		}
		return false;
	}
}
