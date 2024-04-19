# Descripción
- Proyecto para la carnicería esperanza, aplicación web de ventas, transacciones.
# Problema
- La carnicería esperanza requiere de un sistema de ventas y transacciones, que le permite guardar la información en una base de datos y generar el ticket de la venta.
# Solución
- Implementar una aplicación web, que cumpla con los requisitos establecidos por la empresa.
# Arquitectura
- Implementación de java spring boot Maven, MVC, MySQL.
# Requerimientos
- Java 17 o posteriores.
- MySQL 8 o posteriores.
- Maven 3.9.6 o posteriores
# Instalación
- mvnw package en cmd en el path del proyecto
# Configuración
- Asegurarse de tener instalado java, mysql, maven y tener las variables de entorno listas
- https://mkyong.com/maven/how-to-install-maven-in-windows/
- https://mkyong.com/java/how-to-set-java_home-on-windows-10/
- en application.properties configurar la base de datos MySQL
- spring.datasource.url=jdbc:mysql://localhost:{puerto}/(Nombre de la base de datos) ?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
- spring.datasource.username=nombre de usuario de la base de datos
- spring.datasource.password=contrsaeña del usuario de la base de datos
# Uso
- Inicio de sesión exitoso, añadir productos a una transacción, editar productos (si admin), cancelar transacción, ver historial de transacciones.
# Contribución
- Pull requests.
# Roadmap
- Implementación correcta de servicios, transacciones y ventas.
- Funcionalidades como, editar producto, cancelar transacción, historial de transacciones.
