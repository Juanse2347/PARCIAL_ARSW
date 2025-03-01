## Parcial Práctico - Desarrollo de un Servicio REST con Spring Boot ##


## Instrucciones Generales: ## 

- Debes desarrollar un servicio REST API utilizando Spring Boot en Java.
- Implementa inyección de dependencias utilizando @Service y @Autowired.
- Utiliza los verbos HTTP GET y POST de manera adecuada.
- Se evaluará la organización del código, el uso correcto de anotaciones y buenas
  prácticas.
- El código debe estar bien estructurado y contener comentarios explicativos cuando
  sea necesario.
- Entrega tu código en un repositorio de GitHub con instrucciones en el archivo
  README.md sobre cómo ejecutar la aplicación.


## EJECUCION ##

Clonamos el repositorio

```bash
git clone https://github.com/Juanse2347/PARCIAL_ARSW
cd PARCIAL_ARSW
```

Para ejecutar el proyecto 

```bash
mvn clean install
```


## PROBANDO ENDPOINTS CON POSTMAN ##

Registrar un nuevo producto mediante un endpoint POST /productos.

```bash
curl -X POST http://localhost:8080/productos -H "Content-Type: application/json" -d
'{"nombre": "Laptop", "precio": 1200.50}'
```


![Image](https://github.com/user-attachments/assets/7eeac1b7-a2ef-4b47-aae9-534359983625)



Obtener la lista de productos mediante un endpoint GET /productos


```bash
curl -X GET http://localhost:8080/productos
```

![Image](https://github.com/user-attachments/assets/cece5502-df9a-4622-a7a2-555f706a65ff)



Obtener un producto por su ID mediante un endpoint GET /productos/{id}.


```bash
curl -X GET http://localhost:8080/productos/1
```


![Image](https://github.com/user-attachments/assets/b203c5e8-17bd-4417-8874-cd55b1c2a7ec)


