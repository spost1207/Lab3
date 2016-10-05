package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private Table TableID;
	private ArrayList<Player> GamePlayers;
	
	
	public Game(UUID GameID, Table TableID)
	{
		this.GameID = GameID;
		this.TableID = TableID;
		GamePlayers = new ArrayList<Player>();
	}
	
	public void AddPlayerToGame(Table T, Player P)
	{
		GamePlayers.add(P);
	}

	public UUID getGameID()
	{
		return GameID;
	}

	private void setGameID(UUID gamerID)
	{
		GameID = gamerID;
	}

	public Table getTableID()
	{
		return TableID;
	}

	private void setTableID(Table tableID)
	{
		TableID = tableID;
	}

	public ArrayList<Player> getGamePlayers()
	{
		return GamePlayers;
	}

	public void setGamePlayers(ArrayList<Player> Gameplayers)
	{
		GamePlayers = Gameplayers;
	}
	
	
	
	
}
