package com.mall.content.feign;

import com.mall.content.pojo.Content;
import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "content")
@RequestMapping("/content")
public interface ContentFeign {

    /**
     * 根据分类的ID 获取到广告列表
     * @param id
     * @return
     */
    @GetMapping(value = "/list/category/{id}")
    Result<List<Content>> findByCategory(@PathVariable(name = "id") Long id);
}