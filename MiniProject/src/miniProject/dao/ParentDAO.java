package miniProject.dao;

import java.util.List;

import miniProject.dto.Parent;

public interface ParentDAO {
	public List<Parent> getParentDetails();

	public Parent getParentById(int id);

	public int insertParent(Parent parent);

}
