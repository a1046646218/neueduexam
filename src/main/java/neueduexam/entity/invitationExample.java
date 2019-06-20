package neueduexam.entity;

import java.util.ArrayList;
import java.util.List;

public class invitationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public invitationExample() {
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

        public Criteria andInvitationtimeIsNull() {
            addCriterion("invitationTime is null");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeIsNotNull() {
            addCriterion("invitationTime is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeEqualTo(String value) {
            addCriterion("invitationTime =", value, "invitationtime");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeNotEqualTo(String value) {
            addCriterion("invitationTime <>", value, "invitationtime");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeGreaterThan(String value) {
            addCriterion("invitationTime >", value, "invitationtime");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("invitationTime >=", value, "invitationtime");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeLessThan(String value) {
            addCriterion("invitationTime <", value, "invitationtime");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeLessThanOrEqualTo(String value) {
            addCriterion("invitationTime <=", value, "invitationtime");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeLike(String value) {
            addCriterion("invitationTime like", value, "invitationtime");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeNotLike(String value) {
            addCriterion("invitationTime not like", value, "invitationtime");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeIn(List<String> values) {
            addCriterion("invitationTime in", values, "invitationtime");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeNotIn(List<String> values) {
            addCriterion("invitationTime not in", values, "invitationtime");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeBetween(String value1, String value2) {
            addCriterion("invitationTime between", value1, value2, "invitationtime");
            return (Criteria) this;
        }

        public Criteria andInvitationtimeNotBetween(String value1, String value2) {
            addCriterion("invitationTime not between", value1, value2, "invitationtime");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNull() {
            addCriterion("studentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("studentId =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("studentId <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("studentId >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentId >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("studentId <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("studentId <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("studentId in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("studentId not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("studentId between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentId not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStuphoneIsNull() {
            addCriterion("stuPhone is null");
            return (Criteria) this;
        }

        public Criteria andStuphoneIsNotNull() {
            addCriterion("stuPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStuphoneEqualTo(String value) {
            addCriterion("stuPhone =", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotEqualTo(String value) {
            addCriterion("stuPhone <>", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneGreaterThan(String value) {
            addCriterion("stuPhone >", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneGreaterThanOrEqualTo(String value) {
            addCriterion("stuPhone >=", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLessThan(String value) {
            addCriterion("stuPhone <", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLessThanOrEqualTo(String value) {
            addCriterion("stuPhone <=", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLike(String value) {
            addCriterion("stuPhone like", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotLike(String value) {
            addCriterion("stuPhone not like", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneIn(List<String> values) {
            addCriterion("stuPhone in", values, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotIn(List<String> values) {
            addCriterion("stuPhone not in", values, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneBetween(String value1, String value2) {
            addCriterion("stuPhone between", value1, value2, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotBetween(String value1, String value2) {
            addCriterion("stuPhone not between", value1, value2, "stuphone");
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

        public Criteria andInvitecodeIsNull() {
            addCriterion("inviteCode is null");
            return (Criteria) this;
        }

        public Criteria andInvitecodeIsNotNull() {
            addCriterion("inviteCode is not null");
            return (Criteria) this;
        }

        public Criteria andInvitecodeEqualTo(String value) {
            addCriterion("inviteCode =", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotEqualTo(String value) {
            addCriterion("inviteCode <>", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeGreaterThan(String value) {
            addCriterion("inviteCode >", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeGreaterThanOrEqualTo(String value) {
            addCriterion("inviteCode >=", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeLessThan(String value) {
            addCriterion("inviteCode <", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeLessThanOrEqualTo(String value) {
            addCriterion("inviteCode <=", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeLike(String value) {
            addCriterion("inviteCode like", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotLike(String value) {
            addCriterion("inviteCode not like", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeIn(List<String> values) {
            addCriterion("inviteCode in", values, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotIn(List<String> values) {
            addCriterion("inviteCode not in", values, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeBetween(String value1, String value2) {
            addCriterion("inviteCode between", value1, value2, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotBetween(String value1, String value2) {
            addCriterion("inviteCode not between", value1, value2, "invitecode");
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

        public Criteria andOhter2IsNull() {
            addCriterion("ohter2 is null");
            return (Criteria) this;
        }

        public Criteria andOhter2IsNotNull() {
            addCriterion("ohter2 is not null");
            return (Criteria) this;
        }

        public Criteria andOhter2EqualTo(String value) {
            addCriterion("ohter2 =", value, "ohter2");
            return (Criteria) this;
        }

        public Criteria andOhter2NotEqualTo(String value) {
            addCriterion("ohter2 <>", value, "ohter2");
            return (Criteria) this;
        }

        public Criteria andOhter2GreaterThan(String value) {
            addCriterion("ohter2 >", value, "ohter2");
            return (Criteria) this;
        }

        public Criteria andOhter2GreaterThanOrEqualTo(String value) {
            addCriterion("ohter2 >=", value, "ohter2");
            return (Criteria) this;
        }

        public Criteria andOhter2LessThan(String value) {
            addCriterion("ohter2 <", value, "ohter2");
            return (Criteria) this;
        }

        public Criteria andOhter2LessThanOrEqualTo(String value) {
            addCriterion("ohter2 <=", value, "ohter2");
            return (Criteria) this;
        }

        public Criteria andOhter2Like(String value) {
            addCriterion("ohter2 like", value, "ohter2");
            return (Criteria) this;
        }

        public Criteria andOhter2NotLike(String value) {
            addCriterion("ohter2 not like", value, "ohter2");
            return (Criteria) this;
        }

        public Criteria andOhter2In(List<String> values) {
            addCriterion("ohter2 in", values, "ohter2");
            return (Criteria) this;
        }

        public Criteria andOhter2NotIn(List<String> values) {
            addCriterion("ohter2 not in", values, "ohter2");
            return (Criteria) this;
        }

        public Criteria andOhter2Between(String value1, String value2) {
            addCriterion("ohter2 between", value1, value2, "ohter2");
            return (Criteria) this;
        }

        public Criteria andOhter2NotBetween(String value1, String value2) {
            addCriterion("ohter2 not between", value1, value2, "ohter2");
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