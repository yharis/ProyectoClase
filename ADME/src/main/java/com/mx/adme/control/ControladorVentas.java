/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.adme.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author yrodriguez
 */

@Controller
public class ControladorVentas {
    
    @RequestMapping("ventas/Hola")
    public ModelAndView listarAlmacenes() {
        
        ModelAndView mav = new ModelAndView();
      
        mav.setViewName("ventas/Hola");
        return mav;
    }
    
}
