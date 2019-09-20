package program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        method1();
        System.out.println("END PROGRAM");
    }

    public static void method1() {
        System.out.println("INIT METHOD 1");
        method2();
        System.out.println("END METHOD 1");
    }

    public static void method2() {

        System.out.println("INIT METHOD 2");

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.print(vect[position]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid Position!");
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        sc.close();
        System.out.println("FINISH METHOD 2");
    }

}

//
//
//
//
//
//{
//      "id_usuario": "20489",
//      "marcas": [
//        {
//          "id_marca": "1",
//          "clientes": [
//            {
//              "id_cliente": "90673"
//            }
//          ]
//        }
//      ]
//    }
//
