package lab2;
/**
 * Representação de um resumo individual contendo um tema e seu conteúdo.
 * @author Ricardo Vale Vieira Junior
 */
public class Resumo {
    /** Tema do resumo. */
    private String tema;
    /** Conteúdo/texto do resumo. */
    private String conteudo;

    /** Constrói um resumo a partir de seu tema e conteúdo.
     * @param tema o tema do resumo
     * @param conteudo o texto explicativo */
    public Resumo(String tema,String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /** Retorna o tema do resumo.
     * @return o tema */
    public String getTema() {
        return this.tema;
    }

    /** Retorna o conteúdo do resumo.
     * @return o conteúdo */
    public String getConteudo() {
        return conteudo;
    }
    /** Retorna a representação em String no formato "Tema: Conteúdo".
     * @return a representação em String */
    public String toString() {
        return this.tema + ": " + this.conteudo;
    }
}
