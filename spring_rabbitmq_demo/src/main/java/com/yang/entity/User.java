/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title User.java     
 * @author yang          
 * @date 2019年3月25日 上午10:20:57   
 * @version V1.0 
 */
package com.yang.entity;

import java.io.Serializable;

/**
 * @Package com.yang.entity
 * @ClassName User
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月25日上午10:20:57
 */
public class User implements Serializable{
	
	private Integer	id;

	private String	name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	

}
