package org.master.classes;

import org.master.classes.composition.Bed;
import org.master.classes.composition.Bedroom;
import org.master.classes.composition.Ceiling;
import org.master.classes.composition.Lamp;
import org.master.classes.inheritance.InheritanceColor.House;
import org.master.classes.inheritance.InheritanceCylinder.Circle;
import org.master.classes.inheritance.InheritanceCylinder.Cylinder;
import org.master.classes.inheritance.InheritancePoolArea.Cuboid;
import org.master.classes.inheritance.InheritancePoolArea.Rectangle;

public class MainCalculator {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
        calculator.setFirstNumber(-1);
        calculator.setSecondNumber(2);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());


        System.out.println("\n--------------Person Example-----------------------");

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

        System.out.println("\n--------------Account Example-----------------------");


        Account account1 = new Account("Mustaf", "mustafa@email.com", "123");
        System.out.println(account1.getCustomerEmailAddress());

        System.out.println("\n--------------Wall Example-----------------------");

         Wall wall = new Wall(5,4);
         System.out.println("area= " + wall.getArea());

         wall.setHeight(-1.5);
         System.out.println("width= " + wall.getWidth());
         System.out.println("height= " + wall.getHeight());
         System.out.println("area= " + wall.getArea());

        System.out.println("\n--------------Wall Example2-----------------------");
        Wall wall1 = new Wall(-1.25,-1.25);
        System.out.println("area= " + wall1.getArea());

        wall1.setHeight(-1.5);
        System.out.println("width= " + wall1.getWidth());
        System.out.println("height= " + wall1.getHeight());
        System.out.println("area= " + wall1.getArea());


        System.out.println("\n-----------------Distance Example-----------------------");

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second.getX(), second.getY()));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());


        System.out.println("\n-----------------Color House Example-----------------------");

        House greenHouse = new House("green");
        House anotherHouse = greenHouse;

        anotherHouse.setColor("blue");

        System.out.println(greenHouse.getColor());
        System.out.println(anotherHouse.getColor());

        System.out.println("\n-----------------Cylinder House Example-----------------------");
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("\n-----------------Cylinder House Example-----------------------");
        Rectangle rectangle = new Rectangle(-5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(-5,-10,-5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());



        System.out.println("\n-----------------Composition Example-----------------------");


        org.master.classes.composition.Wall wall5 = new org.master.classes.composition.Wall("West");
        org.master.classes.composition.Wall wall6 = new org.master.classes.composition.Wall("East");
        org.master.classes.composition.Wall wall7 = new org.master.classes.composition.Wall("South");
        org.master.classes.composition.Wall wall8 = new org.master.classes.composition.Wall("North");

        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Modern", 4,3,2,1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedroom = new Bedroom("Mustafa", wall5, wall6, wall7, wall8, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();














    }
}
