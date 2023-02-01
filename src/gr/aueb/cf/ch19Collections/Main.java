package gr.aueb.cf.ch19Collections;

public class Main {
    public static void main(String[] args) {
        var iNode = new Node<Integer>();
        Node<Integer> intNode = new Node<>();
        Node<String> strNode = new Node<>();

        for (var i = 0; i < 10; i++){
            System.out.println();
        }

        intNode.setItem(1);
        strNode.setItem("cf");


    }
}
