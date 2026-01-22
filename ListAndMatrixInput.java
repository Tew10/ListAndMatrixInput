package Matriz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListAndMatrixInput {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner read = new Scanner(System.in);

        int numRows = 0;
        int numColumns = 0;
        int exit = 0;
        int listSize = 0;
        int choice = 0;

        while (exit != 9) {

            System.out.println("For table, press 1. For list, press 2");

            System.out.println("To exit, press 3");
            exit = read.nextInt();
            read.nextLine();

            ArrayList<Integer> numbers = new ArrayList<>();

            ArrayList<String> names = new ArrayList<>();

            ArrayList<Float> height = new ArrayList<>();

            if (exit == 2) {

                System.out.println("Enter the list size");
                listSize = read.nextInt();
                read.nextLine();

                System.out.println("Enter 1 to register names. Enter 2 to register numbers. Enter 3 to register heights");
                choice = read.nextInt();
                read.nextLine();

            }
            if (choice == 1) {

                for (int i = 0; i < listSize; i++) {

                    System.out.println("Enter the name you want to register");
                    names.add(read.nextLine());

                }
                System.out.println("The registered names are " + names);

            } else if (choice == 2) {

                for (int i = 0; i < listSize; i++) {

                    System.out.println("Enter the number you want to register");
                    numbers.add(read.nextInt());
                    read.nextLine();

                }

                System.out.println("The registered numbers are " + numbers);

            } else if (choice == 3) {

                for (int i = 0; i < listSize; i++) {

                    System.out.println("Enter the height you want to register");
                    height.add(read.nextFloat());
                    read.nextLine();

                }

                System.out.println("The registered heights are " + height);

            }
            if (exit == 1) {

                System.out.println("Enter the number of rows");
                numRows = read.nextInt();
                read.nextLine();

                System.out.println("Enter the number of columns");
                numColumns = read.nextInt();
                read.nextLine();

                String[][] name = new String[numRows][numColumns];

                int[][] number = new int[numRows][numColumns];

                float[][] heights = new float[numRows][numColumns];

                System.out.println("Enter 1 to register names. Enter 2 to register numbers. Enter 3 to register heights");
                choice = read.nextInt();
                read.nextLine();

                if (choice == 1) {

                    for (int i = 0; i < numRows; i++) {
                        for (int j = 0; j < numColumns; j++) {

                            System.out.println("Enter the names you want " + i + " - " + j);
                            name[i][j] = read.nextLine();
                        }
                    }

                    for (int i = 0; i < numRows; i++) {
                        for (int j = 0; j < numColumns; j++) {

                            System.out.println(name[i][j]);

                        }
                    }
                } else if (choice == 2) {

                    for (int i = 0; i < numRows; i++) {
                        for (int j = 0; j < numColumns; j++) {

                            System.out.println("Enter the numbers you want " + i + " - " + j);
                            number[i][j] = read.nextInt();
                            read.nextLine();

                        }
                    }
                    for (int i = 0; i < numRows; i++) {
                        for (int j = 0; j < numColumns; j++) {
                            System.out.println(number[i][j]);

                        }
                    }

                } else if (choice == 3) {

                    for (int i = 0; i < numRows; i++) {
                        for (int j = 0; j < numColumns; j++) {

                            System.out.println("Enter the height you want " + i + " - " + j);
                            heights[i][j] = read.nextFloat();
                            read.nextLine();

                        }
                    }

                    for (int i = 0; i < numRows; i++) {
                        for (int j = 0; j < numColumns; j++) {

                            System.out.println(heights[i][j]);

                        }
                    }
                }

            }
            if (exit == 3) {

                System.out.println("Exiting...");
                break;

            }

        }
    }
}