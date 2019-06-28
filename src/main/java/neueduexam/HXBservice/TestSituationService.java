package neueduexam.HXBservice;

import java.util.List;

import neueduexam.HXBservicelmp.TestSituationEntity;

public interface TestSituationService {

	String selectTestSituationByTestId(String testId);
	
	List<TestSituationEntity> MakeTestSituationExcelByTestId(String testId);

	String selectNumOfTestStateByTestId(int testId);

	String selectNumOfScoreByTestId(int testId);

}
