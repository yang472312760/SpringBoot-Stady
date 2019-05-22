/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title User.java     
 * @author yang          
 * @date 2019年3月9日 上午8:41:13   
 * @version V1.0 
 */
package com.yang.entitys.baseinfo;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Package com.yang.entitys.baseinfo
 * @ClassName User
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月9日上午8:41:13
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
@Entity //告诉JPA这是一个实体类（和数据表映射的类）
@Table(name = "user") //@Table来指定和哪个数据表对应;如果省略默认表名就是user；
public class User {

	@Id //这是一个主键
	@GeneratedValue(strategy = GenerationType.AUTO) //自增主键
	@Column(name = "id", updatable = false)
	private Integer	id;

	@Column(name = "name", length = 15) //这是和数据表对应的一个列
	private String	name;

}
