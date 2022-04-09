package com.yyc.studydesignpattern.creational.simplefactory;

/**
 * @author Frankie
 * @since 2022-04-08 8:54 AM
 */
public class Client {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);

        String configText = "";
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        return "json";
    }
}
