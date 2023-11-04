package controller;

import fateczl.Lista.model.Lista;

public class newHash {
    private Lista<Integer>[] hash = new Lista[5];
    public newHash() {
        for (int i = 0; i < 5; i++) {
            hash[i] = new Lista<>();
        }
    }
    public void add(int num) throws Exception {
        int pos = hash(num);
        if(hash[pos].isEmpty()) {
            hash[pos].addFirst(num);
        }
        else{
            hash[pos].addLast(num);
        }
    }

    public void print() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.print("Hash " + i + " : ");
            for (int j = 0; j < hash[i].size(); j++) {
                if (!hash[i].isEmpty()) {
                    System.out.print(hash[i].get(j) + " -> ");
                }
            }
            System.out.print("null \n");
        }
    }

    private int hash(int num) {
        return num % 5;
    }
}
