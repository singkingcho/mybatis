package com.bdqn.bean;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table player
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Player {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column player.player_id
	 * @mbg.generated
	 */
	private Integer playerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column player.player_name
	 * @mbg.generated
	 */
	private String playerName;
 
	
	private Team team;
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column player.player_id
	 * @return  the value of player.player_id
	 * @mbg.generated
	 */
	public Integer getPlayerId() {
		return playerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column player.player_id
	 * @param playerId  the value for player.player_id
	 * @mbg.generated
	 */
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column player.player_name
	 * @return  the value of player.player_name
	 * @mbg.generated
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column player.player_name
	 * @param playerName  the value for player.player_name
	 * @mbg.generated
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName == null ? null : playerName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column player.team_id
	 * @return  the value of player.team_id
	 * @mbg.generated
	 */
 
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName +  ", team=" + team
				+ "]";
	}

	 
	 
	
}