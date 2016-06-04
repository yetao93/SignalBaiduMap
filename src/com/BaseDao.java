package com;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	T get(Class<T> entityClazz,Serializable id);
	List<T> findAll(Class<T> entityClazz);
	long findCount(Class<T> entityClazz);
}
