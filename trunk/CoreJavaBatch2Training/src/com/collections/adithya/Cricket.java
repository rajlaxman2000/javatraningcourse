package com.collections.adithya;

public class Cricket implements Comparable<Cricket>{

	
	private String teamName;
	private int rankOdi;
	private String topPlayer;
	
	
	
	@Override
	public String toString() {
		return "\nCricket [teamName=" + teamName + ", rankOdi=" + rankOdi
				+ ", topPlayer=" + topPlayer + "]";
	}

	public Cricket(){
		
	}
	
	
	public Cricket(String teamName, int rankOdi, String topPlayer) {
		this.teamName = teamName;
		this.rankOdi = rankOdi;
		this.topPlayer = topPlayer;
	}

	public int compareTo(Cricket cri) {
		if(this.getRankOdi() > cri.getRankOdi())
			return 1;
		else if(this.getRankOdi() < cri.getRankOdi())
			return -1;
		else 
			return 0;
	}
	
	/*public int hashCode(){
		
		return this.sNO+this.sName.hashCode()+this.age;
	}*/
	public int hashCode(){
		return this.teamName.hashCode()+this.rankOdi+this.topPlayer.hashCode();
	}
	
	public boolean equals(Object object){
		Cricket cri = (Cricket) object;
		if(this.teamName.equalsIgnoreCase(cri.teamName) && this.rankOdi==cri.rankOdi && this.topPlayer.equalsIgnoreCase(cri.topPlayer)){
			return true;
		}
		return false;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getRankOdi() {
		return rankOdi;
	}

	public void setRankOdi(int rankOdi) {
		this.rankOdi = rankOdi;
	}

	public String getTopPlayer() {
		return topPlayer;
	}

	public void setTopPlayer(String topPlayer) {
		this.topPlayer = topPlayer;
	}
		


}