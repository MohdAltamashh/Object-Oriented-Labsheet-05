/*
Multiple inheritance means inheriting from more than one parent class.
Java does not allow a class to extend two classes because this can create
ambiguity when both parents provide the same method (the diamond problem).

Invalid idea shown only as a comment:
    class C extends A, B { }

Hybrid inheritance combines two or more inheritance forms, such as
hierarchical and multilevel inheritance.

Java interfaces are commonly used when multiple inheritance of type/behavior
is needed. This program intentionally does not create or implement interfaces
and contains no executable multiple-inheritance code.
*/

public class InheritanceConceptMain {
    public static void main(String[] args) {
        System.out.println("Multiple class inheritance is not supported in Java.");
        System.out.println("Hybrid inheritance can be modeled using supported class");
        System.out.println("inheritance patterns and interfaces when appropriate.");
    }
}
