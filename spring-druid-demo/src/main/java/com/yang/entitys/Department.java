package com.yang.entitys;


/**
 * @ProjectName: bingo
 * @Package: com.bingo.plan.entities.business
 * @ClassName: Department
 * @Author: yang
 * @Description: ${description}
 * @Date: 2019/5/15 10:51
 * @Version: 1.0
 */

public class Department {

	private Integer id;

	private String departmentName;
	

	/**   
	 * @Title Department   
	 * @Description TODO(这里用一句话描述这个方法的作用)     
	 * @throws   
	 */
	public Department() {
		super();
	}

	/**   
	 * @Title Department   
	 * @Description TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @param departmentName  
	 * @throws   
	 */
	public Department(Integer id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
