package miniProject.display;

import java.util.List;

import miniProject.dto.SchoolBranch;

public class BranchDisplay {
	
	public void retreiveAll(List<SchoolBranch> branchList){
		System.out.println("List of Branches: "+branchList);
	}
	
	public void showBranch(SchoolBranch branch){
		System.out.println("Branch Details: "+branch);
	}
	
	public void rowsEffected(int num){
		System.out.println("Number of effected rows: "+num);
	}
}
