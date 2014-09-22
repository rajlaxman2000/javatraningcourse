package miniProject.service;

import java.util.List;

import miniProject.dto.SchoolBranch;

public interface BranchService {

	public List<SchoolBranch> getBranchDetails();

	public SchoolBranch getBranchById(int id);

	public int updateBranchById(int id,String ph);

	public int insertBranch(int id,String ph);

	public int deleteBranch(int id);

}
