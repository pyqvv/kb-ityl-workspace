package oop.basic.tv;

public class Tv {
    String color;
    boolean power;
    int channel;

    Tv(){
        color = "black";
        power = false;
        channel = 0;
    }

    void power() {
        power = !power;
    }

    void channelUp() {
        this.channel++;
    }


    void channelDown() {
        this.channel--;
    }

    void print() {
        System.out.printf("color: %s\t power: %-5b\t channel: %d\n", color, power, channel);
    }
}
