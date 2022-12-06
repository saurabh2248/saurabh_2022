package com.competitive.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExamApplication {

	public static void main(String[] args) {
		ArrayList<ExamAttributes> list = new ArrayList<ExamAttributes>();
		list.add(new ExamAttributes(1, "UPSC","Nishant Gupta",60, 99000));
		list.add(new ExamAttributes(2, "JEE","Nikita Sahu",24, 50000));
		list.add(new ExamAttributes(3, "NEET","Saurabh Partap",36, 97000));
		list.add(new ExamAttributes(4, "CAT","Nitesh kumar",24, 22000));
		list.add(new ExamAttributes(5, "GATE","Sweeta kumari",48, 43000));
		list.add(new ExamAttributes(6, "GRE","Ankush Kumar",24, 67000));
		list.add(new ExamAttributes(7, "BIE","Rakesh Singh",36, 55000));
		list.add(new ExamAttributes(8, "JSE","Durgash gosh",46, 90900));
		list.add(new ExamAttributes(9, "NTSE","Rajesh Banerjee",60, 22700));
		list.add(new ExamAttributes(10, "CLAT","Sylpa Nayak",60, 43900));
		list.add(new ExamAttributes(11, "GMAT","Alek Khan",24, 20567));
		list.add(new ExamAttributes(12, "CET","Manish Pratap",24, 59000));
		list.add(new ExamAttributes(13, "RRB","Nishant Dube",36, 13500));
		list.add(new ExamAttributes(14, "NDA","Kunal Pratap",12, 47600));
		list.add(new ExamAttributes(50, "CDS","Sanjay Reddy",24, 43900));
		
//		System.out.println("Sorting the data based on price in ascending order");
//		String format = "%1$-15S %2$-15S %3$-15S %4$-15S %5$-20S \n";
//		Consumer<ExamAttributes> exam= a->System.out.format(format, a.getCourse_id()+" "+a.getCourse_name()+" "+a.getCourse_teacher()+" "+a.getCourse_duration()+" "+a.getTotal_fees());
//		System.out.format(format, "course_id","course_name","course_teacher","course_duration","total_fees");
//		List<ExamAttributes> examascsort= list.stream().sorted((o1, o2)->o1.getTotal_fees().compareTo(o2.getTotal_fees())).collect(Collectors.toList());
//		examascsort.stream().forEach(exam);

		System.out.println("Sorting the data in ascending order  based on price");
		List<ExamAttributes> examascsort= list.stream().sorted((o1, o2)->o1.getTotal_fees().compareTo(o2.getTotal_fees())).collect(Collectors.toList());
		for(ExamAttributes a: examascsort) {
		System.out.println(a.getCourse_id()+" "+a.getCourse_name()+" "+a.getCourse_teacher()+" "+a.getCourse_duration()+" "+a.getTotal_fees());		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("Sorting the data in decending order  based on price");
		List<ExamAttributes> examdescsort= list.stream().sorted((o1, o2)->o2.getTotal_fees().compareTo(o1.getTotal_fees())).collect(Collectors.toList());
		for(ExamAttributes a: examdescsort) {
		System.out.println(a.getCourse_id()+" "+a.getCourse_name()+" "+a.getCourse_teacher()+" "+a.getCourse_duration()+" "+a.getTotal_fees());		}
		
		
		System.out.println();
		System.out.println();
     	System.out.println("Sorting the data in ascending order based on course duration");
     	List<ExamAttributes> durationsort= list.stream().sorted((o1, o2)->o1.getCourse_duration().compareTo(o2.getCourse_duration())).collect(Collectors.toList());
		for(ExamAttributes a: durationsort) {
		System.out.println(a.getCourse_id()+" "+a.getCourse_name()+" "+a.getCourse_teacher()+" "+a.getCourse_duration()+" "+a.getTotal_fees());		}
	}
}
