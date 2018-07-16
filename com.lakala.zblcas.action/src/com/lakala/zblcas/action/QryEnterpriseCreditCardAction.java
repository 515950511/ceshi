/**  
* 文件名：QryEnterpriseCreditCardAction.java <br>
* 包名：com.lakala.zblcas.action <br>
* 版本信息：V1.0  <br>
* 日期：2016年10月17日  <br>
* Copyright 中北联合信用评估 Corporation 2016<br>
* 版权所有 北京中北联合信用评估有限公司
*  
*/
package com.lakala.zblcas.action;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lakala.amber.core.Context;
import com.lakala.amber.core.CoreException;
import com.lakala.amber.core.CoreRuntimeException;
import com.lakala.amber.zblcas.common.action.ExecutableAction;
import com.lakala.amber.zblcas.common.model.DICT;

/**  
 * 项目名称：com.lakala.zblcas.action<br>
 * 包名：com.lakala.zblcas.action <br>
 * 类名称：QryEnterpriseCreditCardAction  <br>
 * 类描述：简单描述该类的主要功能<br>
 ******************************************************<br>
 * 主要方法：<br>
 *   描述各个方法用途  <br>
 *   描述各个方法用途  <br>
 ******************************************************<br>
 * 作者：chengxuehong  <br>
 * 创建日期：2016年10月17日 <br>
 * 公司：北京中北联合信用评估有限公司<br>
 * 版本：V1.0<br>
 *******************************************************<br>
 * 修改人：chengxuehong  <br>
 * 修改时间：2016年10月17日 下午5:06:44  <br>
 * 修改原因：  描述修改原因和用途<br>
 *   
 */
public class QryEnterpriseCreditCardAction extends ExecutableAction{
	
	private static Logger logger = LoggerFactory.getLogger(QryEnterpriseCreditCardAction.class);
	
	private String customerid;
	

	public String getCustomerid() {
		return customerid;
	}


	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}


	@SuppressWarnings("unchecked")
	@Override
	public void execute(Context context) throws CoreException,CoreRuntimeException {
		Map<String, Object>  map = context.getModels();
        map.put(DICT._PROCESSID, "enterpriseCreditCard");
        map.put("_customerId", customerid);
        map.put("companyName", map.get("entName").toString().trim());
        context.setModel("_prdGrpId","enterprise");
        super.submit(map, context);
	}
}