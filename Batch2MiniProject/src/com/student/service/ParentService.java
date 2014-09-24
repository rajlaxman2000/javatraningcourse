package com.student.service;

import java.util.List;

import com.student.dto.Parent;

public interface ParentService {
	public List<Parent> getParentDetails();

	public Parent getParentById(int id);

	public int insertParent(Parent parent);
	
	public int delParentByStudID(int id);
}
