package rpg;

import javax.microedition.midlet.MIDlet;

public class GameMIDlet extends MIDlet {
    public static GameMIDlet instance; // a
    private Display display; // a
    public boolean running; // a

    public GameMIDlet(){
        this.instance = this;
    }

    public void startApp(){
        if(!this.running){
            this.running = true;
            this.display = Display.getDisplay((MIDlet)this);
            // bs.a(this.a)
        }
    }
}