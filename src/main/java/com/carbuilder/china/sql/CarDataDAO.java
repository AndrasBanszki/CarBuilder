package com.carbuilder.china.sql;

import com.carbuilder.china.model.CarPOJO.Builder;
import com.carbuilder.china.model.PartPOJO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Car Builder Web Application
 * @author Bánszki András <andras.banszki@gmail.com>
 */
public class CarDataDAO extends MySqlConnector {
    
    private final static String QUERY = " SELECT ct.id, ct.name, ct.brand, ps.name  AS part, cpc.number AS need \n" +
                                        " FROM car_type ct, car_part_connection cpc, part_storage ps \n" +
                                        " WHERE ct.id = cpc.car_type_id \n" +
                                        " AND ps.id = cpc.part_storage_id";
    

    public Map <Integer,Builder> buildCarData(Map <Integer,Builder> carBuilder){

        try(Connection conn = this.getConnection();
            Statement stmt = conn.createStatement(); 
            ResultSet rs = stmt.executeQuery(QUERY)) {
            
            while (rs.next()) {
                if( !carBuilder.containsKey(rs.getInt("id")) ){
                    carBuilder.put(rs.getInt("id"), 
                            new Builder().setId(rs.getInt("id"))
                            .setName(rs.getString("name"))
                            .setBrand(rs.getString("brand"))
                            .addNeedePart(new PartPOJO(rs.getInt("need"),rs.getNString("part"))));
                } else{
                    carBuilder.get(rs.getInt("id")).addNeedePart(new PartPOJO(rs.getInt("need"), rs.getNString("part"))); 
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDataDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return carBuilder;
    }
    
    
}