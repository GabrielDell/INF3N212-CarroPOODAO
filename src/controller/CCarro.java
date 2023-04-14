/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static inf3n212.carro.INF3N212Carro.cadPessoa;
import java.util.ArrayList;
import model.Carro;
/**
 *
 * @author 182120002
 */
public class CCarro {
    ArrayList<Carro> carros = new ArrayList();
    
   /**
     * Método addPessoa adiciona Pessoa no ArrayList pessoas
     *
     * @param c
     */
    public void addCarro(Carro c) {
        this.carros.add(c);
    }// fim arraylist    
    
    public void removeCarro(Carro c) {
        this.carros.remove(c); 
    }
    
    public ArrayList<Carro> getCarros() {
        return this.carros;
    }
    
    public Carro getCarroPlaca(String Placa) {
        Carro c = null;
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(Placa)){
                c = carro;
                break;
            }
        }//Fim do for
        return c;
    }//Fim do public Carro getCarroPlaca
    
    public void mockCarros() {
        Carro c1 = new Carro();
        c1.setPlaca("BRA2E19");
        c1.setMarca("Fiat");
        c1.setModelo("Uno");
        c1.setAnoFab(2018);
        c1.setAnoMod(2019);
        c1.setCor("Branco");
        c1.setTpCambio("Manual");
        c1.setCombustivel("Flex");
        c1.setProprietario(cadPessoa.getPessoaCPF("18585960094"));
        addCarro(c1);
        Carro c2 = new Carro();
        c2.setPlaca("BRA2020");
        c2.setMarca("Chevrolet");
        c2.setModelo("S10");
        c2.setAnoFab(2015);
        c2.setAnoMod(2016);
        c2.setCor("Cinza");
        c2.setTpCambio("Automático");
        c2.setCombustivel("Flex");
        c2.setProprietario(cadPessoa.getPessoaCPF("89177634055"));
        addCarro(c2);
    }//Fim da mockCarros
}
