package VCI_Resolucion;

public class Token {
    private String nombre;
    private int token;
    private int posTabla;
    private int linea;

    public Token(String nombre, int token, int posTabla, int linea) {
        this.nombre = nombre;
        this.token = token;
        this.posTabla = posTabla;
        this.linea = linea;
    }

    public String getNombre() {
        return nombre;
    }

    public int getToken() {
        return token;
    }

    public int getPosTabla() {
        return posTabla;
    }

    public int getLinea() {
        return linea;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public void setPosTabla(int posTabla) {
        this.posTabla = posTabla;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }
}
