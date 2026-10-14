package com.student;

public class OrderProcessor {

    public double processOrder(String type, int qty, double price,
                               boolean member, boolean holiday) {

        double total = 0;

        if (type.equals("A")) {
            if (qty > 10) {
                total = qty * price * 0.9;
            } else {
                total = qty * price;
            }

            if (member) {
                total *= 0.95;
            }

            if (holiday) {
                total *= 1.1;
            }

        } else if (type.equals("B")) {
            if (qty > 10) {
                total = qty * price * 0.9;
            } else {
                total = qty * price;
            }

            if (member) {
                total *= 0.95;
            }

            if (holiday) {
                total *= 1.1;
            }

        } else if (type.equals("C")) {
            if (qty > 10) {
                total = qty * price * 0.9;
            } else {
                total = qty * price;
            }

            if (member) {
                total *= 0.95;
            }

            if (holiday) {
                total *= 1.1;
            }
        }

        double tax = total * 0.15;
        return total + tax;
    }
}