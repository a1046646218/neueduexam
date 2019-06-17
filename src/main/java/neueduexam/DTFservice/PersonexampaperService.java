package neueduexam.DTFservice;

import java.util.ArrayList;
import java.util.List;

import neueduexam.entity.personexampaper;

public interface PersonexampaperService {
	public List<personexampaper> getAlreadyPaperByUserID(int i);

	public List<personexampaper> getNotAlreadyPaperByUserID(int i);
}
