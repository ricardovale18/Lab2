package lab2;

import java.util.Arrays;

/**
 * Representa uma disciplina cursada por um estudante. Cada disciplina
 * possui um nome, número de horas de estudo acumuladas, quatro notas
 * e a média calculada a partir dessas notas.
 *
 * @author Ricardo Vale Vieira Junior
 */
public class Disciplina {
    /** Nome da disciplina. */
    private String nomeDisciplina;
    /** Quantidade total de horas acumuladas dedicadas ao estudo da disciplina. */
    private int horasEstudo;
    /** Array que armazena as 4 notas das avaliações da disciplina.*/
    private double[] notas;
    /** Média calculada a partir das 4 notas.*/
    private double media;

    /** Constrói uma disciplina a partir do seu nome.
     * A disciplina inicia com 0 horas de estudo, 4 notas zeradas e média 0.00.
     *
     * @param nomeDisciplina o nome da disciplina*/
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
        this.media = 0.00;
    }
    /** Cadastra e acumula a quantidade de horas dedicadas aos estudos da disciplina.
     *
     * @param horas a quantidade de horas a ser somada ao total de horas de estudo*/
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }
    /** Cadastra a nota de uma avaliação da 1, 2, 3 ou 4 e recalcula
     * a média das 4 notas acumuladas.
     * @param nota a indicação da avaliação
     * @param valorNota o valor da nota obtida na avaliação*/
    public void cadastraNota(int nota,double valorNota) {
        this.notas[nota-1] = valorNota;
        double somador = 0;
        for (double n : this.notas) {
            somador += n;
        }
        this.media = somador / 4;
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