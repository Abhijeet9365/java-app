package com.btc.exp;

import java.util.HashMap;

public class Prgrm1 {
public static void main(String[] args) {
	String state[] = {"goa","kerala","gujurat"};
	String key1="",key2="";
	HashMap<String,String> hmap = new HashMap();
	for(int i=0;i<state.length;i++) {
		key1=state[i];
		key2=key1.substring(0,3);
		hmap.put(key2.toUpperCase(),state[i]);
	}
	hmap.forEach((k,v)->System.out.println(k+"->"+v));
}
}

