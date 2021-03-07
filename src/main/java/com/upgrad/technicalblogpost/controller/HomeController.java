package com.upgrad.technicalblogpost.controller;


import com.upgrad.technicalblogpost.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/getallposts")
    public String getAllPosts(Model model){
        ArrayList<Post> posts = new ArrayList<>();     //generic - significance ()

        Post post1 = new Post();
        post1.setTitle("Mirzapur");
        post1.setBody("kalian bhaiya ka sarkar");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Gangs of wassepur");
        post2.setBody("khe ke leynge");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("kisaan");
        post3.setBody("Modi ke sarkar nii bneygiii");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts",posts);     //yhn se fetch kareynge data for ui part i.e frontend
        return "index";

    }

}
