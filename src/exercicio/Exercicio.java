/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author operador
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        int numero3;
        int maior;
        int menor;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numer:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha outro numero:"));

        numero3 = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "numero " + numero3);
        if (numero1 > numero2) {
            maior = numero1;
            menor = numero2;
            JOptionPane.showMessageDialog(null, "numero1 e maior" + numero1);
            //else senão 
        } else {
            maior = numero2;
            menor = numero1;
            JOptionPane.showMessageDialog(null, " numero maior e " + numero2);

        }
        if (maior > numero3) {
            JOptionPane.showMessageDialog(null, "Maior numero " + maior);
        } else {
            JOptionPane.showMessageDialog(null, "Maior numero " + numero3);

        }
        if (menor < numero3) {
             JOptionPane.showMessageDialog(null, "Menor numero " + menor);
        }else{
          JOptionPane.showMessageDialog(null, "Menor numero " + numero3);
    }
  }
}