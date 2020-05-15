package blocky.backend.entity;

public class HistoryEntity {
    private int id;
    private int userId;
    private int sceneId;
    private String script;
    private String objects;
    private int level;
    private String mt;
    private String action;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSceneId() {
        return sceneId;
    }

    public void setSceneId(int sceneId) {
        this.sceneId = sceneId;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getObjects() {
        return objects;
    }

    public void setObjects(String objects) {
        this.objects = objects;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getMt() {
        return mt;
    }

    public void setMt(String mt) {
        this.mt = mt;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", user_id=" + userId +
                ", scene_id=" + sceneId +
                ", script='" + script + '\'' +
                ", objects='" + objects + '\'' +
                ", level=" + level +
                ", mt='" + mt + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
