public class Dog extends Animal {
    Dog(){
        name = "Bobby";
        age = 2;
    }

    Dog(String name, int age){
        super(name, age);
    }

    void print(){
        Animal an = new Animal();
        System.out.println(an.name + " " + an.age);
        Animal an1 = new Animal("Dog",1);
        System.out.println(an1.name + " " + an1.age);
        Dog d = new Dog();
        System.out.println(d.name + " " + d.age);
        Dog d1 = new Dog("Max",3);
        System.out.println(d1.name + " " + d1.age);
    }
}
