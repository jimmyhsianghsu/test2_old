/**
 * 程式資訊摘要：qqq
 * 類別名稱：qqq.java
 * 程式內容說明：qqq
 * 版本資訊：0.5
 * 程式設計人員姓名：qqq
 * 程式修改記錄：2013-01-01 qqqq qqq
 * 版權宣告:.qqq
 */
package test;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author William
 * 
 */
public class CalculationEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 條款
     */
    private int ruleNo;
    /**
     * 違規事實
     */
    private String illFact;
    /**
     * 低罰
     */
    private int firstPenalty;
    /**
     * 第二階段罰款
     */
    private int secondPenalty;
    /**
     * 第三階段罰款
     */
    private int thirdPenalty;
    /**
     * 高罰
     */
    private int fourthPenalty;
    /**
     * 車種
     */
    private char vilKindNo;
    /**
     * 歸責對象
     */
    private char respPersonType;
    /**
     * 記點
     */
    private int driverMarkNo;
    /**
     * 記次
     */
    private int plateMarkNo;
    /**
     * 吊扣銷
     */
    private char suspNo;
    /**
     * 禁考註記
     */
    private char forbidNo;
    /**
     * 保留欄位
     */
    private char reserve;
    /**
     * 特殊處罰
     */
    private char specialPunishNo;
    /**
     * 生效日期
     */
    private Date ruleEffectiveDate;

    /**
     * @return the ruleNo
     */
    public int getRuleNo() {
	return ruleNo;
    }

    /**
     * @param ruleNo
     *            the ruleNo to set
     */
    public void setRuleNo(int ruleNo) {
	this.ruleNo = ruleNo;
    }

    /**
     * @return the illFact
     */
    public String getIllFact() {
	return illFact;
    }

    /**
     * @param illFact
     *            the illFact to set
     */
    public void setIllFact(String illFact) {
	this.illFact = illFact;
    }

    /**
     * @return the firstPenalty
     */
    public int getFirstPenalty() {
	return firstPenalty;
    }

    /**
     * @param firstPenalty
     *            the firstPenalty to set
     */
    public void setFirstPenalty(int firstPenalty) {
	this.firstPenalty = firstPenalty;
    }

    /**
     * @return the secondPenalty
     */
    public int getSecondPenalty() {
	return secondPenalty;
    }

    /**
     * @param secondPenalty
     *            the secondPenalty to set
     */
    public void setSecondPenalty(int secondPenalty) {
	this.secondPenalty = secondPenalty;
    }

    /**
     * @return the thirdPenalty
     */
    public int getThirdPenalty() {
	return thirdPenalty;
    }

    /**
     * @param thirdPenalty
     *            the thirdPenalty to set
     */
    public void setThirdPenalty(int thirdPenalty) {
	this.thirdPenalty = thirdPenalty;
    }

    /**
     * @return the fourthPenalty
     */
    public int getFourthPenalty() {
	return fourthPenalty;
    }

    /**
     * @param fourthPenalty
     *            the fourthPenalty to set
     */
    public void setFourthPenalty(int fourthPenalty) {
	this.fourthPenalty = fourthPenalty;
    }

    /**
     * @return the vilKindNo
     */
    public char getVilKindNo() {
	return vilKindNo;
    }

    /**
     * @param vilKindNo
     *            the vilKindNo to set
     */
    public void setVilKindNo(char vilKindNo) {
	this.vilKindNo = vilKindNo;
    }

    /**
     * @return the respPersonType
     */
    public char getRespPersonType() {
	return respPersonType;
    }

    /**
     * @param respPersonType
     *            the respPersonType to set
     */
    public void setRespPersonType(char respPersonType) {
	this.respPersonType = respPersonType;
    }

    /**
     * @return the driverMarkNo
     */
    public int getDriverMarkNo() {
	return driverMarkNo;
    }

    /**
     * @param driverMarkNo
     *            the driverMarkNo to set
     */
    public void setDriverMarkNo(int driverMarkNo) {
	this.driverMarkNo = driverMarkNo;
    }

    /**
     * @return the plateMarkNo
     */
    public int getPlateMarkNo() {
	return plateMarkNo;
    }

    /**
     * @param plateMarkNo
     *            the plateMarkNo to set
     */
    public void setPlateMarkNo(int plateMarkNo) {
	this.plateMarkNo = plateMarkNo;
    }

    /**
     * @return the suspNo
     */
    public char getSuspNo() {
	return suspNo;
    }

    /**
     * @param suspNo
     *            the suspNo to set
     */
    public void setSuspNo(char suspNo) {
	this.suspNo = suspNo;
    }

    /**
     * @return the forbidNo
     */
    public char getForbidNo() {
	return forbidNo;
    }

    /**
     * @param forbidNo
     *            the forbidNo to set
     */
    public void setForbidNo(char forbidNo) {
	this.forbidNo = forbidNo;
    }

    /**
     * @return the reserve
     */
    public char getReserve() {
	return reserve;
    }

    /**
     * @param reserve
     *            the reserve to set
     */
    public void setReserve(char reserve) {
	this.reserve = reserve;
    }

    /**
     * @return the specialPunishNo
     */
    public char getSpecialPunishNo() {
	return specialPunishNo;
    }

    /**
     * @param specialPunishNo
     *            the specialPunishNo to set
     */
    public void setSpecialPunishNo(char specialPunishNo) {
	this.specialPunishNo = specialPunishNo;
    }

    /**
     * @return the ruleEffectiveDate
     */
    public Date getRuleEffectiveDate() {
	return ruleEffectiveDate;
    }

    /**
     * @param ruleEffectiveDate
     *            the ruleEffectiveDate to set
     */
    public void setRuleEffectiveDate(Date ruleEffectiveDate) {
	this.ruleEffectiveDate = ruleEffectiveDate;
    }

}
