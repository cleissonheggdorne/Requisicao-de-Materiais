package br.com.requisicaodemateriais.controllers;

//
//@Controller
//@CrossOrigin(origins="*", maxAge = 3600) //Permitir ser acessado de Qualquer fonte
//@RequestMapping("/api")
public class UserController {
	
//	final UserService userService;
//	//final LocaleService localeService;
//	User userLogged;
//	
//	public UserController(UserService userService) {
//		this.userService = userService;
//	}
//	
//	@GetMapping("/index")
//    public String index() {
//		if(userLogged == null) {
//			return "redirect:/api/login";
//		}else {	
//			return "index";
//		}
//    }
//	
//	@GetMapping("/login")
//    public String loginForm(Model model) {
//        model.addAttribute("user", new UserDto());
//        return "login";
//    }
//	
//	@PostMapping("/login")
//	public String userAccess(@Valid UserDto userDto, BindingResult br, HttpSession session, Model model) throws NoSuchAlgorithmException, ClassServiceException{
//		model.addAttribute("user", new User());
//		if(br.hasErrors()) {
//			return("login");
//		}
//		userLogged = userService.login(userDto.getUserName(),userDto.getSenha());
//		if(userLogged == null) {
//			model.addAttribute("msg", "Usuário Não Encontrado");
//		}else {
//			//Optional<Locale> locale = localeService.verifyPermissionPedidoCompras(userLogged);
//			//if(locale == null) {
//			//	model.addAttribute("msg", "Não há vínculo com local");
//			//}else {
//				session.setAttribute("userLogged", userLogged);
//				return "redirect:/api/index";
//			}
//			
//		
//		return "login";
//	}
	
}
