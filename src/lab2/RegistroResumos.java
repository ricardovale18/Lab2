package lab2;

public class RegistroResumos {
    private Resumo[] resumos;
    private int quantidadeResumos;
    private int proximaPosicao;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.quantidadeResumos = 0;
        this.proximaPosicao =  0;
    }

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
    public Resumo[] pegaResumos() {
        return this.resumos;
    }
    public String imprimeResumos() {
        String imprimeresumo = "";
        for (int i = 0; i < quantidadeResumos - 1; i++) {
            imprimeresumo += resumos[i].getTema() + " | ";
        }
        imprimeresumo += resumos[quantidadeResumos-1].getTema();
        return "- "+quantidadeResumos + " resumo(s) cadastrado(s)"+ "\n" +
                "- " + imprimeresumo;
    }
    public int conta() {
        return quantidadeResumos;
    }
    public boolean temResumo(String tema) {
        for (Resumo t : this.resumos) {
            if (t != null && t.getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
}
