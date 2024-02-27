package fanyi.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fanyi.com.models.Users;
import fanyi.com.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	
//	管理者の登録処理と登録するためのチェック boolean
//	もし、findByUserEmail == null　だったらsaveを使って保存処理をする=>true
//	そうでない場合は、保存処理をしない＝＞false
	public boolean createUser(String name,String email,String password) {
		if(userRepo.findByEmail(email) ==null) {
			userRepo.save(new Users(name,password,email));
			return true;
			}else {
				return false;
			}
	}

//	管理者のログインのチェック UserEntity
//	もし、findByUserEmailAndpassword == null ログインしない　null
//	そうでない場合はログインをする　ログインしている人の情報を渡す
	public Users checkLogin(String username,String password) {
		Users userEntity = userRepo.findByUsernameAndPassword(username, password);
		if(userEntity == null) {
			return null;
		}else {
			return userEntity;
		}
	}
}

	

