package upcasting;

class Child extends Parent {

    @Override
    void PrintData() {
        System.out.println("method of child class.");
    }
    void Show(){
        System.out.println("method of child class show.");
    }
}