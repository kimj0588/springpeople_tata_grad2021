import java.util.Scanner;

public class Main {
    public static void main(String args[]){
//        Product 1 - 22.50
//        Product 2 - 44.50
//        Product 3 - 9.98
        int prouductNumber = 0;
        int qtySold = 0;
        double totalPrice = 0;
        Scanner myObj = new Scanner(System.in);
        while(true){
            String str = myObj.nextLine();
            if(str.equals("")){
                break;
            }
            String[] splitted = str.split(" ");
            prouductNumber = Integer.parseInt(splitted[0]);
            qtySold = Integer.parseInt(splitted[1]);
            switch (prouductNumber){
                case 1: totalPrice+=qtySold*22.50;
                        break;
                case 2: totalPrice+=qtySold*44.50;
                        break;
                case 3: totalPrice+=qtySold*9.98;
                        break;
                default:totalPrice+=0.0;
                        break;
            }
        }

        System.out.println(totalPrice);

    }
}
