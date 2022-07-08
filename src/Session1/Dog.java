package Session1;

public class Dog {
    private String name;
    private String breed;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String name, String breed, String color)
    {
        super();
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", breed='" + breed + '\'' +
//                ", color='" + color + '\'' +
//                '}';
//    }
    public static void main(String args[])
    {
        Dog tuffy = new Dog("tuffy","pappilion","white");
        System.out.println(tuffy.toString());
    }


}
