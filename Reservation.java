/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soft_final;

/**
 *
 * @author kilany
 */
//import java.sql.*;
import java.util.Date;

public class Reservation implements Prototype {
    private int id;
    private String customer;
    private String room;
    private Date checkInDate;
    private Date checkOutDate;

    // Constructor for creating a new reservation
    public Reservation(String customer, String room, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Constructor for cloning existing reservations from DB
    public Reservation(int id, String customer, String room, Date checkInDate, Date checkOutDate) {
        this.id = id;
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Clone method
    @Override
    public Reservation clone() {
        try {
            return (Reservation) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Fetch reservation from the database by ID
//    public static Reservation getReservationById(int reservationId) {
//        try (Connection conn = DatabaseConnection.getConnection()) {
//            String query = "SELECT * FROM reservations WHERE id = ?";
//            try (PreparedStatement stmt = conn.prepareStatement(query)) {
//                stmt.setInt(1, reservationId);
//                try (ResultSet rs = stmt.executeQuery()) {
//                    if (rs.next()) {
//                        return new Reservation(
//                                rs.getInt("id"),
//                                rs.getString("customer"),
//                                rs.getString("room"),
//                                rs.getDate("check_in_date"),
//                                rs.getDate("check_out_date")
//                        );
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    // Save the reservation to the database
//    public boolean save() {
//        try (Connection conn = DatabaseConnection.getConnection()) {
//            String query = "INSERT INTO reservations (customer, room, check_in_date, check_out_date) VALUES (?, ?, ?, ?)";
//            try (PreparedStatement stmt = conn.prepareStatement(query)) {
//                stmt.setString(1, this.customer);
//                stmt.setString(2, this.room);
//                stmt.setDate(3, new java.sql.Date(this.checkInDate.getTime()));
//                stmt.setDate(4, new java.sql.Date(this.checkOutDate.getTime()));
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
        return "Reservation{id=" + id + ", customer='" + customer + '\'' + ", room='" + room + '\'' +
                ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + '}';
    }
}
