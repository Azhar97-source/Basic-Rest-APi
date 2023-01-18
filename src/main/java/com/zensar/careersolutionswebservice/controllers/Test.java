package com.zensar.careersolutionswebservice.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Data d=new Data(0, "A");
		Data d1=new Data(1, "B");
		Data d2=new Data(2, "C");
		Data d3=new Data(3, "D");
		Data d4=new Data(4, "E");
		List<Data> list=new ArrayList<Data>();
		list.add(d);
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		System.out.println("NORMAL ORDER"+list);
		Collections.reverse(list);
		System.out.println(list);
		
		
	}

}
