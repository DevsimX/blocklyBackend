package blocky.backend.dao;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckUsernameDao {

    String checkUsername(String username);

}
