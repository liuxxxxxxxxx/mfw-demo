package com.qf.pojo.po;

import java.util.Date;

public class UserInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.id
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.nickname
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.gender
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    private Boolean gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.avatar
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.area
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    private String area;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.country
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.create_time
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.level
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    private Byte level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.status
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    private Boolean status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.id
     *
     * @return the value of user_info.id
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.id
     *
     * @param id the value for user_info.id
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.nickname
     *
     * @return the value of user_info.nickname
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.nickname
     *
     * @param nickname the value for user_info.nickname
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.gender
     *
     * @return the value of user_info.gender
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.gender
     *
     * @param gender the value for user_info.gender
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.avatar
     *
     * @return the value of user_info.avatar
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.avatar
     *
     * @param avatar the value for user_info.avatar
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.area
     *
     * @return the value of user_info.area
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.area
     *
     * @param area the value for user_info.area
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.country
     *
     * @return the value of user_info.country
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.country
     *
     * @param country the value for user_info.country
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.create_time
     *
     * @return the value of user_info.create_time
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.create_time
     *
     * @param createTime the value for user_info.create_time
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.level
     *
     * @return the value of user_info.level
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.level
     *
     * @param level the value for user_info.level
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.status
     *
     * @return the value of user_info.status
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.status
     *
     * @param status the value for user_info.status
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}