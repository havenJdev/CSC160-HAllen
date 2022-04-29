package txtadv;

public class Item {
	public final String name;
	public final String description;
	public final int uniqueID;
	public final String namespacedID;
	
	public Item(String namespace, String stringID, String name, String description, int uniqueID) {
		this.name = name;
		this.description = description;
		this.uniqueID = uniqueID;
		this.namespacedID = namespace + ":" + stringID;
		TextAdventureGame.ITEMS.add(this);
	}

	public boolean equals(Item other) {
		return other.uniqueID == this.uniqueID;
	}
}
