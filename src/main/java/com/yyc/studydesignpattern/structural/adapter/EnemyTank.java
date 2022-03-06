package com.yyc.studydesignpattern.structural.adapter;

import com.yyc.studydesignpattern.utils.MyRandom;

import java.util.Random;

/**
 * @author Frankie
 * @since 2022-03-06 7:41 PM
 */
public class EnemyTank implements EnemyAttacker {
    private final Random random = MyRandom.getInstance();

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank.");
    }

    @Override
    public void driveForward() {
        int movement = random.nextInt(5) + 1;
        System.out.println("Enemy tank moves " + movement + " spaces.");
    }

    @Override
    public void fireWeapon() {
        int attackDamage = random.nextInt(10) + 1;
        System.out.println("Enemy tank does " + attackDamage + " Damage.");
    }
}
