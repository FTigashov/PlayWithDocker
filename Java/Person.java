class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\tage: %s\n", name, age);
    }
    
    public void printInfo() {
        System.out.println(this);
    }

}