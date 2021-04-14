package Java.q3;

public class PassFailActivity extends GradedActivity {
    int score;
    boolean pass;

    public PassFailActivity(int score) {
        this.score = score;
    }

    public void checkScore() {
        this.pass = this.score >= 40;
    }

}
