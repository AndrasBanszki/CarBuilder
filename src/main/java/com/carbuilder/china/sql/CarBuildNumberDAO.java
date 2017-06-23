
package com.carbuilder.china.sql;

import com.carbuilder.china.model.CarPOJO;
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
public class CarBuildNumberDAO extends MySqlConnector{
    
    private static final String QUERY =  " SELECT ct.id, MIN(ps.number/cpc.number) AS can_build \n" +
                            " FROM car_type ct, car_part_connection cpc, part_storage ps \n" +
                            " WHERE ct.id = cpc.car_type_id \n" +
                            " AND ps.id = cpc.part_storage_id \n" +
                            " group by ct.id";
    
    public Map <Integer,CarPOJO.Builder> buildCarNumbers(Map <Integer,CarPOJO.Builder> carBuilder){
        
        try(Connection conn = this.getConnection();
            Statement stmt = conn.createStatement(); 
            ResultSet rs = stmt.executeQuery(QUERY);) {
            
            while(rs.next()){
                carBuilder.get(rs.getInt("id")).setCanBeBuild(rs.getInt("can_build"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarBuildNumberDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return carBuilder;
    }
    
}
