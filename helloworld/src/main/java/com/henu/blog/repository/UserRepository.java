package com.henu.blog.repository;

import com.henu.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户实现相关的User用户接口，实现用户
 * 修改操作、删除操作、获取所用的user数据操作
 */
public interface UserRepository extends JpaRepository<User, Long> {

//    /**
//     * 保存和更新用户
//     * @param user 旧的用户信息
//     * @return 新的用户信息
//     */
//    User saveOrUpdateUser(User user);
//
//    /**
//     * 根据用户的id值删除用户相关信息
//     * @param id 用户的id值
//     */
//    void deleteUser(Long id);
//
//    /**
//     * 根据用户的id值查找用户的相关信息
//     * @param id
//     * @return
//     */
//    User getUserById(Long id);
//
//    /**
//     * 获取用户列表
//     * @return
//     */
//    List<User> listUsers();

}
