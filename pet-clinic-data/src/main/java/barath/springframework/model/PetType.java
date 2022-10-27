package barath.springframework.model;

public class PetType extends BaseEntity{
    private String name;
    private String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
