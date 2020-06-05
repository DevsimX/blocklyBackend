package blocky.backend.entity;

public class SceneListEntity {
    private int id;
    private String title;
    private int create_id;
    private String description;
    private int level_number;
    private int check_way;
    private String picture;
    private String create_user;

    public int getId() {
        return id;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public int getLevel_number() {
        return level_number;
    }

    public void setLevel_number(int level_number) {
        this.level_number = level_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreate_id() {
        return create_id;
    }

    public void setCreate_id(int create_id) {
        this.create_id = create_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
