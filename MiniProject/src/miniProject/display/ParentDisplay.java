package miniProject.display;

import java.util.List;

import miniProject.dto.Parent;

public class ParentDisplay {
	public void retreiveAll(List<Parent> parentList){
		System.out.println("List of Parents: "+parentList);
	}
	
	public void showParent(Parent parent){
		System.out.println("Parent Details: "+parent);
	}
	
	public void insert(int num){
		System.out.println("Number of effected rows: "+num);
	}
}
