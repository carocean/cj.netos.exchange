package cj.netos.exchange.mapper;

import cj.netos.exchange.model.WenyPurchRecord;
import cj.netos.exchange.model.WenyPurchRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WenyPurchRecordMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(WenyPurchRecordExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(WenyPurchRecordExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(WenyPurchRecord record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(WenyPurchRecord record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<WenyPurchRecord> selectByExample(WenyPurchRecordExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    WenyPurchRecord selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") WenyPurchRecord record, @Param("example") WenyPurchRecordExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") WenyPurchRecord record, @Param("example") WenyPurchRecordExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(WenyPurchRecord record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(WenyPurchRecord record);

    List<WenyPurchRecord> page(@Param(value = "bankid") String bankid, @Param(value = "person") String person, @Param(value = "limit") int limit, @Param(value = "offset") long offset);

}