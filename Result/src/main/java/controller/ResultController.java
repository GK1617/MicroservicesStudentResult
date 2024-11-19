package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Service.ResultService;
import model.Result;

@RestController
@RequestMapping("/api/results")
public class ResultController {
    @Autowired
    private ResultService resultService;

    @PostMapping("/calculate")
    public ResponseEntity<Result> calculateResult(@RequestBody Result result) {
        return ResponseEntity.ok(resultService.calculateAndSaveResult(result));
    }

    @GetMapping("/{rollNumber}")
    public ResponseEntity<Result> getResult(@PathVariable String rollNumber) {
        return ResponseEntity.ok(resultService.getResult(rollNumber));
    }
}