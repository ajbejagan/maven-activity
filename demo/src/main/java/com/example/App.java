package com.example;

import com.person.*;
import com.vehicle.*;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        // activity 1
        
        Student aryen = new Student("Aryen", "Bejagan", 17, "First year");
        Teacher jim = new Teacher("Jim", "Bejagan", 24, "Masters degree");

        introduction(aryen.getFirstName(), aryen.getLastName(), aryen.getAge(), aryen.getYear(), "student");
        introduction(jim.getFirstName(), jim.getLastName(), jim.getAge(), jim.getDegreeLevel(), "teacher");

        Car camry = new Car(4, "2.5-liter Dynamic Force 4-cylinder and a robust 3.5-liter V6", 4);
        Bike vespa = new Bike(2, "Single Cylinder, 4-Stroke, 3-Valve", 69);

        displaySpecs("Camry", camry.getNumberOfWheels(), camry.getEngine(), "Storage capacity", camry.getStorageCapacity());
        displaySpecs("Vespa S 125", vespa.getNumberOfWheels(), vespa.getEngine(), "Wheelie power", vespa.getWheeliePower());

        // activity 2

        Teacher budz = new Teacher("Budz", "Doy", 25, "Lahug", "Masters degree");
        Car xpander = new Car(4, "1.5-liter DOHC 16-valve Inline-4 MIVEC", 45, 21.01, "Xpander", 7);
        System.out.println(xpander.getGas());
        budz.travel(xpander);
        System.out.println(xpander.getGas());

    }

    public static void introduction(String firstName, String lastName, int age, String customString, String title) {
        String introduction = "Hello! My name is " + firstName + " " + lastName + ". I am " + age + " years old";
        String customIntroduction = "";
        switch(title.toLowerCase()) {
            case "student":
                customIntroduction = "and I am a " + customString.toLowerCase() + " " + title + ".";
                break;
            case "teacher":
                customIntroduction = "and I am a " + title + " having a " + customString.toLowerCase() + ".";
                break;
            default:
                System.out.println("You entered an invalid title.");
        }
        System.out.println(introduction + " " + customIntroduction);
    }

    public static void displaySpecs(String vehicle, int numberOfWheels, String engine, String customKey, int customValue) {
        System.out.println("****************************************");
        System.out.println("The all new " + vehicle + " specs...");
        System.out.println("Number of wheels: " + numberOfWheels);
        System.out.println("Engine: " + engine);
        System.out.println(customKey + ": " + customValue);
        System.out.println("****************************************");
    }

}
