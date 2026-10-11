package lab2;

import java.util.Arrays;

/**
 * Representa uma disciplina cursada por um estudante. Cada disciplina
 * possui um nome, número de horas de estudo acumuladas, notas, pesos
 * e a média calculada a partir dessas notas e pesos.
 *
 * @author Ricardo Vale Vieira Junior
 */
public class Disciplina {
    /** Nome da disciplina. */
    private String nomeDisciplina;
    /** Quantidade total de horas acumuladas dedicadas ao estudo da disciplina. */
    private int horasEstudo;
    /** Array que armazena as notas das avaliações da disciplina.*/
    private double[] notas;
    /** Média calculada a partir das notas e pesos.*/
    private double media;
    /** Array que armazena os pesos de cada avaliação.*/
    private int[] pesos;

    /** Constrói uma disciplina a partir do seu nome.
     * A disciplina inicia com 0 horas de estudo, 4 notas zeradas, pesos iguais a 1 e média 0.00.
     *
     * @param nomeDisciplina o nome da disciplina*/
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
        this.media = 0.00;
        this.pesos = new int[]{1, 1, 1, 1};
    }
    /** Constrói uma disciplina a partir do seu nome e quantidade de avaliações.
     * A disciplina inicia com 0 horas de estudo, pesos igual a 1 e média 0.00.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param  numNotas a quantidade de avaliações da disciplina */
    public Disciplina(String nomeDisciplina, int numNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numNotas];
        this.media = 0.00;
        this.pesos = new int[]{1, 1, 1, 1};
    }
    /** Constrói uma disciplina a partir do seu nome e quantidade de avaliações, e os respectivos pesos dessas avaliações.
     * A disciplina inicia com 0 horas de estudom e média 0.00.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param  numNotas a quantidade de avaliações da disciplina
     * @param pesosNotas os numero do peso para cada avaliação. */
    public Disciplina(String nomeDisciplina, int numNotas, int[] pesosNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numNotas];
        this.media = 0.00;
        this.pesos = pesosNotas;
    }

    /** Cadastra e acumula a quantidade de horas dedicadas aos estudos da disciplina.
     * @param horas a quantidade de horas a ser somada ao total de horas de estudo*/
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }
    /** Cadastra a nota de uma avaliação e calcula
     * a média das notas acumuladas com seus respectivos pesos.
     * @param nota a indicação da avaliação
     * @param valorNota o valor da nota obtida na avaliação*/
    public void cadastraNota(int nota,double valorNota) {
        this.notas[nota-1] = valorNota;
        double somaNotas = 0;
        int soma_pesos = 0;
        for (int i = 0; i<notas.length ;i++) {
            somaNotas += notas[i] * pesos[i];
            soma_pesos += pesos[i];
        }
        this.media = somaNotas / soma_pesos;
    }
    /** Informa se o aluno foi aprovado na disciplina se a média for maior ou igual a 7.0.
     * @return true se a média for maior ou igual a 7.0, ou false caso contrário*/
    public boolean aprovado() {
        return media >= 7;
    }
    /** Retorna a String que representa a disciplina.
     * @return a representação em String da disciplina*/
    @Override
    public String toString() {
        return nomeDisciplina + " " + horasEstudo +" "+ this.media +" "+ Arrays.toString(this.notas);
    }
}