package com.jshop.entity;

// Generated 2013-7-14 17:34:18 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CouponT generated by hbm2java
 */
@Entity
@Table(name = "coupon_t", catalog = "jshoper3")
public class CouponT implements java.io.Serializable {

	private String cid;
	private String ctitle;
	private String cimage;
	private Date endtime;
	private String details;
	private Date createtime;
	private Date modifytime;
	private Date begintime;
	private String creatorid;
	private double lat;
	private double lng;
	private int zoom;
	private int readcount;
	private int starsum;
	private int starusersum;
	private int replycount;
	private int gousersum;
	private String coupontypename;
	private String coupontypeid;

	public CouponT() {
	}

	public CouponT(String cid, String ctitle, String cimage, Date endtime,
			String details, Date createtime, Date modifytime, Date begintime,
			String creatorid, double lat, double lng, int zoom, int readcount,
			int starsum, int starusersum, int replycount, int gousersum,
			String coupontypename, String coupontypeid) {
		this.cid = cid;
		this.ctitle = ctitle;
		this.cimage = cimage;
		this.endtime = endtime;
		this.details = details;
		this.createtime = createtime;
		this.modifytime = modifytime;
		this.begintime = begintime;
		this.creatorid = creatorid;
		this.lat = lat;
		this.lng = lng;
		this.zoom = zoom;
		this.readcount = readcount;
		this.starsum = starsum;
		this.starusersum = starusersum;
		this.replycount = replycount;
		this.gousersum = gousersum;
		this.coupontypename = coupontypename;
		this.coupontypeid = coupontypeid;
	}

	@Id
	@Column(name = "CID", unique = true, nullable = false, length = 20)
	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	@Column(name = "CTITLE", nullable = false, length = 225)
	public String getCtitle() {
		return this.ctitle;
	}

	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}

	@Column(name = "CIMAGE", nullable = false, length = 225)
	public String getCimage() {
		return this.cimage;
	}

	public void setCimage(String cimage) {
		this.cimage = cimage;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDTIME", nullable = false, length = 0)
	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	@Column(name = "DETAILS", nullable = false)
	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFYTIME", nullable = false, length = 0)
	public Date getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(Date modifytime) {
		this.modifytime = modifytime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BEGINTIME", nullable = false, length = 0)
	public Date getBegintime() {
		return this.begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "LAT", nullable = false, precision = 22, scale = 0)
	public double getLat() {
		return this.lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	@Column(name = "LNG", nullable = false, precision = 22, scale = 0)
	public double getLng() {
		return this.lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	@Column(name = "ZOOM", nullable = false)
	public int getZoom() {
		return this.zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
	}

	@Column(name = "READCOUNT", nullable = false)
	public int getReadcount() {
		return this.readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	@Column(name = "STARSUM", nullable = false)
	public int getStarsum() {
		return this.starsum;
	}

	public void setStarsum(int starsum) {
		this.starsum = starsum;
	}

	@Column(name = "STARUSERSUM", nullable = false)
	public int getStarusersum() {
		return this.starusersum;
	}

	public void setStarusersum(int starusersum) {
		this.starusersum = starusersum;
	}

	@Column(name = "REPLYCOUNT", nullable = false)
	public int getReplycount() {
		return this.replycount;
	}

	public void setReplycount(int replycount) {
		this.replycount = replycount;
	}

	@Column(name = "GOUSERSUM", nullable = false)
	public int getGousersum() {
		return this.gousersum;
	}

	public void setGousersum(int gousersum) {
		this.gousersum = gousersum;
	}

	@Column(name = "COUPONTYPENAME", nullable = false, length = 45)
	public String getCoupontypename() {
		return this.coupontypename;
	}

	public void setCoupontypename(String coupontypename) {
		this.coupontypename = coupontypename;
	}

	@Column(name = "COUPONTYPEID", nullable = false, length = 20)
	public String getCoupontypeid() {
		return this.coupontypeid;
	}

	public void setCoupontypeid(String coupontypeid) {
		this.coupontypeid = coupontypeid;
	}

}
