# Automation Practice

Reto de automatizacion correspondiente a la pagina [http://automationpractice.com/index.php](http://automationpractice.com/index.php), la cual escribira en el buscador el articulo que desees comprar y escogera el articulo de menor precio para agregarlo en el carrito de compras 

La estructura completa del proyecto es la siguiente:

+ model

Clases que usan el patrón object builder o relcionadas con el modelo de dominio

+ tasks

Clases que representan tareas que realiza el actor a nivel de proceso de negocio

+ interacion

Clases que representan las interacciones directas con la interfaz de usuario

+ user_interface

Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario

+ questions

Objectos usados para consultar acerca del estado de la aplicación

+ util

Una capa opcional que será creada a criterio de cada equipo en caso de que hayan utilidades que consideren se puedan reusar.Manejo de excel, XML, string

````
# Requerimientos

  

Para correr el proyecto se necesita Java JDK 1.8.0_191 y Gradle preferiblemente con la versión 5.2
