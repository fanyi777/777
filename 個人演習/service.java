
@service
public class UserService {
  private final UserRepository userRepository;
  private final BCryptPasswordEncoder passwordEncoder;

  public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
  }

  public void saveUser(User user){ 
    user.setPassword(passwordEncoder.encode(user.getPassword())); 
   userRepository.save(user);

  public User findByUsername(String username) { 
 return userRepository.findByUsername(username); 





}

/Users/fanyi/Library/Containers/241E2414-22D 8-40 CC-8350-0 C819F96DFD8/Data/Documents/myFolder/7 ww777/7 ww777/java/fanyi/com/services/BlogService.
java