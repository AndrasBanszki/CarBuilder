
package com.carbuilder.china;

import com.carbuilder.china.model.CarPOJO;
import com.carbuilder.china.model.CarPOJO.Builder;
import com.carbuilder.china.services.CarSevices;
import java.util.Map;

/**
 * Car Builder Web Application
 * @author Bánszki András <andras.banszki@gmail.com>
 */
public class HtmlBuilder {
    
    
    public String createCarsTable(){
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
                    table.append("    <th>").append(car.getName()).append("</th>");
                    table.append("    <th>").append(car.getBrand()).append("</th> ");
                    table.append("    <th>").append(car.getCanBeBuild()).append("</th>");
                    table.append("    <th>").append(car.getNeedeParts()).append("</th>");
                    table.append("  </tr>");
            
        }
        table.append("</table>");
        return table.toString();
    }
    
}
