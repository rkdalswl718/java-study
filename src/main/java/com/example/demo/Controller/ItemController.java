package com.example.demo.Controller;

import com.example.demo.Service.ItemService;
import com.example.demo.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        Optional<Item> result = itemService.getItemById(id);
        if (result.isPresent()) {
            model.addAttribute("item", result.get());
            return "detail";
        } else {
            return "";
        }
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Item> items = itemService.getAllItems();
        System.out.println(items);
        model.addAttribute("items", items);
        return "list";
    }

    @PostMapping("/add")
    public String writePost(@RequestParam String title, @RequestParam Integer price) {
        itemService.saveItem(title, price);
        return "redirect:/list";
    }

    @GetMapping("/write")
    public String Write() {
        return "write";
    }

    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable("id") Integer id, Model model) {
        Optional<Item> item = itemService.getItemById(id);
        if (item.isPresent()) {
            model.addAttribute("item", item.get());
            return "update";
        } else {
            return "redirect:/list";
        }
    }

    @PostMapping("/updatepost")
    public String updatePost(@RequestParam Integer id, @RequestParam String title, @RequestParam Integer price) {
        itemService.updateItem(id, title, price);
        return "redirect:/list";
    }
}