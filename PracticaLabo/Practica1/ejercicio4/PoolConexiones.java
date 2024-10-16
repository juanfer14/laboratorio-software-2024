package ejercicio4;

public class PoolConexiones {
	private static PoolConexiones singleton;
	
	private PoolConexiones() {}
	
	public static PoolConexiones getSingleton() {
		if(singleton == null)
			singleton = new PoolConexiones();
		return singleton;
	}
}
