package br.ulbra.projetoEscola;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Gerenciador {

    public ArrayList<Integer> lista;
    public ArrayList<Integer> listaDesordem;
    public Gerenciador() {
        lista = new ArrayList();
        listaDesordem = new ArrayList<>();
    }

    public void adicionar(int n) {
        lista.add(n);
        JOptionPane.showMessageDialog(null, n + " adiconado com sucesso!");
    }

    public void remover(int i) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista está vazia!");
        } else if (i < 0 || i >= lista.size()) {
            JOptionPane.showMessageDialog(null, "Indice inexistente!");
        } else {
            lista.remove(i);
            JOptionPane.showMessageDialog(null, "Número removido com sucesso!");
        }
    }

    public void atulizar(int i, int num) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia!");
        } else if (i < 0 || i >= lista.size()) {
            JOptionPane.showMessageDialog(null, "Indice inexistente!");
        } else {
            lista.set(i, num);
            JOptionPane.showMessageDialog(null, "Número atualizado co sucesso!");
        }
    }

    public String listar() {
        String visLista = " ";
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista está vazia");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                visLista += (i + 1) + "-" + lista.get(i) + "\n";
            }
        }
        return visLista;
    }

    public String listarPar() {
        String listaPar = "";
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista está vazia");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) % 2 == 0) {
                    listaPar += (i + 1) + "-" + lista.get(i) + "\n";
                }
            }
        }
        return listaPar;
    }

    public String listarImpar() {
        String listaImpar = "";
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista está vazia");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) % 2 != 0) {
                    listaImpar += (i + 1) + "-" + lista.get(i) + "\n";
                }
            }
        }
        return listaImpar;
    }

    public String buscar(int n) {
       int num =n;
       int cont=0;
       int numero;
       if(lista.isEmpty()){
           JOptionPane.showMessageDialog(null, "Lista vazia");
       }
       else{
           for(int i=0;i<lista.size();i++){
               numero = lista.get(i);
               if(n==numero){
               num = n;
               cont++;
               }
               else{
                  return "Número não está na lista";
               }
           }
       }
       return "O número "+num+ " está na lista "+cont+" vezes";
    }

    public int retornarElemento(int n){
        return lista.get(n);
    }
    public double calcularMedia() {
        double acum = 0, media = 0;
        for (int i = 0; i < lista.size(); i++) {
            acum = acum + lista.get(i);
        }
        media = acum / lista.size();
        return media;
    }

    public int descobrirMaior() {
        int maiorNum = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) >= maiorNum) {
                maiorNum = lista.get(i);
            }
        }
        return maiorNum;
    }

    public int descobrirMenor() {
        int menorNum = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) <= menorNum) {
                menorNum = lista.get(i);
            }
        }
        return menorNum;
    }

    public void ordenarOriginal() {
        Collections.sort(listaDesordem);
    }
    public String listarDesordem() {
        String visLista = " ";
        if (listaDesordem.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista está vazia");
        } else {
            for (int i = 0; i < listaDesordem.size(); i++) {
                visLista += (i + 1) + "-" + listaDesordem.get(i) + "\n";
            }
        }
        return visLista;
    }
    public void retornarOrdem(){
        String listar="";
        for(int i=0;i<listaDesordem.size();i++){
            listar +=(i+1)+" - "+listaDesordem.get(i)+"\n";
        }
    }
    public void adicionar2(int n) {
        listaDesordem.add(n);
    }
    }

