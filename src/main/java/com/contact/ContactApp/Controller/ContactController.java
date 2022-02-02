// package com.contact.ContactApp.Controller;

// import java.util.List;

// import javax.servlet.http.HttpServletRequest;

// import com.contact.ContactApp.Model.Contact;
// import com.contact.ContactApp.Model.Major;
// import com.contact.ContactApp.Model.MajorDAO;
// import com.contact.ContactApp.Model.Student;
// import com.contact.ContactApp.Model.StudentDAO;
// import com.contact.ContactApp.Model.User_1;
// import com.contact.ContactApp.Service.ContactService;
// import com.contact.ContactApp.Service.UserService;
// import com.contact.ContactApp.Service.UserServiceImpl;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.ui.ModelMap;
// import org.springframework.util.StringUtils;
// import org.springframework.validation.BindingResult;
// import org.springframework.validation.annotation.Validated;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

// @Controller
// public class ContactController {

//     @Autowired
//     private ContactService contactService;
//     private UserService userService;

//     // @GetMapping("/home")
//     // public String home(Model model) {
//     //     model.addAttribute("text", "Dinh Quang Nam");
//     //     return "home";
//     // }
 
//     // @RequestMapping(value = "/student/show", method= RequestMethod.GET)
//     // public String showForm(){
//     //     return "student-form";
//     // }


//     // @RequestMapping(value = "/student/save")
//     // public String showSave(HttpServletRequest request, Model model){
//     //     String name = request.getParameter("name");
//     //     String mark = request.getParameter("mark");
//     //     String major = request.getParameter("major");
//     //     model.addAttribute("NAME", "Ho va Ten: " + name);
//     //     model.addAttribute("MARK", "DIEM: " + mark);
//     //     model.addAttribute("MAJOR", "CHUYEN NGANH: ," + major);
//     //     return "student-info";
//     // }


//     // @RequestMapping("/register")
//     // public String register(){
//     //     return "register-user";
//     // }

//     // @GetMapping("/")
//     // public String addOrEdit(ModelMap model){
//     //     User_1 u = new User_1();
//     //     u.setUsername("Dinh Quang Nam");
//     //     u.setPassword("123");
//     //     u.setFullName("Dinh quang Nam Ci");
//     //     u.setGender(false);
//     //     model.addAttribute("USER", u);
//     //     model.addAttribute("ACTION", "saveOrUpdate");
//     //     return "register-user";
//     // }

//     // @PostMapping("/saveOrUpdate")
//     // public String saveOrUpdate(ModelMap model, @ModelAttribute("USER") User_1 user_1){
//     //     // UserService uService = new UserServiceImpl();
//     //     userService.save(user_1);
//     //     System.out.println("size: " + userService.getAllUsers().size());
//     //     return "register-user";
//     // }


//     // @RequestMapping("/list")
//     // public String list(ModelMap model){
//     //     UserService uService = new UserServiceImpl();
//     //     model.addAttribute("USERS", uService.getAllUsers());
//     //     return "view-user";
//     // }

//     @RequestMapping(value= "/select")
//     public String studentForm(){
//         return "student-form2";
//     }
//     // MajorDAO mDao = new MajorDAO();
//     @Autowired
//     private MajorDAO mDao;
//     @ModelAttribute("list_major")
//     public List<Major> getMajor(){
//         return  mDao.getAllMajors();
//     }
//     @Autowired
//     private StudentDAO studentDAO;
//     @PostMapping("/select/saveOrUpdate")
//     public String saveOrUpdate(ModelMap model, @ModelAttribute("STUDENT")Student st){
//         studentDAO.add(st);
//         System.out.println("Size: " + StudentDAO.ls.size());
//         return "student-form2";
//     }

//     @GetMapping("/select")
//     public String addOrEdit1(ModelMap model){
//         model.addAttribute("STUDENT", new Student(0, "", 10, new Major(0, "")));
//         return "student-form2";
//     }

//     @GetMapping("select/list")
//     public String list(Model model){
//         model.addAttribute("LIST_STUDENT", studentDAO.getStudentList());
//         return "view-student";
//     }




//     // @RequestMapping(value= "/home", method= RequestMethod.GET)
//     // public String home(Model model) {
//     //     model.addAttribute("text", "Test Cai nhe");
//     //     return "home";
//     // }

//     // @GetMapping("/display")
//     // public String display(){
//     //     return "display";
//     // }

//     // @GetMapping("/contact")
//     // public String list(Model model) {
//     //     model.addAttribute("contacts", contactService.findAll());
//     //     return "list";
//     // }

//     // @GetMapping("/contact/search")
//     // public String search(@RequestParam("term") String term, Model model) {
//     //     if (StringUtils.isEmpty(term)) {
//     //         return "redirect:/contact";
//     //     }
//     //     else{
//     //         model.addAttribute("contacts", contactService.search(term));
//     //         return "list";
//     //     }
//     // }

//     // @GetMapping("contact/add")
//     // public String add(Model model){
//     //     model.addAttribute("contacts", new Contact());
//     //     return "form";
//     // }

//     // @GetMapping("contact/save")
//     // public String save(@Validated Contact contact, BindingResult result, RedirectAttributes redirect) {
//     //     if (result.hasErrors()){
//     //         return "form";
//     //     }
//     //     else{
//     //         contactService.save(contact);
//     //         redirect.addFlashAttribute("successMessage", "Saved contact successfully!");
//     //         return "redirect:/contact";
//     //     }
//     // }

// }
