package client;

public class ClientFactory {

    public static Client makeClient(ClientType client) throws ClassNotFoundException {
        switch (client) {
            case LUNARCRUSH:
                return new LunarClient();
            default:
                throw new ClassNotFoundException();
        }
    }
}
