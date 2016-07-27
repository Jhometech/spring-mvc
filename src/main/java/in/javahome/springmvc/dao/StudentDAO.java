package in.javahome.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import in.javahome.springmvc.model.Register;

@Component
public class StudentDAO {
	@Autowired
	private HibernateTemplate template;

	@Transactional
	public void register(Register r) {
		template.save(r);
	}

	public boolean findByMailId(String mailId){
		String hql = "from Register where mail=?";
		List<Register> list = (List<Register>) template.find(hql, mailId);
		if(list == null || list.size() ==0){
			return false;
		}else{
			return true;
		}
	}
}
