package com.example.testingweb;

public class Example{

    private String name;

    public Example(String name) {
        this.name = name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void doSomething() {
        // ... código que hace algo
    }

    public void unusedMethod() {
        // ... método no utilizado
    }

    public void longMethodWithComplexLogic() {
        // ... un método largo y complejo con múltiples condiciones y bucles
    }
}
