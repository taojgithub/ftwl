/**
 *  
 *  FormStatusEnum.java 2016-11-24
 * <p/>
 * Copyright 2000-2016 by ChinanetCenter Corporation.
 * <p/>
 * All rights reserved.
 * <p/>
 * This software is the confidential and proprietary information of
 * ChinanetCenter Corporation ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with ChinanetCenter.
 */

package com.ftwl.ltp.model.enums;

import com.ftwl.core.model.entity.enums.SerialNumberPrefixEnumInterface;

/**
 * 序列号前缀
 *
 * @author zhanghq
 * @since 2016/12/22
 */

public enum LtpSerialNumberPrefixEnum implements SerialNumberPrefixEnumInterface {

	DEMO("DEMO"), //测试的编号前缀
	ORDER("OD"); //测试的编号前缀

	LtpSerialNumberPrefixEnum(String prefix) {
		this.prefix = prefix;
	}

	private String prefix;

	public String getPrefix() {
		return prefix;
	}
}
