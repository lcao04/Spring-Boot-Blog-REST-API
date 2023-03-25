package com.sopromadze.blogapi.payload;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class PhotoRequest {

	@NotBlank
	@Size(min = 3)
	private String title;

	@NotBlank
	@Size(min = 10)
	private String url;

	@NotBlank
	@Size(min = 10)
	private String thumbnailUrl;

	@NotNull
	private Long albumId;

	public Long getAlbumId() {
		// TODO Auto-generated method stub
		return this.albumId;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return this.title;
	}

	public String getThumbnailUrl() {
		// TODO Auto-generated method stub
		return this.thumbnailUrl;
	}

	public @NotBlank String getUrl() {
		// TODO Auto-generated method stub
		return this.url;
	}
}
