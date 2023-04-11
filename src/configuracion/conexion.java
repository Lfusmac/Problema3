/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pipe_
 */
public class conexion {

    String bd = "mydb";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";

    Connection cx;
    PreparedStatement ps;

    public conexion() {
    }

    public Connection conectar() {
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url + bd, user, password);
            System.out.println("Conectado a la BD" + bd);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se conectado a la BD" + bd);
        }
        return cx;
    }

    public void desconectar() {
        try {
            cx.close();

        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        conexion conn = new conexion();
        conn.conectar();
    }

    public int Reusuario(String nombres, String apellidos, String correo, String usuario, String contrasena) {
        int res = 0;
        try {
            ps = cx.prepareStatement("insert into usuario(nombres,apellidos,correo,usuario,contrasena)values(?,?,?,?,?) ");
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, correo);
            ps.setString(4, usuario);
            ps.setString(5, contrasena);
            res = ps.executeUpdate();
            System.out.println("Usuario registrado correctamente");
        } catch (Exception e) {
            System.out.println("Error al registrar");

        }
        return res;
    }

    public int ejecutarSenciaSql(String sentSQL) {
        try {
            PreparedStatement preSt = cx.prepareStatement(sentSQL);
            preSt.execute();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public ResultSet consultarReg(String sentSQL) {
        try {
            PreparedStatement preSt = cx.prepareStatement(sentSQL);

            ResultSet res = preSt.executeQuery();
            return res;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
