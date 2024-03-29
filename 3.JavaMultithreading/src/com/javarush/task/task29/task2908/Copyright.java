package com.javarush.task.task29.task2908;

public class Copyright implements Computable<com.javarush.task.task29.task2908.Copyright.Period, String> {
    @Override
    public String compute(com.javarush.task.task29.task2908.Copyright.Period period) throws InterruptedException {
        return "All rights reserved (c) " + period.firstYear + "-" + period.secondYear;
    }

    public static class Period {
        int firstYear;
        int secondYear;

        public Period(int firstYear, int secondYear) {
            this.firstYear = firstYear;
            this.secondYear = secondYear;
        }

        @Override
        public String toString() {
            return "Period{" +
                    "firstYear=" + firstYear +
                    ", secondYear=" + secondYear +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof com.javarush.task.task29.task2908.Copyright.Period)) return false;

            com.javarush.task.task29.task2908.Copyright.Period period = (com.javarush.task.task29.task2908.Copyright.Period) o;

            if (firstYear != period.firstYear) return false;
            return secondYear == period.secondYear;
        }

        @Override
        public int hashCode() {
            int result = firstYear;
            result = 31 * result + secondYear;
            return result;
        }
    }
}
