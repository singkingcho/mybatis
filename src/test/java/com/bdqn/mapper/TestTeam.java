package com.bdqn.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bdqn.bean.Team;

public class TestTeam {

	
	@Test
	public void m1()  {
		SqlSession session =  SessionFactoryUtil.getSession();
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		Team team = new Team();
		team.setTeamId(5);
		team.setTeamName("魔术队");
		mapper.insertTeam(team);
		session.commit();
		session.close();
	}
	
	@Test
	public void m2()  {
		SqlSession session =  SessionFactoryUtil.getSession();
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		List<Team> li =  mapper.selectByIds(list);
		for (Team team : li) {
			System.out.println(team);
		}
//		session.commit();
		session.close();
	}
	
	@Test
	public void m3()  {
		SqlSession session =  SessionFactoryUtil.getSession();
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		Team t = new Team();
		t.setTeamName("骑士队");
		List<Team> list =  mapper.selectByTeam(t);
		for (Team team : list) {
			System.out.println(team);
		}
//		session.commit();
		session.close();
	}
	
	@Test
	public void m4()  {
		SqlSession session =  SessionFactoryUtil.getSession();
		TeamMapper mapper = session.getMapper(TeamMapper.class);
		Team t = new Team();
//		t.setTeamName("骑士队");
		t.setTeamId(5);
		int row = mapper.update(t);
		System.out.println("row:" + row);
		session.commit();
		session.close();
	}
}
