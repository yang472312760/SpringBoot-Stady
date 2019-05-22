/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title DepartmentService.java     
 * @author yang          
 * @date 2019年5月15日 下午6:56:11   
 * @version V1.0 
 */
package com.yang.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yang.entitys.Department;

/**
 * @Package com.yang.service
 * @ClassName DepartmentService
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年5月15日下午6:56:11
 */
public interface DepartmentService {
	
	List<Department> getList();
	
}
