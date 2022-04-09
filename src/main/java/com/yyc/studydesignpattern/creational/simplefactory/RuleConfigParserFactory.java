package com.yyc.studydesignpattern.creational.simplefactory;

import com.yyc.studydesignpattern.creational.simplefactory.parser.JsonRuleConfigParser;
import com.yyc.studydesignpattern.creational.simplefactory.parser.XmlRuleConfigParser;
import com.yyc.studydesignpattern.creational.simplefactory.parser.YamlRuleConfigParser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.env.YamlPropertySourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Frankie
 * @since 2022-04-08 9:04 AM
 */
public class RuleConfigParserFactory {

    private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
    }

    /**
     * 注意点
     * 1. 公共静态方法
     * 2. 返回类型为接口
     */
    public static IRuleConfigParser createParser(String configFormat) {
        if (StringUtils.isEmpty(configFormat)) return null;
        return cachedParsers.get(configFormat.toLowerCase());
    }
}
