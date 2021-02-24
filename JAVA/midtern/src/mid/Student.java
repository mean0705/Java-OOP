package mid;

public class Student {
    int chinese, english, computer, work, creative, solve, analyze;
    int average, total;
    String name;
    
    void setChinese(int g) {chinese = g;}
    void setEnglish(int g) {english = g;}
    void setComputer(int g) {computer = g;}
    void setWork(int g) {work = g;}
    void setCreative(int g) {creative = g;}
    void setSolve(int g) {solve = g;}
    void setAnalyze(int g) {analyze = g;}
    void setName(String j) {name = j;}
    
    void setAverage(){
    	average = ( chinese + english + computer + work + creative + solve + analyze )/7;
    	if (average >= 90) System.out.println( name + "'s performance is much higher than the standard." );
    	else if ( average < 90 && average >= 80 ) System.out.println( name + "'s performance exceeds standard." );
    	else if ( average < 60 ) System.out.println( name + ", you need to study hard." );
    	else;
    }
    
    String getName() {
    	return name;
    }
    
    void setTotal() {
    	total = ( chinese + english + computer + work + creative + solve + analyze );
    }
    
    int getAverage() {
    	return average;
    }
    
}
