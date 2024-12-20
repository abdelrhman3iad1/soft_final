package com.mycompany.soft_final;



import java.sql.*;

public class DatabaseConnection {

    // This method will establish a connection to the database and return the connection object
    public static Connection getConnection() {
        String url = "jdbc:mysql://127.0.0.1:3306/software_proj"; // Database URL
        String user = "root"; // MySQL username
        String password = ""; // MySQL password (assuming it's empty)

        try {
            // Attempting to establish a connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");
            return connection; // Return the established connection
        } catch (SQLException e) {
            // Print the stack trace and provide a user-friendly message
            System.err.println("Error connecting to the database. Please check your connection details.");
            e.printStackTrace();
            return null; // Return null in case of an error
        }
    }

    // Method to test the database connection
    public static void main(String[] args) {
        try (Connection connection = getConnection()) {
            if (connection != null) {
                // You can add any additional queries here to test
                System.out.println("Database connection successful!");
            } else {
                System.out.println("Database connection failed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
