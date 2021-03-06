package com.springcloud.gateway.login.service;


import com.springcloud.gateway.login.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 刘帅
 * @since 2020-05-17
 */
@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
//    public Result saveUserInfo(UserInfo userInfo) throws Exception {
//        UserInfoExample userInfoExample = new UserInfoExample();
//        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
//        ByteSource salt = ByteSource.Util.bytes(userInfo.getUname());
//
//        String newpassword = new SimpleHash("MD5", userInfo.getPassword(), salt, 1024).toHex();
//        criteria.andUnameEqualTo(userInfo.getUname()).andPasswordEqualTo(newpassword);
//        UserInfo userInfo1 = new UserInfo();
//        userInfo1.setUname(userInfo.getUname());
//        userInfo1.setPassword(newpassword);
//        userInfoMapper.insertSelective(userInfo1);
//        return new Result(true);
//    }

}
