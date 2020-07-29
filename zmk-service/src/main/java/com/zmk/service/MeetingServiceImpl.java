package com.zmk.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zmk.bean.Meeting;
import com.zmk.mapper.MeetingMapper;

@Service
public class MeetingServiceImpl implements MeetingService {
	
	@Resource
	private MeetingMapper meetingMapper;
	
	@Override
	public List<Meeting> selm() {
		// TODO Auto-generated method stub
		return meetingMapper.selm();
	}

	@Override
	public void add(Meeting meeting) {
		// TODO Auto-generated method stub
		meetingMapper.add(meeting);
	}
	
}
