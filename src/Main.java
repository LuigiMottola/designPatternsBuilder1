public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Paul","Remak",16,"Via Brandeburgo 18");
        PersonBuilder personBuilder = new PersonBuilder("Tizio","Caio");

        personBuilder.setAge(30);
        personBuilder.setAddress("Viale Sempronio 123");

        Person person2 = personBuilder.buildPerson();

        System.out.println("Person 1: " + person1);

        System.out.println("Person 2 with PersonBuilder: " + person2);
    }
}