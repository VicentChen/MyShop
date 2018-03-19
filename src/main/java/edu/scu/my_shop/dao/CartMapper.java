package edu.scu.my_shop.dao;

import edu.scu.my_shop.entity.Cart;
import edu.scu.my_shop.entity.CartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Mon Mar 19 15:05:08 CST 2018
     */
    long countByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Mon Mar 19 15:05:08 CST 2018
     */
    int deleteByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Mon Mar 19 15:05:08 CST 2018
     */
    int insert(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Mon Mar 19 15:05:08 CST 2018
     */
    int insertSelective(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Mon Mar 19 15:05:08 CST 2018
     */
    List<Cart> selectByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Mon Mar 19 15:05:08 CST 2018
     */
    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Mon Mar 19 15:05:08 CST 2018
     */
    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);
}