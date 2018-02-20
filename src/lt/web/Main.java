package lt.web;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:7779/obj", new WebInterfaceImpl());

    }
}
