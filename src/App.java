/*
* File: App.java
* Author: Reiter Milán
* Copyright: 2024, Reiter Milán
* Group: Szoft II/I/N
* Date: 2024-10-02
* Github: https://github.com/Milus03
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        Network halozat = new Network();
        halozat.connectToNetwork("UltimateBasketballNet");
        halozat.disconnectFromNetwork();
    }
}
