package lab2;

import java.util.Arrays;

public class Disciplinas {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private double media;

    public Disciplinas(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
        this.media = 0.00;
    }
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }
    public void cadastraNotas(int nota,double valorNota) {
        this.notas[nota-1] = valorNota;
        double somador = 0;
        for (double n : this.notas) {
            somador += n;
        }
        this.notas = new double[4];

        this.media = somador / 4;
    }
    public boolean aprovado() {
        return media >= 7;
    }
    @Override
    public String toString() {
        return nomeDisciplina + " " + horasEstudo +" "+ media +" "+ Arrays.toString(notas);
    }
}