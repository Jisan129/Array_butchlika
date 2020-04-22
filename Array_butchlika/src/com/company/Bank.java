package com.company;

import java.util.ArrayList;

public class Bank {
     private String name;
     private ArrayList <Branch> branch =new ArrayList<Branch>();

    public Bank(String name, ArrayList<Branch> branch) {
        this.name = name;
        this.branch = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranch() {
        return branch;
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) ==null) {
            this.branch.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    private String findBranch(String branchName) {
        return branchName;
    }

}