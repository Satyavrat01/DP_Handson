//Abstraction for hiding the complexity and high level class should only depend on abstraction.
//Redmi.java and Samsung.java implements this interface

package DependencyInversionPrinciple.interfaces;

public interface Iphone {
	String getPhonePart1();
	double getPart1Cost();
}
