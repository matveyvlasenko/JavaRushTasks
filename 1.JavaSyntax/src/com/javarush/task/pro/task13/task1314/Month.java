package com.javarush.task.pro.task13.task1314;

public class Month {
    public static final Month JANUARY = new Month();
    public static final Month FEBRUARY = new Month();
    public static final Month MARCH = new Month();
    public static final Month APRIL = new Month();
    public static final Month MAY = new Month();
    public static final Month JUNE = new Month();
    public static final Month JULY = new Month();
    public static final Month AUGUST = new Month();
    public static final Month SEPTEMBER = new Month();
    public static final Month OCTOBER = new Month();
    public static final Month NOVEMBER = new Month();
    public static final Month DECEMBER = new Month();

    private static final Month[] array = {JANUARY, FEBRUARY,
            MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    private final int value;
    private Month (int value)
    {
        this.value = value;
    }

    public int ordinal()
    {
        return this.value;
    }

    public static Month[] values()
    {
        return array;
    }
}
