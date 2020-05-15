package blocky.backend.entity;

public class SceneEntity {
    private int id;
    private String title;
    private int create_id;
    private String script;
    private int three_id;
    private String l1;
    private String l2;
    private String l3;
    private String l4;
    private String l5;
    private String l6;
    private String l7;
    private String l8;
    private String description;
    private int level_number;
    private String objects;
    private String create_user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreate_id() {
        return create_id;
    }

    public void setCreate_id(int create_id) {
        this.create_id = create_id;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public int getThree_id() {
        return three_id;
    }

    public void setThree_id(int three_id) {
        this.three_id = three_id;
    }

    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1;
    }

    public String getL2() {
        return l2;
    }

    public void setL2(String l2) {
        this.l2 = l2;
    }

    public String getL3() {
        return l3;
    }

    public void setL3(String l3) {
        this.l3 = l3;
    }

    public String getL4() {
        return l4;
    }

    public void setL4(String l4) {
        this.l4 = l4;
    }

    public String getL5() {
        return l5;
    }

    public void setL5(String l5) {
        this.l5 = l5;
    }

    public String getL6() {
        return l6;
    }

    public void setL6(String l6) {
        this.l6 = l6;
    }

    public String getL7() {
        return l7;
    }

    public void setL7(String l7) {
        this.l7 = l7;
    }

    public String getL8() {
        return l8;
    }

    public void setL8(String l8) {
        this.l8 = l8;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel_number() {
        return level_number;
    }

    public void setLevel_number(int level_number) {
        this.level_number = level_number;
    }

    public String getObjects() {
        return objects;
    }

    public void setObjects(String objects) {
        this.objects = objects;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", create_id=" + create_id +
                ", script='" + script + '\'' +
                ", three_id=" + three_id +
                ", l1='" + l1 + '\'' +
                ", l2='" + l2 + '\'' +
                ", l3='" + l3 + '\'' +
                ", l4='" + l4 + '\'' +
                ", l5='" + l5 + '\'' +
                ", l6='" + l6 + '\'' +
                ", l7='" + l7 + '\'' +
                ", l8='" + l8 + '\'' +
                ", description='" + description + '\'' +
                ", level_number=" + level_number +
                ", objects='" + objects + '\'' +
                '}';
    }
}
