package hr.igz.demo.sportiva.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the player_has_game database table.
 * 
 */
@Embeddable
public class PlayerHasGamePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;


	private int playerID;

	private int gameID;


	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PlayerHasGamePK)) {
			return false;
		}
		PlayerHasGamePK castOther = (PlayerHasGamePK)other;
		return 
			(playerID == castOther.playerID)
			&& (this.gameID == castOther.gameID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.playerID;
		hash = hash * prime + this.gameID;
		
		return hash;
	}
}