package com.basics.Ref;

import java.time.LocalDate;

public class Project {

	public static void ProjectProgress() {
		System.out.println("Project is making progress");
        LocalDate now=  LocalDate.now();
        System.out.println(now.toString());
	}

}
