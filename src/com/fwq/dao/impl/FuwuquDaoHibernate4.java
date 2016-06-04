package com.fwq.dao.impl;

import java.util.List;

import com.commom.dao.impl.BaseDaoHibernate4;
import com.fwq.dao.FuwuquDao;
import com.fwq.domain.Fuwuqu;

public class FuwuquDaoHibernate4 extends BaseDaoHibernate4<Fuwuqu> implements FuwuquDao {

	@Override
	public List<Fuwuqu> find(Class<Fuwuqu> entityClazz, double a, double b, double c, double d) {
		return find("select en from "+entityClazz.getSimpleName()+
				" en where (lng between "+a+" and "+b+" ) and (lat between "+d+" and "+c+" )");
	}

	
}
