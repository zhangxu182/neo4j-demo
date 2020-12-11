package com.zhangjava.neo4j.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

import java.io.Serializable;

/**
 * 人物
 *
 * @author zhangxu
 * @date 2020/12/10 17:30
 */
@Data
@Accessors(chain = true)
@Node
public class Person implements Serializable {

    private static final long serialVersionUID = 7660065890241732693L;

    @Id @GeneratedValue
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 年龄
     */
    private String age;

}
