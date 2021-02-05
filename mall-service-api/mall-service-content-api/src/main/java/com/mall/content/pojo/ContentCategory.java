package com.mall.content.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="tb_content_category")
@Data
public class ContentCategory implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;//类目ID

    @Column(name = "name")
	private String name;//分类名称




}
