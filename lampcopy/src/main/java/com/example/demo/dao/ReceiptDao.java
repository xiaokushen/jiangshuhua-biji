package com.example.demo.dao;


import com.example.demo.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceiptDao extends JpaRepository<Receipt,String> {

    //查询全部的
    @Query(value = "select COLLECTION_LISTID,TRANSFER_ID,COLLECTION_TOTAL,COLLECTION_CREATDATE,COLLECTION_CRTATOR," +
            " COLLECTION_MODIFYDATE,COLLECTION_REVISER,COLLECTION_DELET" +
            " from jcxxt_collection_goods where COLLECTION_DELET!=0",nativeQuery = true)
    List<Receipt> findAllReceipt();

    //模糊查询
    @Query(value = "select COLLECTION_LISTID,TRANSFER_ID,COLLECTION_TOTAL,COLLECTION_CREATDATE,COLLECTION_CRTATOR," +
            " COLLECTION_MODIFYDATE,COLLECTION_REVISER,COLLECTION_DELET" +
            " from jcxxt_collection_goods where COLLECTION_DELET!=0 AND COLLECTION_REVISER like %:collectionListId%",nativeQuery = true)
    List<Receipt> findOne(@Param("collectionListId") String collectionListId);

    //删除
    @Modifying
    @Query(value = "update jcxxt_collection_goods set COLLECTION_DELET=:#{#receipt.collectionDelet} where COLLECTION_LISTID=:#{#receipt.collectionListId} ",nativeQuery = true)
    void deleteOne(@Param("receipt") Receipt receipt);

    //打开修改页面
   List<Receipt> findFirstBycollectionListId(String collectionListId);

   //修改
   @Modifying
   @Query(value = "update jcxxt_collection_goods set COLLECTION_LISTID=:#{#receipt.collectionListId},TRANSFER_ID=:#{#receipt.transferId},COLLECTION_TOTAL=:#{#receipt.collectionTotal},COLLECTION_CREATDATE=:#{#receipt.collectionCreatDate},COLLECTION_CRTATOR=:#{#receipt.collectionCrtator},COLLECTION_MODIFYDATE=:#{#receipt.collectionModifyDate},COLLECTION_REVISER=:#{#receipt.collectionReviser},COLLECTION_DELET=:#{#receipt.collectionDelet} where COLLECTION_LISTID=:#{#receipt.collectionListId} ",nativeQuery = true)
   void UpdateRec(@Param("receipt")Receipt receipt);
}
