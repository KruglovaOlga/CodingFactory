package gr.aueb.cf.ch19Collections;

public class NodeFlexibleApp {

    public static void main(String[] args) {
        NodeFlexible head = new NodeFlexible();
        head.setItem("CF");
        int data = (int) head.getItem();

        System.out.println(data);
    }
}
