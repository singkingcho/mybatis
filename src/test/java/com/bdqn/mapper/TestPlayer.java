package com.bdqn.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bdqn.bean.Player;

public class TestPlayer {

	@Test
	public void m1() {
		SqlSession session = SessionFactoryUtil.getSession();
		PlayerMapper mapper = session.getMapper(PlayerMapper.class);
		Player player = new Player();
		player.setPlayerName("韦德");
		Player p  = mapper.selectByPlayer(player);
		System.out.println(p);
		session.close();
	}
}
