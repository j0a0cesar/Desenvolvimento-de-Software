

        public class Main {
            public static void main(String[] args) {

                Pessoa p = new Pessoa("joão","0",19);


                Funcionario f = new Funcionario("Zé","2",18,"estagiario",001,1200);


                Gerente g = new Gerente("Luiz","3",48,"gerente",002,12000,5);

                Vendendor v = new Vendendor("Rafa","4",38,"vendedor",003,7500,1200,1500);
                v.trabalhar();
                v.vender();

                Cliente c = new Cliente("Maria","1",21);

                g.liderar();
                g.trabalhar();

            }
        }

