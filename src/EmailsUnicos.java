import java.util.*;
public class EmailsUnicos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<String> emails = new HashSet<>();

        int accion;

        do {
            System.out.println("1 Registrar email");
            System.out.println("2 Mostrar emails");
            System.out.println("3 Comprobar email");
            System.out.println("0 Salir");


            accion = sc.nextInt();
            sc.nextLine();

            switch(accion) {

                case 1:
                    System.out.print("Email: ");
                    String e = sc.nextLine();

                    if(emails.add(e))
                        System.out.println("Registrado");
                    else
                        System.out.println("Email ya registrado");
                    break;

                case 2:
                    System.out.println(emails);
                    break;

                case 3:
                    System.out.print("Email a comprobar: ");
                    e = sc.nextLine();

                    if(emails.contains(e))
                        System.out.println("Está registrado");
                    else
                        System.out.println("No registrado");
                    break;
            }

        } while(accion!=0);
    }
}
