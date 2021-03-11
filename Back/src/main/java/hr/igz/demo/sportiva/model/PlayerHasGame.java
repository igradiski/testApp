package hr.igz.demo.sportiva.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the player_has_game database table.
 * 
 */
@Entity
@Table(name="player_has_game")

public class PlayerHasGame implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
    private PlayerHasGamePK playerHasGamePK;

	@Column(name="time_pick")
	private Date timePick;

	

}