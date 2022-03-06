package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

public class Div1 {

	public static void main(String[] args) {		
		List<Integer> list =Arrays.asList(1,2,3,4,5,6);
		list.forEach(System.out::println);
		System.out.println("\n");
		list.stream().limit(4).forEach(System.out::println);

	}


	}


