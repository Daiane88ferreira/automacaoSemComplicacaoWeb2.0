package br.com.chronosacademy.media;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MediaTest {
    //Aprovado
    //Reprovado

    @Test
    public void validaprovado() {
        Media media = new Media();
        String resultado = media.calculaMedia(5.0,5.0);
        assertEquals( "Aprovado", resultado);

    }
    @Test
    public void validaReprovado(){
        Media media =new Media();
        String resultado = media.calculaMedia(2.0,5.0);
        assertEquals("Reprovado", resultado);

    }


}
