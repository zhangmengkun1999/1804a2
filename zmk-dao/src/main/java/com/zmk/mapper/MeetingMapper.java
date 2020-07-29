package com.zmk.mapper;

import java.util.List;

import com.zmk.bean.Meeting;

public interface MeetingMapper {
		
	public List<Meeting> selm();
	
	public void add(Meeting meeting);
}
