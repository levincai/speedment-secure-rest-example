package com.speedment.example.securerest.db.account.generated;

import com.speedment.example.securerest.db.account.Account;
import java.util.Objects;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * The generated base implementation of the {@link
 * com.speedment.example.securerest.db.account.Account}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedAccountImpl implements Account {
    
    private long id;
    private String username;
    private String password;
    private String role;
    
    protected GeneratedAccountImpl() {
        
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public String getUsername() {
        return username;
    }
    
    @Override
    public String getPassword() {
        return password;
    }
    
    @Override
    public String getRole() {
        return role;
    }
    
    @Override
    public Account setId(long id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Account setUsername(String username) {
        this.username = username;
        return this;
    }
    
    @Override
    public Account setPassword(String password) {
        this.password = password;
        return this;
    }
    
    @Override
    public Account setRole(String role) {
        this.role = role;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "       + Objects.toString(getId()));
        sj.add("username = " + Objects.toString(getUsername()));
        sj.add("password = " + Objects.toString(getPassword()));
        sj.add("role = "     + Objects.toString(getRole()));
        return "AccountImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Account)) { return false; }
        final Account thatAccount = (Account)that;
        if (this.getId() != thatAccount.getId()) {return false; }
        if (!Objects.equals(this.getUsername(), thatAccount.getUsername())) {return false; }
        if (!Objects.equals(this.getPassword(), thatAccount.getPassword())) {return false; }
        if (!Objects.equals(this.getRole(), thatAccount.getRole())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Long.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getUsername());
        hash = 31 * hash + Objects.hashCode(getPassword());
        hash = 31 * hash + Objects.hashCode(getRole());
        return hash;
    }
}