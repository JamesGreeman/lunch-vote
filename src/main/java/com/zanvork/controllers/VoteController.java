package com.zanvork.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zanvork.models.VoteSheet;

/**
 * @author James
 */
@RestController
@RequestMapping("/vote")
public class VoteController {
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> vote(@RequestBody VoteSheet vote){

        return new ResponseEntity<>(null, null, HttpStatus.ACCEPTED);
    }
}
