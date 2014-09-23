package miniProject.service;

import java.util.List;

import miniProject.dto.Parent;

public interface ParentService {
	
	public List<Parent> getParentDetails();

	public Parent getParentById(int id);

	public int insertParent(Parent parent);
	
	public int updateParent(Parent parent);
	
	public int delParentByStudID(int id);
}
