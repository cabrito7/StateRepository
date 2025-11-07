/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos_music.player;

/**
 *
 * @author carlosmamut1
 */
public class MusicProducer {
    private State state;

    public MusicProducer() {
        this.state = new StoppedState(this); // default state
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void play() {
        state.play();
    }

    public void pause() {
        state.pause();
    }

    public void stop() {
        state.stop();
    }

    public void next() {
        state.next();
    }
}
