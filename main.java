public class Main {
    public static void main(String[] args) {
        out.println("Задание 1.7");
        out.println();
        out.println("Условие:Запросить у пользователя число и записать его в переменную redius.\n" +
                "Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius.\n" +
                "Результат - дробное число (тип double).\n" +
                "В качестве значения Pi используй значение 3.14.\n");
        out.println();
        out.println("Решение");
        double redius = 120;
        out.println("redius равен " + " " + redius);
        double Pi = 3.14;
        out.println("Pi равно" + " " + Pi);
        double per = 2;
        out.println("Переменная равна" + " " + per);
        double L = per * Pi * redius;
        out.println("L=2*3,14*120");
        out.println();
        out.println("Ответ:");
        out.println("Длина окружности (L) равна " + " " + L);
        out.println();
        out.println();
        out.println("Задание 1.8");
        out.println();
        out.println("Условие:Запросить у пользователя число(температуру в цельсиях) и записать его в переменную.\n" +
                "Программа должна переводить температуру и возвращать значение в градусах Фаренгейта.\n" +
                "Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:\n" +
                "TF = (9 / 5) * TC + 32\n" +
                "Например: для числа 41 результат будет 105.8\n");
int cel= 41;
        out.println("cel равно " + " " + cel);
        double far =(9.0 / 5.0) * cel +32.0;
        out.println("far равно" + " " + far);
        double cel1 = (5.0 / 9.0) *( far - 32.0);
        out.println("cel1 равно" + " " + cel1);

        out.println();
        out.println("Задание 1.9");
        out.println();
        out.println("Условие:Запросить у пользователя 2 числа (сохранить их в разные переменные)\n" +
                "Вывести на экран максимальное из двух чисел, если числа равны, вывести их сумму.\n");
       out.println("Решение");
       int num1=20;
       int num2=15;
        out.println("num1"+"  "+num1);
        out.println("num2"+"  "+num2);
        int answer = max(num1,num2);
        System.out.println("Ответ max переменная ="+""+answer);


    }
    }
