package com.fwq.action;

import java.io.IOException;
import java.util.List;

import com.fwq.domain.*;
import com.fwq.service.FuwuquService;
import com.opensymphony.xwork2.ActionSupport;

public class FuwuquAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private FuwuquService fuwuquService;
	private Bounds bounds;
	private Fuwuqu fuwuqu;
	private List<Fuwuqu> fuwuqus;
	public void setBounds(Bounds bounds) {
		System.out.println("setBounds");
		this.bounds = bounds;
	}
	public Bounds getBounds() {
		System.out.println("getBounds");
		return bounds;
	}
	public void setFuwuquService(FuwuquService fuwuquService) {
		System.out.println("setFuwuquService");
		this.fuwuquService = fuwuquService;
	}
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
	public String find() throws IOException{
		System.out.println(bounds.getLeftLng()+" "+
				bounds.getRightLng()+ " "+bounds.getUpLat()+ " "+bounds.getDownLat());
		double cur = System.currentTimeMillis();
		setFuwuqus(fuwuquService.getFuwuqus(bounds.getLeftLng(),
				bounds.getRightLng(), bounds.getUpLat(), bounds.getDownLat()));
		System.out.println("这次查询耗时："+(System.currentTimeMillis()-cur));
		if (fuwuqus.size()>0) {
			System.out.println("显示第一个服务区的信息：");
			System.out.println(fuwuqus.get(0).getName()+" "+fuwuqus.get(0).getMoveIn());
		}
		return SUCCESS;
	}
	public String list(){
		setFuwuqus(fuwuquService.getAllFuwuqus());
		return SUCCESS;
	}
	public String show() {
		return SUCCESS;
	}
}
