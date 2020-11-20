package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(2.0 / 0.0);//В стандарте IEEE754(число с плавающей точкой) существует последовательность, принимаемая за бесконечность, поэтому она выводится вместо ошибки
        Exception2 except = new Exception2();
        try { //try пытается выполнить код, записанный в нем
            except.exceptionDemo();
        }
        catch (Exception exception){ //в случае возникновения какой-либо ошибки catch ловит ее и может как-то обработать, при этом программа не вылетает
            System.out.println (exception);
        }
        finally { //finally выполняется после окончания работы блока try/catch
            System.out.println("Программа завершила работу в связи с ошибкой");
        }
    }
}
class Exception2 { //Код из задания
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }
}