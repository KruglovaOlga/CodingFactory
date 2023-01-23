package gr.aueb.cf.ch18.cliserv;

public class EchoCli {

    public static void main(String[] args) {
        EchoServ serv = new EchoServ();
        String request = "Hi";
        String response;

        System.out.println("Request: " + request);
        response = serv.echo(request);
        System.out.println(response);
    }
}
