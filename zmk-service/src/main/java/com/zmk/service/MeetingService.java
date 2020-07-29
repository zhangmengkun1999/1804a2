package com.zmk.service;

import java.util.List;

import com.zmk.bean.Meeting;

public interface MeetingService {
	
	public List<Meeting> selm();
	
	public void add(Meeting meeting);
}
