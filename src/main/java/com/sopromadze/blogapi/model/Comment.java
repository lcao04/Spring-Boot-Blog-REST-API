package com.sopromadze.blogapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sopromadze.blogapi.model.audit.UserDateAudit;
import com.sopromadze.blogapi.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@Table(name = "comments")
public class Comment extends UserDateAudit {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotBlank
    @Size(min = 4, max = 50)
    private String name;

    @Column(name = "email")
    @NotBlank
    @Email
    @Size(min = 4, max = 50)
    private String email;

    @Column(name = "body")
    @NotBlank
    @Size(min = 10, message = "Comment body must be minimum 10 characters")
    private String body;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Comment(@NotBlank @Size(min = 10, message = "Comment body must be minimum 10 characters") String body) {
        this.body = body;
    }

    @JsonIgnore
    public Post getPost() {
        return post;
    }

    @JsonIgnore
    public User getUser() {
        return user;
    }

	public void setUser(User user2) {
		// TODO Auto-generated method stub
		this.user = user2;
	}

	public void setPost(Post post2) {
		// TODO Auto-generated method stub
		this.post = post2;
	}

	public void setName(String username) {
		// TODO Auto-generated method stub
		this.name = username;
	}

	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		this.email = email2;
	}

	public void setBody(
			@NotBlank @Size(min = 10, message = "Comment body must be minimum 10 characters") String body2) {
		// TODO Auto-generated method stub
		this.body = body2;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
}
