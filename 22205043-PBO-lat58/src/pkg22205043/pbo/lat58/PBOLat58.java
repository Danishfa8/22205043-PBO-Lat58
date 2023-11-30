/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205043.pbo.lat58;

class Bilangan {

    private int x;
    private int y;

    public Bilangan() {
        this.x = 3;
        this.y = 4;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class JumlahBilangan extends Bilangan {

    public void tampilHasilJumlah() {
        System.out.println("Hasil Perjumlahan = " + (getX() + getY()));
    }
}

class SelisihBilangan extends Bilangan {

    public void tampilSelisih() {
        System.out.println("Hasil Selisih " + getX() + " - " + getY() + " = "
                + (getX() - getY()));
    }

}

public class PBOLat58 {

    public static void main(String[] args) {
        JumlahBilangan bil = new JumlahBilangan();
        bil.tampilHasilJumlah();

        SelisihBilangan blg = new SelisihBilangan();
        blg.tampilSelisih();
    }

}
