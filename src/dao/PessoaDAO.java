/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mysql.cj.xdevapi.Result;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Pessoa;
/**
 *
 * @author 182120002
 */
public class PessoaDAO {
   
    public void cadastrarPessoaDAO(Pessoa pVO){
        try {
            //Buscar conexão com Banco de dados
            Connection con =  Conexao.getConexao();
            
            //Criar script sql de insert
            String sql = "insert into pessoas values (null, ?,?,?,?)";
            
            //Criar espaço para executar script
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getNome());
            pst.setString(2, pVO.getCpf());
            pst.setString(3, pVO.getEndereco());
            pst.setString(4, pVO.getTelefone());
            pst.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Pessoa.\n"
                                + e.getMessage());
        }
    }//Fim do cadastroPessoaDAO
    public ArrayList<Pessoa> getPessoas(){
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "Select * from pessoas";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Pessoa p = new Pessoa();
                //lado do java |x| lado ao lado do banco
                p.setIdPessoa(rs.getInt("idPessoa"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("nome"));
                p.setEndereco(rs.getString("endereço"));
                p.setTelefone(rs.getString("telefone"));
                pessoas.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar pessoas.\n"
                            + e.getMessage());
        }
        return pessoas;
    }//Fim ArraList<Pessoa> getPessoas()
    
    public Pessoa getPessoaByDoc(String cpf){
        Pessoa p = new Pessoa();
        
         try {
            Connection con = Conexao.getConexao();
            String sql = "Select * from pessoas where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                //lado do java |x| lado ao lado do banco
                p.setIdPessoa(rs.getInt("idPessoa"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("nome"));
                p.setEndereco(rs.getString("endereço"));
                p.setTelefone(rs.getString("telefone"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o cpf.\n"
                            + e.getMessage());
        }
        return p;
    }
    public void atualizarPessoaDAO(Pessoa pVO){
        try {
            Connection con = Conexao.getConexao();
            String sql = "update pessoas set nome = ?, endereco = ?, telefone = ?"
                        + "where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,pVO.getNome());
            pst.setString(2,pVO.getEndereco());
            pst.setString(3,pVO.getTelefone());
            pst.setString(4,pVO.getCpf());
            pst.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Pessoa.\n"
                       + e.getMessage());
        }
    }
    public void deletarPessoaDAO(String cpf){
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from pessoas where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
           pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao deletar a Pessoa.\n"
                        + e.getMessage());
        }
    }
}//Fim da classe PessoaDAO
