package com.example.loop.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.loop.controller.LoopRequest;
import com.example.loop.service.LoopService;

@Service
public class LoopServiceImpl implements LoopService{

    @Override
    public List<List<String>> solucion(LoopRequest entrada) {
        List<String> casos = entrada.getCasos();
        //["0 2 10","5 3 5"]

        List<List<String>> devuelveLista = new ArrayList<List<String>>(); // almacena el resultado de cada operación
        for(int i=0;i<casos.size();i++){  //i=0 hasta i=1
            //devuelveLista = new ArrayList<>();
            String caso = casos.get(i);//["0" "2" "10"] cuando es 0 y ["5" "3" "5"] cuando es 1
            String[] valores = caso.split(" ");//["0","2";"10"] cuando es 0
            Integer a = Integer.valueOf(valores[0]);//0
            Integer b = Integer.valueOf(valores[1]);//2
            Integer n = Integer.valueOf(valores[2]);//10
            System.out.println("a: "+a);
            System.out.println("b: "+b);
            System.out.println("n: "+n);

            Double resultado=0.0;
            Double resultado1=0.0;
            Double resultado2= a + 0.0;
            Double dosElevado = (double) 2 ;
            List<String> devuelveLista1 = new ArrayList<String>();
            for (int j=0;j<n;j++){
                
                resultado = Math.pow(dosElevado , (double) j); // 2 elevado a la 0, a la 1, a la 2 y a la n-1
                System.out.println("resultado: "+resultado);
                resultado1 =  resultado2 + (double) + (resultado * b); //8 14 26
                System.out.println("resultado1: "+resultado1);
                devuelveLista1.add(String.valueOf(resultado1));
                System.out.println("Lista: "+devuelveLista);
                resultado2= resultado1; // 8 14 26
                System.out.println("resultado2: "+resultado2);
            }
            devuelveLista.add(devuelveLista1);            

        }
        return devuelveLista;
    }
}
