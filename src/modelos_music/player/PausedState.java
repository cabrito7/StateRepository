/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos_music.player;

/**
 *
 * @author carlosmamut1
 */
public class PausedState implements State {
    private MusicProducer context;

    public PausedState(MusicProducer context) {
        this.context = context;
    }

    @Override
    public void play() {
        System.out.println("Resuming music...");
        context.changeState(new PlayingState(context));
    }

    @Override
    public void pause() {
        System.out.println("Already paused.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music from paused state...");
        context.changeState(new StoppedState(context));
    }

    @Override
    public void next() {
        System.out.println("Skipping to next song (still paused)...");
    }
}

