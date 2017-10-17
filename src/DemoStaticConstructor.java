/**
 * Everything that is marked static belongs to the class only, for example static method cannot be inherited in the sub class because they belong to the class in which they have been
 * declared.Refer static keyword.
 * Lets back to the point, since each constructor is being called by its subclass during creation of the object of its subclass, so if you mark constructor as static the subclass will not be
 * able to access the constructor of its parent class because it is marked static and thus belong to the class only. This will violate the whole purpose of inheritance concept and that is reason
 * why a constructor cannot be static.
 */


class A {
    public A() {
        System.out.println("default constructor of grand parent Class A ");
    }
}


class B extends A {

    public B() {
        System.out.println("default constructor of parent class B ");
    }
}


public class DemoStaticConstructor extends B {

    public DemoStaticConstructor() {
        System.out.println("default constructor of child class C");
    }

    public static void main(String[] args) {

        System.out.println("program start from here --->");

        new DemoStaticConstructor();

    }
}
