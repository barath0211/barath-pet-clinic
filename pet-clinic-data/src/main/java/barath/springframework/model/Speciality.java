package barath.springframework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialities")
public class Speciality extends  BaseEntity{
    public static Speciality savedRadiology;
    public static Speciality savedSurgery;
    public static Speciality savedDentistry;
    @Column(name = "description")
    private  String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
