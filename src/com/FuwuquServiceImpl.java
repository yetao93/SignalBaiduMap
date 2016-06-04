package com;

import java.util.List;

public class FuwuquServiceImpl implements FuwuquService {

	private FuwuquDao fuwuquDao;
	public void setFuwuquDao(FuwuquDao fuwuquDao) {
		this.fuwuquDao = fuwuquDao;
	}
	public List<Fuwuqu> getAllFuwuqus() {
		return fuwuquDao.findAll(Fuwuqu.class);
	}

}
