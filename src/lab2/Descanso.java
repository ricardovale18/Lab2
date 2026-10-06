package lab2;
/**
 * Representa o descanso de um estudante(horas descansadas)
 * e os metodos para ver ser um estudante está cansado ou descansado.
 *
 * @author Ricardo Vale Vieira Junior
 */
public class Descanso {
    /** Total de horas acumuladas de descanso. */
    private int horasDescanso;
    /** Total de semanas contabilizadas nas horas acumuladas. */
    private int numeroSemanas;

    /** Constrói um registro com 0 horas de descanso e 0 semanas. */
    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }

    /** Define a quantidade total de horas de descanso do estudante.
     * @param valor a quantidade de horas de descanso */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    /** Define a quantidade de semanas consideradas para a média de descanso.
     * @param valor o número de semanas */
    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    /** Retorna o status geral de descanso do estudante. O status será "descansado"
     * se a média semanal de horas de descanso for 26 horas ou mais, e
     * "cansado" caso contrário.
     * @return a representação em String do status ("descansado" ou "cansado") */
    public String getStatusGeral() {
        if (numeroSemanas == 0) {
            return "cansado";
        }
        if ((this.horasDescanso / this.numeroSemanas) >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}
