package com.beyond.net.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beyond.net.dao.IplogDao;
import com.beyond.net.domain.Iplog;
import com.beyond.net.domain.IplogExample;

@Service
public class TestService {
	
	@Resource
	private IplogDao iplogDao;
	
	public Iplog selectUsers(){
		IplogExample example=new IplogExample();
		example.createCriteria().andIpEqualTo("123.123.253.131");
		
		return iplogDao.selectByExample(example).get(0);
	}

}
