
package controler;

import Model.DataDiri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DAODataUser {
     Connection conn;
    public DAODataUser(Connection conn) {
        this.conn = conn;
    }
  public boolean insertUser(DataDiri data){
    try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO tb_user (no_identitas, Nama_user, Alamat, No_hp, email)" + "VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, data.getNo_identitas());
            ps.setString(2, data.getNama_user());
            ps.setString(3, data.getAlamat());
            ps.setString(4, data.getNo_hp());
            ps.setString(5, data.getEmail());

            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    return false;
}
}
