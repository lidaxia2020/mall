package com.mall.goods.feign;

import com.mall.goods.pojo.Sku;
import com.mall.order.pojo.OrderItem;
import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "goods")
@RequestMapping("/sku")
public interface SkuFeign {
    /**
     * 查询符合条件的状态的SKU的列表
     *
     * @param status
     * @return
     */
    @GetMapping("/status/{status}")
    Result<List<Sku>> findByStatus(@PathVariable(name = "status") String status);


    /**
     * 根据条件搜索的SKU的列表
     *
     * @param sku
     * @return
     */
    @PostMapping(value = "/search")
    Result<List<Sku>> findList(@RequestBody(required = false) Sku sku);


    @GetMapping("/{id}")
    Result<Sku> findById(@PathVariable(name = "id") Long id);


    @PostMapping(value = "/decr/count")
    Result decrCount(@RequestBody OrderItem orderItem);


}
