package com.basics.Ref;

public class RefDemo {

	public static void main(String[] args) {
		System.out.println("Method ref Demo");
		
		//Provide the implementation of IWork
		IWork iwork = ()-> {
			System.out.println("This is do project form IWork");
		};
		iwork.doProject();
		
		
		/*Same thing doing with the help of method reference
		IWork iworks = Project::ProjectProgress;
		iworks.doProject();
		*/
		
		/*Implementing runnable interface
		Runnable runnable = Project::threadTask;
		Thread t1 = new Thread(runnable);
		t1.start();
		*/
		
		
		Runnable runnable1 = Project::oddTo100;
		Thread t2 = new Thread(runnable1);
		t2.start();
	}

}
