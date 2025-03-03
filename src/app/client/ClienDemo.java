package app.client;

import app.commons.CommonUtils;

public class ClienDemo {

    public static void main(String[] args) {
        var clients = 5;
        for (int i = 0; i < clients; i++) {
            Client.connectToServer();
        }

        CommonUtils.getClientNames()
                .forEach(clientName ->
                        Client.sendCommandToServer("exit %s".formatted(clientName)));
    }
}