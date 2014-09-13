package miniProject.service;

import java.util.List;

import miniProject.dto.Parent;

public interface ParentService {
	public List<Parent> getParentDetails();

	public Parent getParentById(int id);

	//public int updateBranchById(int id);

	public int insertParent();

	//public int deleteBranch(int id);
}
