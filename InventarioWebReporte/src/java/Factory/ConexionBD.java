package Factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class ConexionBD {
  protected String[] parametros; //Array que recibe los parametros de conexión
  protected Connection conexion;
  //El siguiente método abstracto no se implementa solamente se declara , se 
  //implementa en la subclase
  abstract Connection open(); // Método abstracto que devulve un objeto connection


//Crear método para las consultas
public ResultSet consultaSQL(String consulta){
Statement st; //Objeto Statement en el encargado de ejecutar las consultas
ResultSet rs = null; //Tabla temporal donde se almacenan los datos
try{
  st = conexion.createStatement();
  rs = st.executeQuery(consulta); // Se ejecuta la consulta
}catch(SQLException ex){
      ex.printStackTrace();
}
return rs;
}

//Crear método para ejecutar
public boolean ejecutarSQL(String consulta){
Statement st; //Objeto Statement en el encargado de ejecutar las consultas
boolean guardar = true;
try{
    st = conexion.createStatement();
    st.executeUpdate(consulta); //Se ejecuta la consulta
}catch(SQLException ex){
guardar = false;
 ex.printStackTrace();
}
return guardar;
}

//Método para cerrar la conexión
public boolean cerrarConexion(){
boolean ok = true;
try{
    conexion.close();
}catch(Exception ex){
ok = false;
ex.printStackTrace();
}
return ok;
}
}
