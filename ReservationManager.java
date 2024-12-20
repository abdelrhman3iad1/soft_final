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
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReservationManager {
//    private static ReservationManager instance;
//
//    private ReservationManager() {}
//
//    public static ReservationManager getInstance() {
//        if (instance == null) {
//            instance = new ReservationManager();
//        }
//        return instance;
//    }
//
//    public void makeReservation(String customerName, String roomNumber, String startDate, String endDate) {
//        try (Connection conn = DatabaseConnection.getConnection()) {
//            String query = "INSERT INTO reservations (customer_name, room_number, start_date, end_date) VALUES (?, ?, ?, ?)";
//            PreparedStatement ps = conn.prepareStatement(query);
//            ps.setString(1, customerName);
//            ps.setString(2, roomNumber);
//            ps.setString(3, startDate);
//            ps.setString(4, endDate);
//            ps.executeUpdate();
//            System.out.println("Reservation made successfully for " + customerName);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public List<String> getAllReservations() {
//        List<String> reservations = new ArrayList<>();
//        try (Connection conn = DatabaseConnection.getConnection();
//             PreparedStatement ps = conn.prepareStatement("SELECT * FROM reservations");
//             ResultSet rs = ps.executeQuery()) {
//
//            while (rs.next()) {
//                String reservation = "Customer: " + rs.getString("customer_name") +
//                        ", Room: " + rs.getString("room_number") +
//                        ", Dates: " + rs.getString("start_date") + " to " + rs.getString("end_date");
//                reservations.add(reservation);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return reservations;
//    }
//}
