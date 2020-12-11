package com.zhangjava.neo4j.dao;

import com.zhangjava.neo4j.model.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 人物
 *
 * @author zhangxu
 * @date 2020/12/10 17:56
 */
@Repository
public interface PersonDao {

    /**
     * 查询全部数据
     *
     * @return
     */
    List<Person> selectAll();

    /**
     * 插入数据
     *
     * @param person
     * @return
     */
    int insert(Person person);

    /**
     * 绑定两个节点之间的关系
     *
     * @param nodeName1    节点1
     * @param nodeName2    节点2
     * @param relationShip 关系
     * @return
     */
    int bindRelationship(@Param("nodeName1") String nodeName1,
                         @Param("nodeName2") String nodeName2,
                         @Param("relationShip") String relationShip);

    /**
     * 删除节点，并删除节点之间的关系
     *
     * @param nodeName 节点名称
     * @return
     */
    int deleteByName(String nodeName);

    /**
     * 更新数据
     *
     * @param person
     * @return
     */
    int updateById(Person person);

}
