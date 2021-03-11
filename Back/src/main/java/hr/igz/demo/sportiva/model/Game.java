package hr.igz.demo.sportiva.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "game")
public class Game implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int gameID;

	@Column(name="game_date")
	private Date gameDate;

	@Column(name="game_name")
	private String gameName;

	//bi-directional many-to-one association to Location
	@JoinColumn(name="locationID")
	private int location;
	
	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", gameID,
				gameDate, gameName);
	}

}
