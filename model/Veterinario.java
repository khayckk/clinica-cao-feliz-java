public class Veterinario extends Pessoa{
    private String crmv;
    public Veterinario (int id, String nome, String telefone, String crmv){
        super(id, nome, telefone);
        this.crmv = crmv;
    }

    public String getcrmv() {
        return crmv;
    }

    public void setcrmv(String crmv) {
        this.crmv = crmv;
    }
}