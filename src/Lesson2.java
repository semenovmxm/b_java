public class Lesson2 {
    public static void main(String[] args) {
        String[][] clients = new String[4][3];
        clients[0] = new String[]{"ivan", "male", "35"};
        clients[1] = new String[]{"dana", "female", "26"};
        clients[2] = new String[]{"sasha", "male", "18"};
        clients[3] = new String[]{"nana", "female", "42"};

        sort(clients);
        printBySex(clients, "male");
        printBySex(clients, "female");

    }

    private static void sort(String[][] clients) {
        for (int i = clients.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int current = Integer.parseInt(clients[j][2]);
                int next = Integer.parseInt(clients[j + 1][2]);
                if (current > next) {
                    String[] tmp = clients[j];
                    clients[j] = clients[j + 1];
                    clients[j + 1] = tmp;
                }
            }
        }
    }


    private static void printBySex(String[][] clients, String sex) {

        System.out.println("Printing clients with sex:");
        System.out.println(sex);
        System.out.println("------------");

        for (String[] client : clients) {

            if (client[1] == sex) {
                for (String s : client) {
                    System.out.println(s);
                }
            }
        }

        System.out.println("------------");
    }
}



