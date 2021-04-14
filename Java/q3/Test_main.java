package Java.q3;

public class Test_main {
    public static void main(String args[]){
        PassFailActivity  passFailActivity = new PassFailActivity(60);        
        System.out.println(passFailActivity.pass);

        PassFailExam exam = new PassFailExam(30, 20);
        System.out.println(exam.Gpass);
        
      
    }
    
}
