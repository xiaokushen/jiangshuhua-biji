package com.example.salesSlip.dao;

import com.example.salesSlip.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesDao extends JpaRepository<Sales,String> {
    @Query(value = "select * from PSD_SALES_SLIP where SALORDER_ID like :salorderId% and DELET_STAT='Y' ORDER BY SHIPLIST_ID ASC ",nativeQuery = true)
    //@Query(value = "select * from PSD_SALES_SLIP ",nativeQuery = true)
    List<Sales> querySalesById(@Param("salorderId") String salorderId);

    @Query(value = "select * from PSD_SALES_SLIP where ROW_ID =:rwoId ",nativeQuery = true)
    Sales querySalesByrowId(@Param("rwoId") String rowId);

    @Query(value ="update PSD_SALES_SLIP set SALORDER_ID=:#{#sales.salorderId},CUS_ID=:#{#sales.cusId},SALES_NAME=:#{#sales.salesname} ,WAREHOUSE_ID=:#{#sales.warehouseId},SHIPLIST_ID=:#{#sales.shiplistId} where ROW_ID=:#{#sales.rowId}",nativeQuery = true )
    @Modifying
    void updateSalesById(@Param("sales") Sales sales);

    @Query(value ="update PSD_SALES_SLIP set DELET_STAT=:#{#sales.deletstat} where ROW_ID=:#{#sales.rowId}",nativeQuery = true )
    @Modifying
    void deleteSalesById(@Param("sales") Sales sales);
}
