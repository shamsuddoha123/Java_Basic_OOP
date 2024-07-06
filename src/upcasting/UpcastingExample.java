package upcasting;

class UpcastingExample{
    public static void main(String args[]) {

        Parent obj1 = (Parent) new Child();
        Parent obj2 = (Parent) new Child();

//      obj1.Show();
                            /*This will show an error because obj1 and obj2 can only access
                            methods and fields available in Parent class even though it actually
                             refers to an instance of the child class.*/
//       obj2.Show();

        obj1.PrintData();
                            /*If Child overrides any methods from Parent, the overridden methods in the
                            Child class will be called due to dynamic method dispatch(runtime polymorphism).
                             */
        obj2.PrintData();

        Child obj3 = new Child();
        Parent obj4 = obj3;// Parent obj4 = (Parent) obj3;

        Parent obj5 = new Child();
        obj4.PrintData();
        obj5.PrintData();
    }
}