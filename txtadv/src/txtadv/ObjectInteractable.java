package txtadv;

public class ObjectInteractable {
	public final String name;
	public final String description;
	public final int uniqueID;
	
	public ObjectInteractable(String name, String description, int uniqueID) {
		this.name = name;
		this.description = description;
		this.uniqueID = uniqueID;
		TextAdventureGame.OBJECTS.add(this);
	}
	
	public boolean equals(ObjectInteractable other) {
		return other.uniqueID == this.uniqueID;
	}
}
