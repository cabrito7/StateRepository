/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos_music.player;

/**
 *
 * @author carlosmamut1
 */
public class StoppedState implements State {
    private MusicProducer context;

    public StoppedState(MusicProducer context) {
        this.context = context;
    }

    @Override
    public void play() {
        System.out.println("Starting playback...");
        context.changeState(new PlayingState(context));
    }

    @Override
    public void pause() {
        System.out.println("Cannot pause — music is stopped.");
    }

    @Override
    public void stop() {
        System.out.println("Already stopped.");
    }

    @Override
    public void next() {
        System.out.println("Cannot skip — music is stopped.");
    }
}

