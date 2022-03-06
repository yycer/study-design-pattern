package com.yyc.studydesignpattern.structural.adapter;

/**
 * @author Frankie
 * @since 2022-03-06 7:40 PM
 */
public interface EnemyAttacker {
    void assignDriver(String driverName);
    void driveForward();
    void fireWeapon();
}
