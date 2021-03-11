package hr.igz.demo.sportiva.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the location database table.
 * 
 */
@Entity
@Table(name = "location")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	@Setter
	private int locationID;

	@Column(name="location_adress")
	@Getter
	@Setter
	private String locationAdress;

	@Column(name="location_name")
	@Getter
	@Setter
	private String locationName;

	

}