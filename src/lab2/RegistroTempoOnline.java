package lab2;
/**
 * Registro do tempo dedicado online a uma disciplina. Controla a quantidade
 * de tempo gasta pelo estudante.
 *
 * @author Ricardo Vale Vieira Junior
 */
public class RegistroTempoOnline {
    /** Nome da disciplina. */
    private String nomeDisciplina;
    /** Tempo total acumulado online. */
    private int tempoOnlineUsado;
    /** Tempo total online esperado. */
    private int tempoOnlineEsperado;

    /** Constrói o registro com meta padrão de 120h.
     * @param nomeDisciplina nome da disciplina */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineUsado = 0;
        this.tempoOnlineEsperado = 120;
    }
    /** Constrói o registro especificando a meta de horas.
     * @param nomeDisciplina nome da disciplina
     * @param tempoOnlineEsperado meta de horas */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineUsado = 0;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }
    /** Acumula tempo dedicado à disciplina.
     * @param tempo horas a adicionar */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineUsado += tempo;
    }

    /** Verifica se atingiu ao menos metade da meta de tempo.
     * @return true se atingiu a meta, false caso contrário */
    public boolean atingiuMetaTempoOnline() {
        return this.tempoOnlineUsado*2 >= this.tempoOnlineEsperado;
    }

    /** Retorna a representação no formato "NomeDisciplina TempoUsado/TempoEsperado".
     *  @return a representação em String do registro de tempo online */
    @Override
    public String toString() {
        return nomeDisciplina + " "+ tempoOnlineUsado +"/"+ tempoOnlineEsperado;
    }
}
