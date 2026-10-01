package lab2;

public class RegistroResumos {
    private String[] temas;
    private String[] conteudos;
    private int quantidadeResumos;
    private int proximaPosicao;

    public RegistroResumos(int numeroDeResumos) {
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.quantidadeResumos = 0;
        this.proximaPosicao =  0;
    }

    public void adiciona(String tema,String conteudo) {
        for (String t : this.temas) {
            if (t != null && t.equals(tema)) {
                return;
            }
        }
        temas[proximaPosicao] = tema;
        conteudos[proximaPosicao] = tema +": "+ conteudo;

        proximaPosicao++;
        if (proximaPosicao == temas.length) {
            proximaPosicao = 0;
            }
        if (quantidadeResumos < temas.length) {
            quantidadeResumos++;
        }
    }
    public String[] pegaResumos() {
        return conteudos;
    }
    public String imprimeResumos() {
        String resumos = "";
        for (int i = 0; i < quantidadeResumos - 1; i++) {
            resumos += temas[i] + " | ";
        }
        resumos += temas[quantidadeResumos-1];
        return "- "+quantidadeResumos + " resumo(s) cadastrado(s)"+ "\n" +
                "- " + resumos;
    }
    public int conta() {
        return quantidadeResumos;
    }
    public boolean temResumo(String tema) {
        for (String t : this.temas) {
            if (t != null && t.equals(tema)) {
                return true;
            }
        }
        return false;
    }
}
