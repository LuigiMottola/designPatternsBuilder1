public class PersonBuilder {

    private String firstName;
    private String lastName;
    private int age = 0;
    private String address = "";

    public PersonBuilder(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person buildPerson(){
        Person personBuilt = new Person(this.firstName, this.lastName, this.age, this.address);
        return personBuilt;
    }

}