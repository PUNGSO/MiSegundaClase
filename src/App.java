import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello JD, Wellcome to JAVA!");
        Scanner scanner = new Scanner(System.in);
        String nombre = "";

        Carro carro = new Carro();
        carro.setAnio(1998);

        if ( carro.getAnio()<2000){
            System.out.println("EL CARRO ES CHATARRA");
        }
        else{
            System.out.println("EL CARRO ES NUEVO");
        }
        System.out.println("DAME EL NOMBRE DEL CARRO:");
        nombre = scanner.nextLine();

        carro.setNombre(nombre);

        System.out.println("MARCA DEL CARRO ES:" + carro.getNombre());


        
        
    }
}
