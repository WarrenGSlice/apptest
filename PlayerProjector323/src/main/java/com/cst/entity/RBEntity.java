package com.cst.entity;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.GenerationType;

@Table("RUNNINGBACKS")
public class RBEntity {

	//Variables
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Integer rbId;
		
		@Column("RANK")
		public Integer rank;
		@Column("NAME")
		public String name;
		@Column("TEAM")
		public String team;
		@Column("BYE_WEEK")
		public Integer byeWeek;
		@Column("POINTS")
		public Float points;
		@Column("RUSH_ATTEMPTS")
		public Integer rushAttempts;
		@Column("RUSH_YARDS")
		public Float rushYards;
		@Column("RUSH_TDS")
		public Integer rushTds;
		@Column("RECEPTIONS")
		public Integer receptions;
		@Column("REC_YARDS")
		public Float recYards;
		@Column("REC_TDS")
		public Integer recTds;
		@Column("FUM")
		public Integer fumbles;
		@Column("FUM_LOST")
		public Integer fumblesLost;
		@Column("TARGET_SHARE")
		public Float targetShare;
		@Column("POINTS_GAME")
		public Float pointsGame;
		
		public RBEntity() {
			
		}
		
		public RBEntity(RBEntity rb) {
			rbId = rb.getRbId();
			rank = rb.getRank();
			name = rb.getName();
			team = rb.getTeam();
			byeWeek = rb.getByeWeek();
			points = rb.getPoints();
			rushAttempts = rb.getRushAttempts();
			rushYards = rb.getRushYards();
			rushTds = rb.getRushTds();
			receptions = rb.getReceptions();
			recYards = rb.getRecYards();
			recTds = rb.getRecTds();
			fumbles = rb.getFumbles();
			fumblesLost = rb.getFumblesLost();
			targetShare = rb.getTargetShare();
			pointsGame = rb.getPointsGame();
		}
		
		public RBEntity Construct(String input) {
			rbId = -1;
			rank = -1;
			name = "";
			team = "";
			byeWeek = -1;
			points = -1f;
			rushAttempts = -1;
			rushYards = -1f;
			rushTds = -1;
			receptions = -1;
			recYards = -1f;
			recTds = -1;
			fumbles = -1;
			fumblesLost = -1;
			targetShare = -1f;
			pointsGame = -1.00f;
			return new RBEntity(rbId = -1, rank = -1, name = "", team = "", byeWeek = -1, points = -1f, rushAttempts = -1, rushYards = -1f, rushTds = -1,
					receptions = -1, recYards = -1f, recTds = -1, fumbles = -1, fumblesLost = -1, targetShare = -1f, pointsGame = -1f);
		}
		
		public RBEntity(Integer rbId, Integer rank, String name, String team, Integer byeWeek, Float points,
				Integer rushAttempts, Float rushYards, Integer rushTds, Integer receptions, Float recYards, Integer recTds,
				Integer fumbles, Integer fumblesLost, Float targetShare, Float pointsGame) {
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
		
		public RBEntity(Integer rank, String name, String team, Integer byeWeek, Float points,
				Integer rushAttempts, Float rushYards, Integer rushTds, Integer receptions, Float recYards, Integer recTds,
				Integer fumbles, Integer fumblesLost, Float targetShare, Float pointsGame) {
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
		
		public RBEntity(Integer rbId) {
			this.rbId = rbId;
		}
		
		
		
		public RBEntity(String[] playerArray) {
			this.rbId = Integer.parseInt(playerArray[0]);
			this.rank = Integer.parseInt(playerArray[1]);
			this.name = playerArray[2];
			this.team = playerArray[3];
			this.byeWeek = Integer.parseInt(playerArray[4]);
			this.points = Float.parseFloat(playerArray[5]);
			this.rushAttempts = Integer.parseInt(playerArray[6]);
			this.rushYards = Float.parseFloat(playerArray[7]);
			this.rushTds = Integer.parseInt(playerArray[8]);
			this.receptions = Integer.parseInt(playerArray[9]);
			this.recYards = Float.parseFloat(playerArray[10]);
			this.recTds = Integer.parseInt(playerArray[11]);
			this.fumbles = Integer.parseInt(playerArray[12]);
			this.fumblesLost = Integer.parseInt(playerArray[13]);
			this.targetShare = Float.parseFloat(playerArray[14]);
			this.pointsGame = Float.parseFloat(playerArray[15]);
					
		}

		public Integer getRbId() {
			return rbId;
		}

		public void setRbId(Integer rbId) {
			this.rbId = rbId;
		}

		public Integer getRank() {
			return rank;
		}

		public void setRank(Integer rank) {
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

		public Integer getByeWeek() {
			return byeWeek;
		}

		public void setByeWeek(Integer byeWeek) {
			this.byeWeek = byeWeek;
		}

		public Float getPoints() {
			return points;
		}

		public void setPoints(Float points) {
			this.points = points;
		}

		public Integer getRushAttempts() {
			return rushAttempts;
		}

		public void setRushAttempts(Integer rushAttempts) {
			this.rushAttempts = rushAttempts;
		}

		public Float getRushYards() {
			return rushYards;
		}

		public void setRushYards(Float rushYards) {
			this.rushYards = rushYards;
		}

		public Integer getRushTds() {
			return rushTds;
		}

		public void setRushTds(Integer rushTds) {
			this.rushTds = rushTds;
		}

		public Integer getReceptions() {
			return receptions;
		}

		public void setReceptions(Integer receptions) {
			this.receptions = receptions;
		}

		public Float getRecYards() {
			return recYards;
		}

		public void setRecYards(Float recYards) {
			this.recYards = recYards;
		}

		public Integer getRecTds() {
			return recTds;
		}

		public void setRecTds(Integer recTds) {
			this.recTds = recTds;
		}

		public Integer getFumbles() {
			return fumbles;
		}

		public void setFumbles(Integer fumbles) {
			this.fumbles = fumbles;
		}

		public Integer getFumblesLost() {
			return fumblesLost;
		}

		public void setFumblesLost(Integer fumblesLost) {
			this.fumblesLost = fumblesLost;
		}

		public Float getTargetShare() {
			return targetShare;
		}

		public void setTargetShare(Float targetShare) {
			this.targetShare = targetShare;
		}

		public Float getPointsGame() {
			return pointsGame;
		}

		public void setPointsGame(Float pointsGame) {
			this.pointsGame = pointsGame;
		}
		
		
		
		@Override
		public String toString() {
			return "RBEntity [rbId=" + rbId + ", rank=" + rank + ", name=" + name + ", team=" + team + ", byeWeek="
					+ byeWeek + ", points=" + points + ", rushAttempts=" + rushAttempts + ", rushYards=" + rushYards
					+ ", rushTds=" + rushTds + ", receptions=" + receptions + ", recYards=" + recYards + ", recTds="
					+ recTds + ", fumbles=" + fumbles + ", fumblesLost=" + fumblesLost + ", targetShare=" + targetShare
					+ ", pointsGame=" + pointsGame + "]";
		}

		public void populate(RBEntity bean2) {
			RBEntity bean = new RBEntity();
			bean.setRbId(bean.getRbId());
			bean.setRank(bean.getRank());
			bean.setName(bean.getName());
			bean.setTeam(bean.getTeam());
			bean.setByeWeek(bean.getByeWeek());
			bean.setPoints(bean.getPoints());
			bean.setRushAttempts(bean.getRushAttempts());
			bean.setRushYards(bean.getRushYards());
			bean.setRushTds(bean.getRushTds());
			bean.setReceptions(bean.getReceptions());
			bean.setRecYards(bean.getRecYards());
			bean.setRecTds(bean.getRecTds());
			bean.setFumbles(bean.getFumbles());
			bean.setFumblesLost(bean.getFumblesLost());
			bean.setTargetShare(bean.getTargetShare());
			bean.setPointsGame(bean.getPointsGame());
		}
	
}
