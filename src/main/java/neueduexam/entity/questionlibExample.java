package neueduexam.entity;

import java.util.ArrayList;
import java.util.List;

public class questionlibExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public questionlibExample() {
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

        public Criteria andLibidIsNull() {
            addCriterion("libId is null");
            return (Criteria) this;
        }

        public Criteria andLibidIsNotNull() {
            addCriterion("libId is not null");
            return (Criteria) this;
        }

        public Criteria andLibidEqualTo(Integer value) {
            addCriterion("libId =", value, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidNotEqualTo(Integer value) {
            addCriterion("libId <>", value, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidGreaterThan(Integer value) {
            addCriterion("libId >", value, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidGreaterThanOrEqualTo(Integer value) {
            addCriterion("libId >=", value, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidLessThan(Integer value) {
            addCriterion("libId <", value, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidLessThanOrEqualTo(Integer value) {
            addCriterion("libId <=", value, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidIn(List<Integer> values) {
            addCriterion("libId in", values, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidNotIn(List<Integer> values) {
            addCriterion("libId not in", values, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidBetween(Integer value1, Integer value2) {
            addCriterion("libId between", value1, value2, "libid");
            return (Criteria) this;
        }

        public Criteria andLibidNotBetween(Integer value1, Integer value2) {
            addCriterion("libId not between", value1, value2, "libid");
            return (Criteria) this;
        }

        public Criteria andLibnameIsNull() {
            addCriterion("libName is null");
            return (Criteria) this;
        }

        public Criteria andLibnameIsNotNull() {
            addCriterion("libName is not null");
            return (Criteria) this;
        }

        public Criteria andLibnameEqualTo(String value) {
            addCriterion("libName =", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameNotEqualTo(String value) {
            addCriterion("libName <>", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameGreaterThan(String value) {
            addCriterion("libName >", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameGreaterThanOrEqualTo(String value) {
            addCriterion("libName >=", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameLessThan(String value) {
            addCriterion("libName <", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameLessThanOrEqualTo(String value) {
            addCriterion("libName <=", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameLike(String value) {
            addCriterion("libName like", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameNotLike(String value) {
            addCriterion("libName not like", value, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameIn(List<String> values) {
            addCriterion("libName in", values, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameNotIn(List<String> values) {
            addCriterion("libName not in", values, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameBetween(String value1, String value2) {
            addCriterion("libName between", value1, value2, "libname");
            return (Criteria) this;
        }

        public Criteria andLibnameNotBetween(String value1, String value2) {
            addCriterion("libName not between", value1, value2, "libname");
            return (Criteria) this;
        }

        public Criteria andLibtypeIsNull() {
            addCriterion("libType is null");
            return (Criteria) this;
        }

        public Criteria andLibtypeIsNotNull() {
            addCriterion("libType is not null");
            return (Criteria) this;
        }

        public Criteria andLibtypeEqualTo(String value) {
            addCriterion("libType =", value, "libtype");
            return (Criteria) this;
        }

        public Criteria andLibtypeNotEqualTo(String value) {
            addCriterion("libType <>", value, "libtype");
            return (Criteria) this;
        }

        public Criteria andLibtypeGreaterThan(String value) {
            addCriterion("libType >", value, "libtype");
            return (Criteria) this;
        }

        public Criteria andLibtypeGreaterThanOrEqualTo(String value) {
            addCriterion("libType >=", value, "libtype");
            return (Criteria) this;
        }

        public Criteria andLibtypeLessThan(String value) {
            addCriterion("libType <", value, "libtype");
            return (Criteria) this;
        }

        public Criteria andLibtypeLessThanOrEqualTo(String value) {
            addCriterion("libType <=", value, "libtype");
            return (Criteria) this;
        }

        public Criteria andLibtypeLike(String value) {
            addCriterion("libType like", value, "libtype");
            return (Criteria) this;
        }

        public Criteria andLibtypeNotLike(String value) {
            addCriterion("libType not like", value, "libtype");
            return (Criteria) this;
        }

        public Criteria andLibtypeIn(List<String> values) {
            addCriterion("libType in", values, "libtype");
            return (Criteria) this;
        }

        public Criteria andLibtypeNotIn(List<String> values) {
            addCriterion("libType not in", values, "libtype");
            return (Criteria) this;
        }

        public Criteria andLibtypeBetween(String value1, String value2) {
            addCriterion("libType between", value1, value2, "libtype");
            return (Criteria) this;
        }

        public Criteria andLibtypeNotBetween(String value1, String value2) {
            addCriterion("libType not between", value1, value2, "libtype");
            return (Criteria) this;
        }

        public Criteria andLibpriceIsNull() {
            addCriterion("libPrice is null");
            return (Criteria) this;
        }

        public Criteria andLibpriceIsNotNull() {
            addCriterion("libPrice is not null");
            return (Criteria) this;
        }

        public Criteria andLibpriceEqualTo(Integer value) {
            addCriterion("libPrice =", value, "libprice");
            return (Criteria) this;
        }

        public Criteria andLibpriceNotEqualTo(Integer value) {
            addCriterion("libPrice <>", value, "libprice");
            return (Criteria) this;
        }

        public Criteria andLibpriceGreaterThan(Integer value) {
            addCriterion("libPrice >", value, "libprice");
            return (Criteria) this;
        }

        public Criteria andLibpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("libPrice >=", value, "libprice");
            return (Criteria) this;
        }

        public Criteria andLibpriceLessThan(Integer value) {
            addCriterion("libPrice <", value, "libprice");
            return (Criteria) this;
        }

        public Criteria andLibpriceLessThanOrEqualTo(Integer value) {
            addCriterion("libPrice <=", value, "libprice");
            return (Criteria) this;
        }

        public Criteria andLibpriceIn(List<Integer> values) {
            addCriterion("libPrice in", values, "libprice");
            return (Criteria) this;
        }

        public Criteria andLibpriceNotIn(List<Integer> values) {
            addCriterion("libPrice not in", values, "libprice");
            return (Criteria) this;
        }

        public Criteria andLibpriceBetween(Integer value1, Integer value2) {
            addCriterion("libPrice between", value1, value2, "libprice");
            return (Criteria) this;
        }

        public Criteria andLibpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("libPrice not between", value1, value2, "libprice");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickName is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickName is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickName =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickName >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickName <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickName like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickName not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickName in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickName not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andQuesamountIsNull() {
            addCriterion("quesAmount is null");
            return (Criteria) this;
        }

        public Criteria andQuesamountIsNotNull() {
            addCriterion("quesAmount is not null");
            return (Criteria) this;
        }

        public Criteria andQuesamountEqualTo(Integer value) {
            addCriterion("quesAmount =", value, "quesamount");
            return (Criteria) this;
        }

        public Criteria andQuesamountNotEqualTo(Integer value) {
            addCriterion("quesAmount <>", value, "quesamount");
            return (Criteria) this;
        }

        public Criteria andQuesamountGreaterThan(Integer value) {
            addCriterion("quesAmount >", value, "quesamount");
            return (Criteria) this;
        }

        public Criteria andQuesamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("quesAmount >=", value, "quesamount");
            return (Criteria) this;
        }

        public Criteria andQuesamountLessThan(Integer value) {
            addCriterion("quesAmount <", value, "quesamount");
            return (Criteria) this;
        }

        public Criteria andQuesamountLessThanOrEqualTo(Integer value) {
            addCriterion("quesAmount <=", value, "quesamount");
            return (Criteria) this;
        }

        public Criteria andQuesamountIn(List<Integer> values) {
            addCriterion("quesAmount in", values, "quesamount");
            return (Criteria) this;
        }

        public Criteria andQuesamountNotIn(List<Integer> values) {
            addCriterion("quesAmount not in", values, "quesamount");
            return (Criteria) this;
        }

        public Criteria andQuesamountBetween(Integer value1, Integer value2) {
            addCriterion("quesAmount between", value1, value2, "quesamount");
            return (Criteria) this;
        }

        public Criteria andQuesamountNotBetween(Integer value1, Integer value2) {
            addCriterion("quesAmount not between", value1, value2, "quesamount");
            return (Criteria) this;
        }

        public Criteria andLibprofileIsNull() {
            addCriterion("libProfile is null");
            return (Criteria) this;
        }

        public Criteria andLibprofileIsNotNull() {
            addCriterion("libProfile is not null");
            return (Criteria) this;
        }

        public Criteria andLibprofileEqualTo(String value) {
            addCriterion("libProfile =", value, "libprofile");
            return (Criteria) this;
        }

        public Criteria andLibprofileNotEqualTo(String value) {
            addCriterion("libProfile <>", value, "libprofile");
            return (Criteria) this;
        }

        public Criteria andLibprofileGreaterThan(String value) {
            addCriterion("libProfile >", value, "libprofile");
            return (Criteria) this;
        }

        public Criteria andLibprofileGreaterThanOrEqualTo(String value) {
            addCriterion("libProfile >=", value, "libprofile");
            return (Criteria) this;
        }

        public Criteria andLibprofileLessThan(String value) {
            addCriterion("libProfile <", value, "libprofile");
            return (Criteria) this;
        }

        public Criteria andLibprofileLessThanOrEqualTo(String value) {
            addCriterion("libProfile <=", value, "libprofile");
            return (Criteria) this;
        }

        public Criteria andLibprofileLike(String value) {
            addCriterion("libProfile like", value, "libprofile");
            return (Criteria) this;
        }

        public Criteria andLibprofileNotLike(String value) {
            addCriterion("libProfile not like", value, "libprofile");
            return (Criteria) this;
        }

        public Criteria andLibprofileIn(List<String> values) {
            addCriterion("libProfile in", values, "libprofile");
            return (Criteria) this;
        }

        public Criteria andLibprofileNotIn(List<String> values) {
            addCriterion("libProfile not in", values, "libprofile");
            return (Criteria) this;
        }

        public Criteria andLibprofileBetween(String value1, String value2) {
            addCriterion("libProfile between", value1, value2, "libprofile");
            return (Criteria) this;
        }

        public Criteria andLibprofileNotBetween(String value1, String value2) {
            addCriterion("libProfile not between", value1, value2, "libprofile");
            return (Criteria) this;
        }

        public Criteria andNumofpurchasesIsNull() {
            addCriterion("numOfPurchases is null");
            return (Criteria) this;
        }

        public Criteria andNumofpurchasesIsNotNull() {
            addCriterion("numOfPurchases is not null");
            return (Criteria) this;
        }

        public Criteria andNumofpurchasesEqualTo(Integer value) {
            addCriterion("numOfPurchases =", value, "numofpurchases");
            return (Criteria) this;
        }

        public Criteria andNumofpurchasesNotEqualTo(Integer value) {
            addCriterion("numOfPurchases <>", value, "numofpurchases");
            return (Criteria) this;
        }

        public Criteria andNumofpurchasesGreaterThan(Integer value) {
            addCriterion("numOfPurchases >", value, "numofpurchases");
            return (Criteria) this;
        }

        public Criteria andNumofpurchasesGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOfPurchases >=", value, "numofpurchases");
            return (Criteria) this;
        }

        public Criteria andNumofpurchasesLessThan(Integer value) {
            addCriterion("numOfPurchases <", value, "numofpurchases");
            return (Criteria) this;
        }

        public Criteria andNumofpurchasesLessThanOrEqualTo(Integer value) {
            addCriterion("numOfPurchases <=", value, "numofpurchases");
            return (Criteria) this;
        }

        public Criteria andNumofpurchasesIn(List<Integer> values) {
            addCriterion("numOfPurchases in", values, "numofpurchases");
            return (Criteria) this;
        }

        public Criteria andNumofpurchasesNotIn(List<Integer> values) {
            addCriterion("numOfPurchases not in", values, "numofpurchases");
            return (Criteria) this;
        }

        public Criteria andNumofpurchasesBetween(Integer value1, Integer value2) {
            addCriterion("numOfPurchases between", value1, value2, "numofpurchases");
            return (Criteria) this;
        }

        public Criteria andNumofpurchasesNotBetween(Integer value1, Integer value2) {
            addCriterion("numOfPurchases not between", value1, value2, "numofpurchases");
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

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(String value) {
            addCriterion("publishTime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(String value) {
            addCriterion("publishTime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(String value) {
            addCriterion("publishTime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(String value) {
            addCriterion("publishTime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(String value) {
            addCriterion("publishTime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(String value) {
            addCriterion("publishTime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLike(String value) {
            addCriterion("publishTime like", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotLike(String value) {
            addCriterion("publishTime not like", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<String> values) {
            addCriterion("publishTime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<String> values) {
            addCriterion("publishTime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(String value1, String value2) {
            addCriterion("publishTime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(String value1, String value2) {
            addCriterion("publishTime not between", value1, value2, "publishtime");
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