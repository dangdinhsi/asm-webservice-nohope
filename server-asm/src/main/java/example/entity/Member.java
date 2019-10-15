package example.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {
    @javax.persistence.Id
    private String username;
    private String password;
    private String role;
    private long createdAt;
    private long updatedAt;
    private long deletedAt;
    @OneToOne(mappedBy = "member", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Rate rate;
    @OneToMany(mappedBy = "member", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Comment> comments = new ArrayList<Comment>();
    public Member() {
    }
    public enum Role {
        TRAVELER("TRAVELER"), GUIDE("GUIDE");

        private String value;

        Role(String user) {
            this.value = user;
        }

        public String getValue() {
            return value;
        }

        public Role findByValue(String value){
            for (Role role: Role.values()) {
                if (role.getValue() == value){
                    return role;
                }
            }
            return null;
        }
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
