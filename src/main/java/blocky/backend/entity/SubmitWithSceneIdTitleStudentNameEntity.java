package blocky.backend.entity;

public class SubmitWithSceneIdTitleStudentNameEntity {
    private int id;
    private int student_id;
    private int teacher_id;
    private int status;
    private int score;
    private String result;
    private int history_id;
    private int scene_id;
    private String title;
    private String student_name;
    private int level;
    private int total_level;
    private int check_way;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getHistory_id() {
        return history_id;
    }

    public void setHistory_id(int history_id) {
        this.history_id = history_id;
    }

    public int getScene_id() {
        return scene_id;
    }

    public void setScene_id(int scene_id) {
        this.scene_id = scene_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTotal_level() {
        return total_level;
    }

    public void setTotal_level(int total_level) {
        this.total_level = total_level;
    }

    public int getCheck_way() {
        return check_way;
    }

    public void setCheck_way(int check_way) {
        this.check_way = check_way;
    }
}
