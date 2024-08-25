package ejercicio1;

public class TestVacuna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vacuna[] vacunas = new Vacuna[5];
		Vacuna v1 = new Vacuna();
		v1.setMarca("pfizer");
		v1.setOrigen("eeuu");
		v1.setEnfermedad("covid");
		v1.setDosis(4);
		vacunas[0] = v1;
		
		Vacuna v2 = new Vacuna();
		v2.setMarca("sputnik");
		v2.setOrigen("rusia");
		v2.setEnfermedad("covid");
		v2.setDosis(2);
		vacunas[1] = v2;
		
		Vacuna v3 = new Vacuna();
		v3.setMarca("moderna");
		v3.setOrigen("switzerland");
		v3.setEnfermedad("covid");
		v3.setDosis(3);
		vacunas[2] = v3;
		
		Vacuna v4 = new Vacuna();
		v4.setMarca("spikevax");
		v4.setOrigen("switzerland");
		v4.setEnfermedad("covid");
		v4.setDosis(3);
		vacunas[3] = v4;
		
		Vacuna v5 = new Vacuna();
		v5.setMarca("sinopharm");
		v5.setOrigen("china");
		v5.setEnfermedad("covid");
		v5.setDosis(2);
		vacunas[4] = v5;
		
		for(Vacuna v: vacunas)
			System.out.println(v.toString());
		
		Vacuna v6 = new Vacuna();
		v5.setMarca("sinopharm");
		v5.setOrigen("china");
		v5.setEnfermedad("covid");
		v5.setDosis(2);
		
		System.out.println(v5.equals(v6));
		
	}

}
