package neueduexam.entity;

import java.util.ArrayList;
import java.util.List;

public class personquestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public personquestionExample() {
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

        public Criteria andPerquesidIsNull() {
            addCriterion("perQuesId is null");
            return (Criteria) this;
        }

        public Criteria andPerquesidIsNotNull() {
            addCriterion("perQuesId is not null");
            return (Criteria) this;
        }

        public Criteria andPerquesidEqualTo(Integer value) {
            addCriterion("perQuesId =", value, "perquesid");
            return (Criteria) this;
        }

        public Criteria andPerquesidNotEqualTo(Integer value) {
            addCriterion("perQuesId <>", value, "perquesid");
            return (Criteria) this;
        }

        public Criteria andPerquesidGreaterThan(Integer value) {
            addCriterion("perQuesId >", value, "perquesid");
            return (Criteria) this;
        }

        public Criteria andPerquesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("perQuesId >=", value, "perquesid");
            return (Criteria) this;
        }

        public Criteria andPerquesidLessThan(Integer value) {
            addCriterion("perQuesId <", value, "perquesid");
            return (Criteria) this;
        }

        public Criteria andPerquesidLessThanOrEqualTo(Integer value) {
            addCriterion("perQuesId <=", value, "perquesid");
            return (Criteria) this;
        }

        public Criteria andPerquesidIn(List<Integer> values) {
            addCriterion("perQuesId in", values, "perquesid");
            return (Criteria) this;
        }

        public Criteria andPerquesidNotIn(List<Integer> values) {
            addCriterion("perQuesId not in", values, "perquesid");
            return (Criteria) this;
        }

        public Criteria andPerquesidBetween(Integer value1, Integer value2) {
            addCriterion("perQuesId between", value1, value2, "perquesid");
            return (Criteria) this;
        }

        public Criteria andPerquesidNotBetween(Integer value1, Integer value2) {
            addCriterion("perQuesId not between", value1, value2, "perquesid");
            return (Criteria) this;
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

        public Criteria andQuesidIsNull() {
            addCriterion("quesId is null");
            return (Criteria) this;
        }

        public Criteria andQuesidIsNotNull() {
            addCriterion("quesId is not null");
            return (Criteria) this;
        }

        public Criteria andQuesidEqualTo(Integer value) {
            addCriterion("quesId =", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidNotEqualTo(Integer value) {
            addCriterion("quesId <>", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidGreaterThan(Integer value) {
            addCriterion("quesId >", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("quesId >=", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidLessThan(Integer value) {
            addCriterion("quesId <", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidLessThanOrEqualTo(Integer value) {
            addCriterion("quesId <=", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidIn(List<Integer> values) {
            addCriterion("quesId in", values, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidNotIn(List<Integer> values) {
            addCriterion("quesId not in", values, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidBetween(Integer value1, Integer value2) {
            addCriterion("quesId between", value1, value2, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidNotBetween(Integer value1, Integer value2) {
            addCriterion("quesId not between", value1, value2, "quesid");
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

        public Criteria andStuanswerIsNull() {
            addCriterion("stuAnswer is null");
            return (Criteria) this;
        }

        public Criteria andStuanswerIsNotNull() {
            addCriterion("stuAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andStuanswerEqualTo(String value) {
            addCriterion("stuAnswer =", value, "stuanswer");
            return (Criteria) this;
        }

        public Criteria andStuanswerNotEqualTo(String value) {
            addCriterion("stuAnswer <>", value, "stuanswer");
            return (Criteria) this;
        }

        public Criteria andStuanswerGreaterThan(String value) {
            addCriterion("stuAnswer >", value, "stuanswer");
            return (Criteria) this;
        }

        public Criteria andStuanswerGreaterThanOrEqualTo(String value) {
            addCriterion("stuAnswer >=", value, "stuanswer");
            return (Criteria) this;
        }

        public Criteria andStuanswerLessThan(String value) {
            addCriterion("stuAnswer <", value, "stuanswer");
            return (Criteria) this;
        }

        public Criteria andStuanswerLessThanOrEqualTo(String value) {
            addCriterion("stuAnswer <=", value, "stuanswer");
            return (Criteria) this;
        }

        public Criteria andStuanswerLike(String value) {
            addCriterion("stuAnswer like", value, "stuanswer");
            return (Criteria) this;
        }

        public Criteria andStuanswerNotLike(String value) {
            addCriterion("stuAnswer not like", value, "stuanswer");
            return (Criteria) this;
        }

        public Criteria andStuanswerIn(List<String> values) {
            addCriterion("stuAnswer in", values, "stuanswer");
            return (Criteria) this;
        }

        public Criteria andStuanswerNotIn(List<String> values) {
            addCriterion("stuAnswer not in", values, "stuanswer");
            return (Criteria) this;
        }

        public Criteria andStuanswerBetween(String value1, String value2) {
            addCriterion("stuAnswer between", value1, value2, "stuanswer");
            return (Criteria) this;
        }

        public Criteria andStuanswerNotBetween(String value1, String value2) {
            addCriterion("stuAnswer not between", value1, value2, "stuanswer");
            return (Criteria) this;
        }

        public Criteria andStuscoreIsNull() {
            addCriterion("stuScore is null");
            return (Criteria) this;
        }

        public Criteria andStuscoreIsNotNull() {
            addCriterion("stuScore is not null");
            return (Criteria) this;
        }

        public Criteria andStuscoreEqualTo(Integer value) {
            addCriterion("stuScore =", value, "stuscore");
            return (Criteria) this;
        }

        public Criteria andStuscoreNotEqualTo(Integer value) {
            addCriterion("stuScore <>", value, "stuscore");
            return (Criteria) this;
        }

        public Criteria andStuscoreGreaterThan(Integer value) {
            addCriterion("stuScore >", value, "stuscore");
            return (Criteria) this;
        }

        public Criteria andStuscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuScore >=", value, "stuscore");
            return (Criteria) this;
        }

        public Criteria andStuscoreLessThan(Integer value) {
            addCriterion("stuScore <", value, "stuscore");
            return (Criteria) this;
        }

        public Criteria andStuscoreLessThanOrEqualTo(Integer value) {
            addCriterion("stuScore <=", value, "stuscore");
            return (Criteria) this;
        }

        public Criteria andStuscoreIn(List<Integer> values) {
            addCriterion("stuScore in", values, "stuscore");
            return (Criteria) this;
        }

        public Criteria andStuscoreNotIn(List<Integer> values) {
            addCriterion("stuScore not in", values, "stuscore");
            return (Criteria) this;
        }

        public Criteria andStuscoreBetween(Integer value1, Integer value2) {
            addCriterion("stuScore between", value1, value2, "stuscore");
            return (Criteria) this;
        }

        public Criteria andStuscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("stuScore not between", value1, value2, "stuscore");
            return (Criteria) this;
        }

        public Criteria andPerquesstateIsNull() {
            addCriterion("perQuesState is null");
            return (Criteria) this;
        }

        public Criteria andPerquesstateIsNotNull() {
            addCriterion("perQuesState is not null");
            return (Criteria) this;
        }

        public Criteria andPerquesstateEqualTo(String value) {
            addCriterion("perQuesState =", value, "perquesstate");
            return (Criteria) this;
        }

        public Criteria andPerquesstateNotEqualTo(String value) {
            addCriterion("perQuesState <>", value, "perquesstate");
            return (Criteria) this;
        }

        public Criteria andPerquesstateGreaterThan(String value) {
            addCriterion("perQuesState >", value, "perquesstate");
            return (Criteria) this;
        }

        public Criteria andPerquesstateGreaterThanOrEqualTo(String value) {
            addCriterion("perQuesState >=", value, "perquesstate");
            return (Criteria) this;
        }

        public Criteria andPerquesstateLessThan(String value) {
            addCriterion("perQuesState <", value, "perquesstate");
            return (Criteria) this;
        }

        public Criteria andPerquesstateLessThanOrEqualTo(String value) {
            addCriterion("perQuesState <=", value, "perquesstate");
            return (Criteria) this;
        }

        public Criteria andPerquesstateLike(String value) {
            addCriterion("perQuesState like", value, "perquesstate");
            return (Criteria) this;
        }

        public Criteria andPerquesstateNotLike(String value) {
            addCriterion("perQuesState not like", value, "perquesstate");
            return (Criteria) this;
        }

        public Criteria andPerquesstateIn(List<String> values) {
            addCriterion("perQuesState in", values, "perquesstate");
            return (Criteria) this;
        }

        public Criteria andPerquesstateNotIn(List<String> values) {
            addCriterion("perQuesState not in", values, "perquesstate");
            return (Criteria) this;
        }

        public Criteria andPerquesstateBetween(String value1, String value2) {
            addCriterion("perQuesState between", value1, value2, "perquesstate");
            return (Criteria) this;
        }

        public Criteria andPerquesstateNotBetween(String value1, String value2) {
            addCriterion("perQuesState not between", value1, value2, "perquesstate");
            return (Criteria) this;
        }

        public Criteria andPerquesscoreIsNull() {
            addCriterion("perQuesScore is null");
            return (Criteria) this;
        }

        public Criteria andPerquesscoreIsNotNull() {
            addCriterion("perQuesScore is not null");
            return (Criteria) this;
        }

        public Criteria andPerquesscoreEqualTo(Integer value) {
            addCriterion("perQuesScore =", value, "perquesscore");
            return (Criteria) this;
        }

        public Criteria andPerquesscoreNotEqualTo(Integer value) {
            addCriterion("perQuesScore <>", value, "perquesscore");
            return (Criteria) this;
        }

        public Criteria andPerquesscoreGreaterThan(Integer value) {
            addCriterion("perQuesScore >", value, "perquesscore");
            return (Criteria) this;
        }

        public Criteria andPerquesscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("perQuesScore >=", value, "perquesscore");
            return (Criteria) this;
        }

        public Criteria andPerquesscoreLessThan(Integer value) {
            addCriterion("perQuesScore <", value, "perquesscore");
            return (Criteria) this;
        }

        public Criteria andPerquesscoreLessThanOrEqualTo(Integer value) {
            addCriterion("perQuesScore <=", value, "perquesscore");
            return (Criteria) this;
        }

        public Criteria andPerquesscoreIn(List<Integer> values) {
            addCriterion("perQuesScore in", values, "perquesscore");
            return (Criteria) this;
        }

        public Criteria andPerquesscoreNotIn(List<Integer> values) {
            addCriterion("perQuesScore not in", values, "perquesscore");
            return (Criteria) this;
        }

        public Criteria andPerquesscoreBetween(Integer value1, Integer value2) {
            addCriterion("perQuesScore between", value1, value2, "perquesscore");
            return (Criteria) this;
        }

        public Criteria andPerquesscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("perQuesScore not between", value1, value2, "perquesscore");
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