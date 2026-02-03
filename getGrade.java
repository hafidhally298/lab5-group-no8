public class getGrade {

    public static void main(String[] args) {
        
        int score = 85; 

        
        char grade = getGrade(score);
        
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
    }

    
    public static char getGrade(int score) {
        if (score >= 70) return 'A';
        if (score >= 60) return 'B';
        if (score >= 50) return 'C';
        if (score >= 40) return 'D';
        return 'F';
    }
}
    

