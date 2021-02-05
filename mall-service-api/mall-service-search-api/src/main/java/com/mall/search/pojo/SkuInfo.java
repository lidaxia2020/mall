package com.mall.search.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * 1.创建索引
 * 2.创建类型
 * 3.创建文档 ()
 * 4.字段的映射(是否分词 是否索引 是否存储  数据类型是什么 分词器是什么)
 *
 * indexName 指定创建的索引的名称
 * type :指定索引中的类型
 * @package PACKAGE_NAME *
 * @since 1.0
 */

@Document(indexName = "skuinfo", type = "docs")
@Data
public class SkuInfo implements Serializable {


    //@id 表示文档的唯一标识
    @Id
    private Long id;

    //SKU名称
    // @Field 字段的映射
    // analyzer 指定索引的是用的分词分词器   searchAnalyzer :搜索的时候使用的分词器
    // type 指定数据类型
    @Field(type = FieldType.Text, analyzer = "ik_smart")
    private String name;

    //商品价格，单位为：元
    @Field(type = FieldType.Double)
    private Long price;

    //库存数量

    private Integer num;

    //商品图片
    //@Field(index = false)
    private String image;

    //商品状态，1-正常，2-下架，3-删除
    private String status;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    //是否默认
    private String isDefault;

    //SPUID
    private Long spuId;

    //类目ID
    private Long categoryId;

    //类目名称
    // FieldType.Keyword 是一个关键字 (keyword) 表示不分词.
    @Field(type = FieldType.Keyword)
    private String categoryName;

    //品牌名称
    @Field(type = FieldType.Keyword)
    private String brandName;

    //规格

    private String spec;

    //动态的域的添加和变化

    //规格参数
    //@Field(type = FieldType.Object)
    private Map<String, Object> specMap;

}
