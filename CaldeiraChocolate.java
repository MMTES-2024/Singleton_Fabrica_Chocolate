/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.singleton_fabrica_chocolate;

/**
 *
 * @author rafaelamoreira
 */
public class CaldeiraChocolate {

    private boolean vazia;
    private boolean fervida;

    private static CaldeiraChocolate instancia;

    private CaldeiraChocolate() {
        vazia = true;
        fervida = false;
    }

    // Obter a única instância da caldeira (Singleton)
    public static CaldeiraChocolate getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }

    // Encher a caldeira com chocolate e leite
    public void encher() {
        if (vazia) {
            vazia = false;
            fervida = false;  // Reseta o estado de fervida ao encher
            System.out.println("A caldeira foi preenchida com chocolate e leite.");
        } else {
            System.out.println("Erro: A caldeira já está cheia!");
        }
    }

    // Ferver o conteúdo da caldeira
    public void ferver() {
        if (!vazia && !fervida) {
            fervida = true;
            System.out.println("A mistura de chocolate e leite está fervendo.");
        } else if (vazia) {
            System.out.println("Erro: Não é possível ferver uma caldeira vazia!");
        } else {
            System.out.println("Erro: A mistura já foi fervida.");
        }
    }

    // Drenar a mistura fervida da caldeira
    public void drenar() {
        if (!vazia && fervida) {
            vazia = true;  // A caldeira fica vazia após drenar
            System.out.println("A caldeira foi drenada. A mistura fervida foi enviada para a próxima etapa.");
        } else if (vazia) {
            System.out.println("Erro: Não é possível drenar uma caldeira vazia!");
        } else {
            System.out.println("Erro: A mistura ainda não foi fervida!");
        }
    }

    // Checar o estado da caldeira
    public boolean isVazia() {
        return vazia;
    }

    public boolean isFervida() {
        return fervida;
    }
}
