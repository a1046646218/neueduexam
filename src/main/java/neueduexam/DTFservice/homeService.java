package neueduexam.DTFservice;

import java.util.List;

import neueduexam.entity.homework;

public interface homeService {
	public List<homework> gethomeworklistbygroupid(int groupid);
	public int addhomework(int groupid,String content);
}
