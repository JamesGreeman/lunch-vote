package com.zanvork.models;

import java.util.List;

/**
 * Model for a user's vote choices.
 * Contains a list of {@link Vote}s
 * @author James
 */
public class VoteSheet {

    private final List<Vote> votes;

    public VoteSheet(List<Vote> votes) {
        this.votes = votes;
    }

    public List<Vote> getVotes() {
        return votes;
    }
}
