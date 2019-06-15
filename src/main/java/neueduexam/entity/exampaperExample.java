package neueduexam.entity;

import java.util.ArrayList;
import java.util.List;

public class exampaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public exampaperExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andExamidIsNull() {
            addCriterion("examId is null");
            return (Criteria) this;
        }

        public Criteria andExamidIsNotNull() {
            addCriterion("examId is not null");
            return (Criteria) this;
        }

        public Criteria andExamidEqualTo(Integer value) {
            addCriterion("examId =", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidNotEqualTo(Integer value) {
            addCriterion("examId <>", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidGreaterThan(Integer value) {
            addCriterion("examId >", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("examId >=", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidLessThan(Integer value) {
            addCriterion("examId <", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidLessThanOrEqualTo(Integer value) {
            addCriterion("examId <=", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidIn(List<Integer> values) {
            addCriterion("examId in", values, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidNotIn(List<Integer> values) {
            addCriterion("examId not in", values, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidBetween(Integer value1, Integer value2) {
            addCriterion("examId between", value1, value2, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidNotBetween(Integer value1, Integer value2) {
            addCriterion("examId not between", value1, value2, "examid");
            return (Criteria) this;
        }

        public Criteria andExamnameIsNull() {
            addCriterion("examName is null");
            return (Criteria) this;
        }

        public Criteria andExamnameIsNotNull() {
            addCriterion("examName is not null");
            return (Criteria) this;
        }

        public Criteria andExamnameEqualTo(String value) {
            addCriterion("examName =", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameNotEqualTo(String value) {
            addCriterion("examName <>", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameGreaterThan(String value) {
            addCriterion("examName >", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameGreaterThanOrEqualTo(String value) {
            addCriterion("examName >=", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameLessThan(String value) {
            addCriterion("examName <", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameLessThanOrEqualTo(String value) {
            addCriterion("examName <=", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameLike(String value) {
            addCriterion("examName like", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameNotLike(String value) {
            addCriterion("examName not like", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameIn(List<String> values) {
            addCriterion("examName in", values, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameNotIn(List<String> values) {
            addCriterion("examName not in", values, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameBetween(String value1, String value2) {
            addCriterion("examName between", value1, value2, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameNotBetween(String value1, String value2) {
            addCriterion("examName not between", value1, value2, "examname");
            return (Criteria) this;
        }

        public Criteria andExamtypeIsNull() {
            addCriterion("examType is null");
            return (Criteria) this;
        }

        public Criteria andExamtypeIsNotNull() {
            addCriterion("examType is not null");
            return (Criteria) this;
        }

        public Criteria andExamtypeEqualTo(String value) {
            addCriterion("examType =", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotEqualTo(String value) {
            addCriterion("examType <>", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeGreaterThan(String value) {
            addCriterion("examType >", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeGreaterThanOrEqualTo(String value) {
            addCriterion("examType >=", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeLessThan(String value) {
            addCriterion("examType <", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeLessThanOrEqualTo(String value) {
            addCriterion("examType <=", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeLike(String value) {
            addCriterion("examType like", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotLike(String value) {
            addCriterion("examType not like", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeIn(List<String> values) {
            addCriterion("examType in", values, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotIn(List<String> values) {
            addCriterion("examType not in", values, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeBetween(String value1, String value2) {
            addCriterion("examType between", value1, value2, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotBetween(String value1, String value2) {
            addCriterion("examType not between", value1, value2, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamprofileIsNull() {
            addCriterion("examProfile is null");
            return (Criteria) this;
        }

        public Criteria andExamprofileIsNotNull() {
            addCriterion("examProfile is not null");
            return (Criteria) this;
        }

        public Criteria andExamprofileEqualTo(String value) {
            addCriterion("examProfile =", value, "examprofile");
            return (Criteria) this;
        }

        public Criteria andExamprofileNotEqualTo(String value) {
            addCriterion("examProfile <>", value, "examprofile");
            return (Criteria) this;
        }

        public Criteria andExamprofileGreaterThan(String value) {
            addCriterion("examProfile >", value, "examprofile");
            return (Criteria) this;
        }

        public Criteria andExamprofileGreaterThanOrEqualTo(String value) {
            addCriterion("examProfile >=", value, "examprofile");
            return (Criteria) this;
        }

        public Criteria andExamprofileLessThan(String value) {
            addCriterion("examProfile <", value, "examprofile");
            return (Criteria) this;
        }

        public Criteria andExamprofileLessThanOrEqualTo(String value) {
            addCriterion("examProfile <=", value, "examprofile");
            return (Criteria) this;
        }

        public Criteria andExamprofileLike(String value) {
            addCriterion("examProfile like", value, "examprofile");
            return (Criteria) this;
        }

        public Criteria andExamprofileNotLike(String value) {
            addCriterion("examProfile not like", value, "examprofile");
            return (Criteria) this;
        }

        public Criteria andExamprofileIn(List<String> values) {
            addCriterion("examProfile in", values, "examprofile");
            return (Criteria) this;
        }

        public Criteria andExamprofileNotIn(List<String> values) {
            addCriterion("examProfile not in", values, "examprofile");
            return (Criteria) this;
        }

        public Criteria andExamprofileBetween(String value1, String value2) {
            addCriterion("examProfile between", value1, value2, "examprofile");
            return (Criteria) this;
        }

        public Criteria andExamprofileNotBetween(String value1, String value2) {
            addCriterion("examProfile not between", value1, value2, "examprofile");
            return (Criteria) this;
        }

        public Criteria andEuseridIsNull() {
            addCriterion("eUserId is null");
            return (Criteria) this;
        }

        public Criteria andEuseridIsNotNull() {
            addCriterion("eUserId is not null");
            return (Criteria) this;
        }

        public Criteria andEuseridEqualTo(Integer value) {
            addCriterion("eUserId =", value, "euserid");
            return (Criteria) this;
        }

        public Criteria andEuseridNotEqualTo(Integer value) {
            addCriterion("eUserId <>", value, "euserid");
            return (Criteria) this;
        }

        public Criteria andEuseridGreaterThan(Integer value) {
            addCriterion("eUserId >", value, "euserid");
            return (Criteria) this;
        }

        public Criteria andEuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("eUserId >=", value, "euserid");
            return (Criteria) this;
        }

        public Criteria andEuseridLessThan(Integer value) {
            addCriterion("eUserId <", value, "euserid");
            return (Criteria) this;
        }

        public Criteria andEuseridLessThanOrEqualTo(Integer value) {
            addCriterion("eUserId <=", value, "euserid");
            return (Criteria) this;
        }

        public Criteria andEuseridIn(List<Integer> values) {
            addCriterion("eUserId in", values, "euserid");
            return (Criteria) this;
        }

        public Criteria andEuseridNotIn(List<Integer> values) {
            addCriterion("eUserId not in", values, "euserid");
            return (Criteria) this;
        }

        public Criteria andEuseridBetween(Integer value1, Integer value2) {
            addCriterion("eUserId between", value1, value2, "euserid");
            return (Criteria) this;
        }

        public Criteria andEuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("eUserId not between", value1, value2, "euserid");
            return (Criteria) this;
        }

        public Criteria andEnicknameIsNull() {
            addCriterion("eNickName is null");
            return (Criteria) this;
        }

        public Criteria andEnicknameIsNotNull() {
            addCriterion("eNickName is not null");
            return (Criteria) this;
        }

        public Criteria andEnicknameEqualTo(String value) {
            addCriterion("eNickName =", value, "enickname");
            return (Criteria) this;
        }

        public Criteria andEnicknameNotEqualTo(String value) {
            addCriterion("eNickName <>", value, "enickname");
            return (Criteria) this;
        }

        public Criteria andEnicknameGreaterThan(String value) {
            addCriterion("eNickName >", value, "enickname");
            return (Criteria) this;
        }

        public Criteria andEnicknameGreaterThanOrEqualTo(String value) {
            addCriterion("eNickName >=", value, "enickname");
            return (Criteria) this;
        }

        public Criteria andEnicknameLessThan(String value) {
            addCriterion("eNickName <", value, "enickname");
            return (Criteria) this;
        }

        public Criteria andEnicknameLessThanOrEqualTo(String value) {
            addCriterion("eNickName <=", value, "enickname");
            return (Criteria) this;
        }

        public Criteria andEnicknameLike(String value) {
            addCriterion("eNickName like", value, "enickname");
            return (Criteria) this;
        }

        public Criteria andEnicknameNotLike(String value) {
            addCriterion("eNickName not like", value, "enickname");
            return (Criteria) this;
        }

        public Criteria andEnicknameIn(List<String> values) {
            addCriterion("eNickName in", values, "enickname");
            return (Criteria) this;
        }

        public Criteria andEnicknameNotIn(List<String> values) {
            addCriterion("eNickName not in", values, "enickname");
            return (Criteria) this;
        }

        public Criteria andEnicknameBetween(String value1, String value2) {
            addCriterion("eNickName between", value1, value2, "enickname");
            return (Criteria) this;
        }

        public Criteria andEnicknameNotBetween(String value1, String value2) {
            addCriterion("eNickName not between", value1, value2, "enickname");
            return (Criteria) this;
        }

        public Criteria andNumofquestionsIsNull() {
            addCriterion("numOfQuestions is null");
            return (Criteria) this;
        }

        public Criteria andNumofquestionsIsNotNull() {
            addCriterion("numOfQuestions is not null");
            return (Criteria) this;
        }

        public Criteria andNumofquestionsEqualTo(Integer value) {
            addCriterion("numOfQuestions =", value, "numofquestions");
            return (Criteria) this;
        }

        public Criteria andNumofquestionsNotEqualTo(Integer value) {
            addCriterion("numOfQuestions <>", value, "numofquestions");
            return (Criteria) this;
        }

        public Criteria andNumofquestionsGreaterThan(Integer value) {
            addCriterion("numOfQuestions >", value, "numofquestions");
            return (Criteria) this;
        }

        public Criteria andNumofquestionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOfQuestions >=", value, "numofquestions");
            return (Criteria) this;
        }

        public Criteria andNumofquestionsLessThan(Integer value) {
            addCriterion("numOfQuestions <", value, "numofquestions");
            return (Criteria) this;
        }

        public Criteria andNumofquestionsLessThanOrEqualTo(Integer value) {
            addCriterion("numOfQuestions <=", value, "numofquestions");
            return (Criteria) this;
        }

        public Criteria andNumofquestionsIn(List<Integer> values) {
            addCriterion("numOfQuestions in", values, "numofquestions");
            return (Criteria) this;
        }

        public Criteria andNumofquestionsNotIn(List<Integer> values) {
            addCriterion("numOfQuestions not in", values, "numofquestions");
            return (Criteria) this;
        }

        public Criteria andNumofquestionsBetween(Integer value1, Integer value2) {
            addCriterion("numOfQuestions between", value1, value2, "numofquestions");
            return (Criteria) this;
        }

        public Criteria andNumofquestionsNotBetween(Integer value1, Integer value2) {
            addCriterion("numOfQuestions not between", value1, value2, "numofquestions");
            return (Criteria) this;
        }

        public Criteria andNumofsingleIsNull() {
            addCriterion("numOfSingle is null");
            return (Criteria) this;
        }

        public Criteria andNumofsingleIsNotNull() {
            addCriterion("numOfSingle is not null");
            return (Criteria) this;
        }

        public Criteria andNumofsingleEqualTo(Integer value) {
            addCriterion("numOfSingle =", value, "numofsingle");
            return (Criteria) this;
        }

        public Criteria andNumofsingleNotEqualTo(Integer value) {
            addCriterion("numOfSingle <>", value, "numofsingle");
            return (Criteria) this;
        }

        public Criteria andNumofsingleGreaterThan(Integer value) {
            addCriterion("numOfSingle >", value, "numofsingle");
            return (Criteria) this;
        }

        public Criteria andNumofsingleGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOfSingle >=", value, "numofsingle");
            return (Criteria) this;
        }

        public Criteria andNumofsingleLessThan(Integer value) {
            addCriterion("numOfSingle <", value, "numofsingle");
            return (Criteria) this;
        }

        public Criteria andNumofsingleLessThanOrEqualTo(Integer value) {
            addCriterion("numOfSingle <=", value, "numofsingle");
            return (Criteria) this;
        }

        public Criteria andNumofsingleIn(List<Integer> values) {
            addCriterion("numOfSingle in", values, "numofsingle");
            return (Criteria) this;
        }

        public Criteria andNumofsingleNotIn(List<Integer> values) {
            addCriterion("numOfSingle not in", values, "numofsingle");
            return (Criteria) this;
        }

        public Criteria andNumofsingleBetween(Integer value1, Integer value2) {
            addCriterion("numOfSingle between", value1, value2, "numofsingle");
            return (Criteria) this;
        }

        public Criteria andNumofsingleNotBetween(Integer value1, Integer value2) {
            addCriterion("numOfSingle not between", value1, value2, "numofsingle");
            return (Criteria) this;
        }

        public Criteria andNumofmultipleIsNull() {
            addCriterion("numOfMultiple is null");
            return (Criteria) this;
        }

        public Criteria andNumofmultipleIsNotNull() {
            addCriterion("numOfMultiple is not null");
            return (Criteria) this;
        }

        public Criteria andNumofmultipleEqualTo(Integer value) {
            addCriterion("numOfMultiple =", value, "numofmultiple");
            return (Criteria) this;
        }

        public Criteria andNumofmultipleNotEqualTo(Integer value) {
            addCriterion("numOfMultiple <>", value, "numofmultiple");
            return (Criteria) this;
        }

        public Criteria andNumofmultipleGreaterThan(Integer value) {
            addCriterion("numOfMultiple >", value, "numofmultiple");
            return (Criteria) this;
        }

        public Criteria andNumofmultipleGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOfMultiple >=", value, "numofmultiple");
            return (Criteria) this;
        }

        public Criteria andNumofmultipleLessThan(Integer value) {
            addCriterion("numOfMultiple <", value, "numofmultiple");
            return (Criteria) this;
        }

        public Criteria andNumofmultipleLessThanOrEqualTo(Integer value) {
            addCriterion("numOfMultiple <=", value, "numofmultiple");
            return (Criteria) this;
        }

        public Criteria andNumofmultipleIn(List<Integer> values) {
            addCriterion("numOfMultiple in", values, "numofmultiple");
            return (Criteria) this;
        }

        public Criteria andNumofmultipleNotIn(List<Integer> values) {
            addCriterion("numOfMultiple not in", values, "numofmultiple");
            return (Criteria) this;
        }

        public Criteria andNumofmultipleBetween(Integer value1, Integer value2) {
            addCriterion("numOfMultiple between", value1, value2, "numofmultiple");
            return (Criteria) this;
        }

        public Criteria andNumofmultipleNotBetween(Integer value1, Integer value2) {
            addCriterion("numOfMultiple not between", value1, value2, "numofmultiple");
            return (Criteria) this;
        }

        public Criteria andNumofjudgeIsNull() {
            addCriterion("numOfJudge is null");
            return (Criteria) this;
        }

        public Criteria andNumofjudgeIsNotNull() {
            addCriterion("numOfJudge is not null");
            return (Criteria) this;
        }

        public Criteria andNumofjudgeEqualTo(Integer value) {
            addCriterion("numOfJudge =", value, "numofjudge");
            return (Criteria) this;
        }

        public Criteria andNumofjudgeNotEqualTo(Integer value) {
            addCriterion("numOfJudge <>", value, "numofjudge");
            return (Criteria) this;
        }

        public Criteria andNumofjudgeGreaterThan(Integer value) {
            addCriterion("numOfJudge >", value, "numofjudge");
            return (Criteria) this;
        }

        public Criteria andNumofjudgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOfJudge >=", value, "numofjudge");
            return (Criteria) this;
        }

        public Criteria andNumofjudgeLessThan(Integer value) {
            addCriterion("numOfJudge <", value, "numofjudge");
            return (Criteria) this;
        }

        public Criteria andNumofjudgeLessThanOrEqualTo(Integer value) {
            addCriterion("numOfJudge <=", value, "numofjudge");
            return (Criteria) this;
        }

        public Criteria andNumofjudgeIn(List<Integer> values) {
            addCriterion("numOfJudge in", values, "numofjudge");
            return (Criteria) this;
        }

        public Criteria andNumofjudgeNotIn(List<Integer> values) {
            addCriterion("numOfJudge not in", values, "numofjudge");
            return (Criteria) this;
        }

        public Criteria andNumofjudgeBetween(Integer value1, Integer value2) {
            addCriterion("numOfJudge between", value1, value2, "numofjudge");
            return (Criteria) this;
        }

        public Criteria andNumofjudgeNotBetween(Integer value1, Integer value2) {
            addCriterion("numOfJudge not between", value1, value2, "numofjudge");
            return (Criteria) this;
        }

        public Criteria andNumofblankIsNull() {
            addCriterion("numOfBlank is null");
            return (Criteria) this;
        }

        public Criteria andNumofblankIsNotNull() {
            addCriterion("numOfBlank is not null");
            return (Criteria) this;
        }

        public Criteria andNumofblankEqualTo(Integer value) {
            addCriterion("numOfBlank =", value, "numofblank");
            return (Criteria) this;
        }

        public Criteria andNumofblankNotEqualTo(Integer value) {
            addCriterion("numOfBlank <>", value, "numofblank");
            return (Criteria) this;
        }

        public Criteria andNumofblankGreaterThan(Integer value) {
            addCriterion("numOfBlank >", value, "numofblank");
            return (Criteria) this;
        }

        public Criteria andNumofblankGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOfBlank >=", value, "numofblank");
            return (Criteria) this;
        }

        public Criteria andNumofblankLessThan(Integer value) {
            addCriterion("numOfBlank <", value, "numofblank");
            return (Criteria) this;
        }

        public Criteria andNumofblankLessThanOrEqualTo(Integer value) {
            addCriterion("numOfBlank <=", value, "numofblank");
            return (Criteria) this;
        }

        public Criteria andNumofblankIn(List<Integer> values) {
            addCriterion("numOfBlank in", values, "numofblank");
            return (Criteria) this;
        }

        public Criteria andNumofblankNotIn(List<Integer> values) {
            addCriterion("numOfBlank not in", values, "numofblank");
            return (Criteria) this;
        }

        public Criteria andNumofblankBetween(Integer value1, Integer value2) {
            addCriterion("numOfBlank between", value1, value2, "numofblank");
            return (Criteria) this;
        }

        public Criteria andNumofblankNotBetween(Integer value1, Integer value2) {
            addCriterion("numOfBlank not between", value1, value2, "numofblank");
            return (Criteria) this;
        }

        public Criteria andNumofanswerIsNull() {
            addCriterion("numOfAnswer is null");
            return (Criteria) this;
        }

        public Criteria andNumofanswerIsNotNull() {
            addCriterion("numOfAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andNumofanswerEqualTo(Integer value) {
            addCriterion("numOfAnswer =", value, "numofanswer");
            return (Criteria) this;
        }

        public Criteria andNumofanswerNotEqualTo(Integer value) {
            addCriterion("numOfAnswer <>", value, "numofanswer");
            return (Criteria) this;
        }

        public Criteria andNumofanswerGreaterThan(Integer value) {
            addCriterion("numOfAnswer >", value, "numofanswer");
            return (Criteria) this;
        }

        public Criteria andNumofanswerGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOfAnswer >=", value, "numofanswer");
            return (Criteria) this;
        }

        public Criteria andNumofanswerLessThan(Integer value) {
            addCriterion("numOfAnswer <", value, "numofanswer");
            return (Criteria) this;
        }

        public Criteria andNumofanswerLessThanOrEqualTo(Integer value) {
            addCriterion("numOfAnswer <=", value, "numofanswer");
            return (Criteria) this;
        }

        public Criteria andNumofanswerIn(List<Integer> values) {
            addCriterion("numOfAnswer in", values, "numofanswer");
            return (Criteria) this;
        }

        public Criteria andNumofanswerNotIn(List<Integer> values) {
            addCriterion("numOfAnswer not in", values, "numofanswer");
            return (Criteria) this;
        }

        public Criteria andNumofanswerBetween(Integer value1, Integer value2) {
            addCriterion("numOfAnswer between", value1, value2, "numofanswer");
            return (Criteria) this;
        }

        public Criteria andNumofanswerNotBetween(Integer value1, Integer value2) {
            addCriterion("numOfAnswer not between", value1, value2, "numofanswer");
            return (Criteria) this;
        }

        public Criteria andOther1IsNull() {
            addCriterion("other1 is null");
            return (Criteria) this;
        }

        public Criteria andOther1IsNotNull() {
            addCriterion("other1 is not null");
            return (Criteria) this;
        }

        public Criteria andOther1EqualTo(String value) {
            addCriterion("other1 =", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotEqualTo(String value) {
            addCriterion("other1 <>", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThan(String value) {
            addCriterion("other1 >", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThanOrEqualTo(String value) {
            addCriterion("other1 >=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThan(String value) {
            addCriterion("other1 <", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThanOrEqualTo(String value) {
            addCriterion("other1 <=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Like(String value) {
            addCriterion("other1 like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotLike(String value) {
            addCriterion("other1 not like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1In(List<String> values) {
            addCriterion("other1 in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotIn(List<String> values) {
            addCriterion("other1 not in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Between(String value1, String value2) {
            addCriterion("other1 between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotBetween(String value1, String value2) {
            addCriterion("other1 not between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther2IsNull() {
            addCriterion("other2 is null");
            return (Criteria) this;
        }

        public Criteria andOther2IsNotNull() {
            addCriterion("other2 is not null");
            return (Criteria) this;
        }

        public Criteria andOther2EqualTo(String value) {
            addCriterion("other2 =", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotEqualTo(String value) {
            addCriterion("other2 <>", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThan(String value) {
            addCriterion("other2 >", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThanOrEqualTo(String value) {
            addCriterion("other2 >=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThan(String value) {
            addCriterion("other2 <", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThanOrEqualTo(String value) {
            addCriterion("other2 <=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Like(String value) {
            addCriterion("other2 like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotLike(String value) {
            addCriterion("other2 not like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2In(List<String> values) {
            addCriterion("other2 in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotIn(List<String> values) {
            addCriterion("other2 not in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Between(String value1, String value2) {
            addCriterion("other2 between", value1, value2, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotBetween(String value1, String value2) {
            addCriterion("other2 not between", value1, value2, "other2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}