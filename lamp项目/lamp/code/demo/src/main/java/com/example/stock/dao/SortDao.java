package com.example.stock.dao;


import com.example.stock.entity.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SortDao extends JpaRepository<Sort,Integer> {

    @Query(value = "select *from psd_product_sort where PRODUCT_FASORT=:ProductFasort  ",nativeQuery = true)
    List<Sort> findByProductFasort(@Param("ProductFasort") String ProductFasort);


    @Query(value = "select *from psd_product_sort where PRODUCT_FASORT=:ProductId  ",nativeQuery = true)
    List<Sort> findByProductId(@Param("ProductId") String ProductId);


}
