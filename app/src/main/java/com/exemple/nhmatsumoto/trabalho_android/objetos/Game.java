package com.exemple.nhmatsumoto.trabalho_android.objetos;

import android.util.Log;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {

    private ArrayList<Integer> fase1 = new ArrayList();
    
    //{1,2,3,4,1,2,3,4 };
    private int[] fase2 = {1,3,1,3,1,3,1,3 };
    private int[] fase3 = {4,1,1,2,3,3,3,1 };
    private int[] fase4 = {1,2,3,4,1,2,3,4 };
    private int[] fase5 = {4,3,2,1,1,2,3,4 };


    public void inputSequencia(int fase, int[] inputSequencia){

        for(int i = 0; i<=5;i++){
            if(inputSequencia[i] == fase1[i]){

                return true;
            }

        }
    }

    public void comparaSequencia(){

    }

    public void validaInput(int entrada){

    }




}
