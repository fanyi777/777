package fanyi.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fanyi.com.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	//データの挿入処理　insert save
    //データの更新処理　update
 Users save(Users users);
//findBy~ SELECT * FROM WHERE ~	
 //SELECT*FROM user WHERE user_email =
 //Users findByUserEmail(String usersEmail);//userの保存処理のチェック
 //SELECT *FROM user WHERE user_email=?AND password = ?
 Users findByEmail(String usersEmail);
 Users findByUsernameAndPassword(String username,String password);
 
 }
 
