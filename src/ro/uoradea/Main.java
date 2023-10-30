package ro.uoradea;

public class Main {


    public static void main(String[] args)
    {
        Dog dog1=new Dog("luna",  "something");
        Dog dog2=new Dog("lunisoara", "somethingelse");
        System.out.println(dog1.getName());
        System.out.println(dog1.getBreed());
        System.out.println(dog2.getName());
        System.out.println(dog2.getBreed());
        dog1.setName("anuta");
        dog2.setBreed("nothing");
        System.out.println(dog1.getName());
        System.out.println(dog1.getBreed());
        System.out.println(dog2.getName());
        System.out.println(dog2.getBreed());
    }
}
