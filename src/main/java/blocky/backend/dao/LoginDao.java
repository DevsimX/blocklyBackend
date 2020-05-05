package blocky.backend.dao;

import blocky.backend.entity.UsersEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginDao {

    UsersEntity searchUserByIDAndPassword(@Param(value = "username") String username,@Param(value = "password") String password);

}
