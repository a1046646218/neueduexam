package neueduexam.DTFservice;

import java.util.HashMap;
import java.util.List;

import neueduexam.entity.invitation;

public interface inviteServcie {
	public int insertService(invitation in);
	public List<invitation> getWeekInvite(int i);
}
