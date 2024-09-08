import java.io.*;

public class Menu {
    BufferedReader scanf = new BufferedReader(new InputStreamReader(System.in));
    Colegio colegio = new Colegio();
    public boolean isNumeric(String str) {
        if (str == null || str.isEmpty()){
            return false;
        }
        for (char c:str.toCharArray()){
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    public void menu()throws IOException{
        int opcion;
        String grado,letra,input;
        Curso c;
        do{
            System.out.println("\n\nMenu de registro de asistencia");
            System.out.println("Ya hay cursos registrados desde primero básico a cuarto medio");
            System.out.println("(1) Menu de Cursos");
            System.out.println("(2) Menu de Estudiantes");
            System.out.println("(3) Realizar Asistencia");
            System.out.println("(4) Salir");
            System.out.print("Elija su opción");
            input = scanf.readLine();
            if(isNumeric(input)){
                opcion = Integer.parseInt(input);
            }
            else{
                System.out.println("\n\nValor no valido");
                opcion = 5;
            }
            switch(opcion)
            {
                case 1:
                    //menu curso
                    break;
                case 2:
                    //menu Estudiante
                    break;
                case 3:
                    //Realizar asistencia

                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese un numero valido");
                    break;
            }
        }while(opcion!= 4);
    }

}
