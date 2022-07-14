package aula3;

import java.util.ArrayList;

public class Matriz {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

        int c=2;

        for(int i = 0; i < c; i++){
            matriz.add(new ArrayList<>());
        }

        matriz.get(0).add(1);
        matriz.get(0).add(1);
        matriz.get(0).add(15);
        matriz.get(1).add(4);
        matriz.get(1).add(2);
        matriz.get(1).add(18);
        
        System.out.println(matriz.get(0));
        System.out.println(matriz.get(1));

        double y=((matriz.get(1).get(0) * matriz.get(0).get(2)) - matriz.get(1).get(2)) / ((matriz.get(1).get(0)*matriz.get(0).get(1))+matriz.get(1).get(1));
        System.out.println(y);
        double x = (matriz.get(0).get(2) - y);
        System.out.println((x));
    }
}