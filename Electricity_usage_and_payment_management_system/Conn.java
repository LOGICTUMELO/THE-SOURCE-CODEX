package Electricity_usage_and_payment_management_system;

import java.sql.*;

public class Conn{
    
    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "Thesourcecodex@01");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}