import java.util.Scanner;

public class decifrado {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa el mensaje cifrado");
        String mensajecifrado = lector.next();
        System.out.println("Cuántas veces quieres mover el carcacter");
        int veces = lector.nextInt();

        String mensaje = "";

        for(int i = 0; i < mensajecifrado.length(); i++) {
            char letra = mensajecifrado.charAt(i);
            boolean minuscula = (letra >= 'a' && letra <='z');
            boolean mayuscula = (letra >= 'A' && letra <='Z');
            if(!(minuscula || mayuscula))
                mensaje += letra;
            else {
                int ascii = (int)letra;
                int baseAscii = (int)'a';
                if(mayuscula)
                    baseAscii = (int)'A';
                int nuevoAscii = (ascii - baseAscii - veces) % 26 + baseAscii;
                char nuevaLetra = (char)nuevoAscii;
                mensaje += nuevaLetra;
            }
        }
        System.out.println(mensaje);

    }
}