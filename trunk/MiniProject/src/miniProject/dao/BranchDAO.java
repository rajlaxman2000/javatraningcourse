package miniProject.dao;

import java.util.List;

import miniProject.dto.SchoolBranch;

public interface BranchDAO {
	public List<SchoolBranch> getBranchDetails();

	public SchoolBranch getBranchById(int id);

	public int updateBranchById(SchoolBranch branch);

	public int insertBranch(SchoolBranch  branch);

	public int deleteBranch(int id);

}
