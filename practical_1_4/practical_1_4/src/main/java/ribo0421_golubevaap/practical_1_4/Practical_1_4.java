/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ribo0421_golubevaap.practical_1_4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Practical_1_4 {

    public static void main(String[] args) {
//        Вариант 3. Разработать программу, описывающую с помощью ООП
//сущность ВРАЧ (Doctor). Иерархия классов для сущности должна иметь
//минимум два уровня. Для класса необходимо описать минимум три свойства
//(поля) и три метода (можно больше). Тип объекта, а также значения для
//полей вводит пользователь с клавиатуры после старта программы. В
//результате работы программы необходимо вывести на экран все значения
//полей объекта через запятую.
        Scanner scan = new Scanner(System.in);
        System.out.println("Имя: ");
        String name = scan.nextLine();
        System.out.println("Возраст: ");
        int age  = scan.nextInt();
        System.out.println("Степень образования: ");
        String education  = scan.nextLine();
        System.out.println("Он хирург? (true/false): ");
        boolean surgery  = scan.nextBoolean();
        if (surgery) {
            System.out.println("Опыт работы: ");
            int work_exp = scan.nextInt();
            Surgery surg = new Surgery(work_exp, name, age, education);
            System.out.println();
            System.out.println(surg.getName()+", "+surg.getAge()+", " + 
                surg.getEducation()+", "+ surg.getWorkexp());
        }
        else {
            Doctor doc = new Doctor(name, age, education);
            System.out.println(doc.getName()+", "+doc.getAge()+", " + 
                doc.getEducation());
        }
    }
}
