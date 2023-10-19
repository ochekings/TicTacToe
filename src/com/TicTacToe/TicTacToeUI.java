package com.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

    public class TicTacToeUI {

        ArrayList<Integer> playerOne = new ArrayList<Integer>();
        ArrayList<Integer> playerTwo = new ArrayList<Integer>();
        int count = 1;

        JFrame ticTacFrame;
        JButton btnOne;
        JButton btnTwo;
        JButton btnThree;
        JButton btnFour;
        JButton btnFive;
        JButton btnSix;
        JButton btnSeven;
        JButton btnEight;
        JButton btnNine;

        public void drawUI() {
            ticTacFrame = new JFrame("X and O");
            ticTacFrame.setSize(500, 500);
            ticTacFrame.setLayout(new GridLayout(3, 3));
            ticTacFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


            btnOne = new JButton();
            btnTwo = new JButton();
            btnThree = new JButton();
            btnFour = new JButton();
            btnFive = new JButton();
            btnSix = new JButton();
            btnSeven = new JButton();
            btnEight = new JButton();
            btnNine = new JButton();

            ticTacFrame.add(btnOne);
            ticTacFrame.add(btnTwo);
            ticTacFrame.add(btnThree);
            ticTacFrame.add(btnFour);
            ticTacFrame.add(btnFive);
            ticTacFrame.add(btnSix);
            ticTacFrame.add(btnSeven);
            ticTacFrame.add(btnEight);
            ticTacFrame.add(btnNine);

            ticTacFrame.setVisible(true);

            // Handling Button clicks

            btnOne.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count % 2 == 1) {
                        playerOne.add(1);
                        btnOne.setText("X");
                    } else {
                        playerTwo.add(1);
                        btnOne.setText("O");
                    }
                    count += 1;
                    System.out.println(count);
                    btnOne.setEnabled(false);
                }
            });

            btnTwo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count % 2 == 1) {
                        playerOne.add(1);
                        btnTwo.setText("X");
                    } else {
                        playerTwo.add(1);
                        btnTwo.setText("O");
                    }
                    count += 1;
                    System.out.println(count);
                    btnTwo.setEnabled(false);
                }
            });
            btnThree.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count % 2 == 1) {
                        playerOne.add(1);
                        btnThree.setText("X");
                    } else {
                        playerTwo.add(1);
                        btnThree.setText("O");
                    }
                    count += 1;
                    System.out.println(count);
                    btnThree.setEnabled(false);
                }
            });
            btnFour.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count % 2 == 1) {
                        playerOne.add(1);
                        btnFour.setText("X");
                    } else {
                        playerTwo.add(1);
                        btnFour.setText("O");
                    }
                    count += 1;
                    System.out.println(count);
                    btnFour.setEnabled(false);
                }
            });
            btnFive.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count % 2 == 1) {
                        playerOne.add(1);
                        btnFive.setText("X");
                    } else {
                        playerTwo.add(1);
                        btnFive.setText("O");
                    }
                    count += 1;
                    System.out.println(count);
                    btnFive.setEnabled(false);
                }
            });
            btnSix.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count % 2 == 1) {
                        playerOne.add(1);
                        btnSix.setText("X");
                    } else {
                        playerTwo.add(1);
                        btnSix.setText("O");
                    }
                    count += 1;
                    System.out.println(count);
                    btnSix.setEnabled(false);
                }
            });
            btnSeven.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count % 2 == 1) {
                        playerOne.add(1);
                        btnSeven.setText("X");
                    } else {
                        playerTwo.add(1);
                        btnSeven.setText("O");
                    }
                    count += 1;
                    System.out.println(count);
                    btnSeven.setEnabled(false);
                }
            });
            btnEight.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count % 2 == 1) {
                        playerOne.add(1);
                        btnEight.setText("X");
                    } else {
                        playerTwo.add(1);
                        btnEight.setText("O");
                    }
                    count += 1;
                    System.out.println(count);
                    btnEight.setEnabled(false);
                }
            });
            btnNine.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count % 2 == 1) {
                        playerOne.add(1);
                        btnNine.setText("X");
                    } else {
                        playerTwo.add(1);
                        btnNine.setText("O");
                    }
                    count += 1;
                    System.out.println(count);
                    btnNine.setEnabled(false);
                }
            });

        }

        public static void main(String[] args) {
            TicTacToeUI ui = new TicTacToeUI();
            ui.drawUI();
        }

        public void checkWin() {
            if (playerOne.contains(1) && playerOne.contains(2) && playerOne.contains(3)) {
                // TODO display player one wins and reset game
            } else if (playerOne.contains(4) && playerOne.contains(5) && playerOne.contains(6)) {

            } else if (playerOne.contains(7) && playerOne.contains(8) && playerOne.contains(9)) {

            } else if (playerOne.contains(1) && playerOne.contains(4) && playerOne.contains(7)) {

            } else if (playerOne.contains(2) && playerOne.contains(5) && playerOne.contains(8)) {

            } else if (playerOne.contains(3) && playerOne.contains(6) && playerOne.contains(9)) {

            } else if (playerOne.contains(1) && playerOne.contains(5) && playerOne.contains(9)) {

            } else if (playerOne.contains(3) && playerOne.contains(5) && playerOne.contains(7)) {

            }
            // TODO Player Two winning Settings
            //public void checkWin() {
            if (playerTwo.contains(1) && playerTwo.contains(2) && playerTwo.contains(3)) {

            } else if (playerTwo.contains(4) && playerTwo.contains(5) && playerTwo.contains(6)) {

            } else if (playerTwo.contains(7) && playerTwo.contains(8) && playerTwo.contains(9)) {

            } else if (playerTwo.contains(1) && playerTwo.contains(4) && playerTwo.contains(7)) {

            } else if (playerTwo.contains(2) && playerTwo.contains(5) && playerTwo.contains(8)) {

            } else if (playerTwo.contains(3) && playerTwo.contains(6) && playerTwo.contains(9)) {

            } else if (playerTwo.contains(1) && playerTwo.contains(5) && playerTwo.contains(9)) {

            } else if (playerTwo.contains(3) && playerTwo.contains(5) && playerTwo.contains(7)) {

            }

        }

        void reset () {
            count = 1;
            playerOne.clear();
            playerTwo.clear();

            btnOne.setEnabled(true);
            btnTwo.setEnabled(true);
            btnThree.setEnabled(true);
            btnFour.setEnabled(true);
            btnFive.setEnabled(true);
            btnSix.setEnabled(true);
            btnSeven.setEnabled(true);
            btnEight.setEnabled(true);
            btnNine.setEnabled(true);
        }
    }
