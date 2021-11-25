package com.company.sandbox;

public enum DayOfWeek {

    SUNDAY ("Воскресенье"),
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота");

    private String ttl;

    DayOfWeek(String ttl) {
        this.ttl = ttl;
    }

    public String getTtl() {
        return ttl;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + ttl + '\'' +
                '}';
    }
}