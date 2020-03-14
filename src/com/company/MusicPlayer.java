package com.company;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;

public class MusicPlayer extends Song implements Actions {

    private FileInputStream mp3;
    private Player player;

    public MusicPlayer(Song song) {
        super(song);

        try  {

            this.mp3 = new FileInputStream(this.getPath());
            this.player = new Player(this.mp3);

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("No se pudo abrir el archivo");
        }
    }

    @Override
    public void stop() {
        this.player.close();
    }

    @Override
    public void play() {
        try {
            this.player.play();
            if (this.player.isComplete()){
                stop();
            }
        } catch (JavaLayerException e) {
            e.printStackTrace();
            System.out.println("No se pudo reproducir el archivo");
        }
    }

    @Override
    public void info() {
        System.out.println("Album: "+this.getAlbum());
        System.out.println("Artista: "+this.getArtist());
        System.out.println("Comentarios: "+this.getComment());
        System.out.println("Compositor: "+this.getComposer());
        System.out.println("Titulo: "+this.getTitle());
        System.out.println("Track: "+this.getTrack());
        System.out.println("Año: "+this.getYear());
    }

}
