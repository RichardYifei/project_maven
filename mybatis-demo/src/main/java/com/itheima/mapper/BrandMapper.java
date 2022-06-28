package com.itheima.mapper;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapper {
    //查询所有
    List<Brand> selectAll();
    //查询详细信息
    Brand selectById(int id);
    //条件查询

    /**
     * SQL语句设置多个参数
     * 参数接收1：散装参数，使用@Param
     *List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName,
     *                                   @Param("brandName") String brandName);
     * 参数接收2：实体类封装参数
     * List<Brand> selectByCondition(Brand brand);
     * 参数接收3：Map集合
     * List<Brand> selectByCondition(Map map);
     */
    //参数接收1：散装参数，使用@Param
    List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName,
                                  @Param("brandName") String brandName);
    //添加信息
    void add(Brand brand);
    /**
     * 修改和删除与添加类似
     * void update(Brand brand)：修改数据
     * void delete(int id):删除一个数据
     * void deleteByIds(@Param("Ids") int[] ids):批量删除
     */
}
