package com.yyc.studydesignpattern.structural.adapter;

/**
 * @author Frankie
 * @since 2022-03-06 7:50 PM
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("================ Tanker ===================");
        EnemyTank tank = new EnemyTank();
        tank.assignDriver("Frankie");
        tank.driveForward();
        tank.fireWeapon();

        System.out.println("================ Adapter ===================");
        EnemyAttacker adapter = new EnemyRobotAdapter(new EnemyRobot());
        adapter.assignDriver("yyc");
        adapter.driveForward();
        adapter.fireWeapon();
    }
}
