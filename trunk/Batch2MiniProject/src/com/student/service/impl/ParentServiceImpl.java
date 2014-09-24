package com.student.service.impl;

import java.util.List;

import com.student.dao.ParentDAO;
import com.student.dao.impl.ParentDAOImpl;
import com.student.dto.Parent;
import com.student.dto.SchoolBranch;
import com.student.service.ParentService;

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
	public int insertParent(Parent parent) {
		int insParent = parentDAO.insertParent(parent);
		return insParent;
	}
	
	public int delParentByStudID(int id){
		int delParent = parentDAO.delParentByStudID(id);
		return delParent;
	}

}
