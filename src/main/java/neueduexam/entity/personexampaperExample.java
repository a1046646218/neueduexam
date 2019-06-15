package neueduexam.entity;

import java.util.ArrayList;
import java.util.List;

public class personexampaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public personexampaperExample() {
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

        public Criteria andPexamidIsNull() {
            addCriterion("pExamId is null");
            return (Criteria) this;
        }

        public Criteria andPexamidIsNotNull() {
            addCriterion("pExamId is not null");
            return (Criteria) this;
        }

        public Criteria andPexamidEqualTo(Integer value) {
            addCriterion("pExamId =", value, "pexamid");
            return (Criteria) this;
        }

        public Criteria andPexamidNotEqualTo(Integer value) {
            addCriterion("pExamId <>", value, "pexamid");
            return (Criteria) this;
        }

        public Criteria andPexamidGreaterThan(Integer value) {
            addCriterion("pExamId >", value, "pexamid");
            return (Criteria) this;
        }

        public Criteria andPexamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pExamId >=", value, "pexamid");
            return (Criteria) this;
        }

        public Criteria andPexamidLessThan(Integer value) {
            addCriterion("pExamId <", value, "pexamid");
            return (Criteria) this;
        }

        public Criteria andPexamidLessThanOrEqualTo(Integer value) {
            addCriterion("pExamId <=", value, "pexamid");
            return (Criteria) this;
        }

        public Criteria andPexamidIn(List<Integer> values) {
            addCriterion("pExamId in", values, "pexamid");
            return (Criteria) this;
        }

        public Criteria andPexamidNotIn(List<Integer> values) {
            addCriterion("pExamId not in", values, "pexamid");
            return (Criteria) this;
        }

        public Criteria andPexamidBetween(Integer value1, Integer value2) {
            addCriterion("pExamId between", value1, value2, "pexamid");
            return (Criteria) this;
        }

        public Criteria andPexamidNotBetween(Integer value1, Integer value2) {
            addCriterion("pExamId not between", value1, value2, "pexamid");
            return (Criteria) this;
        }

        public Criteria andTestidIsNull() {
            addCriterion("testId is null");
            return (Criteria) this;
        }

        public Criteria andTestidIsNotNull() {
            addCriterion("testId is not null");
            return (Criteria) this;
        }

        public Criteria andTestidEqualTo(Integer value) {
            addCriterion("testId =", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotEqualTo(Integer value) {
            addCriterion("testId <>", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidGreaterThan(Integer value) {
            addCriterion("testId >", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidGreaterThanOrEqualTo(Integer value) {
            addCriterion("testId >=", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidLessThan(Integer value) {
            addCriterion("testId <", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidLessThanOrEqualTo(Integer value) {
            addCriterion("testId <=", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidIn(List<Integer> values) {
            addCriterion("testId in", values, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotIn(List<Integer> values) {
            addCriterion("testId not in", values, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidBetween(Integer value1, Integer value2) {
            addCriterion("testId between", value1, value2, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotBetween(Integer value1, Integer value2) {
            addCriterion("testId not between", value1, value2, "testid");
            return (Criteria) this;
        }

        public Criteria andStuidIsNull() {
            addCriterion("stuId is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuId is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuId =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuId <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuId >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuId >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuId <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuId <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuId in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuId not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuId between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuId not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andStunicknameIsNull() {
            addCriterion("stuNickName is null");
            return (Criteria) this;
        }

        public Criteria andStunicknameIsNotNull() {
            addCriterion("stuNickName is not null");
            return (Criteria) this;
        }

        public Criteria andStunicknameEqualTo(String value) {
            addCriterion("stuNickName =", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameNotEqualTo(String value) {
            addCriterion("stuNickName <>", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameGreaterThan(String value) {
            addCriterion("stuNickName >", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameGreaterThanOrEqualTo(String value) {
            addCriterion("stuNickName >=", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameLessThan(String value) {
            addCriterion("stuNickName <", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameLessThanOrEqualTo(String value) {
            addCriterion("stuNickName <=", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameLike(String value) {
            addCriterion("stuNickName like", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameNotLike(String value) {
            addCriterion("stuNickName not like", value, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameIn(List<String> values) {
            addCriterion("stuNickName in", values, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameNotIn(List<String> values) {
            addCriterion("stuNickName not in", values, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameBetween(String value1, String value2) {
            addCriterion("stuNickName between", value1, value2, "stunickname");
            return (Criteria) this;
        }

        public Criteria andStunicknameNotBetween(String value1, String value2) {
            addCriterion("stuNickName not between", value1, value2, "stunickname");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNull() {
            addCriterion("browser is null");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNotNull() {
            addCriterion("browser is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserEqualTo(String value) {
            addCriterion("browser =", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotEqualTo(String value) {
            addCriterion("browser <>", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThan(String value) {
            addCriterion("browser >", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThanOrEqualTo(String value) {
            addCriterion("browser >=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThan(String value) {
            addCriterion("browser <", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThanOrEqualTo(String value) {
            addCriterion("browser <=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLike(String value) {
            addCriterion("browser like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotLike(String value) {
            addCriterion("browser not like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserIn(List<String> values) {
            addCriterion("browser in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotIn(List<String> values) {
            addCriterion("browser not in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserBetween(String value1, String value2) {
            addCriterion("browser between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotBetween(String value1, String value2) {
            addCriterion("browser not between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNull() {
            addCriterion("ipAddress is null");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNotNull() {
            addCriterion("ipAddress is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddressEqualTo(String value) {
            addCriterion("ipAddress =", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotEqualTo(String value) {
            addCriterion("ipAddress <>", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThan(String value) {
            addCriterion("ipAddress >", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ipAddress >=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThan(String value) {
            addCriterion("ipAddress <", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThanOrEqualTo(String value) {
            addCriterion("ipAddress <=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLike(String value) {
            addCriterion("ipAddress like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotLike(String value) {
            addCriterion("ipAddress not like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressIn(List<String> values) {
            addCriterion("ipAddress in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotIn(List<String> values) {
            addCriterion("ipAddress not in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressBetween(String value1, String value2) {
            addCriterion("ipAddress between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotBetween(String value1, String value2) {
            addCriterion("ipAddress not between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemIsNull() {
            addCriterion("operatingSystem is null");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemIsNotNull() {
            addCriterion("operatingSystem is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemEqualTo(String value) {
            addCriterion("operatingSystem =", value, "operatingsystem");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemNotEqualTo(String value) {
            addCriterion("operatingSystem <>", value, "operatingsystem");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemGreaterThan(String value) {
            addCriterion("operatingSystem >", value, "operatingsystem");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemGreaterThanOrEqualTo(String value) {
            addCriterion("operatingSystem >=", value, "operatingsystem");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemLessThan(String value) {
            addCriterion("operatingSystem <", value, "operatingsystem");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemLessThanOrEqualTo(String value) {
            addCriterion("operatingSystem <=", value, "operatingsystem");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemLike(String value) {
            addCriterion("operatingSystem like", value, "operatingsystem");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemNotLike(String value) {
            addCriterion("operatingSystem not like", value, "operatingsystem");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemIn(List<String> values) {
            addCriterion("operatingSystem in", values, "operatingsystem");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemNotIn(List<String> values) {
            addCriterion("operatingSystem not in", values, "operatingsystem");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemBetween(String value1, String value2) {
            addCriterion("operatingSystem between", value1, value2, "operatingsystem");
            return (Criteria) this;
        }

        public Criteria andOperatingsystemNotBetween(String value1, String value2) {
            addCriterion("operatingSystem not between", value1, value2, "operatingsystem");
            return (Criteria) this;
        }

        public Criteria andChangeoutIsNull() {
            addCriterion("changeOut is null");
            return (Criteria) this;
        }

        public Criteria andChangeoutIsNotNull() {
            addCriterion("changeOut is not null");
            return (Criteria) this;
        }

        public Criteria andChangeoutEqualTo(Integer value) {
            addCriterion("changeOut =", value, "changeout");
            return (Criteria) this;
        }

        public Criteria andChangeoutNotEqualTo(Integer value) {
            addCriterion("changeOut <>", value, "changeout");
            return (Criteria) this;
        }

        public Criteria andChangeoutGreaterThan(Integer value) {
            addCriterion("changeOut >", value, "changeout");
            return (Criteria) this;
        }

        public Criteria andChangeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeOut >=", value, "changeout");
            return (Criteria) this;
        }

        public Criteria andChangeoutLessThan(Integer value) {
            addCriterion("changeOut <", value, "changeout");
            return (Criteria) this;
        }

        public Criteria andChangeoutLessThanOrEqualTo(Integer value) {
            addCriterion("changeOut <=", value, "changeout");
            return (Criteria) this;
        }

        public Criteria andChangeoutIn(List<Integer> values) {
            addCriterion("changeOut in", values, "changeout");
            return (Criteria) this;
        }

        public Criteria andChangeoutNotIn(List<Integer> values) {
            addCriterion("changeOut not in", values, "changeout");
            return (Criteria) this;
        }

        public Criteria andChangeoutBetween(Integer value1, Integer value2) {
            addCriterion("changeOut between", value1, value2, "changeout");
            return (Criteria) this;
        }

        public Criteria andChangeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("changeOut not between", value1, value2, "changeout");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(String value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(String value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(String value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(String value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(String value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(String value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLike(String value) {
            addCriterion("duration like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotLike(String value) {
            addCriterion("duration not like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<String> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<String> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(String value1, String value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(String value1, String value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andLocalIsNull() {
            addCriterion("local is null");
            return (Criteria) this;
        }

        public Criteria andLocalIsNotNull() {
            addCriterion("local is not null");
            return (Criteria) this;
        }

        public Criteria andLocalEqualTo(String value) {
            addCriterion("local =", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalNotEqualTo(String value) {
            addCriterion("local <>", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalGreaterThan(String value) {
            addCriterion("local >", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalGreaterThanOrEqualTo(String value) {
            addCriterion("local >=", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalLessThan(String value) {
            addCriterion("local <", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalLessThanOrEqualTo(String value) {
            addCriterion("local <=", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalLike(String value) {
            addCriterion("local like", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalNotLike(String value) {
            addCriterion("local not like", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalIn(List<String> values) {
            addCriterion("local in", values, "local");
            return (Criteria) this;
        }

        public Criteria andLocalNotIn(List<String> values) {
            addCriterion("local not in", values, "local");
            return (Criteria) this;
        }

        public Criteria andLocalBetween(String value1, String value2) {
            addCriterion("local between", value1, value2, "local");
            return (Criteria) this;
        }

        public Criteria andLocalNotBetween(String value1, String value2) {
            addCriterion("local not between", value1, value2, "local");
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