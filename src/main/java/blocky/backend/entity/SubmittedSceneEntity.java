package blocky.backend.entity;

public class SubmittedSceneEntity {
    private int id;
    private int scene_id;
    private String scene_title;
    private int status;
    private int score;
    private int teacher_id;
    private String teacher_name;
    private String result;
    private int check_way;
    private String picture;
    private int level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScene_id() {
        return scene_id;
    }

    public void setScene_id(int scene_id) {
        this.scene_id = scene_id;
    }

    public String getScene_title() {
        return scene_title;
    }

    public void setScene_title(String scene_title) {
        this.scene_title = scene_title;
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

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getCheck_way() {
        return check_way;
    }

    public void setCheck_way(int check_way) {
        this.check_way = check_way;
    }

    public String getPicture() {
        return picture;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
