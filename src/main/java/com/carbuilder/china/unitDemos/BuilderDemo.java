
package com.carbuilder.china.unitDemos;

import com.carbuilder.china.model.CarPOJO;
import com.carbuilder.china.model.CarPOJO.Builder;
import com.carbuilder.china.sql.CarBuildNumberDAO;
import com.carbuilder.china.sql.CarDataDAO;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bánszki András <andras.banszki@gmail.com>
 */
public class BuilderDemo {
    
    public static void main(String[] args){
        Map <Integer,CarPOJO.Builder> map = new HashMap<Integer,CarPOJO.Builder>();
        CarBuildNumberDAO getCB = new CarBuildNumberDAO();
        CarDataDAO getCD = new CarDataDAO();
        map = getCD.buildCarData(map);
        map = getCB.buildCarNumbers(map);

        for(Builder builder: map.values()){
            System.out.println(builder.build());
        }
        
    }
    
}

