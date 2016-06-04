package com.fwq.service.impl;

import java.util.List;

import com.fwq.dao.FuwuquDao;
import com.fwq.domain.Fuwuqu;
import com.fwq.service.FuwuquService;

public class FuwuquServiceImpl implements FuwuquService {

	private FuwuquDao fuwuquDao;
	public void setFuwuquDao(FuwuquDao fuwuquDao) {
		this.fuwuquDao = fuwuquDao;
	}
	public List<Fuwuqu> getAllFuwuqus() {
		return fuwuquDao.findAll(Fuwuqu.class);
	}
	public List<Fuwuqu> getFuwuqus(double a,double b,double c,double d){
		return fuwuquDao.find(Fuwuqu.class, a, b, c, d);
	}
}
