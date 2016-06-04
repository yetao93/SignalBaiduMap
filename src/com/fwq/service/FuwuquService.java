package com.fwq.service;

import java.util.List;

import com.fwq.domain.Fuwuqu;

public interface FuwuquService {
	List<Fuwuqu> getAllFuwuqus();
	List<Fuwuqu> getFuwuqus(double a,double b,double c,double d);
}
