package ru.yandex.practicum.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.yandex.practicum.model.Post;

/**
 * Эндпоинт возвращает список всех постов.
 */
@Controller
@RequestMapping("/posts")
public class PostController {
    private List<Post> posts = new ArrayList<>();

    @GetMapping
    public String getPosts(Model model) {
        model.addAttribute("posts", posts);
        return "posts";
    }

    @GetMapping("add")
    public String showAddForm(Model model) {
        model.addAttribute("post", new Post());
        return "add";
    }

    @PostMapping("add")
    public String addPost(@ModelAttribute Post post) {
        post.setId(posts.size() + 1L);
        posts.add(post);
        return "redirect:/posts";
    }
}