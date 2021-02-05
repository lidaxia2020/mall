package com.mall.order.pojo;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name="tb_category_report")
@Data
public class CategoryReport implements Serializable{

    @Column(name = "category_id1")
	private Integer categoryId1;//1级分类

    @Column(name = "category_id2")
	private Integer categoryId2;//2级分类

    @Column(name = "category_id3")
	private Integer categoryId3;//3级分类

	@Id
    @Column(name = "count_date")
	private Date countDate;//统计日期

    @Column(name = "num")
	private Integer num;//销售数量

    @Column(name = "money")
	private Integer money;//销售额


}
