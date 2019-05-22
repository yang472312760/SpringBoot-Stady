/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title DepartmentServiceImpl.java     
 * @author yang          
 * @date 2019年5月15日 下午6:56:48   
 * @version V1.0 
 */
package com.yang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.entitys.Department;
import com.yang.mapper.DepartmentMapper;
import com.yang.service.DepartmentService;

/**
 * @Package com.yang.service.impl
 * @ClassName DepartmentServiceImpl
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年5月15日下午6:56:48
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired private DepartmentMapper departmentMapper;

	/**
	 * @Function getList
	 * @Description TODO
	 * @return    
	 * @version v1.0.0
	 * @author yang
	 * @date 2019年5月15日下午6:57:06
	 *
	 * @see com.yang.service.DepartmentService#getList()
	 */
	@Override
	public List<Department> getList() {
		return departmentMapper.getList();
	}

}
