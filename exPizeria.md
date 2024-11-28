## DU2 - Exercise 12 - Pizzeria - wait() and notify()

We want to simulate a home-delivery pizzeria, where we have two kinds of processes: cooks and deliverers.

Each cook prepares pizzas as orders come in. Once a pizza is ready, the cook places it on a tray for delivery when it is possible.

Each delivery person waits for a pizza to be on the tray, removes it and takes it to the corresponding customer. The deliverer then returns to the pizzeria and waits for a new pizza on the tray.

Additionally, each tray has a limited capacity, no more than 5 pizzas can be stored on the tray.

Each pizza must have a different identifier (starting with with 1) and a prize between 10 and 50€.

Use a linked list to model the tray. Each pizza must be delivered in the order in which it was cooked.

Stop the simulation when 100 pizzas have been cooked and delivered.

Suppose the cook takes between 500 and 1000ms to cook the pizza.

Suppose the delivery person takes between 1000 and 2000ms to deliver the pizza.

Show a message when the cook has placed a pizza on the tray.

Show a message when the delivery person has removed a pizza from the tray.

The solution must avoid deadlocks between the different threads.

--

## DU2 - Ejercicio 12 - Pizzería - wait() y notify()

Queremos simular una pizzería de reparto a domicilio, donde tenemos dos tipos de procesos: cocineros y repartidores.

Cada cocinero prepara las pizzas a medida que van llegando los pedidos. 
Una vez que la pizza está lista, el cocinero la coloca en una bandeja para entregarla cuando sea posible.

Cada repartidor espera a que haya una pizza en la bandeja, la retira y la lleva al cliente correspondiente. 
A continuación, el repartidor vuelve a la pizzería y espera a que haya una nueva pizza en la bandeja.

Además, cada bandeja tiene una capacidad limitada, no se pueden almacenar más de 5 pizzas en la bandeja.

Cada pizza debe tener un identificador diferente (empezando por 1) y un premio entre 10 y 50 euros.

Utilice una lista enlazada para modelar la bandeja. Cada pizza debe entregarse en el orden en que fue cocinada.

Detenga la simulación cuando se hayan cocinado y entregado 100 pizzas.

Suponga que el cocinero tarda entre 500 y 1000ms en cocinar la pizza.

Supongamos que el repartidor tarda entre 1000 y 2000ms en entregar la pizza.

Muestra un mensaje cuando el cocinero haya colocado una pizza en la bandeja.

Mostrar un mensaje cuando el repartidor haya retirado una pizza de la bandeja.

La solución debe evitar bloqueos entre los diferentes hilos.

Traducción realizada con la versión gratuita del traductor DeepL.com