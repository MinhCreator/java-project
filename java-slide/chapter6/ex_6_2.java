class Animal {
    public abstract void sound();

    public abstract void genre();

}

class Dog extends Animal {
    public void sound() {
        System.out.println("go go");
    }

    public void genre(String genre) {
        System.out.println("this genre is" + genre);
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("meow meow");
    }

    public void genre(String genre) {
        System.out.println("this genre is" + genre);
    }
}




public class ex_6_2 {
    public static void main(String[] args) {

    }
}