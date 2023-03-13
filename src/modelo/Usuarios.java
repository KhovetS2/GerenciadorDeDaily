package modelo;

public class Usuarios {

    private int id;
    private String nome;
    private String cargo;
    private String senha;

    public Usuarios() {
    }

    public Usuarios(int id, String nome, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSenha(char[] senha, boolean v) {
        String senhaString = "";
        for (char c : senha) {
            senhaString += c;
        }
        this.senha = senhaString;
    }

    public Usuarios id(int id) {
        setId(id);
        return this;
    }

    public Usuarios nome(String nome) {
        setNome(nome);
        return this;
    }

    public Usuarios cargo(String cargo) {
        setCargo(cargo);
        return this;
    }

    @Override
    public String toString() {
        return "{"
                + " id='" + getId() + "'"
                + ", nome='" + getNome() + "'"
                + ", cargo='" + getCargo() + "'"
                + "}";
    }

}
