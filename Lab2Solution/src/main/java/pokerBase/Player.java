package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Player {
	private UUID PlayerID;
	private String Name;
	private int PlayerPosition;
	
	public Player(UUID PlayerID, String Name, int PlayerPosition)
	{
		this.PlayerID = PlayerID;
		this.Name = Name;
		this.PlayerPosition = PlayerPosition;
	}

	public UUID getPlayerID()
	{
		return PlayerID;
	}

	private void setPlayerID(UUID PlayeriD)
	{
		PlayerID = PlayeriD;
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String n)
	{
		Name = n;
	}

	public int getPlayerPosition()
	{
		return PlayerPosition;
	}

	public void setPlayerPosition(int playerposition)
	{
		PlayerPosition = playerposition;
	}
}
