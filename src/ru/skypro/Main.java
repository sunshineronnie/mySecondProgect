package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here



        byte cat = 1;
        short kittens = 4;
        int dogs = 7;
        long cars = 200L;
        float candiesWeight = 5.5f;
        double catFeedWeight = 10.198;
        boolean catHasKittens = kittens < 5;
        char money = 36;
        System.out.println(catHasKittens);
        System.out.println(money);
        System.out.println("2 cats have " + kittens * 2 + " kittens");


        double  oneFighterWeight = 78.2;
        double  secondFighterWeight = 82.7;
        double  bothFightersWeight = oneFighterWeight + secondFighterWeight;
        double  weightDifference = secondFighterWeight - oneFighterWeight;
        System.out.println(bothFightersWeight + " kg");
        System.out.println(weightDifference + " kg");

        byte banana = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte eggs = 4;
        int bananasWeight = banana * 80;
        int milkWeight = milk * 105;
        int icrCreamWeight = iceCream * 100;
        int eggsWeight = eggs * 70;
        double  breakfastWeight = bananasWeight + milkWeight + icrCreamWeight + eggsWeight;
        System.out.println(breakfastWeight  + " g");
        double breakfast = breakfastWeight / 1000;
        System.out.println(breakfast + " kg");


        byte needLoseWeight = 7;
        int loseWeightKg = needLoseWeight * 1000;
        int loseWeight250g = loseWeightKg / 250;
        System.out.println(loseWeight250g + " days");
        int loseWeight500g = loseWeightKg / 500;
        System.out.println(loseWeight500g + " days");


        int mashaMonthlySalary = 67_760;
        int denisMonthlySalary = 83_690;
        int kristinaMonthlySalary = 76_230;
        double  mashaSalaryInYear = mashaMonthlySalary * 1.1;
        System.out.println(mashaSalaryInYear);
        double mashaSalaryInTwoYears = mashaSalaryInYear * 1.1;
        double mashaSalaryInThreeYears = mashaSalaryInTwoYears * 1.1;
        System.out.println("Зарплата Маши через три года " + mashaSalaryInThreeYears);
        double mashaTotalReturnNow = mashaMonthlySalary * 12;
        System.out.println(" Годовой доход Маши сейчас " + mashaTotalReturnNow);
        double mashaTotalReturnInThreeYears = mashaSalaryInThreeYears * 12;
        System.out.println("Годовой доход Маши через три года " + mashaTotalReturnInThreeYears );
        double mashaDifferenceTotalReturn = mashaTotalReturnInThreeYears - mashaTotalReturnNow;
        System.out.println("Разница в годовом доходе Маши через три года " + mashaDifferenceTotalReturn );

        double  denisMonthlySalaryInYear = denisMonthlySalary * 1.1;
        System.out.println(denisMonthlySalaryInYear );
        double denisMonthlySalaryInTwoYears = denisMonthlySalaryInYear * 1.1;
        double denisMonthlySalaryInThreeYears = denisMonthlySalaryInTwoYears * 1.1;
        System.out.println("Зарплата Дениса через три года " + denisMonthlySalaryInThreeYears );
        double denisTotalReturnNow = denisMonthlySalary * 12;
        System.out.println("Годовой доход Дениса сейчас " + denisTotalReturnNow );
        double denisTotalReturnInThreeYears = denisMonthlySalaryInThreeYears * 12;
        System.out.println("Годовой доход Дениса через три года " + denisTotalReturnInThreeYears );
        double denisDifferenceTotalReturn = denisTotalReturnInThreeYears - denisTotalReturnNow;
        System.out.println("Разница в годовом доходе Дениса через три года " + denisDifferenceTotalReturn);

        double kristinaMonthlySalaryInYear = kristinaMonthlySalary * 1.1;
        double kristinaMonthlySalaryInTwoYears = kristinaMonthlySalaryInYear * 1.1;
        double kristinaMonthlySalaryInThreeYears = kristinaMonthlySalaryInTwoYears * 1.1;
        double kristinaTotalReturnNow = kristinaMonthlySalary * 12;
        System.out.println("Годовой доход Кристины сейсас " + kristinaTotalReturnNow );
        double kristinaTotalReturnInThreeYears = kristinaMonthlySalaryInThreeYears * 12;
        System.out.println("Годовой доход Кристины через три года " + kristinaTotalReturnInThreeYears);
        double kristinaDifferenceTotalReturn = kristinaTotalReturnInThreeYears - kristinaTotalReturnNow;
        System.out.println("Разница в годовом доходе Кристины через три года " + kristinaDifferenceTotalReturn);













    }
}
