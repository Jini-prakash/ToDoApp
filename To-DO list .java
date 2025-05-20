import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int choice;
        do{
            System.out.println("\n=====To-Do List Menu=====");
            System.out.println("1. Add Task.");
            System.out.println("2. View Tasks.");
            System.out.println("3. Delete Task.");
            System.out.println("Enter you choice to add a task.");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1: addTask();break;
                case 2: viewTask();break;
                case 3: deleteTask();break;
                case 4: System.out.println("Exit program.");break;
                default: System.out.println("Invalid number, Try Again!");
            }
        }while(choice!=4);
    }
            public static void addTask(){
                System.out.println("Enter your task");
                String task= scanner.nextLine();
                tasks.add(task);
                System.out.println("your task is added.");
            }
            public static void viewTask(){
                if(tasks.isEmpty()){
                    System.out.println("Your list is empty!");
                }else{
                    System.out.println("Your List");
                    for(int i=0;i<tasks.size();i++){
                        System.out.println((i+1)+"."+tasks.get(i));
                    }
                }
            }
            public static void deleteTask(){
                viewTask();
                if(!tasks.isEmpty()){
                    System.out.println("Enter your choice to delete task:");
                    int index=scanner.nextInt();
                    scanner.nextLine();
                    if(index>0 && index <= tasks.size()){
                        tasks.remove(index-1);
                        System.out.println("task deleted.");
                    }else{
                        System.out.println("Invalid task number.");
                    }
                    }
                }
    }    
