package txtadv;

public class Item {
	public final String name;
	public final String description;
	public final int uniqueID;
	
	public Item(String name, String description, int uniqueID) {
		this.name = name;
		this.description = description;
		this.uniqueID = uniqueID;
		TextAdventureGame.ITEMS.add(this);
	}

	public boolean equals(Item other) {
		return other.uniqueID == this.uniqueID;
	}
}
