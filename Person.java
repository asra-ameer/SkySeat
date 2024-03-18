public class Person {
    private String name;
    private String surname;
    private String email;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    public void person_info() {
         System.out.printf("Person information \nName: %s\nSurname: %s\nEmail: %s\n", name  , surname, email);

    }
}