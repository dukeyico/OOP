# OOP
object-oriented-programming, or OOP, is a programming style that uses objects to design software, and these objects represent real world entities with attributes, data and behaviors.

Java is a popular OOP language because it makes it easier to organize, reuse, and maintainable code.

## Class

class in Java is a blueprint or a template for creating objects.
Analogy of a class that has attributes and methods as an example.

## Object

An object is an instance of a class with unique attribute values.
In Java, creating an object from a class involves using the new keyword followed by the class name and parentheses. This process is known as instantiation. Once you have an object, you can interact with it by accessing its attributes and calling its methods.

## Methods vs Functions

Methods and functions are technically not the same thing, but in object-oriented programming they are, because in object-oriented programming, a function cannot exist without a class, and a function that is within a class is, per definition, a method.
So what we have in Java are therefore methods.
But if you use the word function, it will still work.
It's still okay.
It's just that usually functions are just methods that are not part of a class.
But even if you look at our main method here, this main method is inside the main class.
So without the main class, the main method could not exist.
But if it were to exist and if it would work even without the main class, then main could be a function.
But if you're using Python for example, then you can use functions without classes.
So that's where you would have functions and not methods necessarily.
However, you could also have methods because that would be the functions that are inside of classes.
But again Java is a fully object-oriented programming language.
So it is always going to be called method.

## Constructor

constructors are similar to methods. 
They are also members of a class like our member.
Variables that we see here are our member methods and that they are part of a class okay.
But the constructor doesn't return anything but also does not use the void keyword.
So a constructor is a very special type of method, which is not really a method, but it looks like
a method and behaves like a method, only that it is called only once, and that is during the creation
of the object of the class in which the constructor is.