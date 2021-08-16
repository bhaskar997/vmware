package com.example.demo.Controller;

import com.example.demo.Models.BodyModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/results")
public class VmwareController {
    @GetMapping(value = "{id}")
    private void TaskId(
            @RequestBody BodyModel bodyModel
            ){
        
    }
}
