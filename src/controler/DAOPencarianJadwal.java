
package controler;

import Model.PembelianTiket;
import Model.PencarianJadwal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class DAOPencarianJadwal {
    private Connection conn;
    public DAOPencarianJadwal() {
        try {
            conn = new Connector().getConn();
        } catch (SQLException ex) {
        }
    }
    
     public List<PembelianTiket> getJadwal(String asal, String tujuan)
    {
        List<PembelianTiket> ls = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        PembelianTiket pgw;
        String Tujuan = asal+" - "+tujuan;
        try {
            ps = (PreparedStatement) conn.prepareStatement("Select * from tb_kereta where Tujuan = lower('"+Tujuan+"')");
            rs = ps.executeQuery();
            while(rs.next())
            {
                
                pgw = new PembelianTiket();
                pgw.setId_kereta(rs.getString(1));
                pgw.setNama_kereta(rs.getString(2));
                pgw.setTujuan(rs.getString(3));
                pgw.setSt_asal(rs.getString(4));
                pgw.setSt_tujuan(rs.getString(5));
                pgw.setBerangkat(rs.getString(6));
                pgw.setTiba(rs.getString(7));
                pgw.setKelas(rs.getString(8));
                pgw.setHarga(rs.getInt(9));
                
                ls.add(pgw);
            }   
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return ls;
    }
}
