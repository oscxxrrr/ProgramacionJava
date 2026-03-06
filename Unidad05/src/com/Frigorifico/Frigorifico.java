package com.Frigorifico;

import java.util.ArrayList;
import java.util.List;

public class Frigorifico {
    public List<String> comida;
    public int temperatura;

    public Frigorifico(){
        this(8);

    }

    public Frigorifico(int t){
        if (t<0 || t > 10){
            this.temperatura = 5;
        }else {
            this.temperatura = t;
        }
        this.comida = new ArrayList<>();
    }
}
