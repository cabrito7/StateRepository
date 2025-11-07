/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos_music.player;

/**
 *
 * @author carlosmamut1
 */
public class Client {
    public static void main(String[] args) {
        MusicProducer player = new MusicProducer();

        player.play();   // Starts playing
        player.pause();  // Pauses
        player.next();   // Skips (paused)
        player.play();   // Resumes
        player.stop();   // Stops
        player.next();   // Invalid (stopped)
    }
}

