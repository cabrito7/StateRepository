/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos_music.player;

/**
 *
 * @author carlosmamut1
 */
public class PlayingState implements State {
    private MusicProducer context;

    public PlayingState(MusicProducer context) {
        this.context = context;
    }

    @Override
    public void play() {
        System.out.println("Already playing music.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
        context.changeState(new PausedState(context));
    }

    @Override
    public void stop() {
        System.out.println("Stopping music...");
        context.changeState(new StoppedState(context));
    }

    @Override
    public void next() {
        System.out.println("Skipping to next song...");
    }
}

