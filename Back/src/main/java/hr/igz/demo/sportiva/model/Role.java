package hr.igz.demo.sportiva.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "role")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private int roleID;

	@Column(name = "role_name")
	@Getter
	@Setter
	private String roleName;

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Role)) {
			return false;
		}
		Role castOther = (Role) other;
		return (roleID == castOther.roleID) && (this.roleName == castOther.roleName);

	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.roleID;
		return hash;
	}

	@Override
	public String toString() {
		return "roleID = " + roleID + "; roleName=" + roleName + ";";
	}
	
	
}