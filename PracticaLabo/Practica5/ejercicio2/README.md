2.- Implementar una clase que mapee un objeto Bean a un archivo del filesystem y almacene en el archivo:

1. El nombre de la clase.
2. Los nombres de los atributos y el contenido de los mismos.

Las anotaciones que entiende son las siguientes:

&emsp; ● @Archivo(name="nombre.extension") -- Indica que la información se almacenará en el archivo nombre.extension. Si no se explicita un nombre se utiliza el nombre de la clase.

&emsp; ● @AlmacenarAtributo -– Denota que el nombre del atributo que está a continuación de la anotación se debe almacenar en el archivo.

__Por ejemplo:__

Dada la siguiente clase:

```
@Archivo(nombre="AchivoMapeado.txt")
public class Mapeado {
	@AlmacenarAtributo
	private String valor = "Default1";
	@AlmacenarAtributo
	private Integer valor2=20;
	@AlmacenarAtributo
	private Float valor3=30.20f;
	private Float valor4=30.20f;
	//Metodos getters y setters
}
```

La salida en el archivo AchivoMapeado.txt sería:

```
<nombreClase>Mapeado</nombreClase>
<nombreAtributo>valor</nombreAtributo>
<nombreValor>Default1</nombrenombreValor>
<nombreAtributo>valor2</nombreAtributo>
<nombreValor>20</nombrenombreValor>
<nombreAtributo>valor3</nombreAtributo>
<nombreValor>30.2</nombrenombreValor>
```