public class Tutor extends Pessoa{
    private String endereco;
    public Tutor (int id, String nome, String telefone, String endereco){
        super(id, nome, telefone);
        this.endereco = endereco;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}