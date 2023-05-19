package com.example.testingweb;
import edu.umd.cs.findbugs.annotations.SuppressWarnings;

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

    @SuppressWarnings("squid:S2259")
    public String getName() {
        return name;
    }

    public void doSomething() {
        // ... código que hace algo
    }

    public void unusedMethod() {
        // ... método no utilizado
    }

    @edu.umd.cs.findbugs.annotations.SuppressWarnings(value = "DM_COMPLEXITY", justification = "Complex logic is necessary in this case")
    public void longMethodWithComplexLogic() {
        // ... un método largo y complejo con múltiples condiciones y bucles
    }
}
