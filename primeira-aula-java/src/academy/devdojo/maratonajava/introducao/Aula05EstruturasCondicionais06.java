package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //considerando 1 como domingo

        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Dia Útil");
                break;
            case 3:
                System.out.println("Dia Útil");
                break;
            case 4:
                System.out.println("Dia Útil");
                break;
            case 5:
                System.out.println("Dia Útil");
                break;
            case 6:
                System.out.println("Dia Útil");
                break;
            case 7:
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Dia da semana inexistente");
        }
     //CORREÇÃO VIA YT
    int diaSem = 1;
       switch(diaSem) {
           case 1:
           case 7:
               System.out.println("Final de semana");
               break;
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
               System.out.println("Dia útil");
               break;
           default:
               System.out.println("Dia da semana inexistente");
       }
    }
}
