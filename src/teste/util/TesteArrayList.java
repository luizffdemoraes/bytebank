package teste.util;

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TesteArrayList {

    public static void main(String[] args) {

        List<Conta> lista = new Vector<>(); // tread safe

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22 ,22);
        lista.add(cc2);

        System.out.println(lista.size());
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 333);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(44 ,444);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++) {
            Conta oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("-----------------");

        for (Conta o : lista) {
            System.out.println(o);
        }


        /*
        // Generics
        ArrayList<Conta> lista = new ArrayList();

        ArrayList<String> nomes = new ArrayList<String>();


         */
    }
}