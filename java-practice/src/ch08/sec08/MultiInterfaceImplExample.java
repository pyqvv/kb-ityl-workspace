package ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        SmartTelevision st = new SmartTelevision();

        RemoteControl rc = st;
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = st;
        searchable.search("https://www.youtube.com");
    }
}
