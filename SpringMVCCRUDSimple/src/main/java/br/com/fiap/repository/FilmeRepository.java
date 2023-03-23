package br.com.fiap.repository;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import br.com.fiap.model.FilmeModel;  
  
public class FilmeRepository {  
JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
public int save(FilmeModel filme){  
    String sql="insert into filme_mvc(nome,descricao,categoria,preco) values('"+filme.getNome()+"','"+filme.getDescricao()+"','"+filme.getCategoria()+"',"+filme.getPreco()+")";  
    return template.update(sql);  
}  
public int update(FilmeModel filme){  
    String sql="update filme_mvc set ome='"+filme.getNome()+"', descricao='"+filme.getDescricao()+"',categoria='"+filme.getCategoria()+"',preco="+filme.getPreco()+" where id="+filme.getId()+"";  
    return template.update(sql);  
}  
public int delete(int id){  
    String sql="delete from filme_mvc where id="+id+"";  
    return template.update(sql);  
}  
public FilmeModel getFilmeById(int id){  
    String sql="select * from filme_mvc where id=?";  
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<FilmeModel>(FilmeModel.class));  
}  
public List<FilmeModel> getFilme(){  
    return template.query("select * from filme_mvc",new RowMapper<FilmeModel>(){  
        public FilmeModel mapRow(ResultSet rs, int row) throws SQLException {  
            FilmeModel e=new FilmeModel();  
            e.setId(rs.getInt(1));  
            e.setNome(rs.getString(2));  
            e.setDescricao(rs.getString(3));  
            e.setCategoria(rs.getString(4));
            e.setPreco(rs.getDouble(5));
            return e;  
        }  
    });  
}  
}  