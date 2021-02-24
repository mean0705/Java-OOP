package mid;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student one = new Student();
		one.setName("one");
		one.setChinese(85);
		one.setEnglish(88);
		one.setComputer(87);
		one.setWork(91);
		one.setCreative(93);
		one.setSolve(94);
		one.setAnalyze(98);
		
		Student two = new Student();
		two.setName("two");
		two.setChinese(85);
		two.setEnglish(88);
		two.setComputer(87);
		two.setWork(91);
		two.setCreative(93);
		two.setSolve(94);
		two.setAnalyze(98);
		
		Student three = new Student();
		three.setName("three");
		three.setChinese(85);
		three.setEnglish(88);
		three.setComputer(87);
		three.setWork(91);
		three.setCreative(93);
		three.setSolve(94);
		three.setAnalyze(98);
		
		Student four = new Student();
		four.setName("four");
		four.setChinese(85);
		four.setEnglish(88);
		four.setComputer(87);
		four.setWork(91);
		four.setCreative(93);
		four.setSolve(94);
		four.setAnalyze(98);
		
		Student five = new Student();
		five.setName("five");
		five.setChinese(85);
		five.setEnglish(88);
		five.setComputer(87);
		five.setWork(91);
		five.setCreative(93);
		five.setSolve(94);
		five.setAnalyze(98);
		
		Student six = new Student();
		six.setName("six");
		six.setChinese(85);
		six.setEnglish(88);
		six.setComputer(87);
		six.setWork(91);
		six.setCreative(93);
		six.setSolve(94);
		six.setAnalyze(98);
		
		Student seven = new Student();
		seven.setName("seven");
		seven.setChinese(85);
		seven.setEnglish(88);
		seven.setComputer(87);
		seven.setWork(91);
		seven.setCreative(93);
		seven.setSolve(94);
		seven.setAnalyze(98);
		
		studentList.add(one);
		studentList.add(two);
		studentList.add(three);
		studentList.add(four);
		studentList.add(five);
		studentList.add(six);
		studentList.add(seven);
		
		for (Student student : studentList) {
			student.setAverage();
		}
		
		String winner = "";
		int grade = 0;
		for (Student student : studentList) {
			if (student.getAverage() > grade ) winner = student.getName();
			System.out.println( winner );
		}
    }

}
