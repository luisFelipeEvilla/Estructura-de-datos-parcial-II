/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosparcial2;

public class Punto1 {

    private int[] numeros = {2, 2, 2, 2, 1, 5, 5, 4, 4, 4, 4, 4, 9, 9, 9, 7, 12, 7, 12, 12, 12, 25, 9, 25, 25, 25};

    private class Nodo {

        int num;
        boolean PTR;
        Nodo lLink;
        Nodo rLink;

        Nodo(int num, Nodo lLink, Nodo rlink) {
            this.num = num;
            this.lLink = lLink;
            this.rLink = rlink;
        }
    }

    Nodo PTR;

    private Nodo crearLista(Nodo PTR, int[] numeros) {
        PTR = new Nodo(numeros[0], null, null);
        Nodo p = PTR;
        for (int i = 1; i < numeros.length; i++) {
            p.rLink = new Nodo(numeros[i], p, null);
            p = p.rLink;
        }

        return PTR;
    }

    private Nodo solucion(Nodo PTR) {
        Nodo anterior = PTR;
        Nodo actual = anterior.rLink;
        Nodo siguiente = actual.rLink;

        while (siguiente != null) {
            if (anterior.num == actual.num && actual.num == siguiente.num) {
                if (siguiente.rLink != null) {
                    while (actual.num == siguiente.num) {
                        siguiente = siguiente.rLink;
                    }

                    while (anterior.num != siguiente.num) {
                        if (anterior.equals(PTR)) {
                            anterior = actual;
                            actual = actual.rLink;
                            PTR = anterior;
                        } else {
                            Nodo auxiliar = anterior.lLink;
                            anterior = actual;
                            auxiliar.rLink = anterior;
                            actual.lLink = auxiliar;
                            actual = actual.rLink;

                        }
                    }
                } else {
                    Nodo auxiliar = anterior.lLink;
                    auxiliar.rLink = null;
                    anterior = null;
                    actual = null;
                    siguiente = null;
                }

            } else {
                anterior = actual;
                actual = siguiente;
                siguiente = siguiente.rLink;
            }
        }
        return PTR;
    }

    private void imprimir(Nodo PTR) {
        Nodo p = PTR;
        while (p != null) {
            System.out.print(p.num + ", ");
            p = p.rLink;
        }
        System.out.println();
    }

    public Punto1() {
        this.PTR = crearLista(PTR, numeros);
        imprimir(PTR);
        this.PTR = solucion(PTR);
        imprimir(PTR);
    }
}
