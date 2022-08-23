/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public class BD_Con {
    private static final String DRIVER= "com.mysql.jdbc.Driver";
    private static final String DRIVE= "jdbc:sqlite:C:/Users/LENOVO/Desktop/Clases ITLA/3er Cuatrimestre/Programación I/Proyecto Final/BDFinal/proyecto.sdb";
	private static final String URL= "jdbc:mysql://localhost:3306/bd-conn";
	private static final String USER= "root";
	private static final String PASSWRD= "root";
	Connection con= null;
        
        
        static {
		try {
			Class.forName("org.sqlite.JDBC");
			
		}catch(ClassNotFoundException e){
			System.out.println("Error con el controlador");
		}
	}
        
        public Connection conectar() {
		//Connection con= null;
		try {
				con= DriverManager.getConnection(DRIVE);
				System.out.println("Conexion establecida");
		}catch(SQLException e){
			System.out.println("Error con la conexion");
			System.out.println(e);
		}
	return con;
	}
        
        
        public void ingresar(String sqlQuery){
            try{
                Statement stat= con.createStatement();
                stat.executeUpdate(sqlQuery);
                //return 1;
            } catch(SQLException e){
                System.out.println(e);
                //return 0;
            }
        }
        /*public void ingresar(String sqlQuery){
            try{
            Statement stat= con.createStatement();
            ResultSet result= stat.executeQuery(sqlQuery);
            
            } catch(SQLException e){
                System.out.println(e);
                
            }
        }*/
        
        public ResultSet select(String sqlQuery){
            try{
                PreparedStatement stat= con.prepareStatement(sqlQuery);
                ResultSet result= stat.executeQuery();
                return result;
            } catch(SQLException e){
                System.out.println(e);
                return null;
            }
        }
}
