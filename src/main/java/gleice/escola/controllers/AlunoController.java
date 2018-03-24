/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gleice.escola.controllers;

import gleice.escola.DAO.AlunoDAO;
import gleice.escola.models.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlunoController {
    
    @Autowired
    private AlunoDAO alunoDao;
    
    @RequestMapping("/adiciona")
    @ResponseBody
    String adiciona(Aluno aluno) {
        alunoDao.adiciona(aluno);
        return "Aluno adicionado";
    }
    
    @RequestMapping("/lista")
    @ResponseBody
    String lista(Aluno aluno) {
        alunoDao.adiciona(aluno);
        return "Aluno adicionado";
    }
}
