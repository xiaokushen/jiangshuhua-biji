package com.example.inventory.dao;

import com.example.inventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {
    //    查询单个数据
    @Query(value = "select ROW_ID,PROLIST_ID,PRODUCT_NAME,PRODUCT_MODEL,STOCK_NUMBER,STOCK_AVEPRICE," +
            "STOCK_BATCH,STOCK_BATCHNUMB,PRODUCT_DATE" +
            " from psd_product_list where PROLIST_ID=:prolistID",nativeQuery = true)
    List<Product> findProductByName(@Param("prolistID") String prolistID);

}
