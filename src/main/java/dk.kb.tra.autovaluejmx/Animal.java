package dk.kb.tra.autovaluejmx;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Animal implements AnimalMXBean {
    static Animal create(String name, int numberOfLegs) {
        // See "How do I...?" below for nested classes.
        return new AutoValue_Animal(name, numberOfLegs);
    }

    public abstract String getName();

    public abstract int getNumberOfLegs();
}