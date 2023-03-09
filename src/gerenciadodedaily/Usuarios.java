package gerenciadodedaily;

public class Usuarios {
    private int id;
    private String nome;
    private Cargo cargo;


    public Usuarios() {
    }

    public Usuarios(int id, String nome, Cargo cargo) {
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

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Usuarios id(int id) {
        setId(id);
        return this;
    }

    public Usuarios nome(String nome) {
        setNome(nome);
        return this;
    }

    public Usuarios cargo(Cargo cargo) {
        setCargo(cargo);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", cargo='" + getCargo() + "'" +
            "}";
    }

}
