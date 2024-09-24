/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.singleton_fabrica_chocolate;

/**
 *
 * @author rafaelamoreira
 */
public class FabricaChocolate {

    public static void main(String[] args) {
        CaldeiraChocolate caldeira = CaldeiraChocolate.getInstancia();

        // Tentativa de drenar uma caldeira vazia
        caldeira.drenar();

        // Preencher a caldeira
        caldeira.encher();

        // Tentar preencher novamente 
        caldeira.encher();

        // Ferve o conteúdo
        caldeira.ferver();

        // Tentar ferver novamente
        caldeira.ferver();

        // Drenar a mistura fervida
        caldeira.drenar();

        // Tentar drenar novamente 
        caldeira.drenar();
    }

}
