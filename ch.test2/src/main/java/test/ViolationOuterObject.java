package test;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author William
 * 
 */
public class ViolationOuterObject implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * 歸責對象
     */
    private String respTp;
    /**
     * 繳式
     */
    private String payWay;
    /**
     * 流水號
     */
    private String seq;
    /**
     * 車號
     */
    private String plateNo;
    /**
     * 違規日期
     */
    private Date vilDate;
    /**
     * 違規時間
     */
    private Date vilTime;
    /**
     * 違規地址
     */
    private String location;
    /**
     * 應到案日
     */
    private Date arrivedDate;
    /**
     * 違規單號
     */
    private String vilTicket;
    /**
     * 駕駛人證號
     */
    private String driverId;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 代管物件代碼
     */
    private String reservedNo;
    /**
     * 條款一
     */
    private int rule1;
    /**
     * 條款二
     */
    private int rule2;
    /**
     * 條款三
     */
    private int rule3;
    /**
     * 條款四
     */
    private int rule4;
    /**
     * 告發單位代碼檔
     */
    private String unitNo;
    /**
     * 舉發類型
     */
    private String vilType;
    /**
     * 車種別
     */
    private String carKind;
    /**
     * 車別
     */
    private String carType;
    /**
     * 異動別代碼
     */
    private String closeNo;
    /**
     * 櫃別
     */
    private String serviceType;
    /**
     * 車籍狀態
     */
    private String carStatus;
    /**
     * 駕籍狀態
     */
    private String driverStatus;
    /**
     * 鍵入員代碼
     */
    private String keyInNo;
    /**
     * 車主姓名
     */
    private String carHostName;
    /**
     * 駕駛人姓名
     */
    private String driverName;
    /**
     * 地址
     */
    private String address;
    /**
     * 顏色代碼
     */
    private int colorNo;
    /**
     * 警員
     */
    private String police;
    /**
     * 所站代碼
     */
    private String dmv;
    /**
     * 類別
     */
    private String type;
    /**
     * 郵區號
     */
    private int zipCode;
    /**
     * 入案日
     */
    private Date vilInDate;
    /**
     * 已繳金額
     */
    private int payment;
    /**
     * 應繳金額
     */
    private int penalty;
    /**
     * 異動日
     */
    private Date modifiedDate;
    /**
     * 異動人員代碼
     */
    private String modifiedNo;

    /**
     * 吊扣吊註銷起日
     */
    private Date suspBeginDate;

    /**
     * 吊扣吊註銷迄日
     */
    private Date suspEndDate;

    /**
     * 吊扣吊註銷文號
     */
    private String suspDoc;

    /**
     * 吊扣吊註銷原因
     */
    private String suspReason;

    /**
     * 吊扣吊註銷註記
     */
    private String suspFlag;
    /**
     * 吊扣單位
     */
    private String suspUnit;
    /**
     * 吊扣還件日
     */
    private Date suspBackDate;
    /**
     * 吊扣銷異動名稱
     */
    private String suspModifiedName;
    /**
     * 吊扣銷車號
     */
    private String suspPlateNo;
    /**
     * 案件數
     */
    private int count;
    /**
     * 記點
     */
    private String markNo;
    

    /**
     * @return the seq
     */
    public String getSeq() {
	return seq;
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
     * @param seq
     *            the seq to set
     */
    public void setSeq(String seq) {
	this.seq = seq;
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
     * @return the vilTime
     */
    public Date getVilTime() {
	return vilTime;
    }

    /**
     * @param vilTime
     *            the vilTime to set
     */
    public void setVilTime(Date vilTime) {
	this.vilTime = vilTime;
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
     * @return the reservedNo
     */
    public String getReservedNo() {
	return reservedNo;
    }

    /**
     * @param reservedNo
     *            the reservedNo to set
     */
    public void setReservedNo(String reservedNo) {
	this.reservedNo = reservedNo;
    }

    /**
     * @return the rule1
     */
    public int getRule1() {
	return rule1;
    }

    /**
     * @param rule1
     *            the rule1 to set
     */
    public void setRule1(int rule1) {
	this.rule1 = rule1;
    }

    /**
     * @return the rule2
     */
    public int getRule2() {
	return rule2;
    }

    /**
     * @param rule2
     *            the rule2 to set
     */
    public void setRule2(int rule2) {
	this.rule2 = rule2;
    }

    /**
     * @return the rule3
     */
    public int getRule3() {
	return rule3;
    }

    /**
     * @param rule3
     *            the rule3 to set
     */
    public void setRule3(int rule3) {
	this.rule3 = rule3;
    }

    /**
     * @return the rule4
     */
    public int getRule4() {
	return rule4;
    }

    /**
     * @param rule4
     *            the rule4 to set
     */
    public void setRule4(int rule4) {
	this.rule4 = rule4;
    }

    /**
     * @return the unitNo
     */
    public String getUnitNo() {
	return unitNo;
    }

    /**
     * @param unitNo
     *            the unitNo to set
     */
    public void setUnitNo(String unitNo) {
	this.unitNo = unitNo;
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
     * @return the serviceType
     */
    public String getServiceType() {
	return serviceType;
    }

    /**
     * @param serviceType
     *            the serviceType to set
     */
    public void setServiceType(String serviceType) {
	this.serviceType = serviceType;
    }

    /**
     * @return the carStatus
     */
    public String getCarStatus() {
	return carStatus;
    }

    /**
     * @param carStatus
     *            the carStatus to set
     */
    public void setCarStatus(String carStatus) {
	this.carStatus = carStatus;
    }

    /**
     * @return the driverStatus
     */
    public String getDriverStatus() {
	return driverStatus;
    }

    /**
     * @param driverStatus
     *            the driverStatus to set
     */
    public void setDriverStatus(String driverStatus) {
	this.driverStatus = driverStatus;
    }

    /**
     * @return the keyInNo
     */
    public String getKeyInNo() {
	return keyInNo;
    }

    /**
     * @param keyInNo
     *            the keyInNo to set
     */
    public void setKeyInNo(String keyInNo) {
	this.keyInNo = keyInNo;
    }

    /**
     * @return the carHostName
     */
    public String getCarHostName() {
	return carHostName;
    }

    /**
     * @param carHostName
     *            the carHostName to set
     */
    public void setCarHostName(String carHostName) {
	this.carHostName = carHostName;
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
     * @return the address
     */
    public String getAddress() {
	return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(String address) {
	this.address = address;
    }

    /**
     * @return the colorNo
     */
    public int getColorNo() {
	return colorNo;
    }

    /**
     * @param colorNo
     *            the colorNo to set
     */
    public void setColorNo(int colorNo) {
	this.colorNo = colorNo;
    }

    /**
     * @return the police
     */
    public String getPolice() {
	return police;
    }

    /**
     * @param police
     *            the police to set
     */
    public void setPolice(String police) {
	this.police = police;
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
     * @return the type
     */
    public String getType() {
	return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
	this.type = type;
    }

    /**
     * @return the zipCode
     */
    public int getZipCode() {
	return zipCode;
    }

    /**
     * @param zipCode
     *            the zipCode to set
     */
    public void setZipCode(int zipCode) {
	this.zipCode = zipCode;
    }

    /**
     * @return the carType
     */
    public String getCarType() {
	return carType;
    }

    /**
     * @param carType
     *            the carType to set
     */
    public void setCarType(String carType) {
	this.carType = carType;
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
     * @return the modifiedDate
     */
    public Date getModifiedDate() {
	return modifiedDate;
    }

    /**
     * @param modifiedDate
     *            the modifiedDate to set
     */
    public void setModifiedDate(Date modifiedDate) {
	this.modifiedDate = modifiedDate;
    }

    /**
     * @return the modifiedNo
     */
    public String getModifiedNo() {
	return modifiedNo;
    }

    /**
     * @param modifiedNo
     *            the modifiedNo to set
     */
    public void setModifiedNo(String modifiedNo) {
	this.modifiedNo = modifiedNo;
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
     * @return the suspDoc
     */
    public String getSuspDoc() {
	return suspDoc;
    }

    /**
     * @param suspDoc
     *            the suspDoc to set
     */
    public void setSuspDoc(String suspDoc) {
	this.suspDoc = suspDoc;
    }

    /**
     * @return the suspReason
     */
    public String getSuspReason() {
	return suspReason;
    }

    /**
     * @param suspReason
     *            the suspReason to set
     */
    public void setSuspReason(String suspReason) {
	this.suspReason = suspReason;
    }

    /**
     * @return the suspFlag
     */
    public String getSuspFlag() {
	return suspFlag;
    }

    /**
     * @param suspFlag
     *            the suspFlag to set
     */
    public void setSuspFlag(String suspFlag) {
	this.suspFlag = suspFlag;
    }

    /**
     * @return the suspUnit
     */
    public String getSuspUnit() {
	return suspUnit;
    }

    /**
     * @param suspUnit
     *            the suspUnit to set
     */
    public void setSuspUnit(String suspUnit) {
	this.suspUnit = suspUnit;
    }

    /**
     * @return the suspBackDate
     */
    public Date getSuspBackDate() {
	return suspBackDate;
    }

    /**
     * @param suspBackDate
     *            the suspBackDate to set
     */
    public void setSuspBackDate(Date suspBackDate) {
	this.suspBackDate = suspBackDate;
    }

    /**
     * @return the suspModifiedName
     */
    public String getSuspModifiedName() {
	return suspModifiedName;
    }

    /**
     * @param suspModifiedName
     *            the suspModifiedName to set
     */
    public void setSuspModifiedName(String suspModifiedName) {
	this.suspModifiedName = suspModifiedName;
    }

    /**
     * @return the suspPlateNo
     */
    public String getSuspPlateNo() {
	return suspPlateNo;
    }

    /**
     * @param suspPlateNo
     *            the suspPlateNo to set
     */
    public void setSuspPlateNo(String suspPlateNo) {
	this.suspPlateNo = suspPlateNo;
    }

    /**
     * @return the count
     */
    public int getCount() {
	return count;
    }

    /**
     * @param count
     *            the count to set
     */
    public void setCount(int count) {
	this.count = count;
    }

    /**
     * @return the markNo
     */
    public String getMarkNo() {
	return markNo;
    }

    /**
     * @param _markNo
     *            the markNo to set
     */
    public void setMarkNo(String _markNo) {
	this.markNo = _markNo;
    }

}
