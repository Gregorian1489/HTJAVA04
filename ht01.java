/* Реализовать консольное приложение, которое:
   1. Принимает от пользователя строку вида text~num
   2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
   3. Если введено print~num, выводит строку из позиции num в связном списке.
   4. Если введено exit, завершаем программу        */


import java.util.Scanner;
import java.util.LinkedList;

public class ht01 {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        LinkedList<String> ResultArray = new LinkedList<>(); 

        while (true) {

        
        System.out.println("Введите строку: ");
        String text = in.nextLine();
        
        if (text.equals("exit")){
            break;
        } else {
        
        //in.close();
        
        String[] ArrayIn = text.split("~");      
        
        int index = Integer.parseInt(ArrayIn[1]);       // парсим второй элемент введеных данных (1 й эл-т массива)
        String command = ArrayIn[0];                    // создаем переменную, в которой хранится текстовая часть
        

        if (index > ResultArray.size() & !command.equals("print")){
            for (int i = ResultArray.size(); i < index; i++) {
                ResultArray.add(i, null);
            }
            ResultArray.set(index - 1, command);
            System.out.println(ResultArray.get(index - 1));      
        } else if (index <= ResultArray.size() & !command.equals("print")){
            System.out.println(ResultArray.set(index - 1, command));
        } else if (command.equals("print")){
            System.out.println(ResultArray.get(index - 1));
        }
        }
        continue;
    } 
    }
}
    
