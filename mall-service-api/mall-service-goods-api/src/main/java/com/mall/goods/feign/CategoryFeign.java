package com.mall.goods.feign;

import com.mall.goods.pojo.Category;
import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value="goods")
@RequestMapping("/category")
public interface CategoryFeign {
    @GetMapping("/{id}")
    Result<Category> findById(@PathVariable(name = "id") Integer id);
}
