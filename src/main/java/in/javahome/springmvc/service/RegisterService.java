package in.javahome.springmvc.service;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.javahome.springmvc.dao.StudentDAO;
import in.javahome.springmvc.model.Register;

@Component
public class RegisterService {
	@Autowired
	private StudentDAO dao;
	public void register(Register r){
		if(dao.findByMailId(r.getMail())){
			throw new RuntimeException("Existing User");
		}
		dao.register(r);
	}
}
