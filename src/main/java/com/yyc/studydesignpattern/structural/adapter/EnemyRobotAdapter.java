package com.yyc.studydesignpattern.structural.adapter;

/**
 * @author Frankie
 * @since 2022-03-06 7:48 PM
 */
public class EnemyRobotAdapter implements EnemyAttacker {
    private EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot newRobot) {
        this.robot = newRobot;
    }

    @Override
    public void assignDriver(String driverName) {
        robot.reactToHuman(driverName);
    }

    @Override
    public void driveForward() {
        robot.walkForward();
    }

    @Override
    public void fireWeapon() {
        robot.smashWithHand();
    }
}
