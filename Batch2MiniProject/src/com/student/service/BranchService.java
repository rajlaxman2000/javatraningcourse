package com.student.service;

import java.util.List;

import com.student.dto.SchoolBranch;

public interface BranchService {

	public List<SchoolBranch> getBranchDetails();

	public SchoolBranch getBranchById(int id);

	public int updateBranchById(SchoolBranch  branch);

	public int insertBranch(SchoolBranch  branch);

	public int deleteBranch(int id);

}
