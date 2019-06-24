package neueduexam.MJservice;

import java.util.List;

import neueduexam.entity.record;

public interface PayRecordService {
	public List<record> selectByBuyerandSeller(int userid);
}
