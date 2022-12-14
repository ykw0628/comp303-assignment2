/*
 * Name: Mel Vincent Anonuevo & Kunwoo Yoon
 * ID#: 301167069 &
 * Date: Oct 28, 2022
 * */

package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sport")
public class Sports {
	@Id
	@Column(name="sportid")
	public int sportId;
	@Column(name="sportname")
	public String sportName;
	@Column(name="duration")
	public int duration;
	@Column(name="fee")
	public double fee;
	@Column(name="coachname")
	public String coachName;
	public int getSportId() {
		return sportId;
	}
	public void setSportId(int sportId) {
		this.sportId = sportId;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public Sports(int sportId, String sportName, int duration, double fee, String coachName) {
		super();
		this.sportId = sportId;
		this.sportName = sportName;
		this.duration = duration;
		this.fee = fee;
		this.coachName = coachName;
	}
	
	public Sports() {}
	
}
