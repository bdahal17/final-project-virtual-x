package com.thevirtualx.mvcApp.Entity;

import java.util.ArrayList;
import java.util.Collection;

public class Challenge {
    private Account account;
    private int rating;
    private int popularity;
    private Collection<Comment> comments;
    private String challenges;

    public Challenge(Account account, int rating, int popularity, String challenges) {
        this.account = account;
        this.rating = rating;
        this.popularity = popularity;
        this.comments = new ArrayList<>();
        this.challenges = challenges;
    }

    public Account getAccount() {
        return account;
    }

    public int getRating() {
        return rating;
    }

    public int getPopularity() {
        return popularity;
    }

    public Collection<Comment> getComments() {
        return comments;
    }

    public String getChallenges() {
        return challenges;
    }

    @Override
    public String toString() {
        return "Challenge{" +
                "account=" + account +
                ", rating=" + rating +
                ", popularity=" + popularity +
                ", comments=" + comments +
                ", challenges='" + challenges + '\'' +
                '}';
    }
}
//Add Challenges
//Rating
//Comment
//Account
//Popularity