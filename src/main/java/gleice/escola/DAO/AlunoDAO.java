/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gleice.escola.DAO;

import gleice.escola.models.Aluno;
import java.util.ArrayList;
import java.util.List;


public class AlunoDAO {
    public void adiciona(Aluno aluno){
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        alunos.add(aluno);
    }
    
    public ArrayList listaAlunos(ArrayList alunos){
        return alunos;
    }
    
    public void remove(Aluno aluno){
        
    }
    
    public Aluno busca(Aluno aluno){
        return aluno;
    }
    
    public Long buscaMatricula(Long matricula){
        return matricula;
    }
}
