package com.sample;

/**
 * Default Methods in Interfaces (Conflict resolution in multiple inheritance)
 */

interface InterfaceA {
    default void show() {
        System.out.println("InterfaceA show");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("InterfaceB show");
    }
}


// Concreate Class
class TestDefaultMehodsInterfaces implements InterfaceA, InterfaceB {
    // Override the conflicting default method to resolve the conflict
    @Override
    public void show() {
        InterfaceA.super.show();  // Call show() from InterfaceA
        InterfaceB.super.show();  // Call show() from InterfaceB
        System.out.println("ConcreteClass show");
    }
    
    public static void main(String[] args) {
    	TestDefaultMehodsInterfaces obj = new TestDefaultMehodsInterfaces();
        obj.show();
    }
}

