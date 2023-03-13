package modelo;

public class Avisos {
    private int id;
    private String conteudo;
    private String remetente;


    public Avisos() {
    }

    public Avisos(int id, String conteudo, String remetente) {
        this.id = id;
        this.conteudo = conteudo;
        this.remetente = remetente;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getRemetente() {
        return this.remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public Avisos id(int id) {
        setId(id);
        return this;
    }

    public Avisos conteudo(String conteudo) {
        setConteudo(conteudo);
        return this;
    }

    public Avisos remetente(String remetente) {
        setRemetente(remetente);
        return this;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", conteudo='" + getConteudo() + "'" +
            ", remetente='" + getRemetente() + "'" +
            "}";
    }

}
