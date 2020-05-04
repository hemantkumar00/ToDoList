package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static TodoFunctions myTodoList = new TodoFunctions();

    public static void main(String[] args) {

	    int command = 0;
	    boolean exit = false;

	    printCommand();
	    while(!exit){

            System.out.println("Press");
            command = in.nextInt();
            in.nextLine();

            switch(command){
                case 0:
                    printCommand();
                    break;
                case 1:
                    myTodoList.sizeOfArrayList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Please press the button from given only:");
            }
        }
    }

    static void printCommand() {
        System.out.println("I will print instructions in future");

    }
    static void addItem(){
        System.out.println("Enter item to be added in todo list");
        myTodoList.addItem(in.nextLine());
    }
    static void updateItem(){
        System.out.println("Enter the index on which you want to update the item");
        int i = in.nextInt();
        in.nextLine();
        myTodoList.updateData(i,in.nextLine());
    }
    static void removeItem(){
        System.out.println("Enter the index on which you want to remove the item.");
        myTodoList.removeItem(in.nextInt());
    }
    static void searchItem(){
        System.out.println("Enter the index");
        //in.nextLine();
        myTodoList.findItem(in.nextLine());
    }
}