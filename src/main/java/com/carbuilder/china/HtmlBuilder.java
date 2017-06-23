
package com.carbuilder.china;

import com.carbuilder.china.model.CarPOJO;
import com.carbuilder.china.model.CarPOJO.Builder;
import com.carbuilder.china.sql.CarBuildNumberDAO;
import com.carbuilder.china.sql.CarDataDAO;
import com.carbuilder.china.services.CarSevices;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bánszki András <andras.banszki@gmail.com>
 */
public class HtmlBuilder {
    
    
    public String tableBuilder(){
        Map <Integer,CarPOJO.Builder> map = new CarSevices().GetCars();
        
        StringBuilder table = new StringBuilder();
        table.append("<table style=\"width:100%\">");
        table.append("  <tr>");
        table.append("    <th>Name</th>");
        table.append("    <th>Brand</th> ");
        table.append("    <th>Can Build</th>" );
        table.append("    <th>Parts</th>");
        table.append("  </tr>");
        
        
        for(Builder builder: map.values()){
            CarPOJO car = builder.build();
                    table.append("  <tr>");
                    table.append("    <th>" + car.getName() + "</th>");
                    table.append("    <th>" + car.getBrand() + "</th> ");
                    table.append("    <th>" + car.getCanBeBuild() + "</th>" );
                    table.append("    <th>" + car.getNeedeParts() + "</th>");
                    table.append("  </tr>");
            
        }
        table.append("</table>");
        return table.toString();
    }
    
}
