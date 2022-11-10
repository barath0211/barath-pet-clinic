package barath.springframework.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialities")
public class Speciality extends  BaseEntity{
    @ManyToOne
    @JoinColumn(name = "saved_radiology_id")
    public static Speciality savedRadiology;
    @ManyToOne
    @JoinColumn(name = "saved_surgery_id")
    public static Speciality savedSurgery;
    @ManyToOne
    @JoinColumn(name = "saved_dentistry_id")
    public static Speciality savedDentistry;
    @Column(name = "description")
    private  String description;

}
