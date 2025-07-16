package web.model;

public class User {
    private long id;
    private String name;
    private String familyName;

    public User(long id, String name, String familyName) {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }
}
