/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gleice.escola.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author gleiceellen
 */
@Controller
public class InicialController {
    
    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
