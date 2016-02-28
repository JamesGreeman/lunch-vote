package com.zanvork.services;

import java.util.ArrayList;
import java.util.List;

import com.zanvork.models.LunchChoice;
import com.zanvork.models.VoteSheet;

/**
 * @author James
 */
public class VoteService {

    private static final VoteService INSTANCE = new VoteService();

    private final List<VoteSheet> voteList = new ArrayList<>();

    public static VoteService getInstance(){
        return INSTANCE;
    }

    public void addVote(VoteSheet vote){
        voteList.add(vote);
    }

    public LunchChoice getWinner(){
        return null;
    }
}
