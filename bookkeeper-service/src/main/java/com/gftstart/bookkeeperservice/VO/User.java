package com.gftstart.bookkeeperservice.VO;

public class User {
	
	private boolean statusUser;
	
	private String objectiveUser;
	
	private int heightUser;
	
	private Float weightUser;
	
	private Float bmrUser;

	private String restrictionUser;
	
	private String costUser;

	public User(boolean statusUser, String objectiveUser, int heightUser, Float weightUser, Float bmrUser,
			String restrictionUser, String costUser) {
		super();
		this.statusUser = statusUser;
		this.objectiveUser = objectiveUser;
		this.heightUser = heightUser;
		this.weightUser = weightUser;
		this.bmrUser = bmrUser;
		this.restrictionUser = restrictionUser;
		this.costUser = costUser;
	}

	public boolean isStatusUser() {
		return statusUser;
	}

	public void setStatusUser(boolean statusUser) {
		this.statusUser = statusUser;
	}

	public String getObjectiveUser() {
		return objectiveUser;
	}

	public void setObjectiveUser(String objectiveUser) {
		this.objectiveUser = objectiveUser;
	}

	public int getHeightUser() {
		return heightUser;
	}

	public void setHeightUser(int heightUser) {
		this.heightUser = heightUser;
	}

	public Float getWeightUser() {
		return weightUser;
	}

	public void setWeightUser(Float weightUser) {
		this.weightUser = weightUser;
	}

	public Float getBmrUser() {
		return bmrUser;
	}

	public void setBmrUser(Float bmrUser) {
		this.bmrUser = bmrUser;
	}

	public String getRestrictionUser() {
		return restrictionUser;
	}

	public void setRestrictionUser(String restrictionUser) {
		this.restrictionUser = restrictionUser;
	}

	public String getCostUser() {
		return costUser;
	}

	public void setCostUser(String costUser) {
		this.costUser = costUser;
	}


	
	


}
