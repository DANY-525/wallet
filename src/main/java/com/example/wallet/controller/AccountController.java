package com.example.wallet.controller;

import com.example.wallet.entities.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/account")
@RestController
public class AccountController {

    @GetMapping
    public ResponseEntity<?>  getAccounts (){
       Account ac =  new Account(1,"",1,50000);
       return  new ResponseEntity<>(ac, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> createAccounts(@RequestBody Account ac){;
       return  new ResponseEntity<>(ac, HttpStatus.OK);
    }



}
