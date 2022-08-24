import java.util.*;  
import java.sql.*;  
  
public class userdao 
{    
    public static Connection getConnection()
    {  
        Connection con=null;  
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
        return con;  
    }  
    public static int save(user e){  
        int status=0;  
        try
        {  
            try (Connection con = userdao.getConnection()) {
                PreparedStatement ps = con.prepareStatement("insert into users(name,email,country) values (?,?,?)");
                ps.setString(1,e.getName());
                ps.setString(2,e.getEmail());
                ps.setString(3,e.getCountry());
                
                status = ps.executeUpdate();
            }  
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }  
          
        return status;  
    }  
    public static int update(user e){  
        int status=0;  
        try{  
            try (Connection con = userdao.getConnection()) {
                PreparedStatement ps=con.prepareStatement("update users set name=?,email=?,country=? where id=?");
                ps.setString(1,e.getName());
                ps.setString(2,e.getEmail());
                ps.setString(3,e.getCountry());
                ps.setInt(4,e.getId());
                
                status = ps.executeUpdate();
            }  
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            try (Connection con = userdao.getConnection()) {
                PreparedStatement ps = con.prepareStatement("delete from users where id=?");
                ps.setInt(1,id);
                status=ps.executeUpdate();
            }  
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }  
          
        return status;  
    }  
    public static user getUsersById(int id){  
        user u=new user();  
        try{  
            try (Connection con = userdao.getConnection()) {
                PreparedStatement ps=con.prepareStatement("select * from users where id=?");
                ps.setInt(1,id);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    u.setId(rs.getInt(1));
                    u.setName(rs.getString(2));
                    u.setEmail(rs.getString(3));
                    u.setCountry(rs.getString(4));
                }
            }  
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }  
          
        return u;  
    }  
    public static List<user> getAllUsers(){  
        List<user> list=new ArrayList<>();  
        try{  
            try (Connection con = userdao.getConnection()) {
                PreparedStatement ps = con.prepareStatement("select * from users");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    user u=new user();
                    u.setId(rs.getInt(1));
                    u.setName(rs.getString(2));
                    u.setEmail(rs.getString(3));
                    u.setCountry(rs.getString(4));
                    list.add(u);
                }
            }  
        }catch(SQLException e)
        {
            e.printStackTrace();
        }  
        return list;  
    }  
}  