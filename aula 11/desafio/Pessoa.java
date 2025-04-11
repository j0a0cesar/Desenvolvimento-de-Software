public class Pessoa {

         String nome;
         String cpf;
         int idade;

        Pessoa(String nome,String cpf,int idade){
            this.nome=nome;
            this.cpf=cpf;
            this.idade=idade;
        }

        public void mostrarNome(){
            System.out.println(this.nome);
        }
        public void mostrarCPF(){
            System.out.println(this.cpf);
        }
        public void mostrarIdade(){
            System.out.println(this.idade);
        }

}
