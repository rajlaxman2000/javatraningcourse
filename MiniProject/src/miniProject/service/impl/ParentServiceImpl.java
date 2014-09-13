package miniProject.service.impl;

import java.util.List;

import miniProject.dao.ParentDAO;
import miniProject.dao.impl.ParentDAOImpl;
import miniProject.dto.Parent;
import miniProject.dto.SchoolBranch;
import miniProject.service.ParentService;

public class ParentServiceImpl implements ParentService{

	ParentDAO parentDAO = new ParentDAOImpl();
	
	@Override
	public List<Parent> getParentDetails() {
		List<Parent> parentList = parentDAO.getParentDetails();
		return parentList;
	}

	@Override
	public Parent getParentById(int id) {
		Parent parent = parentDAO.getParentById(id);
		return parent;
	}

	@Override
	public int insertParent() {
		int insParent = parentDAO.insertParent();
		return insParent;
	}

}
