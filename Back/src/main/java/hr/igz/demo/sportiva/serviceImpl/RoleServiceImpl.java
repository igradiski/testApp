package hr.igz.demo.sportiva.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.igz.demo.sportiva.model.Role;
import hr.igz.demo.sportiva.repository.RoleRepository;
import hr.igz.demo.sportiva.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

}
