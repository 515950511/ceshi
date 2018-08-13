//测试一下
//测试两下
/**  
* 鏂囦欢鍚嶏細QryEnterpriseCreditCardAction.java <br>
* 鍖呭悕锛歝om.lakala.zblcas.action <br>
* 鐗堟湰淇℃伅锛歏1.0  <br>
* 鏃ユ湡锛�2016骞�10鏈�17鏃�  <br>
* Copyright 涓寳鑱斿悎淇＄敤璇勪及 Corporation 2016<br>
* 鐗堟潈鎵�鏈� 鍖椾含涓寳鑱斿悎淇＄敤璇勪及鏈夐檺鍏徃
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
 * 椤圭洰鍚嶇О锛歝om.lakala.zblcas.action<br>
 * 鍖呭悕锛歝om.lakala.zblcas.action <br>
 * 绫诲悕绉帮細QryEnterpriseCreditCardAction  <br>
 * 绫绘弿杩帮細绠�鍗曟弿杩拌绫荤殑涓昏鍔熻兘<br>
 ******************************************************<br>
 * 涓昏鏂规硶锛�<br>
 *   鎻忚堪鍚勪釜鏂规硶鐢ㄩ��  <br>
 *   鎻忚堪鍚勪釜鏂规硶鐢ㄩ��  <br>
 ******************************************************<br>
 * 浣滆�咃細chengxuehong  <br>
 * 鍒涘缓鏃ユ湡锛�2016骞�10鏈�17鏃� <br>
 * 鍏徃锛氬寳浜腑鍖楄仈鍚堜俊鐢ㄨ瘎浼版湁闄愬叕鍙�<br>
 * 鐗堟湰锛歏1.0<br>
 *******************************************************<br>
 * 淇敼浜猴細chengxuehong  <br>
 * 淇敼鏃堕棿锛�2016骞�10鏈�17鏃� 涓嬪崍5:06:44  <br>
 * 淇敼鍘熷洜锛�  鎻忚堪淇敼鍘熷洜鍜岀敤閫�<br>
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