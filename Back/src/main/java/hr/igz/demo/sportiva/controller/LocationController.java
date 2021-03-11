package hr.igz.demo.sportiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hr.igz.demo.sportiva.model.Location;
import hr.igz.demo.sportiva.service.LocationService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class LocationController {
	
	@Autowired
	LocationService locationService;
	
	@RequestMapping("/locations")
	public List<Location> getRoles() {
		log.info("testing logging with lombok");
		return locationService.findAll();
	}

}
