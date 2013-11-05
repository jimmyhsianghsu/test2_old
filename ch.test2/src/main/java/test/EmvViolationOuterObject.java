/**
 * 程式資訊摘要：電子公路監理 - 違規查詢物件
 * 類別名稱：EmvViolationOuterObject.java
 * 程式內容說明：違規查詢
 * 版本資訊：1
 * 程式設計人員姓名：jimmy hsu
 * 程式修改記錄：2013-10-24 11 30
 * 版權宣告:jimmy hsu
 */
package test;

import java.util.Map;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Carbo
 * 
 */
public class EmvViolationOuterObject implements Serializable {
    /**
     * serialVersionUID
     */
    public static final long serialVersionUID = -1825155547025453935L;

    // 車別--------------------------------------------------------------------------------
    /** 車別:汽車 */
    public static final String INS_SIMPLE_KIND_NO_1 = "1";
    /** 車別: 拖車 */
    public static final String INS_SIMPLE_KIND_NO_2 = "2";
    /** 車別: 機車 */
    public static final String INS_SIMPLE_KIND_NO_3 = "3";
    /** 車別: 動力械械 */
    public static final String INS_SIMPLE_KIND_NO_4 = "4";
    /** 車別: 臨時牌 */
    public static final String INS_SIMPLE_KIND_NO_5 = "5";
    /** 車別: 試車牌 */
    public static final String INS_SIMPLE_KIND_NO_6 = "6";
    // 結案原因--------------------------------------------------------------------------------
    /** 結案原因: 結案 */
    public static final String CLOSE_NO_B = "B";
    /** 結案原因: 部結 */
    public static final String CLOSE_NO_K = "K";
    /** 結案原因: 錢部 */
    public static final String CLOSE_NO_LITTLE_K = "k";
    // 繳費別--------------------------------------------------------------------------------
    /** 繳費別: 現金 */
    public static final String PAY_WAY_C = "C";
    /** 繳費別: 支匯票 */
    public static final String PAY_WAY_M = "M";
    /** 繳費別: 超商OnLine */
    public static final String PAY_WAY_E = "E";
    /** 繳費別: 超商批次Batch */
    public static final String PAY_WAY_D = "D";
    /** 繳費別: 網銀 */
    public static final String PAY_WAY_LITTLE_M = "m";
    /** 繳費別: 代檢廠 */
    public static final String PAY_WAY_H = "H";
    // 異動別--------------------------------------------------------------------------------
    /** 異動別: 強執 */
    public static final String FES_TYPE_CODE_FORCE = "f";
    /** 異動別:債憑 */
    public static final String FES_TYPE_CODE_DEBT = "R";
    // 是否驗證--------------------------------------------------------------------------------
    /** 是否驗證: 是 */
    public static final String VALID_0 = "0";
    /** 是否驗證: 否 */
    public static final String VALID_1 = "1";

    /**
     * 駕駛人證號
     */
    private String driverId;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 違規日期
     */
    private Date vilDate;
    /**
     * 需到案
     */
    private boolean needArrive;
    /**
     * 已辦理分期
     */
    private boolean layaway;
    /**
     * 違規事實
     */
    private String vilFact;

    /**
     * 罰鍰
     */
    private int penalty;
    /**
     * 罰鍰金額
     */
    private int penaltyAmount;
    /**
     * 應到案日
     */
    private Date arrivedDate;

    /**
     * 違規地址
     */
    private String location;
    /**
     * 歸責對象
     */
    private String respTp;
    /**
     * 違規單號
     */
    private String vilTicket;
    /**
     * 處法條例
     */
    private int rule;
    /**
     * 車號
     */
    private String plateNo;
    /**
     * 到案處所
     */
    private String arriveDmv;
    /**
     * 駕別
     */
    private String driverKind;
    /**
     * 狀態
     */
    private String suspStatus;
    /**
     * 吊扣吊註銷起日
     */
    private Date suspBeginDate;
    /**
     * 吊扣吊註銷迄日
     */
    private Date suspEndDate;
    /**
     * 車種別
     */
    private String carKind;
    /**
     * 記點
     */
    private String markNo;
    /**
     * 條款一
     */
    private String rule1;
    /**
     * 條款二
     */
    private String rule2;
    /**
     * 條款三
     */
    private String rule3;
    /**
     * 條款四
     */
    private String rule4;
    /**
     * 處罰條例
     */
    private List<Map<String, String>> ruleList;
    /**
     * 是否已裁決
     */
    private String adjState;
    /**
     * 已繳金額
     */
    private int payment;
    /**
     * 異動員
     */
    private String updateUid;
    /**
     * 異動時間
     */
    private Date updateTime;
    /**
     * 異動所站
     */
    private String updateDmv;
    /**
     * 異動別代碼
     */
    private String closeNo;
    /**
     * 繳式
     */
    private String payWay;
    /**
     * 舉發類型
     */
    private String accuseType;
    /**
     * 單筆可否轉帳
     */
    private boolean transfer;
    /**
     * 狀態(van)
     */
    private String vanStatus;
    /**
     * 扣件
     */
    private String holdNo;
    /**
     * 行為地代碼(管轄所站)
     */
    private String dmv;
    /**
     * 姓氏
     */
    private String driverName;
    /**
     * 地址
     */
    private String driverAddr;
    /**
     * 劃撥帳號
     */
    private String payAccount;
    /**
     * 清算日
     */
    private Date clearDate;
    /**
     * 入案日
     */
    private Date vilInDate;
    /**
     * 違規類型
     */
    private String vilKind;
    /**
     * 車駕別
     */
    private String vehKind;
    /**
     * 舉發單位代碼
     */
    private String accuseNo;
    /**
     * 櫃別
     */
    private String countNo;
    /**
     * 入案員
     */
    private String createUid;
    /**
     * 入案所站
     */
    private String createDmv;
    /**
     * 案件管轄所站
     */
    private String adjNo;
    /**
     * 最新陳訴狀態
     */
    private String remedyState;
    /**
     * 最新陳訴日期
     */
    private Date remedyDate;
    /**
     * 最新處理情形
     */
    private String handleState;
    /**
     * 最新處理日期
     */
    private Date handleDate;
    /**
     * 文號
     */
    private String remedyDoc;
    /**
     * 陳訴明細<List>
     */
    private List<String> remedyDetail;
    /**
     * 郵遞區號
     */
    private String permZip;
    /**
     * 戶政地址
     */
    private String permAddress;

    /**
     * 送達狀態
     */
    private String receiveState;
    /**
     * 送達日
     */
    private Date receiveDate;
    /**
     * 裁決員
     */
    private String adjudicator;
    /**
     * 裁決日
     */
    private Date adjDate;
    /**
     * 裁決成功失敗訊息
     */
    private String caseFlag;
    /**
     * 單據類別
     */
    private String vilType;
    /**
     * 違規地點代碼
     */
    private String vilAddrNo;

    /**
     * @return the vilAddrNo
     */
    public String getVilAddrNo() {
	return vilAddrNo;
    }

    /**
     * @param vilAddrNo
     *            the vilAddrNo to set
     */
    public void setVilAddrNo(String vilAddrNo) {
	this.vilAddrNo = vilAddrNo;
    }

    /**
     * @return the accuseNo
     */
    public String getAccuseNo() {
	return accuseNo;
    }

    /**
     * @param accuseNo
     *            the accuseNo to set
     */
    public void setAccuseNo(String accuseNo) {
	this.accuseNo = accuseNo;
    }

    /**
     * @return the countNo
     */
    public String getCountNo() {
	return countNo;
    }

    /**
     * @param countNo
     *            the countNo to set
     */
    public void setCountNo(String countNo) {
	this.countNo = countNo;
    }

    /**
     * @return the createUid
     */
    public String getCreateUid() {
	return createUid;
    }

    /**
     * @param createUid
     *            the createUid to set
     */
    public void setCreateUid(String createUid) {
	this.createUid = createUid;
    }

    /**
     * @return the createDmv
     */
    public String getCreateDmv() {
	return createDmv;
    }

    /**
     * @param createDmv
     *            the createDmv to set
     */
    public void setCreateDmv(String createDmv) {
	this.createDmv = createDmv;
    }

    /**
     * @return the adjNo
     */
    public String getAdjNo() {
	return adjNo;
    }

    /**
     * @param adjNo
     *            the adjNo to set
     */
    public void setAdjNo(String adjNo) {
	this.adjNo = adjNo;
    }

    /**
     * @return the remedyState
     */
    public String getRemedyState() {
	return remedyState;
    }

    /**
     * @param remedyState
     *            the remedyState to set
     */
    public void setRemedyState(String remedyState) {
	this.remedyState = remedyState;
    }

    /**
     * @return the remedyDate
     */
    public Date getRemedyDate() {
	return remedyDate;
    }

    /**
     * @param remedyDate
     *            the remedyDate to set
     */
    public void setRemedyDate(Date remedyDate) {
	this.remedyDate = remedyDate;
    }

    /**
     * @return the handleState
     */
    public String getHandleState() {
	return handleState;
    }

    /**
     * @param handleState
     *            the handleState to set
     */
    public void setHandleState(String handleState) {
	this.handleState = handleState;
    }

    /**
     * @return the handleDate
     */
    public Date getHandleDate() {
	return handleDate;
    }

    /**
     * @param handleDate
     *            the handleDate to set
     */
    public void setHandleDate(Date handleDate) {
	this.handleDate = handleDate;
    }

    /**
     * @return the remedyDoc
     */
    public String getRemedyDoc() {
	return remedyDoc;
    }

    /**
     * @param remedyDoc
     *            the remedyDoc to set
     */
    public void setRemedyDoc(String remedyDoc) {
	this.remedyDoc = remedyDoc;
    }

    /**
     * @return the remedyDetail
     */
    public List<String> getRemedyDetail() {
	return remedyDetail;
    }

    /**
     * @param remedyDetail
     *            the remedyDetail to set
     */
    public void setRemedyDetail(List<String> remedyDetail) {
	this.remedyDetail = remedyDetail;
    }

    /**
     * @return the permZip
     */
    public String getPermZip() {
	return permZip;
    }

    /**
     * @param permZip
     *            the permZip to set
     */
    public void setPermZip(String permZip) {
	this.permZip = permZip;
    }

    /**
     * @return the permAddress
     */
    public String getPermAddress() {
	return permAddress;
    }

    /**
     * @param permAddress
     *            the permAddress to set
     */
    public void setPermAddress(String permAddress) {
	this.permAddress = permAddress;
    }

    /**
     * @return the receiveState
     */
    public String getReceiveState() {
	return receiveState;
    }

    /**
     * @param receiveState
     *            the receiveState to set
     */
    public void setReceiveState(String receiveState) {
	this.receiveState = receiveState;
    }

    /**
     * @return the receiveDate
     */
    public Date getReceiveDate() {
	return receiveDate;
    }

    /**
     * @param receiveDate
     *            the receiveDate to set
     */
    public void setReceiveDate(Date receiveDate) {
	this.receiveDate = receiveDate;
    }

    /**
     * @return the adjudicator
     */
    public String getAdjudicator() {
	return adjudicator;
    }

    /**
     * @param adjudicator
     *            the adjudicator to set
     */
    public void setAdjudicator(String adjudicator) {
	this.adjudicator = adjudicator;
    }

    /**
     * @return the adjDate
     */
    public Date getAdjDate() {
	return adjDate;
    }

    /**
     * @param adjDate
     *            the adjDate to set
     */
    public void setAdjDate(Date adjDate) {
	this.adjDate = adjDate;
    }

    /**
     * @return the caseFlag
     */
    public String getCaseFlag() {
	return caseFlag;
    }

    /**
     * @param caseFlag
     *            the caseFlag to set
     */
    public void setCaseFlag(String caseFlag) {
	this.caseFlag = caseFlag;
    }

    /**
     * @return the vilType
     */
    public String getVilType() {
	return vilType;
    }

    /**
     * @param vilType
     *            the vilType to set
     */
    public void setVilType(String vilType) {
	this.vilType = vilType;
    }

    /**
     * @return the vilKind
     */
    public String getVilKind() {
	return vilKind;
    }

    /**
     * @param vilKind
     *            the vilKind to set
     */
    public void setVilKind(String vilKind) {
	this.vilKind = vilKind;
    }

    /**
     * @return the vehKind
     */
    public String getVehKind() {
	return vehKind;
    }

    /**
     * @param vehKind
     *            the vehKind to set
     */
    public void setVehKind(String vehKind) {
	this.vehKind = vehKind;
    }

    /**
     * @return the vilInDate
     */
    public Date getVilInDate() {
	return vilInDate;
    }

    /**
     * @param vilInDate
     *            the vilInDate to set
     */
    public void setVilInDate(Date vilInDate) {
	this.vilInDate = vilInDate;
    }

    /**
     * @return the clearDate
     */
    public Date getClearDate() {
	return clearDate;
    }

    /**
     * @param clearDate
     *            the clearDate to set
     */
    public void setClearDate(Date clearDate) {
	this.clearDate = clearDate;
    }

    /**
     * @return the transfer
     */
    public boolean isTransfer() {
	return transfer;
    }

    /**
     * @param transfer
     *            the transfer to set
     */
    public void setTransfer(boolean transfer) {
	this.transfer = transfer;
    }

    /**
     * @return the vanStatus
     */
    public String getVanStatus() {
	return vanStatus;
    }

    /**
     * @param vanStatus
     *            the vanStatus to set
     */
    public void setVanStatus(String vanStatus) {
	this.vanStatus = vanStatus;
    }

    /**
     * @return the holdNo
     */
    public String getHoldNo() {
	return holdNo;
    }

    /**
     * @param holdNo
     *            the holdNo to set
     */
    public void setHoldNo(String holdNo) {
	this.holdNo = holdNo;
    }

    /**
     * @return the dmv
     */
    public String getDmv() {
	return dmv;
    }

    /**
     * @param dmv
     *            the dmv to set
     */
    public void setDmv(String dmv) {
	this.dmv = dmv;
    }

    /**
     * @return the driverName
     */
    public String getDriverName() {
	return driverName;
    }

    /**
     * @param driverName
     *            the driverName to set
     */
    public void setDriverName(String driverName) {
	this.driverName = driverName;
    }

    /**
     * @return the driverAddr
     */
    public String getDriverAddr() {
	return driverAddr;
    }

    /**
     * @param driverAddr
     *            the driverAddr to set
     */
    public void setDriverAddr(String driverAddr) {
	this.driverAddr = driverAddr;
    }

    /**
     * @return the payAccount
     */
    public String getPayAccount() {
	return payAccount;
    }

    /**
     * @param payAccount
     *            the payAccount to set
     */
    public void setPayAccount(String payAccount) {
	this.payAccount = payAccount;
    }

    /**
     * @return the payment
     */
    public int getPayment() {
	return payment;
    }

    /**
     * @param payment
     *            the payment to set
     */
    public void setPayment(int payment) {
	this.payment = payment;
    }

    /**
     * @return the updateUid
     */
    public String getUpdateUid() {
	return updateUid;
    }

    /**
     * @param updateUid
     *            the updateUid to set
     */
    public void setUpdateUid(String updateUid) {
	this.updateUid = updateUid;
    }

    /**
     * @return the updateTime
     */
    public Date getUpdateTime() {
	return updateTime;
    }

    /**
     * @param updateTime
     *            the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {
	this.updateTime = updateTime;
    }

    /**
     * @return the updateDmv
     */
    public String getUpdateDmv() {
	return updateDmv;
    }

    /**
     * @param updateDmv
     *            the updateDmv to set
     */
    public void setUpdateDmv(String updateDmv) {
	this.updateDmv = updateDmv;
    }

    /**
     * @return the closeNo
     */
    public String getCloseNo() {
	return closeNo;
    }

    /**
     * @param closeNo
     *            the closeNo to set
     */
    public void setCloseNo(String closeNo) {
	this.closeNo = closeNo;
    }

    /**
     * @return the payWay
     */
    public String getPayWay() {
	return payWay;
    }

    /**
     * @param payWay
     *            the payWay to set
     */
    public void setPayWay(String payWay) {
	this.payWay = payWay;
    }

    /**
     * @return the accuseType
     */
    public String getAccuseType() {
	return accuseType;
    }

    /**
     * @param accuseType
     *            the accuseType to set
     */
    public void setAccuseType(String accuseType) {
	this.accuseType = accuseType;
    }

    /**
     * @return the ruleList
     */
    public List<Map<String, String>> getRuleList() {
	return ruleList;
    }

    /**
     * @param ruleList
     *            the ruleList to set
     */
    public void setRuleList(List<Map<String, String>> ruleList) {
	this.ruleList = ruleList;
    }

    /**
     * @return the adjState
     */
    public String getAdjState() {
	return adjState;
    }

    /**
     * @param adjState
     *            the adjState to set
     */
    public void setAdjState(String adjState) {
	this.adjState = adjState;
    }

    /**
     * @return the driverKind
     */
    public String getDriverKind() {
	return driverKind;
    }

    /**
     * @param driverKind
     *            the driverKind to set
     */
    public void setDriverKind(String driverKind) {
	this.driverKind = driverKind;
    }

    /**
     * @return the suspStatus
     */
    public String getSuspStatus() {
	return suspStatus;
    }

    /**
     * @param suspStatus
     *            the suspStatus to set
     */
    public void setSuspStatus(String suspStatus) {
	this.suspStatus = suspStatus;
    }

    /**
     * @return the suspBeginDate
     */
    public Date getSuspBeginDate() {
	return suspBeginDate;
    }

    /**
     * @param suspBeginDate
     *            the suspBeginDate to set
     */
    public void setSuspBeginDate(Date suspBeginDate) {
	this.suspBeginDate = suspBeginDate;
    }

    /**
     * @return the suspEndDate
     */
    public Date getSuspEndDate() {
	return suspEndDate;
    }

    /**
     * @param suspEndDate
     *            the suspEndDate to set
     */
    public void setSuspEndDate(Date suspEndDate) {
	this.suspEndDate = suspEndDate;
    }

    /**
     * @return the carKind
     */
    public String getCarKind() {
	return carKind;
    }

    /**
     * @param carKind
     *            the carKind to set
     */
    public void setCarKind(String carKind) {
	this.carKind = carKind;
    }

    /**
     * @return the markNo
     */
    public String getMarkNo() {
	return markNo;
    }

    /**
     * @param markNo
     *            the markNo to set
     */
    public void setMarkNo(String markNo) {
	this.markNo = markNo;
    }

    /**
     * @return the rule1
     */
    public String getRule1() {
	return rule1;
    }

    /**
     * @param rule1
     *            the rule1 to set
     */
    public void setRule1(String rule1) {
	this.rule1 = rule1;
    }

    /**
     * @return the rule2
     */
    public String getRule2() {
	return rule2;
    }

    /**
     * @param rule2
     *            the rule2 to set
     */
    public void setRule2(String rule2) {
	this.rule2 = rule2;
    }

    /**
     * @return the rule3
     */
    public String getRule3() {
	return rule3;
    }

    /**
     * @param rule3
     *            the rule3 to set
     */
    public void setRule3(String rule3) {
	this.rule3 = rule3;
    }

    /**
     * @return the rule4
     */
    public String getRule4() {
	return rule4;
    }

    /**
     * @param rule4
     *            the rule4 to set
     */
    public void setRule4(String rule4) {
	this.rule4 = rule4;
    }

    /**
     * @return the layaway
     */
    public boolean isLayaway() {
	return layaway;
    }

    /**
     * @param layaway
     *            the layaway to set
     */
    public void setLayaway(boolean layaway) {
	this.layaway = layaway;
    }

    /**
     * @return the driverId
     */
    public String getDriverId() {
	return driverId;
    }

    /**
     * @param driverId
     *            the driverId to set
     */
    public void setDriverId(String driverId) {
	this.driverId = driverId;
    }

    /**
     * @return the birthday
     */
    public Date getBirthday() {
	return birthday;
    }

    /**
     * @param birthday
     *            the birthday to set
     */
    public void setBirthday(Date birthday) {
	this.birthday = birthday;
    }

    /**
     * @return the vilDate
     */
    public Date getVilDate() {
	return vilDate;
    }

    /**
     * @param vilDate
     *            the vilDate to set
     */
    public void setVilDate(Date vilDate) {
	this.vilDate = vilDate;
    }

    /**
     * @return the needArrive
     */
    public boolean isNeedArrive() {
	return needArrive;
    }

    /**
     * @param needArrive
     *            the needArrive to set
     */
    public void setNeedArrive(boolean needArrive) {
	this.needArrive = needArrive;
    }

    /**
     * @return the vilFact
     */
    public String getVilFact() {
	return vilFact;
    }

    /**
     * @param vilFact
     *            the vilFact to set
     */
    public void setVilFact(String vilFact) {
	this.vilFact = vilFact;
    }

    /**
     * @return the penalty
     */
    public int getPenalty() {
	return penalty;
    }

    /**
     * @param penalty
     *            the penalty to set
     */
    public void setPenalty(int penalty) {
	this.penalty = penalty;
    }

    /**
     * @return the penaltyAmount
     */
    public int getPenaltyAmount() {
	return penaltyAmount;
    }

    /**
     * @param penaltyAmount
     *            the penaltyAmount to set
     */
    public void setPenaltyAmount(int penaltyAmount) {
	this.penaltyAmount = penaltyAmount;
    }

    /**
     * @return the arrivedDate
     */
    public Date getArrivedDate() {
	return arrivedDate;
    }

    /**
     * @param arrivedDate
     *            the arrivedDate to set
     */
    public void setArrivedDate(Date arrivedDate) {
	this.arrivedDate = arrivedDate;
    }

    /**
     * @return the location
     */
    public String getLocation() {
	return location;
    }

    /**
     * @param location
     *            the location to set
     */
    public void setLocation(String location) {
	this.location = location;
    }

    /**
     * @return the respTp
     */
    public String getRespTp() {
	return respTp;
    }

    /**
     * @param respTp
     *            the respTp to set
     */
    public void setRespTp(String respTp) {
	this.respTp = respTp;
    }

    /**
     * @return the vilTicket
     */
    public String getVilTicket() {
	return vilTicket;
    }

    /**
     * @param vilTicket
     *            the vilTicket to set
     */
    public void setVilTicket(String vilTicket) {
	this.vilTicket = vilTicket;
    }

    /**
     * @return the rule
     */
    public int getRule() {
	return rule;
    }

    /**
     * @param rule
     *            the rule to set
     */
    public void setRule(int rule) {
	this.rule = rule;
    }

    /**
     * @return the plateNo
     */
    public String getPlateNo() {
	return plateNo;
    }

    /**
     * @param plateNo
     *            the plateNo to set
     */
    public void setPlateNo(String plateNo) {
	this.plateNo = plateNo;
    }

    /**
     * @return the arriveDmv
     */
    public String getArriveDmv() {
	return arriveDmv;
    }

    /**
     * @param arriveDmv
     *            the arriveDmv to set
     */
    public void setArriveDmv(String arriveDmv) {
	this.arriveDmv = arriveDmv;
    }

}
