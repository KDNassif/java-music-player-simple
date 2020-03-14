package com.company;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.Mp3File;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        File folder = new File("/home/dev-nassif/IdeaProjects/musicPlayer/resource/songs");
        File[] list = folder.listFiles();

        ArrayList<MusicPlayer> listSongs = new ArrayList<>();

        for (final File file : list) {
            try {
                Mp3File mp3file = new Mp3File(file.getAbsolutePath());
                if (mp3file.hasId3v2Tag()) {
                    ID3v2 id3v2Tag = mp3file.getId3v2Tag();
                    Song s = new Song();
                    s.setTrack(id3v2Tag.getTrack());
                    s.setArtist(id3v2Tag.getArtist());
                    s.setTitle(id3v2Tag.getTitle());
                    s.setAlbum(id3v2Tag.getAlbum());
                    s.setYear(id3v2Tag.getYear());
                    s.setComment(id3v2Tag.getComment());
                    s.setComposer(id3v2Tag.getComposer());
                    s.setArtist(id3v2Tag.getAlbumArtist());
                    s.setPath(file.getAbsolutePath());

                    listSongs.add(new MusicPlayer(s));
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Problemas con el archivo");
            }
        }

        listSongs.forEach((i)->{
            i.info();
            i.play();
        });
    }

}
