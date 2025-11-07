/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos_music.player;

/**
 *
 * @author carlosmamut1
 */
public interface State {
    void play();
    void pause();
    void stop();
    void next(); 
}
