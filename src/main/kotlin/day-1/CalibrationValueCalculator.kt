package `day-1`

import java.io.File;

class CalibrationValueCalculator {

    public fun sum(): Int {
        println(collectDigitsFromEachLine().sum())
        return collectDigitsFromEachLine().sum();
    }

    private fun collectDigitsFromEachLine(): ArrayList<Int> {
        val arrOfDigits = ArrayList<Int>();
        val lines = convertEachLineToArrayElement();
        for (line in lines) {
            arrOfDigits.add(getFirstAndLastDigit(line))
        }

        return arrOfDigits;
    }

    private fun getFirstAndLastDigit(line: String): Int {
        var string = ""
        val nums = line.filter { x -> x.isDigit() }.toList();
        string += nums.first();
        string += nums.last();
        return string.toInt();
    };

    private fun convertEachLineToArrayElement(): List<String> {
        return File("C:\\Users\\Corinna\\Desktop\\MBH\\advent-of-code\\advent-of-code\\src\\main\\kotlin\\day-1\\day-1.txt").readLines();
    }


}