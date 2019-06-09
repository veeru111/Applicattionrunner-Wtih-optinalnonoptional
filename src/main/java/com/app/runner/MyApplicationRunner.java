package com.app.runner;


import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		//Optional Keys
		
			Set<String> keys=args.getOptionNames();
			System.out.println(keys);
			
		//	optinal key related values
			
	List<String> va=args.getOptionValues("key1");
	System.out.println(va);
	//check key exist or not
	System.out.println(args.containsOption("key1"));
	
	//non optinal
	
	List<String> non=args.getNonOptionArgs();
	System.out.println(non);
	
	
//all arguments
	
	
	String [] all=args.getSourceArgs();
	System.out.println(all);
	
	
	
	
	
	}
}
