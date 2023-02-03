public class Main {
    public static void main(String[] args) {
        System.out.print("Test\n");

        Person person = new Person("Ivan", 20);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.printInfo();

        Person person2 = new Person("Boris", 25);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        person2.printInfo();
    }
}
