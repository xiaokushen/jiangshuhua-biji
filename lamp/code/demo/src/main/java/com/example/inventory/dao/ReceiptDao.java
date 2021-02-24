package com.example.inventory.dao;

import com.example.inventory.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceiptDao  extends JpaRepository<Receipt,Integer> {
//    查询单个数据
    @Query(value = "select COLLECTION_LISTID,TRANSFER_ID,COLLECTION_TOTAL,COLLECTION_CREATDATE,COLLECTION_CRTATOR," +
            "COLLECTION_MODIFYDATE,COLLECTION_REVISER,COLLECTION_DELET" +
            " from jcxxt_collection_goods where COLLECTION_LISTID=:collectionListId",nativeQuery = true)
    List<Receipt> findReceiptByName(@Param("collectionListId") String collectionListId);

    //    查询多个数据
    @Query(value = "select COLLECTION_LISTID,TRANSFER_ID,COLLECTION_TOTAL,COLLECTION_CREATDATE,COLLECTION_CRTATOR," +
            " COLLECTION_MODIFYDATE,COLLECTION_REVISER,COLLECTION_DELET" +
            " from jcxxt_collection_goods where COLLECTION_DELET!=0",nativeQuery = true)
    List<Receipt> findAllByOperatorID();

//    打开修改单个数据
    @Modifying
    @Query(value = "select  COLLECTION_LISTID,TRANSFER_ID,COLLECTION_TOTAL,COLLECTION_CREATDATE,COLLECTION_CRTATOR," +
            " COLLECTION_MODIFYDATE,COLLECTION_REVISER,COLLECTION_DELET" +
            " from jcxxt_collection_goods  where COLLECTION_LISTID=:collectionListId ",nativeQuery = true)
    List<Receipt>  openupdateByOrderId(@Param("collectionListId") String collectionListId);

//    修改数据
    @Modifying
    @Query(value = "update jcxxt_collection_goods set COLLECTION_LISTID=:#{#receipt.collectionListId},TRANSFER_ID=:#{#receipt.transferId},COLLECTION_TOTAL=:#{#receipt.collectionTotal},COLLECTION_CREATDATE=:#{#receipt.collectionCreatDate},COLLECTION_CRTATOR=:#{#receipt.collectionCrtator},COLLECTION_MODIFYDATE=:#{#receipt.collectionModifyDate},COLLECTION_REVISER=:#{#receipt.collectionReviser},COLLECTION_DELET=:#{#receipt.collectionDelet} where COLLECTION_LISTID=:#{#receipt.collectionListId} ",nativeQuery = true)
    void updateByColListId(@Param("receipt") Receipt receipt);

    //    删除数据
    @Modifying
    @Query(value = "update jcxxt_collection_goods set COLLECTION_DELET=:#{#receipt.collectionDelet} where COLLECTION_LISTID=:#{#receipt.collectionListId} ",nativeQuery = true)
    void deleteByColListId(@Param("receipt") Receipt receipt);


}