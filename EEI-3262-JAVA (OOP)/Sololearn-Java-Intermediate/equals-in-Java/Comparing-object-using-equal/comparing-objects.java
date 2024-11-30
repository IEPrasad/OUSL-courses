class Animal {
    String name;
    Animal(String n) {
        name = n;
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1 == a2);
    }
}

// >>> false 
// Despite having to objects with the same name, the equality testing returns false, becaue we have two different object (two different reference or memory locations).

