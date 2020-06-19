/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import Model.DataAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOAdmin {


    Connection conn;
    
    public DAOAdmin() {
        try {
            conn = new Connector().getConn();
        } catch (SQLException ex) {
        }
    }
    
    public List<DataAdmin> getAllDataAdmin() {
        List<DataAdmin> listDataAdmin = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM tb_kereta ");
            ResultSet rs = ps.executeQuery();
            ps.setMaxRows(1000);
            while (rs.next()) {
                DataAdmin data = new DataAdmin();
                data.setId_kereta(rs.getString(1));
                data.setNama_kereta(rs.getString(2));
                data.setTujuan(rs.getString(3));
                data.setStasal(rs.getString(4));
                data.setSttujuan(rs.getString(5));
                data.setKeberangkatan(rs.getString(6));
                data.setKedatangan(rs.getString(7));
                data.setKelas(rs.getString(8));
                data.setHarga(rs.getInt(9));
                listDataAdmin.add(data);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listDataAdmin;
    }

    public boolean insertDataAdmin(DataAdmin data) {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO tb_kereta (id_kereta, Nama_kereta, Tujuan, st_asal, st_tujuan, berangkat, tiba, Kelas, harga) "+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, data.getId_kereta());
            ps.setString(2, data.getNama_kereta());
            ps.setString(3, data.getTujuan());
            ps.setString(4, data.getStasal());
            ps.setString(5, data.getSttujuan());
            ps.setString(6, data.getKeberangkatan());
            ps.setString(7, data.getKedatangan());
            ps.setString(8, data.getKelas());
            ps.setInt(9, data.getHarga());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean deleteDataAdmin(String id_kereta) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM tb_kereta "
                    + "WHERE id_kereta='" + id_kereta + "'");
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean updateDataAdmin(DataAdmin data, String id_keretaUpdate) {
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE tb_kereta "
                    + "SET id_kereta=?, Nama_kereta=?, Tujuan=?, st_asal=?, st_tujuan=?, berangkat=?, tiba=?, Kelas=?, harga=? "
                    + "WHERE id_kereta=?");
            ps.setString(1, data.getId_kereta());
            ps.setString(2, data.getNama_kereta());
            ps.setString(3, data.getTujuan());
            ps.setString(4, data.getStasal());
            ps.setString(5, data.getSttujuan());
            ps.setString(6, data.getKeberangkatan());
            ps.setString(7, data.getKedatangan());
            ps.setString(8, data.getKelas());
            ps.setInt(9, data.getHarga());
            ps.setString(10, id_keretaUpdate);
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
