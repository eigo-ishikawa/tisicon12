package com.tisicon12.domain;

/**
 * 職業種別。
 *
 * @author TISI Taro
 *
 * @param jobType 職業種別
 * @param jobName 職業名
 */
public record JobType(
		Integer jobType, // 職業種別
		String jobName // 職業名
) {

}
