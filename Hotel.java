/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.soft_final;

/**
 *
 * @author kilany
 */
//import java.util.List;
public class Hotel {

    /**
     * @param args the command line arguments
     */



    public static void main(String[] args) {
        // ReservationManager Singleton
//        ReservationManager reservationManager = ReservationManager.getInstance();
//        reservationManager.makeReservation("Alice", "101", "2024-12-20", "2024-12-22");
//        reservationManager.makeReservation("Bob", "102", "2024-12-21", "2024-12-23");
//
//        System.out.println("\nAll Reservations:");
//        List<String> reservations = reservationManager.getAllReservations();
//        for (String reservation : reservations) {
//            System.out.println(reservation);
//        }
//
//        // PaymentProcessor Singleton
//        PaymentProcessor paymentProcessor = PaymentProcessor.getInstance();
//        paymentProcessor.processPayment(1, 150.0);
//        paymentProcessor.processPayment(2, 200.0);
//
//        System.out.println("\nAll Payments:");
//        List<String> payments = paymentProcessor.getAllPayments();
//        for (String payment : payments) {
//            System.out.println(payment);
            
                // Create a new reservation (save to database)
//        Reservation originalReservation = new Reservation("John Doe", "101", new Date(), new Date(System.currentTimeMillis() + 86400000L));
//        originalReservation.save();
//
//        // Clone the reservation from the database
//        Reservation clonedReservation = Reservation.getReservationById(1).clone();
//        clonedReservation = new Reservation("Jane Smith", "102", new Date(), new Date(System.currentTimeMillis() + 172800000L));
//
//        // Save the cloned reservation to the database
//        clonedReservation.save();
//
//        // Print the original and cloned reservations
//        System.out.println("Original Reservation: " + originalReservation);
//        System.out.println("Cloned Reservation: " + clonedReservation);
//
//        // Create and save a payment (save to database)
//        Payment originalPayment = new Payment(1, 500.00, "Success");
//        originalPayment.save();
//
//        // Clone the payment from the database
//        Payment clonedPayment = Payment.getPaymentById(1).clone();
//        clonedPayment = new Payment(2, 300.00, "Pending");
//
//        // Save the cloned payment to the database
//        clonedPayment.save();
//
//        // Print the original and cloned payments
//        System.out.println("Original Payment: " + originalPayment);
//        System.out.println("Cloned Payment: " + clonedPayment);

 // Create a new reservation using Singleton ReservationManager
        ReservationManager reservationManager = ReservationManager.getInstance();
        Reservation originalReservation = new Reservation("John Doe", "101", new Date(), new Date(System.currentTimeMillis() + 86400000L));
        reservationManager.reserveRoom(originalReservation);

        // Clone the reservation using Prototype
        Reservation clonedReservation = originalReservation.clone();
        clonedReservation = new Reservation("Jane Smith", "102", new Date(), new Date(System.currentTimeMillis() + 172800000L));
        reservationManager.reserveRoom(clonedReservation);

        // Create a new payment using Singleton PaymentProcessor
        PaymentProcessor paymentProcessor = PaymentProcessor.getInstance();
        Payment originalPayment = new Payment(1, 500.00, "Success");
        paymentProcessor.processPayment(originalPayment);

        // Clone the payment using Prototype
        Payment clonedPayment = originalPayment.clone();
        clonedPayment = new Payment(2, 300.00, "Pending");
        paymentProcessor.processPayment(clonedPayment);

        // Print the details
        System.out.println("Original Reservation: " + originalReservation);
        System.out.println("Cloned Reservation: " + clonedReservation);
        System.out.println("Original Payment: " + originalPayment);
        System.out.println("Cloned Payment: " + clonedPayment);
        }
    }
//}     

    

