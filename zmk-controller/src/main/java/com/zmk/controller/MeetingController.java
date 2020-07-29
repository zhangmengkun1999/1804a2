package com.zmk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zmk.bean.Meeting;
import com.zmk.service.MeetingService;

@Controller
public class MeetingController {
	
	@Resource
	private MeetingService meetingService;

	@RequestMapping("list")
	public String selm(Model model,@RequestParam(defaultValue="1")Integer pageNum) {
		PageHelper.startPage(pageNum, 2);
		List<Meeting> list = meetingService.selm();
		PageInfo<Meeting> page = new PageInfo<Meeting>(list);
		model.addAttribute("page",page);
		return "list";
		
	}
	
	@RequestMapping("add")
	@ResponseBody
	public boolean add( Meeting meeting) {
		try {
			meetingService.add(meeting);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
	}
}
