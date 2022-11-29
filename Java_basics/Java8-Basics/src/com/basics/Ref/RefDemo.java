package com.basics.Ref;

public class RefDemo {

	public static void main(String[] args) {
		System.out.println("Method ref Demo");
		
		/* Provide the implementation of IWork
		IWork iwork = ()-> {
			System.out.println("This is do project form IWork");
		};
		iwork.doProject();
		*/
		
		
		
		//Same thing doing with the help of method reference
		IWork iwork = Project::ProjectProgress;
		iwork.doProject();
	}

}
