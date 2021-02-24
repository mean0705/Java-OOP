package mid;

public class Student { // 就是一些student該有的setter跟getter
    int chinese, english, computer, work, creative, solve, analyze;
    int average, total;
    String name, comment, id;
    
    void setChinese(int g) {chinese = g;}
    void setEnglish(int g) {english = g;}
    void setComputer(int g) {computer = g;}
    void setWork(int g) {work = g;}
    void setCreative(int g) {creative = g;}
    void setSolve(int g) {solve = g;}
    void setAnalyze(int g) {analyze = g;}
    void setName(String j) {name = j;}
    void setId(String j) {id = j;}
    void setTotal() {total = ( chinese + english + computer + work + creative + solve + analyze );}
    void setAverage(){
    	average = ( chinese + english + computer + work + creative + solve + analyze )/7;
    	if (average >= 90) comment =  name + "'s performance is much higher than the standard.";
    	else if ( average < 90 && average >= 80 ) comment = name + "'s performance exceeds standard.";
    	else if ( average < 60 ) comment = name + ", you need to study hard.";
    	else;
    }
    
    String getId() {return id;}
    String getComment() {return comment;}
    String getName() {return name;}
    
    
    int getChinese() {return chinese;}
    int getEnglish() {return english;}
    int getComputer() {return computer;}
    int getWork() {return work;}
    int getCreative() {return creative;}
    int getSolve() {return solve;}
    int getAnalyze() {return analyze;}
    int getTotal() {return total;}
    int getAverage() {return average;}
    
}
