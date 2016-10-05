package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Table {
	
	private UUID TableID;
	private ArrayList<Player> TablePlayers;
	
	
	public Table(UUID TableiD, ArrayList<Player> Tableplayers) {
		this.TableID = TableiD;
		this.TablePlayers = Tableplayers;
	}
	
	public UUID getTableID() {
		return TableID;
	}
	public void setTableID(UUID TableiD) {
		TableID = TableiD;
	}
	public ArrayList<Player> getTablePlayers() {
		return TablePlayers;
	}
	public void setTablePlayers(ArrayList<Player> Tableplayers) {
		TablePlayers = Tableplayers;
	}
	
	public void AddPlayerToTable(Player player){
		this.TablePlayers.add(player);
	}
}
