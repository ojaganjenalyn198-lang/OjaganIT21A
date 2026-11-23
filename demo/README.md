1. How Polymorphism Works in My Code
Polymorphism works in my code by allowing different classes to have their own behaviors using the same method.
- Parent Class: Animal – contains the makeSound() method.
- Child Classes: Dog and Cat – both extend the Animal class.
- Overridden Method: makeSound() – each child class provides a different implementation of this method.
In my code, I used parent-class references to create objects of Dog and Cat. When I call makeSound(), each object produces a different sound. The dog says "Woof Woof!" while the cat says "Meow Meow!"
This demonstrates polymorphism because one method can have different behaviors depending on the object.

2. How Abstraction Works in My Code
Abstraction works in my code by hiding unnecessary details and showing only the important features of the program.
- Abstract Class: Payment – serves as the parent class for different payment methods.
- Abstract Method: processPayment() – a method without an implementation in the abstract class.
- Child Classes: Cash and GCash – both extend the Payment class.
- Implementation: Each child class provides its own implementation of processPayment(). The Cash class displays "Payment made using Cash," while the GCash class displays "Payment made using GCash."
- Concrete Method: paymentMessage() – a regular method that displays "Processing payment..." and can be inherited by both child classes.
This demonstrates abstraction because the program focuses on what the payment methods do without requiring the user to know all the implementation details.

3. Difference Between Polymorphism and Abstraction
Polymorphism allows different classes to perform the same method in different ways, while abstraction hides unnecessary details and focuses on the important functions of a program.In simple words, polymorphism is about having many forms or behaviors, while abstraction is about hiding details and showing only what is necessary.
Both are important in programming because they make code more organized, flexible, reusable, and easier to maintain.

## Answer the following questions:

1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?
Method overriding is important in polymorphism because it allows child classes to have their own behavior while using the same method from the parent class.
If a child class does not override the parent's method, it will simply inherit and use the parent's original method instead of having its own behavior.

2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?
We cannot create an object directly from an abstract class because it is incomplete and may contain abstract methods without implementation.
The purpose of this restriction is to make sure that child classes provide their own implementation of the required methods.

3. If you need to add another child class to your polymorphism program, how would your existing code handle it?
I can simply create another child class that extends the Animal class and overrides the makeSound() method.
The existing code can handle it because polymorphism allows different child classes to use the same method with different behaviors.

4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.
the  polymorphism and abstraction can work together in a single program.
Abstraction hides unnecessary details using an abstract class, while polymorphism allows different child classes to provide their own behavior for the same method.
 In a payment system, we can create an abstract class called Payment with an abstract method processPayment(). Then, we can create child classes such as Cash, GCash, and CreditCard.
Each child class can implement the processPayment() method differently. We can use a parent-class reference to call the method of different child objects.
This demonstrates both abstraction and polymorphism in one program.

5. As a future programmer, when would you use polymorphism, and when would you use abstraction?
As a future programmer, I would use polymorphism when I want different classes to perform the same method in different ways. It helps make my program more flexible, reusable, and easier to manage.
I would use abstraction when I want to hide unnecessary implementation details and show only the important features of a program. It helps make my code simpler, organized, and easier to understand.
Both are useful because they help me create programs that are more efficient, flexible, and easier to maintain.