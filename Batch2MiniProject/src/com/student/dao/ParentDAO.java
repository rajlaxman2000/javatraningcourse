package com.student.dao;

import java.util.List;

import com.student.dto.Parent;

public interface ParentDAO {
	public List<Parent> getParentDetails();

	public Parent getParentById(int id);

	public int insertParent(Parent parent);
	
	public int delParentByStudID(int id);

}
