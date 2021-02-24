package mid;

import java.util.ArrayList;

public class s10327205_1080711 {
	
	private ArrayList<Student> studentList = new ArrayList<Student>();
    
	private void setStudentInfo() { // 設定每個學生的成績及資料
		
		Student one = new Student();
		one.setName("stu1");
		one.setId("10922323");
		one.setChinese(85);
		one.setEnglish(88);
		one.setComputer(87);
		one.setWork(91);
		one.setCreative(93);
		one.setSolve(94);
		one.setAnalyze(98);
		
		Student two = new Student();
		two.setName("stu2");
		two.setId("10922324");
		two.setChinese(70);
		two.setEnglish(60);
		two.setComputer(50);
		two.setWork(61);
		two.setCreative(55);
		two.setSolve(30);
		two.setAnalyze(40);
		
		Student three = new Student();
		three.setName("stu3");
		three.setId("10922325");
		three.setChinese(60);
		three.setEnglish(88);
		three.setComputer(87);
		three.setWork(80);
		three.setCreative(80);
		three.setSolve(89);
		three.setAnalyze(80);
		
		Student four = new Student();
		four.setName("stu4");
		four.setId("10922326");
		four.setChinese(85);
		four.setEnglish(88);
		four.setComputer(87);
		four.setWork(91);
		four.setCreative(93);
		four.setSolve(94);
		four.setAnalyze(98);
		
		Student five = new Student();
		five.setName("stu5");
		five.setId("10922327");
		five.setChinese(85);
		five.setEnglish(88);
		five.setComputer(87);
		five.setWork(91);
		five.setCreative(93);
		five.setSolve(94);
		five.setAnalyze(98);
		
		Student six = new Student();
		six.setName("stu6");
		six.setId("10922328");
		six.setChinese(85);
		six.setEnglish(88);
		six.setComputer(87);
		six.setWork(91);
		six.setCreative(93);
		six.setSolve(94);
		six.setAnalyze(98);
		
		Student seven = new Student();
		seven.setName("stu7");
		seven.setId("10922329");
		seven.setChinese(85);
		seven.setEnglish(88);
		seven.setComputer(87);
		seven.setWork(91);
		seven.setCreative(93);
		seven.setSolve(94);
		seven.setAnalyze(98);
		
		studentList.add(one); // 然後將所有學生丟入一個ArrayList
		studentList.add(two);
		studentList.add(three);
		studentList.add(four);
		studentList.add(five);
		studentList.add(six);
		studentList.add(seven);
	}
	
	private void Average() { // 設定平均跟總分用
		for (Student student : studentList) {
			student.setAverage();
			student.setTotal();
		}
	}
	private void Winner() { // 找到最高分的人
		String winner = "";
		int grade = 0;
		for (Student student : studentList) {
			if (student.getAverage() > grade ) winner = student.getName();
		}
		System.out.println( "The student who has highest score is : " + winner );
	}
	
	private void Print() { // 輸出所需要的資料
		System.out.println( "|    id    | name |Chi |Eng |Com |Wor |Cre |Sol |Ana |Total| Average |                   Comment                    " );
		for (Student student : studentList) {
			System.out.println( "| " + student.getId() + " | " + student.getName() + " | " + student.getChinese() + " | " + student.getEnglish() + " | " + student.getComputer() + " | " + student.getWork() + " | " + student.getCreative() + " | " + student.getSolve() + " | " + student.getAnalyze() + " | " + student.getTotal() + " |   " + student.getAverage() + "    | " + student.getComment() );
		}
	}
	
	
	public static void main(String[] args) {
		s10327205_1080711 class1 = new s10327205_1080711();
		class1.setStudentInfo();
		class1.Average();
		class1.Print();
		class1.Winner();
    }

}
