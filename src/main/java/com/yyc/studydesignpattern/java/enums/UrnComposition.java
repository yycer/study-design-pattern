package com.yyc.studydesignpattern.java.enums;

import java.util.Arrays;

/**
 * @author Frankie
 * @since 2022-04-13 8:50 PM
 */
public enum UrnComposition {

    RADD("DATASET", "RADD"),
    RISK_MODEL("MODEL", "RISK_MODEL");

    private final String type;
    private final String subType;

    public String getType() {
        return type;
    }

    public String getSubType() {
        return subType;
    }

    // 3. enum中构造函数的参数类型需要设置为final
    UrnComposition(final String type, final String subType) {
        this.type = type;
        this.subType = subType;
    }

    // 1. 对于当前enum使用的常用表达式，可以抽象成当前enum的公共方法
    public boolean isRadd() {
        return this.subType.equals("RADD");
    }

    // 2. 如何根据enum中的某个属性值获取对应enum值？
    public static UrnComposition of(String subType) {
        UrnComposition ans = Arrays.stream(UrnComposition.values())
                .filter(x -> x.getSubType().equalsIgnoreCase(subType))
                .findAny()
                .orElse(null);
        if (ans == null) {
            throw new RuntimeException("This subType is not supported!");
        }
        return ans;
    }

}
