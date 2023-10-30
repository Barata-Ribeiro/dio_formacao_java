package br.com.dio.java.io.IOBytes.IOObject;

import java.io.Serializable;

//nome, idade, cor;
public class Gato implements Serializable {

    private static final long serialVersionUID = 2L;
    private String nome;
    private int idade;
    private String cor;
    private boolean castrado;
    private transient boolean ronrona;

    public Gato() {
    }

    /**
     * @param nome
     * @param idade
     * @param cor
     * @param castrado
     * @param ronrona
     */
    public Gato(String nome, int idade, String cor, boolean castrado, boolean ronrona) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.castrado = castrado;
        this.ronrona = ronrona;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the castrado
     */
    public boolean isCastrado() {
        return castrado;
    }

    /**
     * @param castrado the castrado to set
     */
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    /**
     * @return the ronrona
     */
    public boolean isRonrona() {
        return ronrona;
    }

    /**
     * @param ronrona the ronrona to set
     */
    public void setRonrona(boolean ronrona) {
        this.ronrona = ronrona;
    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + ", castrado=" + castrado + ", ronrona="
                + ronrona + "]";
    }

}
