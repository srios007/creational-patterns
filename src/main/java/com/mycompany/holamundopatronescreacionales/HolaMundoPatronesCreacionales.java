package com.mycompany.holamundopatronescreacionales;

import AbstractFactory.Factories.EnglishManufacturer;
import AbstractFactory.Factories.Person;
import AbstractFactory.Factories.SpanishManufacturer;
import FactoryMethod.HelloUniverseManufacturer;
import FactoryMethod.HelloWorldManufacturer;
import Prototype.HelloPrototype;
import Singleton.Singleton;
import builder.HelloBuilder;

/**
 *
 * @author Santiago
 */
public class HolaMundoPatronesCreacionales {

    public static void main(String[] args) throws CloneNotSupportedException {
        // Singleton ------------------------------------

        Singleton.getInstance().printHelloWorld();

        // Factory method -------------------------------
        /// Creamos la fábrica concretas
        HelloWorldManufacturer helloWorldManufacturer = new HelloWorldManufacturer();
        HelloUniverseManufacturer helloUniverseManufacturer = new HelloUniverseManufacturer();

        /// Creamos el saludo con las fábricas
        helloWorldManufacturer.printHello();
        helloUniverseManufacturer.printHello();

        // Abstract factory -----------------------------
        Person englishPerson = new EnglishManufacturer();
        Person spanishPerson = new SpanishManufacturer();

        englishPerson.sayHelloUniverse().print();
        englishPerson.sayHelloWorld().print();

        spanishPerson.sayHelloUniverse().print();
        spanishPerson.sayHelloWorld().print();

        // Builder --------------------------------------
        new HelloBuilder("Hola").place("mundo").pattern(" - Patrón builder").build();
        new HelloBuilder("Hola").place("universo").pattern(" - Patrón builder").build();

        // Prototype
        HelloPrototype helloWorld = new HelloPrototype("Hola", "mundo", "- Patrón prototype");
        HelloPrototype helloUniverse = helloWorld.clone();
        helloUniverse.setPlace("universo");
        HelloPrototype helloGalaxy = helloWorld.clone();
        helloGalaxy.setPlace("galaxia");

        helloWorld.printHello();
        helloUniverse.printHello();
        helloGalaxy.printHello();
    }
}
