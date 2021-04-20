import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

class PalindromeQueue{
    public static void main(String[] args) {

        //inputan untuk memasuknan kata
    	System.out.print("Masukkan kata apapun : ");

        //instance object class scanner
        Scanner in=new Scanner(System.in);

        String inputString = in.nextLine();
        Queue queue = new LinkedList();

        //mengambil nilai string ketika dibalik
        for (int i = inputString.length()-1; i >=0; i--) {
            queue.add(inputString.charAt(i));
        }

        String reverseString = "";

        //melakukan perulangan utk menentukan kata palindrom atau tidak
        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }

        if (inputString.equals(reverseString))
            System.out.println("Adalah kata palindrom");
        else
            System.out.println("Bukan kata palindrom");

    }
}