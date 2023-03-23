package projeto;
public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("jose", "12345678910", "25/07/2002", 20, "rua luverci");
        c.validarCPF();
    }
}
