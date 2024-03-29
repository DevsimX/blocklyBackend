package blocky.backend.entity;

public class SubmitEntity {
    private int id;
    private int student_id;
    private int teacher_id;
    private int status;
    private int score;
    private String result;
    private int history_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public int getHistory_id() {
        return history_id;
    }

    public void setHistory_id(int history_id) {
        this.history_id = history_id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", student_id=" + student_id +
                ", teacher_id=" + teacher_id +
                ", status=" + status +
                ", score=" + score +
                ", result='" + result + '\'' +
                ", history_id=" + history_id +
                '}';
    }
}
