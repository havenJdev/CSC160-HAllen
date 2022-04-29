package txtadv.objects;

import txtadv.ObjectInteractable;
import txtadv.items.ItemKey;

public class ObjectDoor extends ObjectInteractable {

	private boolean unlocked = false;
	public final ItemKey key;
	
	public ObjectDoor(String namespace, String stringID, String name, String description, ItemKey key, int uniqueID) {
		super(namespace, stringID, name, description, uniqueID);
		this.key = key;
		// TODO Auto-generated constructor stub
	};
	
	public boolean use(Object other) {
		if( (this.key != null) && (other.equals(this.key))) {
			unlocked = true;
			return true;
		}
		return false;
	}
}
