package ngves.asiainfo.core.ware.bo;

import java.sql.Timestamp;

import ngves.asiainfo.core.ware.ivalues.IQBOPermissionInfoValue;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;

public class QBOPermissionInfoBean extends DataContainer implements DataContainerInterface, IQBOPermissionInfoValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static String m_boName = "ngves.asiainfo.core.ware.bo.QBOPermissionInfo";

	public final static String S_OrderNum = "ORDER_NUM";
	public final static String S_OrderStatus = "ORDER_STATUS";
	public final static String S_ProvinceView = "PROVINCE_VIEW";
	public final static String S_PermissionName = "PERMISSION_NAME";
	public final static String S_ProviceCode = "PROVICE_CODE";
	public final static String S_WareView = "WARE_VIEW";
	public final static String S_OptType = "OPT_TYPE";
	public final static String S_SupportType = "SUPPORT_TYPE";
	public final static String S_PartnerView = "PARTNER_VIEW";
	public final static String S_OrderEndTime = "ORDER_END_TIME";
	public final static String S_PartnerCode = "PARTNER_CODE";
	public final static String S_MobileBrandCode = "MOBILE_BRAND_CODE";
	public final static String S_ItemScope = "ITEM_SCOPE";
	public final static String S_CretaeTime = "CRETAE_TIME";
	public final static String S_PermissionId = "PERMISSION_ID";
	public final static String S_WareCode = "WARE_CODE";
	public final static String S_BakCol2 = "BAK_COL2";
	public final static String S_SubkindView = "SUBKIND_VIEW";
	public final static String S_BakCol1 = "BAK_COL1";
	public final static String S_WareGmeValue = "WARE_GME_VALUE";
	public final static String S_MaxItemNum = "MAX_ITEM_NUM";
	public final static String S_SubkindCode = "SUBKIND_CODE";
	public final static String S_ExchangeChannel = "EXCHANGE_CHANNEL";
	public final static String S_MaxTimes = "MAX_TIMES";
	public final static String S_OrderStartTime = "ORDER_START_TIME";
	public final static String S_OperField = "OPER_FIELD";
	
	//混合支付新增字段
	public final static String S_PayType = "PAY_TYPE";
	public final static String S_PayIntegral = "PAY_INTEGRAL";
	public final static String S_PayCash = "PAY_CASH";
	// 订单范围
	public final static String S_OrderScope = "ORDER_SCOPE";
	
	public void initOrderScope(String value) {
		this.initProperty(S_OrderScope, new String(value));
	}

	public void setOrderScope(String value) {
		this.set(S_OrderScope, new String(value));
	}

	public String getOrderScope() {
		return DataType.getAsString(this.get(S_OrderScope));
	}

	public void setOrderScopeNull() {
		this.set(S_OrderScope, null);
	}

	public String getOrderScopeInitialValue() {
		return DataType.getAsString(this.getOldObj(S_OrderScope));
	} 
	public void initPayCash(long value) {
		this.initProperty(S_PayCash, new Long(value));
	}

	public void setPayCash(long value) {
		this.set(S_PayCash, new Long(value));
	}

	public void setPayCashNull() {
		this.set(S_PayCash, null);
	}

	public long getPayCash() {
		return DataType.getAsLong(this.get(S_PayCash));

	}

	public long getPayCashInitialValue() {
		return DataType.getAsLong(this.getOldObj(S_PayIntegral));
	}
	
	
	public void initPayIntegral(long value) {
		this.initProperty(S_PayIntegral, new Long(value));
	}

	public void setPayIntegral(long value) {
		this.set(S_PayIntegral, new Long(value));
	}

	public void setPayIntegralNull() {
		this.set(S_PayIntegral, null);
	}

	public long getPayIntegral() {
		return DataType.getAsLong(this.get(S_PayIntegral));

	}

	public long getPayIntegralInitialValue() {
		return DataType.getAsLong(this.getOldObj(S_PayIntegral));
	}
	
	
	public void initPayType(String value) {
		this.initProperty(S_PayType, value);
	}

	public void setPayType(String value) {
		this.set(S_PayType, value);
	}

	public void setPayTypeNull() {
		this.set(S_PayType, null);
	}

	public String getPayType() {
		return DataType.getAsString(this.get(S_PayType));

	}

	public String getPayTypeInitialValue() {
		return DataType.getAsString(this.getOldObj(S_PayType));
	}
	
	

	public QBOPermissionInfoBean() throws AIException {
		super(ServiceManager.getObjectTypeFactory().getInstance(m_boName));
	}

	public static ObjectType getObjectTypeStatic() throws AIException {
		return ServiceManager.getObjectTypeFactory().getInstance(m_boName);
	}

	public void setObjectType(ObjectType value) throws AIException {
		throw new AIException("此种数据容器不能重置业务对象类型");
	}

	public void initOrderNum(long value) {
		this.initProperty(S_OrderNum, new Long(value));
	}

	public void setOrderNum(long value) {
		this.set(S_OrderNum, new Long(value));
	}

	public void setOrderNumNull() {
		this.set(S_OrderNum, null);
	}

	public long getOrderNum() {
		return DataType.getAsLong(this.get(S_OrderNum));

	}

	public long getOrderNumInitialValue() {
		return DataType.getAsLong(this.getOldObj(S_OrderNum));
	}

	public void initOrderStatus(String value) {
		this.initProperty(S_OrderStatus, value);
	}

	public void setOrderStatus(String value) {
		this.set(S_OrderStatus, value);
	}

	public void setOrderStatusNull() {
		this.set(S_OrderStatus, null);
	}

	public String getOrderStatus() {
		return DataType.getAsString(this.get(S_OrderStatus));

	}

	public String getOrderStatusInitialValue() {
		return DataType.getAsString(this.getOldObj(S_OrderStatus));
	}

	public void initProvinceView(String value) {
		this.initProperty(S_ProvinceView, value);
	}

	public void setProvinceView(String value) {
		this.set(S_ProvinceView, value);
	}

	public void setProvinceViewNull() {
		this.set(S_ProvinceView, null);
	}

	public String getProvinceView() {
		return DataType.getAsString(this.get(S_ProvinceView));

	}

	public String getProvinceViewInitialValue() {
		return DataType.getAsString(this.getOldObj(S_ProvinceView));
	}

	public void initPermissionName(String value) {
		this.initProperty(S_PermissionName, value);
	}

	public void setPermissionName(String value) {
		this.set(S_PermissionName, value);
	}

	public void setPermissionNameNull() {
		this.set(S_PermissionName, null);
	}

	public String getPermissionName() {
		return DataType.getAsString(this.get(S_PermissionName));

	}

	public String getPermissionNameInitialValue() {
		return DataType.getAsString(this.getOldObj(S_PermissionName));
	}

	public void initProviceCode(String value) {
		this.initProperty(S_ProviceCode, value);
	}

	public void setProviceCode(String value) {
		this.set(S_ProviceCode, value);
	}

	public void setProviceCodeNull() {
		this.set(S_ProviceCode, null);
	}

	public String getProviceCode() {
		return DataType.getAsString(this.get(S_ProviceCode));

	}

	public String getProviceCodeInitialValue() {
		return DataType.getAsString(this.getOldObj(S_ProviceCode));
	}

	public void initWareView(String value) {
		this.initProperty(S_WareView, value);
	}

	public void setWareView(String value) {
		this.set(S_WareView, value);
	}

	public void setWareViewNull() {
		this.set(S_WareView, null);
	}

	public String getWareView() {
		return DataType.getAsString(this.get(S_WareView));

	}

	public String getWareViewInitialValue() {
		return DataType.getAsString(this.getOldObj(S_WareView));
	}

	public void initOptType(String value) {
		this.initProperty(S_OptType, value);
	}

	public void setOptType(String value) {
		this.set(S_OptType, value);
	}

	public void setOptTypeNull() {
		this.set(S_OptType, null);
	}

	public String getOptType() {
		return DataType.getAsString(this.get(S_OptType));

	}

	public String getOptTypeInitialValue() {
		return DataType.getAsString(this.getOldObj(S_OptType));
	}

	public void initSupportType(String value) {
		this.initProperty(S_SupportType, value);
	}

	public void setSupportType(String value) {
		this.set(S_SupportType, value);
	}

	public void setSupportTypeNull() {
		this.set(S_SupportType, null);
	}

	public String getSupportType() {
		return DataType.getAsString(this.get(S_SupportType));

	}

	public String getSupportTypeInitialValue() {
		return DataType.getAsString(this.getOldObj(S_SupportType));
	}

	public void initPartnerView(String value) {
		this.initProperty(S_PartnerView, value);
	}

	public void setPartnerView(String value) {
		this.set(S_PartnerView, value);
	}

	public void setPartnerViewNull() {
		this.set(S_PartnerView, null);
	}

	public String getPartnerView() {
		return DataType.getAsString(this.get(S_PartnerView));

	}

	public String getPartnerViewInitialValue() {
		return DataType.getAsString(this.getOldObj(S_PartnerView));
	}

	public void initOrderEndTime(Timestamp value) {
		this.initProperty(S_OrderEndTime, value);
	}

	public void setOrderEndTime(Timestamp value) {
		this.set(S_OrderEndTime, value);
	}

	public void setOrderEndTimeNull() {
		this.set(S_OrderEndTime, null);
	}

	public Timestamp getOrderEndTime() {
		return DataType.getAsDateTime(this.get(S_OrderEndTime));

	}

	public Timestamp getOrderEndTimeInitialValue() {
		return DataType.getAsDateTime(this.getOldObj(S_OrderEndTime));
	}

	public void initPartnerCode(String value) {
		this.initProperty(S_PartnerCode, value);
	}

	public void setPartnerCode(String value) {
		this.set(S_PartnerCode, value);
	}

	public void setPartnerCodeNull() {
		this.set(S_PartnerCode, null);
	}

	public String getPartnerCode() {
		return DataType.getAsString(this.get(S_PartnerCode));

	}

	public String getPartnerCodeInitialValue() {
		return DataType.getAsString(this.getOldObj(S_PartnerCode));
	}

	public void initMobileBrandCode(String value) {
		this.initProperty(S_MobileBrandCode, value);
	}

	public void setMobileBrandCode(String value) {
		this.set(S_MobileBrandCode, value);
	}

	public void setMobileBrandCodeNull() {
		this.set(S_MobileBrandCode, null);
	}

	public String getMobileBrandCode() {
		return DataType.getAsString(this.get(S_MobileBrandCode));

	}

	public String getMobileBrandCodeInitialValue() {
		return DataType.getAsString(this.getOldObj(S_MobileBrandCode));
	}

	public void initItemScope(String value) {
		this.initProperty(S_ItemScope, value);
	}

	public void setItemScope(String value) {
		this.set(S_ItemScope, value);
	}

	public void setItemScopeNull() {
		this.set(S_ItemScope, null);
	}

	public String getItemScope() {
		return DataType.getAsString(this.get(S_ItemScope));

	}

	public String getItemScopeInitialValue() {
		return DataType.getAsString(this.getOldObj(S_ItemScope));
	}

	public void initCretaeTime(Timestamp value) {
		this.initProperty(S_CretaeTime, value);
	}

	public void setCretaeTime(Timestamp value) {
		this.set(S_CretaeTime, value);
	}

	public void setCretaeTimeNull() {
		this.set(S_CretaeTime, null);
	}

	public Timestamp getCretaeTime() {
		return DataType.getAsDateTime(this.get(S_CretaeTime));

	}

	public Timestamp getCretaeTimeInitialValue() {
		return DataType.getAsDateTime(this.getOldObj(S_CretaeTime));
	}

	public void initPermissionId(long value) {
		this.initProperty(S_PermissionId, new Long(value));
	}

	public void setPermissionId(long value) {
		this.set(S_PermissionId, new Long(value));
	}

	public void setPermissionIdNull() {
		this.set(S_PermissionId, null);
	}

	public long getPermissionId() {
		return DataType.getAsLong(this.get(S_PermissionId));

	}

	public long getPermissionIdInitialValue() {
		return DataType.getAsLong(this.getOldObj(S_PermissionId));
	}

	public void initWareCode(String value) {
		this.initProperty(S_WareCode, value);
	}

	public void setWareCode(String value) {
		this.set(S_WareCode, value);
	}

	public void setWareCodeNull() {
		this.set(S_WareCode, null);
	}

	public String getWareCode() {
		return DataType.getAsString(this.get(S_WareCode));

	}

	public String getWareCodeInitialValue() {
		return DataType.getAsString(this.getOldObj(S_WareCode));
	}

	public void initBakCol2(String value) {
		this.initProperty(S_BakCol2, value);
	}

	public void setBakCol2(String value) {
		this.set(S_BakCol2, value);
	}

	public void setBakCol2Null() {
		this.set(S_BakCol2, null);
	}

	public String getBakCol2() {
		return DataType.getAsString(this.get(S_BakCol2));

	}

	public String getBakCol2InitialValue() {
		return DataType.getAsString(this.getOldObj(S_BakCol2));
	}

	public void initSubkindView(String value) {
		this.initProperty(S_SubkindView, value);
	}

	public void setSubkindView(String value) {
		this.set(S_SubkindView, value);
	}

	public void setSubkindViewNull() {
		this.set(S_SubkindView, null);
	}

	public String getSubkindView() {
		return DataType.getAsString(this.get(S_SubkindView));

	}

	public String getSubkindViewInitialValue() {
		return DataType.getAsString(this.getOldObj(S_SubkindView));
	}

	public void initBakCol1(String value) {
		this.initProperty(S_BakCol1, value);
	}

	public void setBakCol1(String value) {
		this.set(S_BakCol1, value);
	}

	public void setBakCol1Null() {
		this.set(S_BakCol1, null);
	}

	public String getBakCol1() {
		return DataType.getAsString(this.get(S_BakCol1));

	}

	public String getBakCol1InitialValue() {
		return DataType.getAsString(this.getOldObj(S_BakCol1));
	}

	public void initWareGmeValue(long value) {
		this.initProperty(S_WareGmeValue, new Long(value));
	}

	public void setWareGmeValue(long value) {
		this.set(S_WareGmeValue, new Long(value));
	}

	public void setWareGmeValueNull() {
		this.set(S_WareGmeValue, null);
	}

	public long getWareGmeValue() {
		return DataType.getAsLong(this.get(S_WareGmeValue));

	}

	public long getWareGmeValueInitialValue() {
		return DataType.getAsLong(this.getOldObj(S_WareGmeValue));
	}

	public void initMaxItemNum(long value) {
		this.initProperty(S_MaxItemNum, new Long(value));
	}

	public void setMaxItemNum(long value) {
		this.set(S_MaxItemNum, new Long(value));
	}

	public void setMaxItemNumNull() {
		this.set(S_MaxItemNum, null);
	}

	public long getMaxItemNum() {
		return DataType.getAsLong(this.get(S_MaxItemNum));

	}

	public long getMaxItemNumInitialValue() {
		return DataType.getAsLong(this.getOldObj(S_MaxItemNum));
	}

	public void initSubkindCode(String value) {
		this.initProperty(S_SubkindCode, value);
	}

	public void setSubkindCode(String value) {
		this.set(S_SubkindCode, value);
	}

	public void setSubkindCodeNull() {
		this.set(S_SubkindCode, null);
	}

	public String getSubkindCode() {
		return DataType.getAsString(this.get(S_SubkindCode));

	}

	public String getSubkindCodeInitialValue() {
		return DataType.getAsString(this.getOldObj(S_SubkindCode));
	}

	public void initExchangeChannel(String value) {
		this.initProperty(S_ExchangeChannel, value);
	}

	public void setExchangeChannel(String value) {
		this.set(S_ExchangeChannel, value);
	}

	public void setExchangeChannelNull() {
		this.set(S_ExchangeChannel, null);
	}

	public String getExchangeChannel() {
		return DataType.getAsString(this.get(S_ExchangeChannel));

	}

	public String getExchangeChannelInitialValue() {
		return DataType.getAsString(this.getOldObj(S_ExchangeChannel));
	}

	public void initMaxTimes(long value) {
		this.initProperty(S_MaxTimes, new Long(value));
	}

	public void setMaxTimes(long value) {
		this.set(S_MaxTimes, new Long(value));
	}

	public void setMaxTimesNull() {
		this.set(S_MaxTimes, null);
	}

	public long getMaxTimes() {
		return DataType.getAsLong(this.get(S_MaxTimes));

	}

	public long getMaxTimesInitialValue() {
		return DataType.getAsLong(this.getOldObj(S_MaxTimes));
	}

	public void initOrderStartTime(Timestamp value) {
		this.initProperty(S_OrderStartTime, value);
	}

	public void setOrderStartTime(Timestamp value) {
		this.set(S_OrderStartTime, value);
	}

	public void setOrderStartTimeNull() {
		this.set(S_OrderStartTime, null);
	}

	public Timestamp getOrderStartTime() {
		return DataType.getAsDateTime(this.get(S_OrderStartTime));

	}

	public Timestamp getOrderStartTimeInitialValue() {
		return DataType.getAsDateTime(this.getOldObj(S_OrderStartTime));
	}

	public void initOperField(String value) {
		this.initProperty(S_OperField, value);
	}

	public void setOperField(String value) {
		this.set(S_OperField, value);
	}

	public void setOperFieldNull() {
		this.set(S_OperField, null);
	}

	public String getOperField() {
		return DataType.getAsString(this.get(S_OperField));

	}

	public String getOperFieldInitialValue() {
		return DataType.getAsString(this.getOldObj(S_OperField));
	}

}
