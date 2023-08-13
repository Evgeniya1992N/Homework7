public class Main {
    public static void main(String[] args) {
        // Task 1
        int wishedSavings = 2_459_000;
        int currentSavings = 0;
        int monthsNumber = 0;
        while ( currentSavings < wishedSavings ) {
            currentSavings = currentSavings + 15_000;
            monthsNumber = monthsNumber + 1;
            System.out.println( "Mесяц " + monthsNumber + " , сумма накоплений равна " + currentSavings +  " рублей." );
        }
        // Task 2
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print( i + " ");
        }
        System.out.println( );
        for (int j = 10; j >=1; j = j-1)
            System.out.print( j + " ");
        System.out.println();
        // Task 3
        int totalPeople = 12_000_000;
        int newBornAnnually = 12_000_000/1000 * 17;
        int diedAnnually = 12_000_000/1000/8;
        int year = 1;
        while (year<10) {
            year = year + 1;
            totalPeople = totalPeople + newBornAnnually - diedAnnually;
            System.out.println( "Год "+ year  + ", численность населения составляет " +  totalPeople );
        }

        // Task 4
        double initSum =  15000;
        int month = 1;
        double procentMonth = 0.07;
        while (initSum < 12000000 ) {
            initSum += initSum * procentMonth;
            month = month + 1;
        System.out.println( "Month "+ month  + ", have on the account " +  initSum );
        }

        // Task 5
        int startSum = 15000;
        int monthNum = 1;
        for (; startSum < 12000000; monthNum++ ) {
            startSum += startSum * 0.07 ;

            if (monthNum % 6 == 0) {
            System.out.println( "Month "+ monthNum  + ", have on the account " +  startSum );
            }
        }
        System.out.println( startSum );


        // Task 6
        int totall = 15000;
        int months = 1;

        for (int years = 0; years < 10; years++) {

        for (; totall < 12000000; months++ ) {
            totall += totall * 0.07;

            if ( months % 6 == 0) {

                System.out.println( "месяц "+ months  + ", на счете  " +  totall );
            }
    }

}
        //Task 7
        int friday = 5;

        for (int day = 1; day <= 31; day++ ){
            if ((day == friday) || (day == friday + 7) || (day == friday + 14) || (day == friday + 21)) {
                System.out.println( "Сегодня пятница, " + day + "-е число месяца. Необходимо подготовить отчет."  );
            }
        }

        //Task 8
        int startYear = 1800;
        int stopYear = 2123;
        for(int countYear = 0; countYear < stopYear; countYear = countYear+1){
        if ((countYear % 79 == 0) && (countYear > startYear)){
            System.out.println(countYear);
        }
        }
        }
}


//&& ( <= 9 )


