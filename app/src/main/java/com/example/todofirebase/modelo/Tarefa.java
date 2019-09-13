package com.example.todofirebase.modelo;

public class Tarefa {

    //Atributos da classe
    private String uuid;
    private String nome;
    private String imageSrc = "https://freeiconshop.com/wp-content/uploads/edd/task-done-outline.png";
    private boolean status;

    public Tarefa(){

    }


    //Instancia um objeto
    public Tarefa(String uuid, String nome) {
        this.uuid = uuid;
        this.nome = nome;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "uuid='" + uuid + '\'' +
                ", nome='" + nome + '\'' +
                ", status=" + status +
                '}';
    }
}
