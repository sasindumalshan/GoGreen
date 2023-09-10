package view.tm;

import javafx.scene.control.Button;


public class EmployeeTm {
    private String id;
    private String fist;
    private String last;
    private String handle;
    private Button remove;
    private Button update;

    public EmployeeTm(String id, String fist, String last, String handle, Button remove, Button update) {
        this.id = id;
        this.fist = fist;
        this.last = last;
        this.handle = handle;
        this.remove = remove;
        this.update = update;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFist() {
        return fist;
    }

    public void setFist(String fist) {
        this.fist = fist;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public Button getRemove() {
        return remove;
    }

    public void setRemove(Button remove) {
        this.remove = remove;
    }

    public Button getUpdate() {
        return update;
    }

    public void setUpdate(Button update) {
        this.update = update;
    }

    @Override
    public String toString() {
        return "EmployeeTm{" +
                "id='" + id + '\'' +
                ", fist='" + fist + '\'' +
                ", last='" + last + '\'' +
                ", handle='" + handle + '\'' +
                ", remove=" + remove +
                ", update=" + update +
                '}';
    }
}
