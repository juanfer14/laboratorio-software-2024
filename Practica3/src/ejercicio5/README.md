5.- Modifique el código de la clase Stack, para que ahora la clase anidada StackIterator, se convierta en una clase anónima.

```
public Iterator<E> getIterator() {
	return new Iterator<E>() {
		private int i = items.size()-1;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i > -1;
		}
		@Override
		public E next() {
			// TODO Auto-generated method stub
			if(i > -1) { 
				return items.get(i--);
			}
			return null;
		}
	};
}
```

a) ¿En que situación es conveniente definir a una clase cómo anónima?

__Cuando tengo que definir clases como objeto-funcion, donde la utilidad de la clase es solamente en el momento en el que la necesito o cumple un proposito de funcionamiento.__

__Tambien, cuando se debe redefinir el comportamiento de una clase, sin la necesidad de crear una subclase de la misma.__

b) Si tendría que inicializar valores de la clase anónima (cuando se crea una instancia de la misma), ¿cómo lo haría?

__De la siguiente forma:__

```
public Iterator<E> getIterator() {
	return new Iterator<E>() {
		private int i;
		
		{
			i = items.size()-1;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i > -1;
		}
		@Override
		public E next() {
			// TODO Auto-generated method stub
			if(i > -1) { 
				return items.get(i--);
			}
			return null;
		}
	};
}
```

__Como no es posible utilizar constructores (porque la clase no tiene nombre), se utiliza un bloque de inicializacion, que funciona de forma similar a un constructor.__

