package blocky.backend.dao;

import blocky.backend.entity.UsersEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RegisterDao {

    UsersEntity searchUserByID(@Param(value = "username") String username);

    int insertUser(@Param(value = "username") String username,
                   @Param(value = "password") String password,
                   @Param(value = "role") long role,
                   @Param(value = "name") String name,
                   @Param(value = "email") String email);
}
