/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kleyton;

/**
 *
 * @author SATC
 */
public enum Bebidas {
    cocacola("Coca-cola 2L " , "Bebida gelada de dois litros sabor cola " , 2000 ,(float) 6.00),
    cocacola2("Coca-cola 600ml " , "Bebida gelada de 600 ml sabor cola " , 600 ,(float) 3.00),
    guarana("Guaraná 2L " , "Bebida gelada de dois litros sabor Guaraná " , 2000 ,(float) 5.00),
    guarana2("Guaraná 600ml " , "Bebida gelada de 600 ml sabor Guaraná " , 600 ,(float) 2.50),
    pepsi("Pepsi 2L " , "Bebida gelada de dois litros sabor cola " , 2000 ,(float) 5.00),
    pepsi2("Pepsi 600ml " , "Bebida gelada de 600 ml sabor cola " , 600 ,(float) 2.50),
    fanta("Fanta 2L " , "Bebida gelada de dois litros sabor laranja " , 2000 ,(float) 4.50),
    fanta2("Fanta 600ml " , "Bebida gelada de 600 ml sabor laranja " , 600 ,(float) 2.00),
    dolly("Dolly 2L " , "Bebida gelada de dois litros sabor Guaraná paraguáio " , 2000 ,(float) 3.00),
    dolly2("Dolly 600ml " , "Bebida gelada de 600 ml sabor Guaraná paraguáio " , 600 ,(float) 0.99);
    private String nome;
    private String descricao;
    private int ml;
    private float valor;

    private Bebidas(String nome, String descricao, int ml, float valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.ml = ml;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Bebidas{" + "\nnome=" + nome + ", descricao=" + descricao + ", ml=" + ml + ", valor=" + valor + '}';
    }

    
    
    public static Bebidas getCocacola() {
        return cocacola;
    }

    public static Bebidas getCocacola2() {
        return cocacola2;
    }

    public static Bebidas getGuarana() {
        return guarana;
    }

    public static Bebidas getGuarana2() {
        return guarana2;
    }

    public static Bebidas getPepsi() {
        return pepsi;
    }

    public static Bebidas getPepsi2() {
        return pepsi2;
    }

    public static Bebidas getFanta() {
        return fanta;
    }

    public static Bebidas getFanta2() {
        return fanta2;
    }

    public static Bebidas getDolly() {
        return dolly;
    }

    public static Bebidas getDolly2() {
        return dolly2;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getMl() {
        return ml;
    }

    public float getValor() {
        return valor;
    }

    
}
