package testvaadin;

public class Person {

    private String firstname;
    private String lastname;


    public Person(final String firstname, final String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }
}
