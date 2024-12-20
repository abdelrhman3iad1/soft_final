/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soft_final;

/**
 *
 * @author kilany
 */
import java.sql.*;

public class Payment implements Prototype {
    private int id;
    private int reservationId;
    private double amount;
    private String status;

    // Constructor for creating a new payment
    public Payment(int reservationId, double amount, String status) {
        this.reservationId = reservationId;
        this.amount = amount;
        this.status = status;
    }

    // Constructor for cloning existing payments from DB
    public Payment(int id, int reservationId, double amount, String status) {
        this.id = id;
        this.reservationId = reservationId;
        this.amount = amount;
        this.status = status;
    }

    // Clone method
    
    @Override
    public payment clone() {
        try {
            return (Payment) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }


    // Fetch payment by ID from the database
//    public static Payment getPaymentById(int paymentId) {
//        try (Connection conn = DatabaseConnection.getConnection()) {
//            String query = "SELECT * FROM payments WHERE id = ?";
//            try (PreparedStatement stmt = conn.prepareStatement(query)) {
//                stmt.setInt(1, paymentId);
//                try (ResultSet rs = stmt.executeQuery()) {
//                    if (rs.next()) {
//                        return new Payment(
//                                rs.getInt("id"),
//                                rs.getInt("reservation_id"),
//                                rs.getDouble("amount"),
//                                rs.getString("status")
//                        );
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    // Save the payment to the database
//    public boolean save() {
//        try (Connection conn = DatabaseConnection.getConnection()) {
//            String query = "INSERT INTO payments (reservation_id, amount, status) VALUES (?, ?, ?)";
//            try (PreparedStatement stmt = conn.prepareStatement(query)) {
//                stmt.setInt(1, this.reservationId);
//                stmt.setDouble(2, this.amount);
//                stmt.setString(3, this.status);
//                int rowsAffected = stmt.executeUpdate();
//                return rowsAffected > 0;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

    @Override
    public String toString() {
        return "Payment{id=" + id + ", reservationId=" + reservationId + ", amount=" + amount +
                ", status='" + status + '\'' + '}';
    }
}
