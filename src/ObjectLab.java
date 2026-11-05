public class ObjectLab {
    public static void main(String[] args) {
        // 1. Create rex (Rex, 3) and mia (Mia). Print names and ages.
        Pet rex = new Pet("Rex", 3);
        Pet mia = new Pet("Mia");
        System.out.println("Rex: " + rex.getName() + ", age " + rex.getAge());
        System.out.println("Mia: " + mia.getName() + ", age " + mia.getAge());

        // 2. Alias: Pet copy = rex; copy.birthday(); print both ages.
        Pet copy = rex;
        copy.birthday();
        System.out.println("After alias birthday:");
        System.out.println("rex age = " + rex.getAge());
        System.out.println("copy age = " + copy.getAge());

        // 3. A separate Pet twin with the same values. Print its age.
        Pet twin = new Pet(rex.getName(), rex.getAge());
        System.out.println("Twin: " + twin.getName() + ", age " + twin.getAge());

        // 4. copy = null; then try copy.getName().
        copy = null;
        try {
            System.out.println(copy.getName());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: cannot call getName() on a null reference.");
        }
    }
}

// Given class. Read it, do not edit it. You will write classes like this in Unit 5.
class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {
        this.name = name;
        this.age = 1;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public void birthday() { age++; }
}
