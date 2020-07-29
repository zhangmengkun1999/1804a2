package com.zmk.bean;

public class Meeting {
	private Integer id;
	private Integer code;
	private String name;
	private String starttime;
	private String endtime;
	private String creare_time;
	private Integer tid;
	private String tname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getCreare_time() {
		return creare_time;
	}
	public void setCreare_time(String creare_time) {
		this.creare_time = creare_time;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Meeting(Integer id, Integer code, String name, String starttime, String endtime, String creare_time,
			Integer tid, String tname) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.starttime = starttime;
		this.endtime = endtime;
		this.creare_time = creare_time;
		this.tid = tid;
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Meeting [id=" + id + ", code=" + code + ", name=" + name + ", starttime=" + starttime + ", endtime="
				+ endtime + ", creare_time=" + creare_time + ", tid=" + tid + ", tname=" + tname + "]";
	}
	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
