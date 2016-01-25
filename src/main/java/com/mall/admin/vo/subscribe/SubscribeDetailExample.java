package com.mall.admin.vo.subscribe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubscribeDetailExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	public SubscribeDetailExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andSubscribeIdIsNull() {
			addCriterion("subscribe_id is null");
			return (Criteria) this;
		}

		public Criteria andSubscribeIdIsNotNull() {
			addCriterion("subscribe_id is not null");
			return (Criteria) this;
		}

		public Criteria andSubscribeIdEqualTo(Long value) {
			addCriterion("subscribe_id =", value, "subscribeId");
			return (Criteria) this;
		}

		public Criteria andSubscribeIdNotEqualTo(Long value) {
			addCriterion("subscribe_id <>", value, "subscribeId");
			return (Criteria) this;
		}

		public Criteria andSubscribeIdGreaterThan(Long value) {
			addCriterion("subscribe_id >", value, "subscribeId");
			return (Criteria) this;
		}

		public Criteria andSubscribeIdGreaterThanOrEqualTo(Long value) {
			addCriterion("subscribe_id >=", value, "subscribeId");
			return (Criteria) this;
		}

		public Criteria andSubscribeIdLessThan(Long value) {
			addCriterion("subscribe_id <", value, "subscribeId");
			return (Criteria) this;
		}

		public Criteria andSubscribeIdLessThanOrEqualTo(Long value) {
			addCriterion("subscribe_id <=", value, "subscribeId");
			return (Criteria) this;
		}

		public Criteria andSubscribeIdIn(List<Long> values) {
			addCriterion("subscribe_id in", values, "subscribeId");
			return (Criteria) this;
		}

		public Criteria andSubscribeIdNotIn(List<Long> values) {
			addCriterion("subscribe_id not in", values, "subscribeId");
			return (Criteria) this;
		}

		public Criteria andSubscribeIdBetween(Long value1, Long value2) {
			addCriterion("subscribe_id between", value1, value2, "subscribeId");
			return (Criteria) this;
		}

		public Criteria andSubscribeIdNotBetween(Long value1, Long value2) {
			addCriterion("subscribe_id not between", value1, value2,
					"subscribeId");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andSubTitleIsNull() {
			addCriterion("sub_title is null");
			return (Criteria) this;
		}

		public Criteria andSubTitleIsNotNull() {
			addCriterion("sub_title is not null");
			return (Criteria) this;
		}

		public Criteria andSubTitleEqualTo(String value) {
			addCriterion("sub_title =", value, "subTitle");
			return (Criteria) this;
		}

		public Criteria andSubTitleNotEqualTo(String value) {
			addCriterion("sub_title <>", value, "subTitle");
			return (Criteria) this;
		}

		public Criteria andSubTitleGreaterThan(String value) {
			addCriterion("sub_title >", value, "subTitle");
			return (Criteria) this;
		}

		public Criteria andSubTitleGreaterThanOrEqualTo(String value) {
			addCriterion("sub_title >=", value, "subTitle");
			return (Criteria) this;
		}

		public Criteria andSubTitleLessThan(String value) {
			addCriterion("sub_title <", value, "subTitle");
			return (Criteria) this;
		}

		public Criteria andSubTitleLessThanOrEqualTo(String value) {
			addCriterion("sub_title <=", value, "subTitle");
			return (Criteria) this;
		}

		public Criteria andSubTitleLike(String value) {
			addCriterion("sub_title like", value, "subTitle");
			return (Criteria) this;
		}

		public Criteria andSubTitleNotLike(String value) {
			addCriterion("sub_title not like", value, "subTitle");
			return (Criteria) this;
		}

		public Criteria andSubTitleIn(List<String> values) {
			addCriterion("sub_title in", values, "subTitle");
			return (Criteria) this;
		}

		public Criteria andSubTitleNotIn(List<String> values) {
			addCriterion("sub_title not in", values, "subTitle");
			return (Criteria) this;
		}

		public Criteria andSubTitleBetween(String value1, String value2) {
			addCriterion("sub_title between", value1, value2, "subTitle");
			return (Criteria) this;
		}

		public Criteria andSubTitleNotBetween(String value1, String value2) {
			addCriterion("sub_title not between", value1, value2, "subTitle");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlIsNull() {
			addCriterion("html_url is null");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlIsNotNull() {
			addCriterion("html_url is not null");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlEqualTo(String value) {
			addCriterion("html_url =", value, "htmlUrl");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlNotEqualTo(String value) {
			addCriterion("html_url <>", value, "htmlUrl");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlGreaterThan(String value) {
			addCriterion("html_url >", value, "htmlUrl");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlGreaterThanOrEqualTo(String value) {
			addCriterion("html_url >=", value, "htmlUrl");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlLessThan(String value) {
			addCriterion("html_url <", value, "htmlUrl");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlLessThanOrEqualTo(String value) {
			addCriterion("html_url <=", value, "htmlUrl");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlLike(String value) {
			addCriterion("html_url like", value, "htmlUrl");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlNotLike(String value) {
			addCriterion("html_url not like", value, "htmlUrl");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlIn(List<String> values) {
			addCriterion("html_url in", values, "htmlUrl");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlNotIn(List<String> values) {
			addCriterion("html_url not in", values, "htmlUrl");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlBetween(String value1, String value2) {
			addCriterion("html_url between", value1, value2, "htmlUrl");
			return (Criteria) this;
		}

		public Criteria andHtmlUrlNotBetween(String value1, String value2) {
			addCriterion("html_url not between", value1, value2, "htmlUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlIsNull() {
			addCriterion("img_url is null");
			return (Criteria) this;
		}

		public Criteria andImgUrlIsNotNull() {
			addCriterion("img_url is not null");
			return (Criteria) this;
		}

		public Criteria andImgUrlEqualTo(String value) {
			addCriterion("img_url =", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlNotEqualTo(String value) {
			addCriterion("img_url <>", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlGreaterThan(String value) {
			addCriterion("img_url >", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
			addCriterion("img_url >=", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlLessThan(String value) {
			addCriterion("img_url <", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlLessThanOrEqualTo(String value) {
			addCriterion("img_url <=", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlLike(String value) {
			addCriterion("img_url like", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlNotLike(String value) {
			addCriterion("img_url not like", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlIn(List<String> values) {
			addCriterion("img_url in", values, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlNotIn(List<String> values) {
			addCriterion("img_url not in", values, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlBetween(String value1, String value2) {
			addCriterion("img_url between", value1, value2, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlNotBetween(String value1, String value2) {
			addCriterion("img_url not between", value1, value2, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andPlatformTypeIsNull() {
			addCriterion("platform_type is null");
			return (Criteria) this;
		}

		public Criteria andPlatformTypeIsNotNull() {
			addCriterion("platform_type is not null");
			return (Criteria) this;
		}

		public Criteria andPlatformTypeEqualTo(Byte value) {
			addCriterion("platform_type =", value, "platformType");
			return (Criteria) this;
		}

		public Criteria andPlatformTypeNotEqualTo(Byte value) {
			addCriterion("platform_type <>", value, "platformType");
			return (Criteria) this;
		}

		public Criteria andPlatformTypeGreaterThan(Byte value) {
			addCriterion("platform_type >", value, "platformType");
			return (Criteria) this;
		}

		public Criteria andPlatformTypeGreaterThanOrEqualTo(Byte value) {
			addCriterion("platform_type >=", value, "platformType");
			return (Criteria) this;
		}

		public Criteria andPlatformTypeLessThan(Byte value) {
			addCriterion("platform_type <", value, "platformType");
			return (Criteria) this;
		}

		public Criteria andPlatformTypeLessThanOrEqualTo(Byte value) {
			addCriterion("platform_type <=", value, "platformType");
			return (Criteria) this;
		}

		public Criteria andPlatformTypeIn(List<Byte> values) {
			addCriterion("platform_type in", values, "platformType");
			return (Criteria) this;
		}

		public Criteria andPlatformTypeNotIn(List<Byte> values) {
			addCriterion("platform_type not in", values, "platformType");
			return (Criteria) this;
		}

		public Criteria andPlatformTypeBetween(Byte value1, Byte value2) {
			addCriterion("platform_type between", value1, value2,
					"platformType");
			return (Criteria) this;
		}

		public Criteria andPlatformTypeNotBetween(Byte value1, Byte value2) {
			addCriterion("platform_type not between", value1, value2,
					"platformType");
			return (Criteria) this;
		}

		public Criteria andContentTypeIsNull() {
			addCriterion("content_type is null");
			return (Criteria) this;
		}

		public Criteria andContentTypeIsNotNull() {
			addCriterion("content_type is not null");
			return (Criteria) this;
		}

		public Criteria andContentTypeEqualTo(Byte value) {
			addCriterion("content_type =", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeNotEqualTo(Byte value) {
			addCriterion("content_type <>", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeGreaterThan(Byte value) {
			addCriterion("content_type >", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeGreaterThanOrEqualTo(Byte value) {
			addCriterion("content_type >=", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeLessThan(Byte value) {
			addCriterion("content_type <", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeLessThanOrEqualTo(Byte value) {
			addCriterion("content_type <=", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeIn(List<Byte> values) {
			addCriterion("content_type in", values, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeNotIn(List<Byte> values) {
			addCriterion("content_type not in", values, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeBetween(Byte value1, Byte value2) {
			addCriterion("content_type between", value1, value2, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeNotBetween(Byte value1, Byte value2) {
			addCriterion("content_type not between", value1, value2,
					"contentType");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Byte value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Byte value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Byte value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Byte value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Byte value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Byte> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Byte> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Byte value1, Byte value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andWeightIsNull() {
			addCriterion("weight is null");
			return (Criteria) this;
		}

		public Criteria andWeightIsNotNull() {
			addCriterion("weight is not null");
			return (Criteria) this;
		}

		public Criteria andWeightEqualTo(Byte value) {
			addCriterion("weight =", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightNotEqualTo(Byte value) {
			addCriterion("weight <>", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightGreaterThan(Byte value) {
			addCriterion("weight >", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightGreaterThanOrEqualTo(Byte value) {
			addCriterion("weight >=", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightLessThan(Byte value) {
			addCriterion("weight <", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightLessThanOrEqualTo(Byte value) {
			addCriterion("weight <=", value, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightIn(List<Byte> values) {
			addCriterion("weight in", values, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightNotIn(List<Byte> values) {
			addCriterion("weight not in", values, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightBetween(Byte value1, Byte value2) {
			addCriterion("weight between", value1, value2, "weight");
			return (Criteria) this;
		}

		public Criteria andWeightNotBetween(Byte value1, Byte value2) {
			addCriterion("weight not between", value1, value2, "weight");
			return (Criteria) this;
		}

		public Criteria andOperatorIsNull() {
			addCriterion("operator is null");
			return (Criteria) this;
		}

		public Criteria andOperatorIsNotNull() {
			addCriterion("operator is not null");
			return (Criteria) this;
		}

		public Criteria andOperatorEqualTo(Integer value) {
			addCriterion("operator =", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorNotEqualTo(Integer value) {
			addCriterion("operator <>", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorGreaterThan(Integer value) {
			addCriterion("operator >", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorGreaterThanOrEqualTo(Integer value) {
			addCriterion("operator >=", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorLessThan(Integer value) {
			addCriterion("operator <", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorLessThanOrEqualTo(Integer value) {
			addCriterion("operator <=", value, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorIn(List<Integer> values) {
			addCriterion("operator in", values, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorNotIn(List<Integer> values) {
			addCriterion("operator not in", values, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorBetween(Integer value1, Integer value2) {
			addCriterion("operator between", value1, value2, "operator");
			return (Criteria) this;
		}

		public Criteria andOperatorNotBetween(Integer value1, Integer value2) {
			addCriterion("operator not between", value1, value2, "operator");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2,
					"createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2,
					"updateTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tb_subscribe_detail
	 * @mbggenerated  Mon Aug 31 17:40:31 CST 2015
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_subscribe_detail
     *
     * @mbggenerated do_not_delete_during_merge Mon Aug 31 13:45:05 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}