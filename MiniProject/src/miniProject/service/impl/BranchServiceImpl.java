package miniProject.service.impl;

import java.util.List;

import miniProject.dao.BranchDAO;
import miniProject.dao.impl.BranchDAOImpl;
import miniProject.dto.SchoolBranch;
import miniProject.service.BranchService;

public class BranchServiceImpl implements BranchService{

	BranchDAO branchDAO = new BranchDAOImpl();
	
	@Override
	public List<SchoolBranch> getBranchDetails() {
		List<SchoolBranch> branchList = branchDAO.getBranchDetails(); 
		return branchList;
	}

	@Override
	public SchoolBranch getBranchById(int id) {
		SchoolBranch branch = branchDAO.getBranchById(id);
		return branch;
	}

	@Override
	public int updateBranchById(SchoolBranch branch) {
		int updBranch = branchDAO.updateBranchById(branch);
		return updBranch;
	}

	@Override
	public int insertBranch(SchoolBranch  branch) {
		int insBranch = branchDAO.insertBranch(branch);
		return insBranch;
	}

	@Override
	public int deleteBranch(int id) {
		int delBranch = branchDAO.deleteBranch(id);
		return delBranch;
	}

}
