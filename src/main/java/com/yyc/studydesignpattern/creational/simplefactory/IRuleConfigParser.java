package com.yyc.studydesignpattern.creational.simplefactory;

/**
 * @author Frankie
 * @since 2022-04-08 8:57 AM
 */
public interface IRuleConfigParser {
    RuleConfig parse(String configText);
}
