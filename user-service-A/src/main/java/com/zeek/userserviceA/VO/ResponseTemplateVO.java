package com.zeek.userserviceA.VO;


import com.zeek.userserviceA.entity.User;


public class ResponseTemplateVO {

  
	private User user;
	private Department department;
    
	
	
	
	
	 //Constructors using superclass
	  public ResponseTemplateVO() {
			super();
		}
	  
    //Constructors using fields
    public ResponseTemplateVO(User user, Department department) {
  		super();
  		this.user = user;
  		this.department = department;
  	}
    //Getters and Setters
    public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	

}
