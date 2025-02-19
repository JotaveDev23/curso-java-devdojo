public class Aula06EstruturasDeRepetição {
    public static void main (String[] args){
        //while ; do while ; for
        //enquanto ; faça enquanto ;
        int count = 0;
        while(count < 10){ //enquanto count for menor que dez
            System.out.println(count);
            count = count + 1;

            //só vai executar se tiver um valor real

        }
        count = 0;
        do{ //faça
            count = count + 1;
            System.out.println("dentro do do-while");

        } while (count < 10);

        for (int i= 0; i<10; i++) { //for é mais utilizado em contagens, vai contando de um em um, a variavel é feita dentro dele
            //para (i começando de zero ; até o i ser menor que 10 ; incrementando ele de um em um) faça
            System.out.println("for " + i);
        }
    }
}
