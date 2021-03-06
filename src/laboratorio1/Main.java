/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal desde donde se genera el menu que se le mostrara al cliente y sera creando todo el pedido
 * @author Diego Alejandro Gutierrez Rojas
 * @author Lina Paola Correa Ballen
 * @author Diego Alexander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int basePizza = 0;
        int opc1 = 1;
        int tam;
        int tamP;
        int tamB;
        int tamaño;
        int tipo;
        int sumad = 0;
        int sumap = 0;
        int sumab = 0;
        ArrayList<DoItYourself> doit = new ArrayList<>();
        ArrayList<Prefab> prefab = new ArrayList<>();
        ArrayList<Bebidas> bebidas = new ArrayList<>();
        Cobertura pollo = new Cobertura("Pollo", 1000);
        Cobertura champi = new Cobertura("Champiñones", 2000);
        Cobertura queso = new Cobertura("Queso", 3000);
        Cobertura carne = new Cobertura("Carne", 4000);
        Prefab hawaiana = new Prefab(5500, "Hawaiana");
        Prefab polloChampi = new Prefab(6000, "Pollo con campiñones");
        Prefab peperoni = new Prefab(5000, "Peperoni");
        Prefab vegetariana = new Prefab(7000, "Vegetariana");
        Bebidas cocaCola = new Bebidas("CocaCola", 500);
        Bebidas limonada = new Bebidas("Limonada", 200);
        Bebidas cerveza = new Bebidas("Cerveza", 600);
        while (opc1 != 0) {
            System.out.println("1. Agregar pizza DoItYourself, 2. Agregar pizza prefab,"
                    + " 3. Agregar bebida, 0. Terminar pedido");
            opc1 = sc.nextInt();
            while (opc1 != 1 && opc1 != 2 && opc1 != 3 && opc1 != 0) {
                System.out.println("Valor equivocado, porfavor ingrese un valor valido.");
                System.out.println("1. Agregar pizza DoItYourself, 2. Agregar pizza prefab,"
                        + " 3. Agregar bebida, 0. Terminar pedido");
                opc1 = sc.nextInt();
            }
            switch (opc1) {
                case 1:
                    System.out.println("Base de la pizza: 1. Corteza profunda, 2. Base crujiente");
                    base = sc.nextInt();
                    while (base != 1 && base !=2) {                        
                        System.out.println("Valor equivocado, porfavor ingrese un valor valido.");
                        System.out.println("Base de la pizza: 1. Corteza profunda, 2. Base crujiente");
                        base = sc.nextInt();
                    }
                    switch(base){
                        case 1:
                            basePizza = 1;
                            break;
                        case 2:
                            basePizza = 2;
                            break;
                    }
                    System.out.println("Tamaño de la pizza: 1. 6 pulgadas, 2. 9 pulgadas, 3. 12 pulgadas");
                    tam = sc.nextInt();
                    while (tam != 1 && tam != 2 && tam != 3) {
                        System.out.println("Valor equivocado, porfavor ingrese un valor valido.");
                        System.out.println("Tamaño de la pizza: 1. 6 pulgadas, 2. 9 pulgadas, 3. 12 pulgadas");
                        tam = sc.nextInt();
                    }
                    switch (tam) {
                        case 1:
                            doit.add(new DoItYourself(6, basePizza));
                            break;
                        case 2:
                            doit.add(new DoItYourself(9, basePizza));
                            break;
                        case 3:
                            doit.add(new DoItYourself(12, basePizza));
                            break;
                    }
                    CoberturaPizza obj = new CoberturaPizza(doit.get(doit.size() - 1));
                    int cober = 10;
                    while (cober != 0) {
                        System.out.println("Coberturas: 1. Pollo, 2. Champiñones, 3. Queso,"
                                + " 4. Carne, 0. No agregar mas cobertura");
                        cober = sc.nextInt();
                        while (cober != 1 && cober != 2 && cober != 3 && cober != 4 && cober != 0) {
                            System.out.println("Valor equivocado, porfavor ingrese un valor valido.");
                            System.out.println("Coberturas: 1. Pollo, 2. Champiñones, 3. Queso,"
                                    + " 4. Carne, 0. No agregar mas cobertura");
                            cober = sc.nextInt();
                        }
                        switch (cober) {
                            case 1:
                                obj.addCoberturaDoIt(doit.get(doit.size() - 1), pollo);
                                break;
                            case 2:
                                obj.addCoberturaDoIt(doit.get(doit.size() - 1), champi);
                                break;
                            case 3:
                                obj.addCoberturaDoIt(doit.get(doit.size() - 1), queso);
                                break;
                            case 4:
                                obj.addCoberturaDoIt(doit.get(doit.size() - 1), carne);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Valor erroneo de cobertura");
                                break;
                        }
                    }
                    System.out.println("Precio pizza DoItYourself: " + doit.get(doit.size() - 1).getPrecioTotal());
                    break;
                case 2:
                    System.out.println("Tipo de pizza prefab: 1. Hawaiana, 2. Pollo con champiñones,"
                            + " 3. Peperoni, 4. Vegetariana");
                    tipo = sc.nextInt();
                    while (tipo != 1 && tipo != 2 && tipo != 3 && tipo != 4) {
                        System.out.println("Valor equivocado, porfavor ingrese un valor valido.");
                        System.out.println("Tipo de pizza prefab: 1. Hawaiana, 2. Pollo con champiñones,"
                            + " 3. Peperoni, 4. Vegetariana");
                        tipo = sc.nextInt();
                    }
                    switch (tipo) {
                        case 1:
                            prefab.add(hawaiana);
                            break;
                        case 2:
                            prefab.add(polloChampi);
                            break;
                        case 3:
                            prefab.add(peperoni);
                            break;
                        case 4:
                            prefab.add(vegetariana);
                            break;
                    }
                    CoberturaPizza pzp = new CoberturaPizza(prefab.get(prefab.size() - 1));
                    System.out.println("Base de la pizza: 1. Corteza profunda, 2. Base crujiente");
                    base = sc.nextInt();
                    while (base != 1 && base !=2) {                        
                        System.out.println("Valor equivocado, porfavor ingrese un valor valido.");
                        System.out.println("Base de la pizza: 1. Corteza profunda, 2. Base crujiente");
                        base = sc.nextInt();
                    }
                    switch(base){
                        case 1:
                            basePizza = 1;
                            break;
                        case 2:
                            basePizza = 2;
                            break;
                    }
                    System.out.println("Tamaño de la pizza: 1. 6 pulgadas, 2. 9 pulgadas, 3. 12 pulgadas");
                    tamaño = sc.nextInt();
                    while (tamaño != 1 && tamaño != 2 && tamaño != 3) {
                        System.out.println("Valor equivocado, porfavor ingrese un valor valido.");
                        System.out.println("Tamaño de la pizza: 1. 6 pulgadas, 2. 9 pulgadas, 3. 12 pulgadas");
                        tamaño = sc.nextInt();
                    }
                    switch (tamaño) {
                        case 1:
                            tamP = 6;
                            pzp.addCoberturaPrefab(prefab.get(prefab.size() - 1), tamP, basePizza);
                            break;
                        case 2:
                            tamP = 9;
                            pzp.addCoberturaPrefab(prefab.get(prefab.size() - 1), tamP, basePizza);
                            break;
                        case 3:
                            tamP = 12;
                            pzp.addCoberturaPrefab(prefab.get(prefab.size() - 1),tamP, basePizza);
                            break;
                    }
                    System.out.println("Precio de la pizza prefab: "
                            + prefab.get(prefab.size() - 1).getPrecioTotal());
                    break;
                case 3:
                    System.out.println("Sabor de la bebida: 1. Coca Cola, 2. Limonada, 3. Cerveza");
                    tipo = sc.nextInt();
                    while (tipo != 1 && tipo != 2 && tipo != 3) {
                        System.out.println("Valor equivocado, porfavor ingrese un valor valido.");
                        System.out.println("Sabor de la bebida: 1. Coca Cola, 2. Limonada, 3. Cerveza");
                        tipo = sc.nextInt();
                    }
                    switch (tipo) {
                        case 1:
                            bebidas.add(cocaCola);
                            break;
                        case 2:
                            bebidas.add(limonada);
                            break;
                        case 3:
                            bebidas.add(cerveza);
                            break;
                    }
                    PrecioBebida precBebida = new PrecioBebida(bebidas.get(bebidas.size() - 1));
                    System.out.println("Tamaño de la bebida: 1. Bebida pequeña, 2. Bebida grande");
                    tamaño = sc.nextInt();
                    while (tamaño != 1 && tamaño != 2) {
                        System.out.println("Valor equivocado, porfavor ingrese un valor valido.");
                        System.out.println("Tamaño de la bebida: 1. Bebida pequeña, 2. Bebida grande");
                        tamaño = sc.nextInt();
                    }
                    switch (tamaño) {
                        case 1:
                            tamB = 1;
                            precBebida.PreciosBebida(bebidas.get(bebidas.size() - 1), tamB);
                            break;
                        case 2:
                            tamB = 2;
                            precBebida.PreciosBebida(bebidas.get(bebidas.size() - 1), tamB);
                            break;
                    }
                    System.out.println("Precio de la bebida: "
                            + bebidas.get(bebidas.size() - 1).getPrecioTotal());
                    break;
            }
        }
        for (int i = 0; i < doit.size(); i++) {
            sumad = sumad + doit.get(i).getPrecioTotal();
        }
        System.out.println("La precio de las pizzas DoItyourself es: " + sumad);
        for (int i = 0; i < prefab.size(); i++) {
            sumap = sumap + prefab.get(i).getPrecioTotal();
        }
        System.out.println("La precio de las pizzas prefab es: " + sumap);
        for (int i = 0; i < bebidas.size(); i++) {
            sumab = sumab + bebidas.get(i).getPrecioTotal();
        }
        System.out.println("El precio de las bebidas es: " + sumab);
        System.out.println("la suma total es: " + (sumad + sumap + sumab));
    }
}