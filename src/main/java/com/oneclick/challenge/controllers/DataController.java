package com.oneclick.challenge.controllers;

import com.oneclick.challenge.models.Data;
import com.oneclick.challenge.models.User;
import com.oneclick.challenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/saveData/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<?> saveData(@PathVariable Long id,@RequestBody List<Data> dataList) {
        Optional<User> user = repo.findById(id);
        user.get().setData(dataList);
        repo.save(user.get());
        return (ResponseEntity<?>) ResponseEntity.ok();
    }

    @GetMapping("/getData/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Data> getData(@PathVariable Long id) {
        return repo.findById(id).get().getData();
    }
}
