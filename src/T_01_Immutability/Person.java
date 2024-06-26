package T_01_Immutability;

public class Person {
    private final String name;
    private final Date birthdate;

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String name() {
        return name;
    }

    public Date birthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return STR."Person{ name = '\{name}\{'\''}, birthdate = \{birthdate} }";
    }
}
