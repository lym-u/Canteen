//package com.canteen.service.impl;
//import java.util.List;
//
//import com.canteen.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import com.canteen.bean.User;
//import com.canteen.dao.UserMapper;
//import com.canteen.service.IUserService;

/**
 * 服务实现
 * @author hmg
 *
 */
//@Service //标识为服务类
//public class UserServiceImpl implements UserService {
	//注入数据层接口
//	@Autowired
//	private IUserService userDao;
//
//	public List<User> getUser(User user) {
//		return userDao.getUser(user);
//	}
//
//	/**
//	 * 分页查询用户
//	 * @param page 页码
//	 * @param size 数量
//	 * @return
//	 */
//	public PageInfo<User> getUsersLimit(int page,int size){
//		//首先开启PageHelper的分页
//		PageHelper.startPage(page, size);
//		//查询分页信息 调用方式与普通方式一致
//		List<User> list=userDao.getUser(new User());
//		//生成PageInfo对象
//		PageInfo<User> pageInfo=new PageInfo<User>(list);
//		return pageInfo;
//	}

//}
package com.canteen.service.impl;

import com.canteen.bean.User;
import com.canteen.bean.UserExample;
import com.canteen.dao.UserMapper;
import com.canteen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public long countByExample(UserExample example) {
        return userMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserExample example) {
        return userMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return userMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return userMapper.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer userid) {
        return userMapper.selectByPrimaryKey(userid);
    }

    @Override
    public int updateByExampleSelective(User record, UserExample example) {
        return userMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(User record, UserExample example) {
        return userMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}

