package com.basics.Ref;

import java.time.LocalDate;

public class Project {

	public static void ProjectProgress() {
		System.out.println("Project is making progress");
        LocalDate now=  LocalDate.now();
        System.out.println(now.toString());
	}
	
	public static void threadTask() {
		for(int i=1; i<=10; i++) {
			System.out.println(2*i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void oddTo100() {
		for(int i=1; i<=100; i++) {
			if(i%2!=0)
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
