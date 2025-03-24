public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();


    public void adicionarContato(Contato novoContato) {
        contatos.add(novoContato);
        System.out.println("Novo contato salvo!");
    }

    public Contato buscarContato(String nomeProcurado) {
// o for-each que a cada ciclo, contato recebe o valor do próximo elemento 
//ele é bom menos propenso a erros, não tem o risco de estourar o índice, não precisa da condicional i < x, tambem não precisa i++   
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nomeProcurado)) {
                //comparação entre duas strings ignorando se as letras são maiúsculas ou minúsculas
                return contato;
            }
        }
            System.out.println("Contato não encontrado!");
            return null;
    }//aqui um metodo usando boolean, que tem que retorna true ou false
    public boolean removerContato(String nome) {
        Contato c = buscarContato(nome);
        if(c != null) {
            contatos.remove(c);
            return true;
        }
        return false;
    }
}
/*Comentarios apos resover este exercicio:
arrayList é novidade,  aprendi para usar aqui ArrarList é flexivel(não tem um tamnho definido) e é bom quando precisa adionar e remover com frequencia,
e também tem metodos que facilitam o trabalho como .add(), .remove()
ele foi o diferncial desse exercicio pois com ele mudou a forma de resolver a questão,diria que a logica da resolução, pois eu tinha pensado em fazer um arry comun, e uma busca sequncial,
uma forma mais proxima do que se faz em C,
ele mudou a  forma de adiconar e remover o contato tambem
*/
