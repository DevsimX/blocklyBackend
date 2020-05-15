package blocky.backend.entity;

public class SubmitEntity {
    private int id;
    private int studentId;
    private int teacherId;
    private int status;
    private int score;
    private String result;
    private int historyId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", student_id=" + studentId +
                ", teacher_id=" + teacherId +
                ", status=" + status +
                ", score=" + score +
                ", result='" + result + '\'' +
                ", history_id=" + historyId +
                '}';
    }
}
