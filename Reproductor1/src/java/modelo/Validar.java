package modelo;

import java.util.List;

public interface Validar {
    public int validar(Persona per);
    public List listar();
    public Persona list(int id);
    public boolean add(Persona per);
    public boolean edit(Persona per);
    public boolean eliminar(int id);
}
