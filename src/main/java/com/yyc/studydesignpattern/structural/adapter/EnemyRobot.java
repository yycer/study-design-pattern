package com.yyc.studydesignpattern.structural.adapter;

import com.yyc.studydesignpattern.utils.MyRandom;

import java.util.Random;

/**
 * @author Frankie
 * @since 2022-03-06 7:46 PM
 */
public class EnemyRobot {
    private final Random random = MyRandom.getInstance();

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }

    public void walkForward() {
        int movement = random.nextInt(5) + 1;
        System.out.println("Enemy Robot Walks Forward " + movement + " spaces");
    }

    public void smashWithHand() {
        int attackDamage = random.nextInt(10) + 1;
        System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");
    }
}