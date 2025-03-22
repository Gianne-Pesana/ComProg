package org.example;

public abstract class Pet extends Animal {
    boolean hasOwner;
    String petName;

    public Pet() {
    }

    public Pet(String kingdom, double lifeSpan) {
        super(kingdom, lifeSpan);
    }

    public Pet(String kingdom, double lifeSpan, boolean hasOwner, String petName) {
        this(kingdom, lifeSpan);
        this.hasOwner = hasOwner;
        this.petName = petName;
    }

    @Override
    public String introduction() {
        String formatted = "Kingdom: " + getKingdom() + " Lifespan: " + getLifeSpan() +
                "\n\nHello I am a Pet with details" +
                "\nPet Name: " + petName +
                "\nDo I have a owner: " + hasOwner;
        return formatted;
    }

    abstract public void adopt();
}
