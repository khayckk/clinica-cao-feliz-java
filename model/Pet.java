package model;

public class Pet {
    private int id;
    private String nome;
    private String especie;
    private int idade;
    private String raca;
    private int tutor_id;

    public Pet() {
    }

    public Pet(int id, String nome, String especie, int idade) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    // Construtor sem ID (útil na hora de cadastrar um novo Pet antes de ir pro banco)
    public Pet(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTutor_id() {
        return tutor_id;
    }

    public void setTutor_id(int tutor_id) {
        this.tutor_id = tutor_id;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

}