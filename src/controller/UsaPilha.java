package controller;

import model.PilhaHeap;

public class UsaPilha {
    public static void main(String[] args) {
        PilhaHeap pil = new PilhaHeap();
        
        pil.push("Sara");
        pil.plotar();
        pil.push("Ester");
        pil.plotar();
        pil.push("Raquel");
        pil.plotar();
        
        pil.pop(); 
        pil.plotar();
        pil.pop(); 
        pil.plotar();
        pil.pop(); 
        pil.plotar();
    }
}