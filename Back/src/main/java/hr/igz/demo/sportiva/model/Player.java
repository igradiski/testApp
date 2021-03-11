package hr.igz.demo.sportiva.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the player database table.
 * 
 */
@Entity
@Table(name="player")
public class Player implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int playerID;

	@Column(name="activated")
	private int activated;

	@Column(name="email")
	private String email;

	@Column(name="name")
	private String name;

	@Column(name="password")
	private String password;

	@Column(name="surname")
	private String surname;

	@Column(name="username")
	private String username;


	@JoinColumn(name="table1_roleID")
	private int role;

	

	
}