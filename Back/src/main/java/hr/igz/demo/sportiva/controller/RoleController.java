package hr.igz.demo.sportiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hr.igz.demo.sportiva.model.Role;
import hr.igz.demo.sportiva.service.RoleService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/roles")
	public List<Role> getRoles() {
		log.info("testing logging with lombok");
		return roleService.findAll();
	}
}
