/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefania
 */
public class Main {
    
    public static void main(String[] args) {
        InfixToPostFix fx  = new  InfixToPostFix();
        String exp = "1+2*9";
        System.out.println("Infix Expression: " + exp);
        System.out.println("Postfix Expression: " + fx.infixToPostFix(exp));
    }
}
  
