package com.zanvork.controllers.dto;

import java.util.Map;

/**
 * DTO for a user's vote choices;
 * @author James
 */
public class VoteRequest {
    private Map<Integer, Integer> votes;

    public Map<Integer, Integer> getVotes() {
        return votes;
    }
}
