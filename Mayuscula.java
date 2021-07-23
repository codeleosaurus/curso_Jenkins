import java.util.Scanner;
public class Mayuscula
  
{
    public static void main(String args[])
     {
        String nombre;
        Scanner myObj = new Scanner(System.in);
        nombre = myObj.nextLine();
        System.out.println(nombre.toUpperCase());
    }
}
