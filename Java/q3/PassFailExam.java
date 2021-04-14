package Java.q3;

public class PassFailExam extends PassFailActivity {

    int gradeing_marks;
    boolean Gpass;
    public PassFailExam(int score, int gradeing_marks) {
        super(score);
        this.gradeing_marks = gradeing_marks;

    }
    public void checkScore() {
        this.Gpass = this.score >= this.gradeing_marks;
    }
}
