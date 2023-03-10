package co.edu.unbosque.controller;

<<<<<<< Updated upstream
=======
import co.edu.unbosque.model.PokemonesDAO;
>>>>>>> Stashed changes
import co.edu.unbosque.servidor.Servidor;

public class Controller {
	
	public Controller() {
<<<<<<< Updated upstream
=======
		PokemonesDAO pd = new PokemonesDAO();
		pd.agregarPokemonesDAO();
>>>>>>> Stashed changes
		Servidor server = new Servidor(5000);
		server.start();
		
	}

}
