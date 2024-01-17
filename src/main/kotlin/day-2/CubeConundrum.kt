package `day-2`

import java.io.File;

class CubeConundrum {
    public fun countOfPossibleGames() : Int {
        var counter : Int = 0
        val lines: ArrayList<List<String>> = splitLines()
        for (line in lines) {
            //sortRoundsBasedOnColor(line, lines)
            val red = ArrayList<Int>();
            val green = ArrayList<Int>();
            val blue = ArrayList<Int>();

            for (i in line) {
                if (i.contains("green")) {
                    green.add(i.filter { x -> x.isDigit() }.toInt())
                } else if (i.contains("red")) {
                    red.add(i.filter { x -> x.isDigit() }.toInt());
                } else {

                    blue.add(i.filter { x -> x.isDigit() }.toInt());
                }
            }
            if (red.max() <= 12 && green.max() <= 13 && blue.max() <= 14) {
                counter += lines.indexOf(line) + 1;
            }
        }
        println(counter);
        return counter;
    }


    private fun splitLines(): ArrayList<List<String>> {
        val lines = convertEachLineToArrayElement();
        val splittedLines = ArrayList<List<String>>();
        for (line in lines) {
            val editedLine: List<String> = line.substring(8).split(",", ";");
            splittedLines.add(editedLine)
        }
        return splittedLines;
    }

    private fun convertEachLineToArrayElement(): List<String> {
        return File("C:\\Users\\Corinna\\Desktop\\MBH\\advent-of-code\\advent-of-code\\src\\main\\kotlin\\day-2\\day-2.txt").readLines();
    }
}