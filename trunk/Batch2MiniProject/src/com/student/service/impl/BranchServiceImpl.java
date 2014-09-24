package com.student.service.impl;

import java.util.List;

import com.student.dao.BranchDAO;
import com.student.dao.impl.BranchDAOImpl;
import com.student.dto.SchoolBranch;
import com.student.service.BranchService;

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
