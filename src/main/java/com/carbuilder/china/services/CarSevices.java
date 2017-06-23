
package com.carbuilder.china.services;

import com.carbuilder.china.model.CarPOJO;
import com.carbuilder.china.sql.CarBuildNumberDAO;
import com.carbuilder.china.sql.CarDataDAO;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bánszki András <andras.banszki@gmail.com>
 */
public class CarSevices {
    
    public Map <Integer,CarPOJO.Builder> GetCars(){
        Map <Integer,CarPOJO.Builder> map = new HashMap<>();
        
        CarBuildNumberDAO getCB = new CarBuildNumberDAO();
        CarDataDAO getCD = new CarDataDAO();
        
        map = getCD.buildCarData(map);
        map = getCB.buildCarNumbers(map);
        
        return map;
    }
    
}
