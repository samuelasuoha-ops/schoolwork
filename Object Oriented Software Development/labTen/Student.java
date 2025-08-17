//Student ID: C00305107
//Date: 28/01/2025
package labTen;

public class Student {
    private String name;
    private String id;
    private String module;

    // This is the constructor
    public Student(String mName, String mID, String mModule) {
        this.name = mName;
        this.id = mID;
        this.module = mModule;
    }

    // This is the getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}

