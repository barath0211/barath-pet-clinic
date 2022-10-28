package barath.springframework.model;

public class Speciality extends  BaseEntity{
    public static Speciality savedRadiology;
    public static Speciality savedSurgery;
    public static Speciality savedDentistry;
    private  String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
