package com.mycompany.holamundopatronescreacionales;

import AbstractFactory.Factories.EnglishManufacturer;
import AbstractFactory.Factories.Person;
import AbstractFactory.Factories.SpanishManufacturer;
import FactoryMethod.HelloUniverseManufacturer;
import FactoryMethod.HelloWorldManufacturer;
import Singleton.Singleton;

/**
 *
 * @author Santiago
 */
public class HolaMundoPatronesCreacionales {

    public static void main(String[] args) {
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

    }
}
