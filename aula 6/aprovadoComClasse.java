import java.util.Scanner;

public class Main {
    //import java.util.Scanner;
    //
    //public class Main {
    //    public static void main(String[] args) {
    //
    //        //Scanner input = new Scanner(System.in);
    //        /* Aluno aluno1 = new Aluno();
    //        Aluno aluno2 = new Aluno();
    //
    //        aluno1.nome = "Bruna";
    //        aluno1.nota1 = 8.5f;
    //        aluno1.nota2 = 7.3f;
    //
    //        aluno2.nome = "Math";
    //        aluno2.nota1 = 7.0f;
    //        aluno2.nota2 = 9.4f;
    //
    //        System.out.println(aluno1.nome);
    //        System.out.println(aluno1.nota1);
    //        System.out.println(aluno1.nota2);
    //
    //        System.out.println(aluno1.nome);
    //        System.out.println(aluno1.nota1);
    //        System.out.println(aluno1.nota2); */
    //
    //        Aluno[] turma = new Aluno[5];
    //
    //        turma[0] = new Aluno();
    //
    //        turma[0].nome = "Carlos";
    //        turma[0].nota1 = 3f;
    //        turma[0].nota2 = 1.0f;
    //
    //        for(int i = 0; i < 5; i++){
    //            turma[i].verMedia();
    //        }
    //        turma[0].verMedia();
    //
    //    }
    //}
    //public class Aluno {
    //    String nome;
    //    float nota1, nota2;
    //    int idade;
    //
    //    void verMedia(){
    //        float media = (nota1 + nota2) / 2;
    //        System.out.println("Média " + nome + " é: " + media);
    //    }
    //
    //}
    public static void main(String[] args) {
    Aluno [] turma = new Aluno[5];

        Scanner input = new Scanner(System.in);

     for(int i = 0; i < turma.length; i++){
          turma[i] = new Aluno();

         System.out.print("Digite a sua matricula: ");
         turma[i].matricula = input.nextInt();
         input.nextLine();

         System.out.print("Digite o seu nome: ");
          turma[i].nome = input.nextLine();

         System.out.print("Digite a sua primeira nota: ");
         turma[i].nota1 = input.nextFloat();
         System.out.print("Digite a sua segunda nota: ");
         turma[i].nota2 = input.nextFloat();
     }

     for(int i= 0; i < turma.length; i ++){
         turma[i].media = (turma[i].nota1 + turma[i].nota2)/2;

         System.out.println("Matricula: "+turma[i].matricula);
         System.out.println("Nome: "+turma[i].nome);
         System.out.println("Nota 1: "+turma[i].nota1);
         System.out.println("Nota 2: "+turma[i].nota2);
         if( turma[i].media >= 6){
             System.out.println("Aprovado: (X)Sim ()Não");
         }
         else{
             System.out.println("Aprovado: ()Sim (X)Não");
         }
         System.out.println("Média final: "+turma[i].media);
     }
    input.close();
    }

}
