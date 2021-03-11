package hr.igz.demo.sportiva.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.igz.demo.sportiva.model.Location;
import hr.igz.demo.sportiva.repository.LocationRepository;
import hr.igz.demo.sportiva.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	LocationRepository locationRepository;
	
	@Override
	public List<Location> findAll() {
		return locationRepository.findAll();
	}

}
