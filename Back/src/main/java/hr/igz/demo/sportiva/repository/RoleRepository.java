package hr.igz.demo.sportiva.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hr.igz.demo.sportiva.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
}
