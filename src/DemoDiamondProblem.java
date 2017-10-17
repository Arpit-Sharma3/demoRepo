/**
 * Let us consider if we have two classes 'ParentA' and 'ParentB' inheriting from Class 'GrandParentC'. Assume that ParentB and ParentA are overriding an inherited method and they
 * provide their own implementation. Now class'DemoDiamondProblem' inherits from both ParentB and ParentA doing multiple inheritance. Class 'DemoDiamondProblem' should inherit that
 * overridden method, which overridden method will be used? Will it be from ParentB or ParentA? Here we have an ambiguity.
 * since compile time error is better than run time error so to avoid this type of problem java shows compile time error and java allows multiple inheritance only through interfaces
 * so we can change ParentA, ParentB and GrandParent classes into interfaces, because interfaces only provide declaration of methods or we can implement method in interface using default
 * method in java as following code.
 */


interface GrandParentC {
    default void hello() {
        System.out.println("C: Grand Parent C");
    }
}

interface ParentB extends GrandParentC {
    default void hello() {
        System.out.println("B: Parent B interface ");
    }
}

interface ParentA extends GrandParentC {
    default void hello() {
        System.out.println("A: Parent A interface");
    }
}

public class DemoDiamondProblem implements ParentA, ParentB {
    public static void main(String[] args) {
        DemoDiamondProblem demoDiamondProblem = new DemoDiamondProblem();
        demoDiamondProblem.hello();
    }

    public void hello() {
        System.out.println("D: Hello!! Welcome to diamond problem \nDemoDiamondProblem class");
        ParentA.super.hello();
        ParentB.super.hello();
    }
}

