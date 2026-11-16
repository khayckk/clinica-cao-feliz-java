public class Veterinario extends Pessoa {
    private String crmv;

    public Veterinario(int id, String nome, String telefone, String crmv) {
        super(id, nome, telefone);
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
}