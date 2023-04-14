/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 182120002
 */
public class Carro {
    private String placa;   
    private String marca;
    private String modelo;
    private int anoFab;
    private int anoMod;
    private String cor;
    private String tpCambio;
    private String combustivel;
    private Pessoa proprietario;// Agregação de classe model Pessoa com Carro
    
    public Carro() {
    }

    public Carro(String placa, String marca, String modelo, int anoFab, int anoMod, String cor, String tpCambio, String combustivel, Pessoa proprietario) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.anoMod = anoMod;
        this.cor = cor;
        this.tpCambio = tpCambio;
        this.combustivel = combustivel;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public int getAnoMod() {
        return anoMod;
    }

    public String getCor() {
        return cor;
    }

    public String getTpCambio() {
        return tpCambio;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public void setAnoMod(int anoMod) {
        this.anoMod = anoMod;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTpCambio(String tpCambio) {
        this.tpCambio = tpCambio;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "\n---\t" + "\nPlaca:\t" + placa + "\nMarca:\t" + marca + "\nModelo:\t" + modelo 
                + "\nAno Fab:\t" + anoFab + "\nAno Mod:\t" + anoMod + "\nCor:\t" + cor 
                + "\nTipo de Cambio:\t" + tpCambio + "\nCombustivel:\t" + combustivel
                + "\nProprietario:\t" + proprietario.getNome();
    }//Fim do toString 
}//Fim Classe Carro
