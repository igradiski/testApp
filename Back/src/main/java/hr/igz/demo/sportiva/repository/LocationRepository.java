package hr.igz.demo.sportiva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hr.igz.demo.sportiva.model.Location;

@Repository
public interface LocationRepository  extends JpaRepository<Location , Long>{
	
	

}
