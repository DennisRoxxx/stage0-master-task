package com.epam.OOP;

public class Animal {
  
  private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal (String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription () {

        if (numberOfPaws == 1) {
            if (hasFur) {
                return "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and a fur.";
            } else return "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and no fur.";

        } else {
            if (hasFur) {
                return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and a fur.";
            } else return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and no fur.";
        }
    }
  public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
  }

}
