package com;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

public class FuwuquAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private FuwuquService fuwuquService;
	
	public void setFuwuquService(FuwuquService fuwuquService) {
		this.fuwuquService = fuwuquService;
	}
	
	private Fuwuqu fuwuqu;
	private List<Fuwuqu> fuwuqus;
	private Integer id;
	public Fuwuqu getFuwuqu() {
		return fuwuqu;
	}
	public void setFuwuqu(Fuwuqu fuwuqu) {
		this.fuwuqu = fuwuqu;
	}
	public List<Fuwuqu> getFuwuqus() {
		return fuwuqus;
	}
	public void setFuwuqus(List<Fuwuqu> fuwuqus) {
		this.fuwuqus = fuwuqus;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String list(){
		setFuwuqus(fuwuquService.getAllFuwuqus());
		return SUCCESS;
	}
}
