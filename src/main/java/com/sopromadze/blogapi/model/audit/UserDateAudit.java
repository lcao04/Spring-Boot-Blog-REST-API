package com.sopromadze.blogapi.model.audit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Data
@JsonIgnoreProperties(
		value = { "createdBY", "updatedBy" },
		allowGetters = true
)
public abstract class UserDateAudit extends DateAudit {
	private static final long serialVersionUID = 1L;

	@CreatedBy
	@Column(updatable = false)
	private Long createdBy;

	@LastModifiedBy
	private Long updatedBy;

	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy2) {
		// TODO Auto-generated method stub
		this.createdBy = createdBy2;
		
	}

	public Long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Long updatedBy2) {
		this.updatedBy = updatedBy2;
	}
}
