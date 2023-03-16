package com.cst.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Backs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int rbId;
	
	@Column(length=3, nullable=false)
	int rank;
	
	@Column(length=55, nullable=false)
	String name;
	
	@Column(length=55, nullable=false)
	String team;
	
	@Column(length=2, nullable=false)
	int byeWeek;
	
	@Column(length=10, nullable=false)
	float points;
	
	@Column(length=3, nullable=false)
	int rushAttempts;
	
	@Column(length=10, nullable=false)
	float rushYards;
	
	@Column(length=2, nullable=false)
	int rushTds;
	
	@Column(length=3, nullable=false)
	int receptions;
	
	@Column(length=10, nullable=false)
	float recYards;
	
	@Column(length=2, nullable=false)
	int recTds;
	
	@Column(length=2, nullable=false)
	int fumbles;
	
	@Column(length=2, nullable=false)
	int fumblesLost;
	
	@Column(length=10, nullable=false)
	float targetShare;
	
	@Column(length=10, nullable=false)
	float pointsGame;
	
	public Backs() {
		
	}

	public Backs(int rbId, int rank, String name, String team, int byeWeek, float points, int rushAttempts,
			float rushYards, int rushTds, int receptions, float recYards, int recTds, int fumbles, int fumblesLost,
			float targetShare, float pointsGame) {
		this.rbId = rbId;
		this.rank = rank;
		this.name = name;
		this.team = team;
		this.byeWeek = byeWeek;
		this.points = points;
		this.rushAttempts = rushAttempts;
		this.rushYards = rushYards;
		this.rushTds = rushTds;
		this.receptions = receptions;
		this.recYards = recYards;
		this.recTds = recTds;
		this.fumbles = fumbles;
		this.fumblesLost = fumblesLost;
		this.targetShare = targetShare;
		this.pointsGame = pointsGame;
	}
	
	public Backs(int rank, String name, String team, int byeWeek, float points, int rushAttempts,
			float rushYards, int rushTds, int receptions, float recYards, int recTds, int fumbles, int fumblesLost,
			float targetShare, float pointsGame) {		
		this.rank = rank;
		this.name = name;
		this.team = team;
		this.byeWeek = byeWeek;
		this.points = points;
		this.rushAttempts = rushAttempts;
		this.rushYards = rushYards;
		this.rushTds = rushTds;
		this.receptions = receptions;
		this.recYards = recYards;
		this.recTds = recTds;
		this.fumbles = fumbles;
		this.fumblesLost = fumblesLost;
		this.targetShare = targetShare;
		this.pointsGame = pointsGame;
	}
	
	public Backs(int rbId) {
		this.rbId = rbId;
	}

	public int getRbId() {
		return rbId;
	}

	public void setRbId(int rbId) {
		this.rbId = rbId;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getByeWeek() {
		return byeWeek;
	}

	public void setByeWeek(int byeWeek) {
		this.byeWeek = byeWeek;
	}

	public float getPoints() {
		return points;
	}

	public void setPoints(float points) {
		this.points = points;
	}

	public int getRushAttempts() {
		return rushAttempts;
	}

	public void setRushAttempts(int rushAttempts) {
		this.rushAttempts = rushAttempts;
	}

	public float getRushYards() {
		return rushYards;
	}

	public void setRushYards(float rushYards) {
		this.rushYards = rushYards;
	}

	public int getRushTds() {
		return rushTds;
	}

	public void setRushTds(int rushTds) {
		this.rushTds = rushTds;
	}

	public int getReceptions() {
		return receptions;
	}

	public void setReceptions(int receptions) {
		this.receptions = receptions;
	}

	public float getRecYards() {
		return recYards;
	}

	public void setRecYards(float recYards) {
		this.recYards = recYards;
	}

	public int getRecTds() {
		return recTds;
	}

	public void setRecTds(int recTds) {
		this.recTds = recTds;
	}

	public int getFumbles() {
		return fumbles;
	}

	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}

	public int getFumblesLost() {
		return fumblesLost;
	}

	public void setFumblesLost(int fumblesLost) {
		this.fumblesLost = fumblesLost;
	}

	public float getTargetShare() {
		return targetShare;
	}

	public void setTargetShare(float targetShare) {
		this.targetShare = targetShare;
	}

	public float getPointsGame() {
		return pointsGame;
	}

	public void setPointsGame(float pointsGame) {
		this.pointsGame = pointsGame;
	}

	@Override
	public String toString() {
		return "Backs [rbId=" + rbId + ", rank=" + rank + ", name=" + name + ", team=" + team + ", byeWeek=" + byeWeek
				+ ", points=" + points + ", rushAttempts=" + rushAttempts + ", rushYards=" + rushYards + ", rushTds="
				+ rushTds + ", receptions=" + receptions + ", recYards=" + recYards + ", recTds=" + recTds
				+ ", fumbles=" + fumbles + ", fumblesLost=" + fumblesLost + ", targetShare=" + targetShare
				+ ", pointsGame=" + pointsGame + "]";
	}
	
	
}
