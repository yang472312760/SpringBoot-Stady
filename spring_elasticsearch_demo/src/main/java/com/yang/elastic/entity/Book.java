/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title Book.java     
 * @author yang          
 * @date 2019年3月28日 下午10:20:56   
 * @version V1.0 
 */
package com.yang.elastic.entity;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Package com.yang.elastic.entity
 * @ClassName Book
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月28日下午10:20:56
 */
@Document(indexName="yang",type="book")
public class Book {
	
	private Integer id;
	
	private String bookName;
	
	private String anthor;
	
	

	/**   
	 * @Title Book   
	 * @Description TODO(这里用一句话描述这个方法的作用)     
	 * @throws   
	 */
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**   
	 * @Title Book   
	 * @Description TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @param bookName
	 * @param anthor  
	 * @throws   
	 */
	public Book(Integer id, String bookName, String anthor) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.anthor = anthor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAnthor() {
		return anthor;
	}

	public void setAnthor(String anthor) {
		this.anthor = anthor;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", anthor=" + anthor + "]";
	}
	
	
	
}
