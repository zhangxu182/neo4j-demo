package com.zhangjava.neo4j.dao;

import com.zhangjava.neo4j.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangxu
 * @date 2020/12/10 18:12
 */
@SpringBootTest
class PersonDaoTest {
    @Resource
    private PersonDao personDao;

    /**
     * 测试查询全部数据
     */
    @Test
    void testSelectAll() {
        List<Person> list = personDao.selectAll();
        list.forEach(System.out::println);
    }

    /**
     * 测试插入节点
     */
    @Test
    void insert() {
        Person person = new Person()
                .setName("测试1").setAge("20");
        personDao.insert(person);
        System.out.println(person);
    }

    /**
     * 测试绑定节点关系
     */
    @Test
    void bindRelationship() {
        personDao.bindRelationship("测试1", "测试2", "关系1");
    }

    /**
     * 测试删除
     */
    @Test
    void deleteByName() {
        personDao.deleteByName("测试2");
    }

    /**
     * 测试更新数据
     */
    @Test
    void updateById() {
        Person person = new Person()
                .setId(14L).setName("测试").setAge("21").setNickname("昵称");
        personDao.updateById(person);
    }

}