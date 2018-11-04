/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REMIDI;

/**
 *
 * @author Bamz Dnr
 */
public class komputer {
    private String merk;
    private String tipe;
    private mouse Mouse;
    private keyboard Keyboard;
    private cpu Cpu;
    
    public komputer(String merk, String tipe){
        this.merk = merk;
        this.tipe = tipe;
    }
    
    public komputer (mouse Mouse, keyboard Keyboard, cpu Cpu){
        this.Mouse = Mouse;
        this.Keyboard = Keyboard;
        this.Cpu = Cpu;
    }
}
