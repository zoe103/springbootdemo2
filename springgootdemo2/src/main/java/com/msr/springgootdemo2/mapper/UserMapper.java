package com.msr.springgootdemo2.mapper;

import com.msr.springgootdemo2.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tom
 * @version V1.0
 * @Package com.msr.springgootdemo2.mapper
 * @date 2020/8/26 15:40
 * @Copyright © 株式会社多言语系统研究所
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
