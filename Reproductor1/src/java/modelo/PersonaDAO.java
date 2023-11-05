package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements Validar{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Persona p = new Persona();
    
    @Override
    public int validar(Persona per) {
        int r=0;
        String sql = "select * from persona where usuario=? and contrasena=?";
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, per.getUsu());
            ps.setString(2, per.getContra());
            rs=ps.executeQuery();
            while(rs.next()){
                r=r+1;
                per.setUsu(rs.getString("usuario"));
                per.setContra(rs.getString("contrasena"));
            } 
            if (r==1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public List listar() {
        ArrayList<Persona>list=new ArrayList<>();
        String sql = "select * from persona";
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Persona per=new Persona();
                per.setId(rs.getInt("id"));
                per.setUsu(rs.getString("usuario"));
                per.setContra(rs.getString("contrasena"));
                list.add(per);
            }
        } catch (Exception e) {
            
        }
        return list;
    }

    @Override
    public Persona list(int id) {
        String sql = "select * from persona where id="+id;
        try {
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setId(rs.getInt("id"));
                p.setUsu(rs.getString("usuario"));
                p.setContra(rs.getString("contrasena"));
                
            }
        } catch (Exception e) {
            
        }
        return p;
    }

    @Override
    public boolean add(Persona per) {
        String sql="insert into persona(usuario,contrasena)values('"+per.getUsu()+"','"+per.getContra()+"')";
        try {
            con =cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Persona per) {
        String sql="update persona set usuario='"+per.getUsu()+"',contrasena='"+per.getContra()+"'where id="+per.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql ="delete from persona where id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        } 
        return false;
    }
}
    

