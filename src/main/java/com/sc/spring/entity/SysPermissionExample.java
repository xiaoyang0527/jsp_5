package com.sc.spring.entity;

import java.util.ArrayList;
import java.util.List;

public class SysPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPermissionExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("sys_permission.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("sys_permission.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("sys_permission.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("sys_permission.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("sys_permission.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_permission.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("sys_permission.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_permission.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("sys_permission.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("sys_permission.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("sys_permission.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_permission.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("sys_permission.`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("sys_permission.`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("sys_permission.`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("sys_permission.`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("sys_permission.`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_permission.`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("sys_permission.`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("sys_permission.`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("sys_permission.`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("sys_permission.`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("sys_permission.`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("sys_permission.`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("sys_permission.`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("sys_permission.`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("sys_permission.`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("sys_permission.`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("sys_permission.`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("sys_permission.`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("sys_permission.`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_permission.`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("sys_permission.`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("sys_permission.`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("sys_permission.`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("sys_permission.`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("sys_permission.`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("sys_permission.`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("sys_permission.`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("sys_permission.`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("sys_permission.url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("sys_permission.url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("sys_permission.url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("sys_permission.url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("sys_permission.url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("sys_permission.url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("sys_permission.url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("sys_permission.url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("sys_permission.url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("sys_permission.url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("sys_permission.url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("sys_permission.url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("sys_permission.url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("sys_permission.url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPercodeIsNull() {
            addCriterion("sys_permission.percode is null");
            return (Criteria) this;
        }

        public Criteria andPercodeIsNotNull() {
            addCriterion("sys_permission.percode is not null");
            return (Criteria) this;
        }

        public Criteria andPercodeEqualTo(String value) {
            addCriterion("sys_permission.percode =", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeNotEqualTo(String value) {
            addCriterion("sys_permission.percode <>", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeGreaterThan(String value) {
            addCriterion("sys_permission.percode >", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_permission.percode >=", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeLessThan(String value) {
            addCriterion("sys_permission.percode <", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeLessThanOrEqualTo(String value) {
            addCriterion("sys_permission.percode <=", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeLike(String value) {
            addCriterion("sys_permission.percode like", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeNotLike(String value) {
            addCriterion("sys_permission.percode not like", value, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeIn(List<String> values) {
            addCriterion("sys_permission.percode in", values, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeNotIn(List<String> values) {
            addCriterion("sys_permission.percode not in", values, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeBetween(String value1, String value2) {
            addCriterion("sys_permission.percode between", value1, value2, "percode");
            return (Criteria) this;
        }

        public Criteria andPercodeNotBetween(String value1, String value2) {
            addCriterion("sys_permission.percode not between", value1, value2, "percode");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("sys_permission.parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("sys_permission.parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Long value) {
            addCriterion("sys_permission.parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Long value) {
            addCriterion("sys_permission.parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Long value) {
            addCriterion("sys_permission.parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_permission.parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Long value) {
            addCriterion("sys_permission.parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Long value) {
            addCriterion("sys_permission.parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Long> values) {
            addCriterion("sys_permission.parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Long> values) {
            addCriterion("sys_permission.parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Long value1, Long value2) {
            addCriterion("sys_permission.parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Long value1, Long value2) {
            addCriterion("sys_permission.parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidsIsNull() {
            addCriterion("sys_permission.parentids is null");
            return (Criteria) this;
        }

        public Criteria andParentidsIsNotNull() {
            addCriterion("sys_permission.parentids is not null");
            return (Criteria) this;
        }

        public Criteria andParentidsEqualTo(String value) {
            addCriterion("sys_permission.parentids =", value, "parentids");
            return (Criteria) this;
        }

        public Criteria andParentidsNotEqualTo(String value) {
            addCriterion("sys_permission.parentids <>", value, "parentids");
            return (Criteria) this;
        }

        public Criteria andParentidsGreaterThan(String value) {
            addCriterion("sys_permission.parentids >", value, "parentids");
            return (Criteria) this;
        }

        public Criteria andParentidsGreaterThanOrEqualTo(String value) {
            addCriterion("sys_permission.parentids >=", value, "parentids");
            return (Criteria) this;
        }

        public Criteria andParentidsLessThan(String value) {
            addCriterion("sys_permission.parentids <", value, "parentids");
            return (Criteria) this;
        }

        public Criteria andParentidsLessThanOrEqualTo(String value) {
            addCriterion("sys_permission.parentids <=", value, "parentids");
            return (Criteria) this;
        }

        public Criteria andParentidsLike(String value) {
            addCriterion("sys_permission.parentids like", value, "parentids");
            return (Criteria) this;
        }

        public Criteria andParentidsNotLike(String value) {
            addCriterion("sys_permission.parentids not like", value, "parentids");
            return (Criteria) this;
        }

        public Criteria andParentidsIn(List<String> values) {
            addCriterion("sys_permission.parentids in", values, "parentids");
            return (Criteria) this;
        }

        public Criteria andParentidsNotIn(List<String> values) {
            addCriterion("sys_permission.parentids not in", values, "parentids");
            return (Criteria) this;
        }

        public Criteria andParentidsBetween(String value1, String value2) {
            addCriterion("sys_permission.parentids between", value1, value2, "parentids");
            return (Criteria) this;
        }

        public Criteria andParentidsNotBetween(String value1, String value2) {
            addCriterion("sys_permission.parentids not between", value1, value2, "parentids");
            return (Criteria) this;
        }

        public Criteria andSortstringIsNull() {
            addCriterion("sys_permission.sortstring is null");
            return (Criteria) this;
        }

        public Criteria andSortstringIsNotNull() {
            addCriterion("sys_permission.sortstring is not null");
            return (Criteria) this;
        }

        public Criteria andSortstringEqualTo(String value) {
            addCriterion("sys_permission.sortstring =", value, "sortstring");
            return (Criteria) this;
        }

        public Criteria andSortstringNotEqualTo(String value) {
            addCriterion("sys_permission.sortstring <>", value, "sortstring");
            return (Criteria) this;
        }

        public Criteria andSortstringGreaterThan(String value) {
            addCriterion("sys_permission.sortstring >", value, "sortstring");
            return (Criteria) this;
        }

        public Criteria andSortstringGreaterThanOrEqualTo(String value) {
            addCriterion("sys_permission.sortstring >=", value, "sortstring");
            return (Criteria) this;
        }

        public Criteria andSortstringLessThan(String value) {
            addCriterion("sys_permission.sortstring <", value, "sortstring");
            return (Criteria) this;
        }

        public Criteria andSortstringLessThanOrEqualTo(String value) {
            addCriterion("sys_permission.sortstring <=", value, "sortstring");
            return (Criteria) this;
        }

        public Criteria andSortstringLike(String value) {
            addCriterion("sys_permission.sortstring like", value, "sortstring");
            return (Criteria) this;
        }

        public Criteria andSortstringNotLike(String value) {
            addCriterion("sys_permission.sortstring not like", value, "sortstring");
            return (Criteria) this;
        }

        public Criteria andSortstringIn(List<String> values) {
            addCriterion("sys_permission.sortstring in", values, "sortstring");
            return (Criteria) this;
        }

        public Criteria andSortstringNotIn(List<String> values) {
            addCriterion("sys_permission.sortstring not in", values, "sortstring");
            return (Criteria) this;
        }

        public Criteria andSortstringBetween(String value1, String value2) {
            addCriterion("sys_permission.sortstring between", value1, value2, "sortstring");
            return (Criteria) this;
        }

        public Criteria andSortstringNotBetween(String value1, String value2) {
            addCriterion("sys_permission.sortstring not between", value1, value2, "sortstring");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNull() {
            addCriterion("sys_permission.available is null");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("sys_permission.available is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableEqualTo(String value) {
            addCriterion("sys_permission.available =", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotEqualTo(String value) {
            addCriterion("sys_permission.available <>", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThan(String value) {
            addCriterion("sys_permission.available >", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("sys_permission.available >=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThan(String value) {
            addCriterion("sys_permission.available <", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThanOrEqualTo(String value) {
            addCriterion("sys_permission.available <=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLike(String value) {
            addCriterion("sys_permission.available like", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotLike(String value) {
            addCriterion("sys_permission.available not like", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableIn(List<String> values) {
            addCriterion("sys_permission.available in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotIn(List<String> values) {
            addCriterion("sys_permission.available not in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableBetween(String value1, String value2) {
            addCriterion("sys_permission.available between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotBetween(String value1, String value2) {
            addCriterion("sys_permission.available not between", value1, value2, "available");
            return (Criteria) this;
        }
    }

    /**
     */
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