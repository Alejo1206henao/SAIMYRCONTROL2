# Guía para usar SAIMYR - Skeleton 2.1

Este proyecto (_Skeleton 2.1_) contiene la estructura necesaria para construir un backend en Java usando las características adoptadas por SAIMYR para construir soluciones de software. La arquitectura usada es una por capas orientada al dominio.

## Tabla de Contenido

* [Explicación de las capas](#capas)
    - [domain](#capa-domain)
    - [persistence](#capa-persistence)
    - [web](#capa-web)
* [Paso a paso para iniciar un proyecto con Skeleton 2.1](#como-usar)

<a name="capas"></a>
# Capas

<a name="capa-domain"></a>
## Capa _domain_
Esta capa es la encargada de servir como core del proyecto. En este se encontrará todo lo relacionado con el dominio. A continuación se detallan los paquetes:

**Paquete** | **Descripción**
 --- | ---
```co.com.saimyr.domain``` | Aquí van las clases del dominio del proyecto. Estas clases además de tener atributos pueden tener métodos de negocio y validaciones propias que se ejecutan al momento de instanciarla para verificar sí puede ser creada o debe retornar un error a la petición. 
```co.com.saimyr.domain.dto``` | Aquí van todos los DTO del proyecto. Recuerda que los DTO son objetos planos que únicamente tienen atributos y son estos los que exponen a la API para recibir y responder peticiones.
```co.com.saimyr.domain.exception``` | Aquí van las excepciones propias del dominio. Todas heredan de `BaseException`, y cualquier otra que sea creada debe ser incluida en los `STATES` de la clase `RestExceptionHandler` de la capa web (en el paquete `co.com.saimyr.web.exception`). Las excepciones que por defecto están en este paquete son: <ul><li>**DuplicateException**: Excepción utilizada cuando lo que se desea gestionar ya existe en la plataforma.</li><li>**InvalidValueException**: Excepción utilizada cuando un valor no es válido por alguna razón.</li><li>**MandatoryValueException**: Excepción utilizada cuando un atributo que es obligatorio no está presente en la petición.</li><li>**MaxLengthException**: Excepción utlizada cuando un atributo excede el tamaño máximo establecido para él.</li><li>**MinLengthException**: Excepción utilizada cuando un atributo es más pequeño que el tamaño mínimo establecido para él.</li><li>**NoDataException**: Excepción utilizada cuando no se encuentra información necesaria (en la BD u otra fuente) para procesar la petición.</li></ul>
```co.com.saimyr.domain.exception.validation``` | Aquí está la clase `DomainValidator` que contiene todas las validaciones que pueden ser usadas en esta capa para lanzar las excepciones vistas en el paquete anterior. Se pueden adicionar nuevas validaciones que creas pertinentes y evaluar con el equipo sí deben ser parte de Skeleton.
```co.com.saimyr.domain.repository``` | Aquí van las interfaces que sirven como definición para los repositorios que luego serán implementados en la capa persistence.
```co.com.saimyr.domain.service``` | Aquí van las interfaces que sirven como definición para los repositorios que luego serán implementados en la capa persistence.

<a name="capa-persistence"></a>
## Capa _persistence_
Esta capa es la encargada de gestionar todo lo relacionado a la base de datos. A continuación se detallan los paquetes:

**Paquete** | **Descripción**
 --- | ---
```co.com.saimyr.persistence``` | Aquí van las clases que implementan las interfaces que están en `co.com.saimyr.domain.repository`. Internamente las clases que vayan aquí inyectaran dos interfaces: una que extienda de CrudRepository y otra que sea el Mapper. 
```co.com.saimyr.persistence.crud``` | Aquí van las interfaces que heredan de `CrudRepository` ó de `JPARepository` para la interacción mediante _Native Queries_ o _Query Methods_ con la base de datos.
```co.com.saimyr.persistence.entity``` | Aquí van los entities que representan las tablas de la base de datos dentro del proyecto.
```co.com.saimyr.persistence.mapper``` | Aquí van las interfaces que realizar las operaciones de mapeo Domain, DTO -> Entity y viceversa usando MapStruct. 

<a name="capa-web"></a>
## Capa _web_
Esta capa tiene como responsabilidad exponer el API del proyecto; además, toda la configuración y seguridad de la misma. A continuación se detallan los paquetes:

**Paquete** | **Descripción**
--- | ---
```co.com.saimyr.web``` | En este paquete la única clase que va es `Application`, que es la clase que inicializa la aplicación autocontenida de Spring.
```co.com.saimyr.web.config``` | Aquí van todas las clases que lleven configuración dentro del proyecto. Inicialmente, la única clase que existe aquí es `SwaggerConfig`. 
```co.com.saimyr.web.controller``` | En este paquete van todos los controladores Rest que vaya a tener el proyecto.
```co.com.saimyr.web.exception``` | En este paquete está la clase `RestExceptionHandler` que es la encargada de gestionar y todas las excepciones que se lanzan en el proyecto, aquí deben ser añadidas las nuevas excepciones que se creen en `co.com.saimyr.domain.exception`. También está la clase `Error` que es un DTO para responder cuando ocurre una excepción en el proyecto. 
```co.com.saimyr.web.security``` | En este paquete está todo lo relacionado con la seguridad del API. Internamente contiene la clase `CorsConfig` que gestiona los permisos CORS, la clase `JWTUtil` que tiene el cliente que consume el API de verificación de JWT de SAIMYR y la clase `SecurityConfig` que es donde se controla que peticiones requieren o no autenticación y autorización.
```co.com.saimyr.web.security.filter``` | En este paquete se encuentra la clase `JWTFilter`, allí es donde se encuentra el filtro que se llama desde el `SecurityConfig` y se encarga de verificar que tenga permisos para procesar la solicitud mediante el uso de la clase `JWTUtil`.

<a name="como-usar"></a>
# Paso a paso para iniciar un proyecto con Skeleton 2.1

1. Descargar Skeleton como .zip y extraer su contenido localmente dónde lo necesites (únicamente el contenido, sin la carpeta contenedora _skeleton-springboot-master_). 
   
> 💡 _**Protip**: En tu equipo, crea una carpeta con el nombre del proyecto y dentro de ella dos carpetas más: Backend (aquí iría la estructura de Skeleton) y Frontend._

2. Abrir el `build.gradle` del proyecto desde IntelliJ. Para esto simplemente se debe seleccionar el archivo desde IntelliJ y elegir _"Open as Project"_.

3. Ir a `gradle.properties` y cambiar el nombre del proyecto en la variable `appName`; este nombre es usado al momento de generar el jar junto con la versión que se configura en este mismo archivo. Para aplicar los cambios se debe dar click en el botón de gradle que aparece a la derecha y dice _"Load Gradle Changes"_.

4. Ir a `settings.gradle` y cambiar el nombre del proyecto en la variable `rootProject.name`. Este nombre será usado por IntelliJ para registrar el nombre dentro de los proyectos del IDE.

5. Cambiar el nombre del pool conexiones de HikariCP (`spring.datasource.hikari.poolName`) en el `application.properties` que está en los _resources_ de la capa web.

6. Cambiar el nombre del archivo log (`logging.file.name`) en `application-prod.properties` que está en los _resources_ de la capa web.

7. Eliminar o editar este `readme.md` para que no quede en el repositorio cuando se cargue a Git.

8. ¡Empieza a desarrollar! 🚀

> 💡 _**Protip 2**: Cada que crees un componente o archivo dentro de una carpeta que contenga un **.gitkeep** elimínalo para que no quede innecesariamente allí._

***
Cualquier inquietud, solicitud ó aporte que quieras realizar a Skeleton contactar a Alejandro Ramírez en <alejandro@saimyr.com.co>.
