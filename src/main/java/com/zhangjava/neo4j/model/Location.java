package com.zhangjava.neo4j.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

import java.io.Serializable;

/**
 * 地方
 *
 * @author zhangxu
 * @date 2020/12/10 17:39
 */
@Data
@Accessors(chain = true)
@Node
public class Location implements Serializable {

    @Id @GeneratedValue
    private Long id;

    /**
     * 位置名称
     */
    private String city;

}
