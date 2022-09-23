package DAO;

import Model.Hotel;
import Model.UserDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public void changePassword(String username,String newPassword){
        try{
            String query="Update userDetail set user_password=? where username=?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,newPassword);
            ps.setString(2,username);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        }
        public UserDetail viewProfile(String username){
        try{
            String query="Select * from userDetail where username=?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,username);
            rs= ps.executeQuery();
            ArrayList<UserDetail> user= new ArrayList<>();
            while(rs.next()) {
                UserDetail user1 = new UserDetail(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getDouble(13));
                    user.add(user1);
            }
                return user.get(0);
        }catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        }
        public String updateProfile(UserDetail user){
            try{
                String query="Update user detail set email=? set phone=? set name=?  set avatar=? set self_description=? where username=?";
                conn = new DBContext().getConnection();
                ps.setString(1,user.getEmail());
                ps.setString(2,user.getPhone());
                ps.setString(3,user.getName());
                ps.setString(4,user.getAvatar());
                ps.setString(5,user.getSelfDescription());
                ps.setString(6,user.getUsername());
                ps = conn.prepareStatement(query);
                ps.executeQuery();
                return "update Successfully";
            }catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
    }
    }
    public ArrayList<Hotel> viewPage(){
        try{
            String query="Select * from Hotel ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Hotel> hotel= new ArrayList<>();
            while (rs.next()){
                Hotel htl= new Hotel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getBoolean(7), rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13));
                hotel.add(htl);
            }
            return hotel;

        }catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Hotel> searchHotel(String searchString){
        try{
            String query="Select * from Hotel where hotel_name like ? or city like ? or country like ? or district like ? or street_name like ? or street_number like ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%"+searchString+"%");
            ps.setString(2,"%"+searchString+"%");
            ps.setString(3,"%"+searchString+"%");
            ps.setString(4,"%"+searchString+"%");
            ps.setString(5,"%"+searchString+"%");
            ps.setString(6,"%"+searchString+"%");
            rs = ps.executeQuery();
            ArrayList<Hotel> hotel= new ArrayList<>();
            while (rs.next()){
                Hotel htl= new Hotel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getBoolean(7), rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13));
                hotel.add(htl);
            }
            return hotel;

        }catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean  updateHotelInfo(Hotel hotel){
        try {
            String query = "update Hotel " +
                    "SET  hotel_name=? "+
                    "SET background_image=?"+
                    "SET country=?"+
                    "SET district=?"+
                    "SET city=?"+
                    "SET street_name=?" +
                    "SET street_number=? where hotel_id=?";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,hotel.getHotelName());
            ps.setString(2,hotel.getBackgroundImg());
            ps.setString(3,hotel.getCountry());
            ps.setString(4,hotel.getDistrict());
            ps.setString(5, hotel.getCity());
            ps.setString(6,hotel.getStreetName());
            ps.setString(7,hotel.getStreetNum());
            ps.setString(8,hotel.getHotelId());
            return true;
        }catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);

        }

    }
    public static void main(String[] args) {
        DAO dao= new DAO();
        ArrayList<Hotel> htl=dao.searchHotel("ngo");
        System.out.println(htl);
        return;
    }
}
