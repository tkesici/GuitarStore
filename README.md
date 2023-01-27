# Guitar Store
### CSE 351 Design Patterns School Project

![POWERPNT_8xDKEiKuPG](https://user-images.githubusercontent.com/72649005/215095026-fb537755-cfb7-4d84-9273-da0a17626800.png)

## Statement of Work

In this project, we are going to operate a guitar store that operates a little differently than others. We have noticed that only 2% of people who try our guitars actually end up buying them, so we decided to use artificial intelligence employees instead of wasting the time of our real employees. The solution we found required solving software design and development problems because we now need a software to manage our store.
First, we started with a simple guitar store, but when we wanted to expand our store, some problems occurred. Most people in Istanbul wanted different models of the same brands, while people in Izmir wanted something else. For example, in our Izmir store, we sell new, trending guitars. In the Istanbul store, unlike Izmir, we sell old-school guitars from the same manufacturer. An example from the ESP brand, in Istanbul, the meaning of ESP was the ESP Eclipse II, but in Izmir, it was the ESP Snakebyte.
One other problem is the modifications you want to make when you want to buy the guitar. Adding accessories that we would like to buy with the guitar led to a class explosion. Every add-on we added and every price update we wanted to make was violating the open-closed principle.
One more problem, We have only one AIEmployee per store, so our operations should proceed on only one instance of an AIEmployee. we wanted to make sure there was at most one instance of our AIEmployee class because we needed to ensure that there were no problems in transactions between clients or inconsistent results.
The last problem is that our AIEmployee, which communicates with customers, gives an error when we don’t have a requested guitar.

## Design Patterns
•	Factory Method: The factory method pattern was the key to solving this problem because it is useful when we need a complicated construction process for constructing the object, which in our case is a guitar. While Istanbul demands different models, Izmir also demands different models. One other benefit of using the factory method pattern is that when one of the stores orders a guitar, that store does not need to know how the guitar is made. The guitar factory handles these things, which is why we chose the factory method pattern.

We have a playGuitar() method, in which the customer passes the brand of the guitar as a parameter that he or she wants. Then, the chooseGuitar() method is called, which is defined in the abstract GuitarStore class and implemented in the IstanbulGuitarStore and IzmirGuitarStore classes. The selected guitar is then returned to the playGuitar() method, which has no idea what kind of guitar was created.

•	Decorator: The reason why we chose this is that the decorator pattern is useful when adding additional functionality to an existing object, which is a guitar. In other words, it is instantiated as a class at runtime and dynamically changes the functionality of our guitar object at runtime without impacting the other existing functionality. After adding this pattern, we can easily change the prices of the modifications. And we don't need to calculate every time; we can simply wrap our guitar with these modifications.

We have an abstract AccessoriesDecorator class that extends our Guitar class for type matching. We also have concrete accessories classes that extend the AccessoriesDecorator class. We add new accessories by composing a decorator with our guitar object using composition. This allows us to dynamically change our guitar object at runtime. Additionally, we have made our guitars extend the Component class, which is the Guitar class. This allows us to wrap our component (the guitar) with any number of decorators, providing flexibility in customization.

•	Singleton: We needed a design pattern that restricts a class from instantiating its multiple objects, so we chose the singleton pattern.

In our public AIEmployee class, we have a private constructor and a static getEmployee() method. To deal with multithreading, we used synchronization because we don't have any performance issues due to the small number of AIEmployee instances.

•	Null Object: If our store does not have requested guitar, we will handle this by our NullGuitar, it will reflect nothing and exit the system.

We created a NullGuitar object that is inherited from the Guitar object, and we have overridden the isNull() method to make it return true. In this way, if our factories are unable to create any guitar with the given types, our factory will return a NullGuitar object. We will then handle non-existing guitar types by using the isNull() method for our guitars.
