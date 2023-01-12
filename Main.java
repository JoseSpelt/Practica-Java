
public class Main{

    public Main() {
    }

    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.nombre = "Juan Carlos";
        cliente.telefono = 994114128;
        cliente.credito = 20000000;
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 24;
        trabajador.nombre = "Jose Spelt";
        trabajador.telefono = 994114128;
        trabajador.salario = 5000000;

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);


        System.out.println(trabajador.nombre);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
}
}

class Persona {
    int edad;
    String nombre;
    int telefono;

}
class Cliente extends Persona{
    int credito;


}
class Trabajador extends Persona{
    int salario;
}