package br.com.alura.musicapp.models;

public class MyFavorites {

    public void add(Audio audio) {
        if (audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTitle() + " é uma excelente opcao para ser ouvido!");
        }
    }
}
