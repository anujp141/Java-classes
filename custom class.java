public class Pet {
    // Private instance variables
    private String name;
    private int age;
    private String location;
    private String type;

    // Empty constructor
    public Pet() {
        this.name = "";
        this.age = 0;
        this.location = "";
        this.type = "";
    }

    // Constructor using 2 variables
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        this.location = "";
        this.type = "";
    }

    // Constructor using all 3 variables
    public Pet(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = "";
    }

    // Get methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    // Set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Method that returns a Boolean
    public boolean isOld() {
        return age > 10;
    }

    // Method that returns a String
    public String description() {
        return "This is " + name + ", a " + age + "-year-old " + type + ". Currently located in " + location + ".";
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet();
        pet1.setName("Buddy");
        pet1.setAge(5);
        pet1.setType("Dog");
        System.out.println(pet1.description());

        Pet pet2 = new Pet("Fluffy", 2, "Living Room");
        pet2.setType("Cat");
        System.out.println(pet2.isOld());  // Output: false
    }
}
