//Реализуйте класс Концерт, в котором разные артисты будут выходить на сцену и развлекать зрителей используя свои умения и талант.
package de.telran.home20240201.theater;

import java.util.ArrayList;
import java.util.List;

public class Concert <Template extends Artists> {
private final List<Template> artists;

    public Concert() {
        this.artists = new ArrayList<>();
    }
    public void addArtist(Template artist){
        artists.add(artist);
    }
    public void begin(){
        for(Template artist : artists){
            artist.artists();
        }
    }
}
