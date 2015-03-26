package com.kbss.application.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.joda.time.LocalDate;

@MappedSuperclass
public class DomainBase implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@ApiModelProperty(required = true, value = "can not be sent on POSTs")
	private Long id;
    
    @Version
    private long version;
    
    @Column(name = "createdBy", nullable = false, length = 100)
	private String createdBy;
	
    @Column(name = "modifiedBy", nullable = true, length = 100)
	private String modifiedBy;
	
    @Column(name = "createdDate", nullable = false)
	private LocalDate createdDate;
	
    @Column(name = "modifiedDate", nullable = true)
	private LocalDate modifiedDate;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the version
	 */
	public long getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(long version) {
		this.version = version;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}
	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	/**
	 * @return the createdDate
	 */
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the modifiedDate
	 */
	public LocalDate getModifiedDate() {
		return modifiedDate;
	}
	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(LocalDate modifiedDate) {
		this.modifiedDate = modifiedDate;
	}	
	
}
