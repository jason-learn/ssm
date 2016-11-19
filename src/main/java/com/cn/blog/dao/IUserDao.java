package com.cn.blog.dao;
import com.cn.blog.pojo.User;

public interface IUserDao {
	    public int deleteByPrimaryKey(Integer id);

	    public int insert(User record);

	    public int insertSelective(User record);

	    public User selectByPrimaryKey(Integer id);

	    public int updateByPrimaryKeySelective(User record);

	    public int updateByPrimaryKey(User record);

}
