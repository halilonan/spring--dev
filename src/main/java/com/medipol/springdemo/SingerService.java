package com.medipol.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SingerService {

    public List<Singer> singers = new ArrayList<>();
    public List<Song> songList = new ArrayList<Song>();

    @Autowired
    public SingerService(){

         Singer erdem = new Singer(1l, "erdem", "deniz");
         singers.add(erdem);
         Singer halil = new Singer(4l, "halil", "onan");
         singers.add( halil );

        Song song1 = new Song("Du hast");
        Song song2 = new Song("İch will");

        songList.add(song1);
        songList.add(song2);

        erdem.songList.add( song1 );
        halil.songList.add( song2 );

    }

    public List<Singer> findSinger(){
        return singers;
    }

    public List<Singer> findSingersById(Long id){

        for (Singer singer : singers) {
            if (singer.getId().equals(id)){

                List<Singer> res = new ArrayList<>();
                res.add(singer);

                return res;
            }
        }
        return new ArrayList<>();
    }
}

