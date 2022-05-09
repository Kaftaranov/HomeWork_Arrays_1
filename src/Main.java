import java.sql.SQLOutput;
import java.util.Random;

public class Main {

       public static void main(String[] args) {
           Random random = new Random();                                       //Метод для генерации случайных чисел
           int[] finArray = new int[30];                                       //Объявление массива бух. записей
           int monthExpenses = 0;                                              //Должна быть проинициализирована сразу
           int minValue;                                                       //Эти будут проинициализированы
           int maxValue;                                                       //непосредственно перед использованием
           float avgValue;
           char[] reverseFullName = {'r','u', 'm', 'i', 'T', ' ', 'v','o','n','a','r', 'a', 't', 'f', 'a', 'K'};

           for (int i =0; i < finArray.length; i++) {
               finArray[i] = random.nextInt(100_000) + 100_000;          //Инициализация массива
               System.out.print(finArray[i] + " ");                            //Вывод на печать содержимого массива
               if (i == 14) { System.out.println();}                           //и его форматирование
              }
           System.out.println();
           System.out.println("----------------------------------------------------------------------------------");
// Задача №1
           for (int dailyExpenses : finArray) {monthExpenses += dailyExpenses;}       //Общие затраты за месяц
           System.out.println("Total expenses for last month is " + monthExpenses);
// Задача №2
           maxValue = minValue = finArray[0];                               // Инициализация макс. и мин. значений
           for (int dailyExpenses : finArray)
           {                                                                // Поиск
               if (dailyExpenses > maxValue) maxValue = dailyExpenses;      // максимального и
               if (dailyExpenses < minValue) minValue = dailyExpenses;      // минимального значения
           }
           System.out.println("Minimum daily expense is " + minValue);
           System.out.println("Maximum daily expense is " + maxValue);
// Задача №3
           System.out.println("Average daily expense is " + monthExpenses/30);  // Средние затраты в день
           System.out.println("----------------------------------------------------------------------------------");
// Задача №4
           for (int i = reverseFullName.length - 1; i >= 0; i--)
           {
               System.out.print(reverseFullName[i]);
           }
           System.out.println();
           System.out.println("----------------------------------------------------------------------------------");
           System.out.println("Homework 'Arrays, Part 2' complete. Congratulations!");
           }
       }




