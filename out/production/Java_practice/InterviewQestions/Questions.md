#Interview Most Important 


##Inheritance

> Which class in Java is superclass of every other class?
>
>>Ans: In Java, Object class is the superclass of every other class.

>Are constructor and instance initialization block inherited to subclass?
>
>>Ans: No, constructor and instance initialization block of the superclass cannot be inherited to its subclass but they are executed while creating an object of the subclass.

>How will you restrict a member of a class from inheriting its subclass?
>
>>Ans: We can restrict members of a class by declaring them private because the private members of superclass are not available to the subclass directly. They are only available in their own class.

>Can we override a static method?
>>No, we cannot override static methods because method overriding is based on dynamic binding at runtime and the static methods are bonded using static binding at compile time. So, we cannot override static methods.

## Polymorphism 


>What is  binding?
>> Connecting a method call to the method body is known as binding.

>Can we achieve polymorphism through data member?
>> No, Polymorphism is always achieved via behavior of an object only properties of an object do not play any role in case of polymorphism.

>Can you achieve Runtime Polymorphism by data members?
>>No, because method overriding is used to achieve runtime polymorphism and data members cannot be overridden. We can override the member functions but not the data members.

## Abstraction

>Can concrete class have abstract methods?
>>Concrete class can not have abstract methods.

>Can we use “abstract” keyword with constructor, Instance Initialization Block and Static Initialization Block?
>
>> No. Constructor, Static Initialization Block, Instance Initialization Block and variables can not be abstract.


## Strings

>What is string constant pool?
>
>>String objects are most used data objects in Java. Hence, Java has a special arrangement to store the string objects. String Constant Pool is one such arrangement. String Constant Pool is the memory space in the heap memory specially allocated to store the string objects created using string literals. In String Constant Pool, there will be no two string objects having the same content.
>
>>Whenever you create a string object using string literal, JVM first checks the content of the object to be created. If there exist an object in the string constant pool with the same content, then it returns the reference of that object. It doesn’t create a new object. If the content is different from the existing objects then only it creates new object.

> How many objects will be created in the following code and where they will be stored in the memory?
>
>>String s1 = "abc";
>
>>String s2 = "abc";   
> 
>> Only one object will be created and this object will be stored in the string constant pool.


>How many objects will be created in the following code and where they will be stored?
>
>>String s1 = new String("abc");
>
>>String s2 = "abc";
>
>>Here, two string objects will be created. Object created using new operator(s1) will be stored in the heap memory. The object created using string literal(s2) is stored in the string constant pool.

>Where exactly string constant pool is located in the memory?
>
>>Inside the heap memory. JVM reserves some part of the heap memory to store string objects created using string literals.

>What is string intern?
>
>> String object in the string constant pool is called as String Intern. You can create an exact copy of heap memory string object in string constant pool. This process of creating an exact copy of heap memory string object in the string constant pool is called interning. intern() method is used for interning.

>What is the use of interning the string?
>>To Save The memory Space :
>
>>>Using interned string, you can save the memory space. If you are using lots of string objects with same content in your code, than it is better to create an intern of that string in the pool. Use that intern string whenever you need it instead of creating a new object in the heap. It saves the memory space.
>
>>For Faster Comparison :
>
>>>Assume that there are two string objects s1 and s2 in heap memory and you need to perform comparison of these two objects more often in your code. Then using s1.intern() == s2.intern() will be more fast then s1.equals(s2). Because, equals() method performs character by character comparison where as “==” operator just compares references of objects.

>What is the difference between "ABC".equals(str) and str?equals("ABC"), where an str is a String object? 
>>Though both look similar and return the same result if str is equal to "ABC" but the real difference comes when the given String is null i.e. str = null. In that case, the first code snippet will return false, while the second code snippet will throw NullPointerException.

>When you execute String str = new String("abcd")? how many String objects are created? 
>>This is another tricky Java interview question as many Java developers will answer just one but that's not true. There are two String objects are created here, the first String object is created by String literal "abcd" and the second one is created by new String().


>Why char array is better than String for storing sensitive information? 
>> This is one of the trick questions from Java interviews. The reason is that because String is immutable they are cached in memory and there is a good chance that they will remain in memory for a longer duration posing a possible threat, while character array gives you the option to erase data once they are used. This is the primary reason but there are some more subtle reasons which you can found in the detailed answer linked to the question. 

## Exception Handling

>Can we keep other statements in between try, catch and finally blocks?
>
>>No. We shouldn’t write any other statements in between try, catch and finally blocks.

>finalize()
>>finalize() method is a protected method of java.lang.Object class. It is inherited to every class you create in java. This method is called by garbage collector thread before an object is removed from the memory. finalize() method is used to perform some clean up operations on an object before it is removed from the memory.

>Will it be possible to keep the statements after the ‘finally’ block if the control is returning from the finally block itself?
>
>> This will result in an unreachable catch block error. This is because the control will be returning from the ‘finally’ block itself. The compiler will fail to execute the code after the line with the exception. That is why the execution will show an unreachable code error. 