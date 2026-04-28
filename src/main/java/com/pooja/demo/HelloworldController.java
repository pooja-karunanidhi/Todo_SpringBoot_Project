package com.pooja.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @GetMapping("/hello")
  String sayhelloworld()
  {
      return "hello and world";
  }

}
