/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title Artice.java     
 * @author yang          
 * @date 2019年3月28日 下午9:32:45   
 * @version V1.0 
 */
package com.yang.elastic.entity;

//import io.searchbox.annotations.JestId;

/**
 * @Package com.yang.elastic.entity
 * @ClassName Artice
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月28日下午9:32:45
 */
public class Artice {
	
	//@JestId
	private Integer id;
	
	private String author;
	
	private String title;
	
	private String content;
	
	

	/**   
	 * @Title Artice   
	 * @Description TODO(这里用一句话描述这个方法的作用)     
	 * @throws   
	 */
	public Artice() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**   
	 * @Title Artice   
	 * @Description TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @param author
	 * @param title
	 * @param content  
	 * @throws   
	 */
	public Artice(Integer id, String author, String title, String content) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
