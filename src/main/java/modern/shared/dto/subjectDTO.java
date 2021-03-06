package modern.shared.dto;

import modern.io.entity.collage;

import java.io.Serializable;

public class subjectDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String code;
    private String name;
    private int creditHours;
    private String defaultInstructor;
    private String files;
    private String description;
    private collage collage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getDefaultInstructor() {
        return defaultInstructor;
    }

    public void setDefaultInstructor(String defaultInstructor) {
        this.defaultInstructor = defaultInstructor;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public modern.io.entity.collage getCollage() {
        return collage;
    }

    public void setCollage(modern.io.entity.collage collage) {
        this.collage = collage;
    }
}
