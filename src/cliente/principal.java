package cliente;

public class principal {

    private String usuario;
    private String contrasenia;

    public principal() {
        usuario="Admin";
        contrasenia="facilita";
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public String getNomUsuario(){
        return this.usuario;
    }
    public String getContrasenia(){
        return this.contrasenia;
    }

    public static void main(String[] args) {
        EscogerUsuario interfaz = new EscogerUsuario(args, new principal());
        interfaz.setVisible(true);
    }
}
