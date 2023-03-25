package com.sopromadze.blogapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sopromadze.blogapi.model.audit.UserDateAudit;
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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@Table(name = "photos", uniqueConstraints = { @UniqueConstraint(columnNames = { "title" }) })
public class Photo extends UserDateAudit {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Column(name = "title")
	private String title;

	@NotBlank
	@Column(name = "url")
	private String url;

	@NotBlank
	@Column(name = "thumbnail_url")
	private String thumbnailUrl;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "album_id")
	private Album album;

	public Photo(@NotBlank String title, @NotBlank String url, @NotBlank String thumbnailUrl, Album album) {
		this.title = title;
		this.url = url;
		this.thumbnailUrl = thumbnailUrl;
		this.album = album;
	}

	@JsonIgnore
	public Album getAlbum() {
		return album;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return this.title;
	}

	public String getUrl() {
		// TODO Auto-generated method stub
		return this.url;
	}

	public String getThumbnailUrl() {
		// TODO Auto-generated method stub
		return this.thumbnailUrl;
	}

	public void setTitle(String title2) {
		// TODO Auto-generated method stub
		this.title = title2;
	}

	public void setThumbnailUrl(String thumbnailUrl2) {
		// TODO Auto-generated method stub
		this.thumbnailUrl = thumbnailUrl2;
	}

	public void setAlbum(Album album2) {
		// TODO Auto-generated method stub
		this.album = album2;
	}
}
