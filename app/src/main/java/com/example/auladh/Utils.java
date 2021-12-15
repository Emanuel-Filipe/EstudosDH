package com.example.auladh;

import android.widget.EditText;

public class Utils {
    public float converteValor(EditText caixaDeTexto){
        float valorMedia = Float.parseFloat(caixaDeTexto.getText().toString());
        return valorMedia;
    }
    public float calcularMedia(EditText notaP, EditText notaS, EditText notaT, EditText notaQ){
        float notaPrimeiroConvertida = converteValor(notaP);
        float notaSegundoConvertida = converteValor(notaS);
        float notaTerceiroConvertida = converteValor(notaT);
        float notaQuartoConvertida = converteValor(notaQ);
        float notasSomadas = notaPrimeiroConvertida + notaSegundoConvertida + notaTerceiroConvertida
                + notaQuartoConvertida;
        float media = notasSomadas / 4;
        return media;
    }
}
