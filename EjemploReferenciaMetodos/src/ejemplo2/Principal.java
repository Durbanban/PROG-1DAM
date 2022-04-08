package ejemplo2;

import java.util.function.BiFunction;


// Se deja la explicación al final del main

public class Principal {

	
    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }
    
    public static String appendStrings(String a, String b) {
        return a + b;
    }
    
    public String appendStrings2(String a, String b) {
        return a + b;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodReferencesExamples myApp = new MethodReferencesExamples();
		
		// Calling the method mergeThings with a lambda expression
        System.out.println(MethodReferencesExamples.mergeThings("Hello ", "World!", (a, b) -> a + b));
        
        // Reference to a static method
        System.out.println(MethodReferencesExamples.mergeThings("Hello ", "World!", MethodReferencesExamples::appendStrings));

        // Reference to an instance method of a particular object        
        System.out.println(MethodReferencesExamples.
            mergeThings("Hello ", "World!", myApp::appendStrings2));
        
        // Reference to an instance method of an arbitrary object of a
        // particular type
        System.out.println(MethodReferencesExamples.mergeThings("Hello ", "World!", String::concat));
        
        /*

1. Reference to a Static Methodos

The method references Person::compareByAge and MethodReferencesExamples::appendStrings are references to a static method.

2. Reference to an Instance Method of a Particular Object

The following is an example of a reference to an instance method of a particular object:

class ComparisonProvider {
    public int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
        
    public int compareByAge(Person a, Person b) {
        return a.getBirthday().compareTo(b.getBirthday());
    }
}
ComparisonProvider myComparisonProvider = new ComparisonProvider();
Arrays.sort(rosterAsArray, myComparisonProvider::compareByName);

The method reference myComparisonProvider::compareByName invokes the method compareByName that 
is part of the object myComparisonProvider. 
The JRE infers the method type arguments, which in this case are (Person, Person).

Similarly, the method reference myApp::appendStrings2 invokes the method appendStrings2 that 
is part of the object myApp. The JRE infers the method type arguments, which in this case are (String, String).

3. Reference to an Instance Method of an Arbitrary Object of a Particular Type

The following is an example of a reference to an instance method of an arbitrary object of a particular type:

String[] stringArray = { "Barbara", "James", "Mary", "John",
    "Patricia", "Robert", "Michael", "Linda" };
    
Arrays.sort(stringArray, String::compareToIgnoreCase);

The equivalent lambda expression for the method reference 
String::compareToIgnoreCase would have the formal parameter list (String a, String b), 
where a and b are arbitrary names used to better describe this example. 
The method reference would invoke the method a.compareToIgnoreCase(b).

Similarly, the method reference String::concat would invoke the method a.concat(b).

4. Reference to a Constructor

You can reference a constructor in the same way as a static method by using the name new. 
The following method copies elements from one collection to another:

public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
    DEST transferElements(
        SOURCE sourceCollection,
        Supplier<DEST> collectionFactory) {
        
    DEST result = collectionFactory.get();
    for (T t : sourceCollection) {
        result.add(t);
    }
    return result;
}
The functional interface Supplier contains one method get that takes no arguments and returns an object. 
Consequently, you can invoke the method transferElements with a lambda expression as follows:

Set<Person> rosterSetLambda =
    transferElements(roster, () -> { return new HashSet<>(); });
    
You can use a constructor reference in place of the lambda expression as follows:

Set<Person> rosterSet = transferElements(roster, HashSet::new);

The Java compiler infers that you want to create a HashSet collection that contains elements of type Person. 
Alternatively, you can specify this as follows:

Set<Person> rosterSet = transferElements(roster, HashSet<Person>::new);
         * */
	}

}
