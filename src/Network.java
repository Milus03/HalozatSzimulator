/*
* File: Network.java
* Author: Reiter Milán
* Copyright: 2024, Reiter Milán
* Group: Szoft II/I/N
* Date: 2024-10-02
* Github: https://github.com/Milus03
* Licenc: GNU GPL
*/

public class Network implements Connectable {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Sikeresen csatlakoztál az alábbi hálózathoz: " + networkName);
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Sikeresen lecsatlakoztál a hálózatról.");
    }

}
