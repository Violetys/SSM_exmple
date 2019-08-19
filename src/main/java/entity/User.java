package entity;
import org.springframework.stereotype.Component;
@Component
public class User {
//实体类的属性和表的字段名称一一对应
int id;
String username;
String password;
//getter和setter…
@Override
public String toString() {
return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
}
public String getUsername() {
	// TODO Auto-generated method stub
	return username;
}
}