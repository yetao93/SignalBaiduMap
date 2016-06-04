package com.fwq.dao;

import java.util.List;

import com.commom.dao.BaseDao;
import com.fwq.domain.Fuwuqu;

public interface FuwuquDao extends BaseDao<Fuwuqu> {
	//根据经纬度查询服务区，abcd分别为左经度、右经度、上纬度、下纬度
	List<Fuwuqu> find(Class<Fuwuqu> entityClazz,double a,double b,double c,double d);
}
