package com.company.lesson3;

public class Freelance {
    public static void main(String[] args) {
        int sum = 0;
        int max = 0;
        int cout = 0;
        int[][] income = {
                {95, 67, 13, 55, 44, 11, 10}, // Доходы от первого заказчика

                {7, 190, 4, 44, 11, 1, 99}, // Доходы от второго заказчика

                {0, 5, -1, 500, 14, 90, 1}, // Доходы от третьего заказчика
        };
        for (int i = 0; i < income.length; i++) {
            for (int z = 0; z < income[i].length; z++) {
                sum += income[i][z];
            }
            if (sum > max) {
                max = sum;
                cout = i;
            }
            sum = 0;
        }
        System.out.println("Фрилансеру выгоднее работать с заказчиком №: " + (cout + 1) + " за неделю доход с ним составил " + max + "$");
    }
}
