package neueduexam.DTFservice;
import java.util.List;

import neueduexam.entity.exampaper;

public interface ExamPaperService {
	public List<exampaper> getexampaperListbyuserid(int userid);
}
