// package com.contact.ContactApp.Controller;

// import com.contact.ContactApp.Model.User;
// import com.contact.ContactApp.Repository.UserRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseBody;

// @Controller // // This means that this class is a Controller
// @RequestMapping(path = "/demo") // This means URL's start with /demo (after Application path)
// public class MainController {

//     @Autowired
//     private UserRepository userRepository;

//     @PostMapping(path = "/add") // Map ONLY POST Requests
//     public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
//         User user_1 = new User();
//         user_1.setName(name);
//         user_1.setEmail(email);
//         userRepository.save(user_1);
//         return "Saved";
//     }

//     @GetMapping(path = "/all")
//     public @ResponseBody Iterable<User> getAllUsers() {
//         // This returns a JSON or XML with the users
//         return userRepository.findAll();
//     }

//     @GetMapping(path = "/list")
//     public String list(){
//         return "list";
//     }

// }
