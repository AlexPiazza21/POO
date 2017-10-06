/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaplicacao;

/**
 *
 * @author internet
 */
public class PrimeiraAplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro meuCarro = new Carro();
        meuCarro.setChassi("AB1234");
        meuCarro.setCor("Azul");
        meuCarro.setModelo("Uno");
        
        System.out.println(meuCarro.toString());
        
        meuCarro.setCor("Amarelo");
        
        System.out.println(meuCarro.toString());
        
    }
    
}
