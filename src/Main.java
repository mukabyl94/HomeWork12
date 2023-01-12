public class Main {
    public static void main(String[] args) {

       Fish fish = new Fish();
       fish.setName("Akula");
       fish.setAge(12);
       fish.setColor("black white");
       fish.setWeight(4000);
        System.out.println("Name: "+fish.getName());
        System.out.println("Age: "+fish.getAge());
        System.out.println("Color: "+fish.getColor());
        System.out.println("Weight: "+fish.getWeight());
        System.out.println();

        Fish fish2 = new Fish();
        fish2.setName("Sudak");
        fish2.setAge(1);
        fish2.setColor("green brown");
        fish2.setWeight(16.5);
        System.out.println("Name: "+fish2.getName());
        System.out.println("Age: "+fish2.getAge());
        System.out.println("Color: "+fish2.getColor());
        System.out.println("Weight: "+fish2.getWeight());
        System.out.println("-------------------------------------");


        Parrot parrot = new Parrot();
        parrot.setName("Amazon");
        parrot.setAge(45);
        parrot.setColor("green and yellow");
        parrot.setWeight(0.450);
        System.out.println("Name: "+parrot.getName());
        System.out.println("Age: "+parrot.getAge());
        System.out.println("Color: "+parrot.getColor());
        System.out.println("Weight: "+parrot.getWeight());
        System.out.println();

        Parrot parrot2 = new Parrot();
        parrot2.setName("Kakadu");
        parrot2.setAge(62);
        parrot2.setColor("white");
        parrot2.setWeight(1.850);
        System.out.println("Name: "+parrot2.getName());
        System.out.println("Age: "+parrot2.getAge());
        System.out.println("Color: "+parrot2.getColor());
        System.out.println("Weight: "+parrot2.getWeight());
        System.out.println("----------------------------");


        Cat cat = new Cat();
        cat.setName("Gudvin");
        cat.setAge(6);
        cat.setColor("black");
        cat.setBreed("korat");
        cat.setWeight(2.600);
        System.out.println("Name: "+cat.getName());
        System.out.println("Age: "+cat.getAge());
        System.out.println("Color: "+cat.getColor());
        System.out.println("Breed: "+cat.getBreed());
        System.out.println("Weight: "+cat.getWeight());
        System.out.println();

        Cat cat2 = new Cat();
        cat2.setName("Garvild");
        cat2.setAge(8);
        cat2.setColor("yellow");
        cat2.setBreed("persidskaya");
        cat2.setWeight(3.250);
        System.out.println("Name: "+cat2.getName());
        System.out.println("Age: "+cat2.getAge());
        System.out.println("Color: "+cat2.getColor());
        System.out.println("Breed: "+cat2.getBreed());
        System.out.println("Weight: "+cat2.getWeight());
        System.out.println("------------------------------");

        Dog dog = new Dog();
        dog.setName("Alabai");
        dog.setAge(12);
        dog.setColor("white");
        dog.setBreed("ovcharka");
        dog.setWeight(60);
        System.out.println("Name: "+dog.getName());
        System.out.println("Age: "+dog.getAge());
        System.out.println("Color: "+dog.getColor());
        System.out.println("Breed: "+dog.getBreed());
        System.out.println("Weight: "+dog.getWeight());
        System.out.println();

        Dog dog2 = new Dog();
        dog2.setName("Reks");
        dog2.setAge(9);
        dog2.setColor("orange and white");
        dog2.setBreed("senbernar");
        dog2.setWeight(70);
        System.out.println("Name: "+dog2.getName());
        System.out.println("Age: "+dog2.getAge());
        System.out.println("Color: "+dog2.getColor());
        System.out.println("Breed: "+dog2.getBreed());
        System.out.println("Weight: "+dog2.getWeight());
        System.out.println("------------------------");

    }
}