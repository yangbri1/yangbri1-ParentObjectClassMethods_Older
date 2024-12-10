/**
 * Your goal for this activity is to provide an overriden implementation of the 'equals' method and the 'toString'
 * method. Please note that these methods are automatically inherited by all classes in Java from the Object class.
 * 
 * The equals() method compares two objects and should return a boolean to determine if the objects are equivalent to
 * one another. This equivalency typically means that all respective instance variable values between two objects of the
 * same type are the same. For the SampleClass below two objects are "equal" if the fields 'a' and 'b' are the same in both
 * objects. The equals() method should take in a parameter that is another SampleClass object, and access its version 
 * of the fields 'a' and 'b'. Return true if the values of 'a' and 'b' are equal in both objects, and false otherwise.
 * 
 * The toString() method is used to return a descriptive representation of the object in memory. Typically this 
 * includes the name of the class, and the value of each field of that object. Please note the the test cases for this 
 * lab will check if the String returned by the toString method contains information about the fields of this object.
 * Essentially, you just need to append them to the String that is returned by toString. The string may be formatted 
 * in any way.
 *
 * The test cases for this class use methods called .equals which aren't written anywhere in this class. How?
 * All objects have a method called .equals and a method called toString - they are inherited from the Object class,
 * which is actually the parent class of all Java classes. Classes are able to 'extend' other classes, which will
 * transfer their behavior over from the parent class. All classes implicitly do this with the Object class.
 *
 * When a class inherits .equals or .toString from the Object class, it inherits a method that isn't very useful.
 * The .equals method is intended to be used to determine if two separate objects are equal to each other, and the
 * .toString method is intended to be used to produce an informative String representation of the object. The default
 * implementation of these methods inherited from the Object class do neither of these, because the exact implementation
 * of these methods is for the developer to design. The developer can override the .equals and .toString methods so
 * that the method written in this class are used instead of the default implementation! This overriding falls under
 * the OOP principle of polymorphism, specifically runtime polymorphism (since there are situations where the exact
 * class of an object isn't known until runtime).
 *
 * for instance, the following code:
 * public boolean equals(SampleClass other){
 *    //code here
 * }
 * Will override the default equals method when iem1.equals(iem2); is called. That equals method can be used to compare
 * 'this' object with another SampleClass named 'other'.
 *
 * whereas this code:
 * public String toString(){
 *   //code here
 * }
 * Will override the default toString() method. The String that is returned is the String representation of this object.
 *
 * Please keep the following in mind:
 * .equals addendum: Why can't we just compare objects with ==? == is referred to as a shallow comparison - it only
 * compares the 'address' of an object in memory. Two objects can have equivalent values of a,b, and c but == could
 * resolve to false because the equivalent object is located in a different place in memory. == will resolve to true
 * only if two variables represent literally the same object in memory.
 *
 * .toString addendum: What is the default behavior of toString? By default, toString just calls another Object class
 * method, named .hashcode, which generates a random value that can be used to identify this Object. Without a custom
 * toString that overrides the Parent class toString, toString would return something like SampleClass@4063272.
 *
 * You can read about all the methods inherited from the Object class, including .equals and .toString, in the
 * Oracle docs:
 * https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
 *
 * In the future (or if you get stuck), IDE's are generally capable of automatically generating boilerplate code
 * like toString, equals, constructors, getters, setters, if you can find the menu to do so.
 */
public class SampleClass {
    public int a;
    public boolean b;

    //    implement a custom .equals(SampleClass other){} method here.


    //    implement a custom .toString(){} method here.

    
}
