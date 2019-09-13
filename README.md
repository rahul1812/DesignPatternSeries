# DesignPatternSeries

In software engineering, a design pattern is a general repeatable solution to a commonly occurring problem in software design. A design pattern isn't a finished design that can be transformed directly into code. It is a description or template for how to solve a problem that can be used in many different situations

<h3>Design Pattern Featured </h3> <br/>
<ul>
     <li> Design patterns can speed up the development process by providing tested, proven development </li> 
     <li> Reusing design patterns helps to prevent subtle issues that can cause major problems and improves code
          readability for coders and architects familiar with the patterns.</li>
     <li> Provide Good architecture for your software
</ul>

  Design pattern Divided into three <br/>
 
 a] Creational<br/>
 b] Structural<br/>
 c] Behavioral<br/>

 <h3>Creational</h3><br/>
    These design patterns are all about class instantiation or object creation. Class-creational patterns and object-creational   
    patterns.
    Creational design patterns are the Factory Method, Abstract Factory, Builder, Singleton, Object Pool, and Prototype.
     example :- Use Case Of Creational Design Pattern <br/>
             Suppose you want to create multiple instances of similar kind and want to achieve loose coupling then you can go for     
             Factory pattern.<br/>
             In project user want DB-connection it will use singleton pattern. <br/> <br/>
  
             
   <h3>Structural</h3> <br/>
       These design patterns are about organizing different classes and objects to form larger structures and provide new functionality.
       Structural design patterns are Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Private Class Data, and Proxy. 
       <br/> 
  example :-  Use Case Of Structural Design Pattern <br/>
              When 2 interfaces are not compatible with each other and want to make establish a relationship between them through an                   adapter its called adapter design pattern. Adapter pattern converts the interface of a class into another interface or 
              classes the client expects that is adapter lets classes works together that could not otherwise because of 
              incompatibility. so in these type of incompatible scenarios, we can go for the adapter pattern. 
              <br/> 
              <br/>
<h3> Behavioral</h3> <br/>
     Behavioral patterns are about identifying common communication patterns between objects and realize these patterns.
     Behavioral patterns are Chain of responsibility, Command, Interpreter, Iterator, Mediator, Memento, Null Object, Observer, 
     State, Strategy, Template method, Visitor. <br/>
    
  example :-  Use Case Of Structural Design Pattern <br/>
  
Template pattern defines the skeleton of an algorithm in an operation deferring some steps to sub-classes, Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm structure. say for an example in your project you want the behavior of the module can be extended, such that we can make the module behave in new and different ways as the requirements of the application change, or to meet the needs of new applications. However, No one is allowed to make source code changes to it. it means you can add but can’t modify the structure in those scenarios a developer can approach template design pattern.
<br/> <br/>
                
<hr>         
  
