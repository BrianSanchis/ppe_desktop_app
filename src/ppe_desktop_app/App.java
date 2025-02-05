package ppe_desktop_app;

import java.sql.Connection;
import java.sql.SQLException;

import controllers.ConnectionController;
import controllers.InscriptionController;
import utils.DBSingleton;
import views.ConnectionFenetre;
import views.InscriptionFenetre;

public class App {

	public static void testConnexion() throws SQLException {
		DBSingleton dbSingleton = DBSingleton.getInstance();
		Connection connection = dbSingleton.getConnection();
		if (connection !=null) {
			System.out.println("Connexion ok ! ");
		}
		else {
			System.out.println("Connexion ne marche pas :'( ");
		}
	}
	
	public void bootstrap() throws SQLException {
		new ConnectionController(new ConnectionFenetre());
	}
	
	public static void main(String[] args) throws SQLException {
		//App app = new App();
		//app.bootstrap();
		new ConnectionController(new ConnectionFenetre());
	}
}
