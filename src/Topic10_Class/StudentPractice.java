package Topic10_Class;

public class StudentPractice {
    private int studentID;
    private String studentName;
    private float knowledgeScore;
    private float practiceScore;

    //chuột phải > Generate getter/setter
    //hàm get để lấy dữ liệu ra
    private int getStudentID(){ return studentID;}
    //hàm set để gán giá trị
    private void setStudentID(int studentID){this.studentID= studentID;}

    private String getstudentName(){ return studentName;}
    private void setstudentName(String studentName){this.studentName= studentName;}

    private float getKnowledgeScore() {return knowledgeScore;}
    private void setKnowledgeScore(float knowledgeScore){this.knowledgeScore=knowledgeScore;}

    private float getPracticeScore() {return practiceScore;}
    private void setPracticeScore(float practiceScore){this.practiceScore = practiceScore;}

    private float getAverageScore(){
        return ((this.knowledgeScore+(this.practiceScore*2)))/3;
    }
    private void displayStudentInformation ()
    {
        System.out.println("ID: "+getStudentID());
        System.out.println("Name: "+getstudentName());
        System.out.println("knowledge score: "+getKnowledgeScore());
        System.out.println("practice score: "+getPracticeScore());
        System.out.println("average score: "+getAverageScore());
        System.out.println("---------");
    }

    public static void main(String[] args) {
        StudentPractice firstStudent = new StudentPractice();
        firstStudent.setStudentID(0001);
        firstStudent.setstudentName("enchantix");
        firstStudent.setKnowledgeScore(9.1f); //float nên nhập là f
        firstStudent.setPracticeScore(8.5f);
        firstStudent.displayStudentInformation();
    }
}
