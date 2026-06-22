package com.tisicon12.domain;

import java.math.BigDecimal;

/**
 * 年齢調整率。
 *
 * @author TISI Taro
 *
 * @param age            年齢
 * @param adjustmentRate 調整率
 */
public record AgeAdjustmentRate(
        Integer age, // 年齢
        BigDecimal adjustmentRate // 調整率
) {

}
