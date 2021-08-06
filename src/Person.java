public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello there from %s!%n", this.name);
    }

    public static Person[] addPerson(Person[] input, Person addThisPerson) {
        Person [] output = new Person[input.length + 1];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        output[input.length] = addThisPerson;
        return output;
    }

    public static void main(String[] args) {
//        Person person1 = new Person("Youssef");
//        Person person2 = new Person("Youssef");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("Youssef");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("Youssef");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Rivas");
        System.out.println(person1.getName());
        System.out.println(person2.getName());


    }
}