
@RequestMapping
@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/register") 
    public String getRegisterPage() {
        return"register.html";
    }

    @PostMapping("/register")
    public String register(@RequestParam)
    if (userService.createAccount()) {
        
    }
}
