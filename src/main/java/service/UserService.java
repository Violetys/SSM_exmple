package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.User;
import mapper.IUserMapper;

//import省略
@Service
public class UserService {
//此处变量是接口类型，不加@Autowired
	private IUserMapper iUserMapper;
	@Autowired
	public UserService(IUserMapper iUserMapper) {
	this.iUserMapper=iUserMapper;
	}
	public boolean login(User user) {
		User u=iUserMapper.findUser(user);
		if(u!=null)
		return true;
		else {
		return false;
		}
		}
		@Transactional
		public boolean register(User user) {
		int cnt=iUserMapper.addUser(user);
		if(cnt!=0)
		return true;
		else {
		return false;
		}
		}
		public boolean findUser(String username) {
			User u=iUserMapper.findUserByUserName(username);
			if(u!=null)
			return true;
			else {
			return false;
			}
			}
}//end class