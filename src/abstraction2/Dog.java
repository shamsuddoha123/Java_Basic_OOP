package abstraction2;

//Dog class extends Animal class
public class Dog extends Animal {

        public void sound(){

            System.out.println("Woof");
        }
        public static void main(String[] args){
            Animal obj = new Dog();
            obj.sound();
        }
    }

