package com.proyecto.esperanza.controllers;

import com.proyecto.esperanza.dto.productosDTO;
import com.proyecto.esperanza.dto.transaccionesDTO;
import com.proyecto.esperanza.dto.usuariosDTO;
import com.proyecto.esperanza.models.usuariosModel;
import com.proyecto.esperanza.services.usuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/")
public class userController {
    @Autowired
    private usuarioServicio servicioUsuario;

    @ModelAttribute("usuario")
    public usuariosDTO newUser() {
        return new usuariosDTO();
    }

    @ModelAttribute("producto")
    public productosDTO newProduct() {
        return new productosDTO();
    }

    @ModelAttribute("transaccion")
    public transaccionesDTO newTrans() {
        return new transaccionesDTO();

    }


    @GetMapping("/menu")
    public String menu() {

        return "menu";
    }

    @PostMapping ("/login")
    public String login(@ModelAttribute("usuario") usuariosDTO usuarioDTO){
        List<usuariosModel> users = servicioUsuario.getUsers();
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getUsername().equals(usuarioDTO.getUsername()) &&
                    users.get(i).getPassword().equals(usuarioDTO.getPassword())){
                return "menu";
            }
        }
        return "index";
    }


    @GetMapping("/reg")
    public String reg() {

        return "register";
    }

    @PostMapping ("/register")
    public String register(@ModelAttribute("usuario") usuariosDTO usuarioDTO){
        servicioUsuario.saveUser(usuarioDTO);
        return "menu";
    }


    @GetMapping("/logout")
    public String logout() {

        return "index";
    }
    public boolean prueba(String username){
        usuariosDTO user = new usuariosDTO("rodriaac", "123");
        boolean test = false;


        if(servicioUsuario.getUsers().isEmpty()){
            servicioUsuario.saveUser(user);
            if(user.getUsername().equals(username)){
                test = true;
            }
        }else{
            for(int i = 0; i < servicioUsuario.getUsers().size(); i++){
                if(!servicioUsuario.getUsers().get(i).getUsername().equals(user.getUsername())){
                    servicioUsuario.saveUser(user);
                }

                if(servicioUsuario.getUsers().get(i).getUsername().equals(username)){
                    test = true;
                }

            }
        }



        return test;
    }


}
