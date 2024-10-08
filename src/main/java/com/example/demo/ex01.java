//package com.example.demo;
//
//import com.example.demo.Entity.Event;
//import com.example.demo.Repository.EventRepository;
//import com.example.demo.Repository.ItemRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//public class ex01 {
//
//    @GetMapping("/")
//    @ResponseBody
//    String Hello() {
//        return "Hello";
//    }
//
//    @Controller
//    @RequiredArgsConstructor
//    public class EventController {
//        private final EventRepository eventRepository;
//
//        @GetMapping("/event")
//        @ResponseBody
//        String Event() {
//            List<Event> result = eventRepository.findAll();
//            System.out.println(result.get(0));
//            return result.toString();
//        }
//
//        @GetMapping("/list")
//        public String list(Model model) {
//            List<Event> events = eventRepository.findAll();
//            model.addAttribute("events", events);
//            return "list.html";
//        }
//    }
//}
