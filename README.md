# SpringAOPExamples
Spring version : 5.2.*

https://docs.spring.io/spring/docs/5.2.x/spring-framework-reference/core.html#aop
https://en.wikipedia.org/wiki/Aspect-oriented_programming
https://www.youtube.com/watch?v=cGcdSRS33Fk


Aspect-oriented programming is a programming paradigm that aims to increase modularity by allowing the separation of cross-cutting concerns.
It does so by adding additional behavior to existing code (an advice) without modifying the code itself.

The cross-cutting concern is a concern which is applicable throughout the application. This affects the entire application. For example, logging, security and data transfer are the concerns needed in almost every module of an application, thus they are the cross-cutting concerns.

Aspect: A modularization of a concern that cuts across multiple classes

A proxy is a well-used design pattern. To put it simply, a proxy is an object that looks like another object, but adds special functionality behind the scene.

Spring AOP is proxy-based. AOP proxy is an object created by the AOP framework in order to implement the aspect contracts in runtime.

Spring AOP defaults to using standard JDK dynamic proxies for AOP proxies. This enables any interface (or set of interfaces) to be proxied. Spring AOP can also use CGLIB proxies. This is necessary to proxy classes, rather than interfaces.

Joinpoint is a point of execution of the program, such as the execution of a method or the handling of an exception. 
In Spring AOP, a joinpoint always represents a method execution.
Pointcut is a predicate or expression that matches join points.
Advice is associated with a pointcut expression and runs at any join point matched by the pointcut.
Spring uses the AspectJ pointcut expression language by default.

Advice types:
1) Before
2) After
3) Around
4) After returning
5) After throwing

PointCuts:
1) Execution
2) within
3) target
4) this
5) annotations
6) args
