package com.example.demo.Controller;

import com.example.demo.Models.BodyModel;
import com.example.demo.Models.Shape;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/results")
public class VmwareController {
    @GetMapping(value = "{id}")
    private Map<String,Double> TaskId(
            HttpServletRequest httpServletRequest,
            @RequestBody BodyModel bodyModel){
        Map<String,Shape> m=bodyModel.getMap();
        Map<String,Double> result = new HashMap<>();
        for(Map.Entry<String, Shape> map: m.entrySet()){
            Shape shape=map.getValue();
            Double area=-1.0;
            if(shape.getType()!=null && shape.getType().equals("circle")
            && shape.getRadius()!=null){
                area=3.14*shape.getRadius()*shape.getRadius();
            }
            else if(shape.getType()!=null && shape.getType().equals("square")
            && shape.getSide()!=null){
                area=shape.getSide()*shape.getSide()*1.0;
            }
            else if(shape.getType()!=null && shape.getType().equals("rectangle")
                && shape.getL()!=null && shape.getB()!=null){
                area=shape.getB()*shape.getL()*1.0;
            }
            if(area!=-1){
                result.put(map.getKey(),area);
            }
        }
        return result;
    }
}
