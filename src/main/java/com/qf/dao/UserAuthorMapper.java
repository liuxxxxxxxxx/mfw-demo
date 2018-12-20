package com.qf.dao;

import com.qf.pojo.po.UserAuthor;
import com.qf.pojo.po.UserAuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAuthorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_author
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    long countByExample(UserAuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_author
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    int deleteByExample(UserAuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_author
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_author
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    int insert(UserAuthor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_author
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    int insertSelective(UserAuthor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_author
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    List<UserAuthor> selectByExample(UserAuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_author
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    UserAuthor selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_author
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserAuthor record, @Param("example") UserAuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_author
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    int updateByExample(@Param("record") UserAuthor record, @Param("example") UserAuthorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_author
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    int updateByPrimaryKeySelective(UserAuthor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_author
     *
     * @mbg.generated Thu Dec 20 09:34:11 CST 2018
     */
    int updateByPrimaryKey(UserAuthor record);
}