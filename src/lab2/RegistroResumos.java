package lab2;
/**
 * Armazena e gerencia resumos de estudos.
 *
 * @author Ricardo Vale Vieira Junior
 */
public class RegistroResumos {
    /** Array que armazena os objetos do tipo Resumo. */
    private Resumo[] resumos;
    /** Quantidade atual de resumos cadastrados. */
    private int quantidadeResumos;
    /** Índice da próxima a ser sobrescrita no array. */
    private int proximaPosicao;

    /** Constrói o registro definindo a capacidade máxima de resumos.
     * @param numeroDeResumos capacidade limite do registro */
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.quantidadeResumos = 0;
        this.proximaPosicao =  0;
    }

    /** Adiciona um resumo caso o tema ainda não exista, mudando o primeiro resumo caso o limite seja atingido.
     * @param tema tema do resumo
     * @param conteudo texto do resumo */
    public void adiciona(String tema,String conteudo) {
        for (Resumo t : this.resumos) {
            if (t != null && t.getTema().equals(tema)) {
                return;
            }
        }
        resumos[proximaPosicao] = new Resumo(tema, conteudo);

        proximaPosicao++;
        if (proximaPosicao == resumos.length) {
            proximaPosicao = 0;
            }
        if (quantidadeResumos < resumos.length) {
            quantidadeResumos++;
        }
    }
    /** Retorna o array contendo todos os resumos armazenados.
     *  @return array de objetos Resumo */
    public Resumo[] pegaResumos() {
        return this.resumos;
    }
    /** Retorna a listagem formatada dos resumos cadastrados e seus temas.
     * @return String com contagem e temas separados por "|" */
    public String imprimeResumos() {
        String imprimeresumo = "";
        for (int i = 0; i < quantidadeResumos - 1; i++) {
            imprimeresumo += resumos[i].getTema() + " | ";
        }
        imprimeresumo += resumos[quantidadeResumos-1].getTema();
        return "- "+quantidadeResumos + " resumo(s) cadastrado(s)"+ "\n" +
                "- " + imprimeresumo;
    }
    /** Retorna a quantidade total de resumos cadastrados.
     * @return número de resumos */
    public int conta() {
        return quantidadeResumos;
    }
    /** Verifica se já existe um resumo cadastrado com o tema informado. @param tema tema a ser pesquisado
     * @return true se o tema existir, false caso contrário */
    public boolean temResumo(String tema) {
        for (Resumo t : this.resumos) {
            if (t != null && t.getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
}
