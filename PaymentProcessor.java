///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package hotel;
//
///**
// *
// * @author kilany
// */
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class PaymentProcessor {
//    private static PaymentProcessor instance;
//
//    private PaymentProcessor() {}
//
//    public static PaymentProcessor getInstance() {
//        if (instance == null) {
//            instance = new PaymentProcessor();
//        }
//        return instance;
//    }
//
//    public void processPayment(int reservationId, double amount) {
//        try (Connection conn = DatabaseConnection.getConnection()) {
//            String query = "INSERT INTO payments (reservation_id, amount) VALUES (?, ?)";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setInt(1, reservationId);
//            ps.setDouble(2, amount);
//            ps.executeUpdate();
//            System.out.println("Payment of $" + amount + " processed successfully for Reservation ID: " + reservationId);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public List<String> getAllPayments() {
//        List<String> payments = new ArrayList<>();
//        try (Connection conn = DatabaseConnection.getConnection();
//             PreparedStatement ps = conn.prepareStatement("SELECT * FROM payments");
//             ResultSet rs = ps.executeQuery()) {
//
//            while (rs.next()) {
//                String payment = "Reservation ID: " + rs.getInt("reservation_id") +
//                        ", Amount: $" + rs.getDouble("amount") +
//                        ", Date: " + rs.getTimestamp("payment_date");
//                payments.add(payment);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return payments;
//    }
//}
