public class Main {
    public static void main(String[] args) {

        int notaFinal = 14;

        if(notaFinal >= 18){
            System.out.println("Estás aprobado y tiene beca");
        }else if(notaFinal >= 14){
            System.out.println("Estás aprobado");
        }
        else if(notaFinal >= 12){
            System.out.println("Aprobó a las justas");
        }
        else{
            System.out.println("Estás desaprobado");
        }

        int opcion = 2;
        switch (opcion){
            case 1:
                System.out.println("Registrar");
                break;
            case 2:
                System.out.println("Consultar");
                break;
            case 3:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Esa opción no existe");

        }


        /* int contador = 1;

        while(contador <= 5){
            System.out.println(contador);
            contador++;
        }



        do{
            System.out.println("Estoy iniciando mi proceso de recorrido");
            contador++;
        }while(contador<=5);



        for(int i = 1 ; i<=5; i++){
            System.out.println(i);
        } */

        for(int i = 1 ; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }


    }
}
