package Assignment_Management_Program;
import java.io.*;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
public class MainApp {
    public static void main(String[] args) throws IOException{

        File filename1 = new File("database.txt");
        ArrayList<Assignment> arr = new ArrayList();
        try {
            FileInputStream fi = new FileInputStream(filename1);
            ObjectInputStream input = new ObjectInputStream(fi);
            while (true) {
                Assignment s = (Assignment) input.readObject();
                arr.add(s);
            }
        }catch(ClassNotFoundException e){
            out.println("Error: "+e);
        }catch(EOFException e){
            out.println();
        }
        again:
        while(true)
        {
            Assignment assignment = new Assignment();
            Scanner input = new Scanner(System.in);
            out.println("------------------------------------------");
            out.println("|      Assignment Managment Program      |");
            out.println("|    Menu :                              |");
            out.println("|1.Create an Assignment.                 |");
            out.println("|2.List Assignment.                      |");
            out.println("|3.Delete an Assignment.                 |");
            out.println("|4.Update an Assignment.                 |");
            out.println("|5.Search Assignment.                    |");
            out.println("|6.Exit(Save).                           |");
            out.println("------------------------------------------");
            out.print("Choose your Option : ");
            String opt = input.next();

            if (opt.equals("1"))
            {

                out.print("Enter ID : ");
                long id = input.nextLong();
                input.nextLine(); //fake input
                out.print("Type : ");
                String type = input.nextLine();
                out.print("title : ");
                String tittle = input.nextLine();
                out.print("Instruction : ");
                String instruction = input.nextLine();
                out.print("coursename : ");
                String coursename = input.nextLine();
                out.print("dueDate : ");
                String dueDate = input.nextLine();
                out.print("Point: ");
                float point = input.nextFloat();
                input.nextLine(); //fake input
                out.print("topic : ");
                String topic = input.nextLine();
                for(Assignment j : arr) {
                    if (j.getId() == id) {
                        out.println("The ID can not be the same!");
                        continue again;
                    }
                }
                assignment.setId(id);
                assignment.setType(type);
                assignment.setTittle(tittle);
                assignment.setInstruction(instruction);
                assignment.setCoursename(coursename);
                assignment.setDueDate(dueDate);
                assignment.setPoint(point);
                assignment.setTopic(topic);
                arr.add(assignment);
                out.println("Create Successful");

            }else if(opt.equals("2"))
            {
                boolean ans = arr.isEmpty();
                if (ans == true){
                    System.out.println("The List is empty");}
                else
                {  for (Assignment i :arr)
                    {
                        i.display();
                        out.println("------------------------------------------");
                    }
                }

            }else if(opt.equals("3"))
            {
                out.print("Enter ID you want to delete : ");
                long num1=input.nextLong();
                int n1 = 0;
                int index=0;
                for(Assignment k : arr)
                {
                    if(k.getId() == num1)
                    {
                        k.display();
                        n1++;
                        break;
                    }else
                    {
                        index++;
                    }
                }if(n1==0)
                {
                    out.println("The ID is not exist!");
                }else{
                    out.print("Are you sure you want to delete this assignment? : ");
                    String check = input.next();
                    if(check.equals("yes"))
                    {
                        arr.remove(index);
                        out.println("Delete Successful");
                    }else if(check.equals("no"))
                    {

                    }else{
                        out.println("Please choose yes or no only!");
                    }
                }
            }else if(opt.equals("4"))
            {
                out.print("Enter ID you want to update : ");
                long num2=input.nextLong();
                for(Assignment v : arr)
                {
                    if(v.getId() == num2)
                    {
                        v.display();
                        out.println("------------------------------------------");
                        while (true)
                        {
                            out.println("1.Update Type.");
                            out.println("2.Update Tittle.");
                            out.println("3.Update Instruction.");
                            out.println("4.Update Coursename.");
                            out.println("5.Update dueDate.");
                            out.println("6.Update point.");
                            out.println("7.Update Topic.");
                            out.println("8.Exit.");
                            out.print("Please choose your option : ");
                            String check1 = input.next();
                            if (check1.equals("1"))
                            {
                                out.print("Enter Type you want to update : ");
                                input.nextLine(); //fake input
                                String ty = input.nextLine();
                                out.print("Are you sure you want to update this? : ");
                                String check2 = input.next();
                                if(check2.equals("yes"))
                                {
                                    v.setType(ty);
                                    out.println("Update Successful!");
                                }else if(check2.equals("no"))
                                {

                                }else
                                {
                                    out.println("Please choose yes or no only!");
                                }
                            }else if (check1.equals("2"))
                            {
                                out.print("Enter Tittle you want to update : ");
                                input.nextLine(); //fake input
                                String ti = input.nextLine();
                                out.print("Are you sure you want to update this? : ");
                                String check2 = input.next();
                                if(check2.equals("yes"))
                                {
                                    v.setTittle(ti);
                                    out.println("Update Successful!");
                                }else if(check2.equals("no"))
                                {

                                }else
                                {
                                    out.println("Please choose yes or no only!");
                                }
                            }else if (check1.equals("3"))
                            {
                                out.print("Enter Instruction you want to update : ");
                                input.nextLine(); //fake input
                                String in = input.nextLine();
                                out.print("Are you sure you want to update this? : ");
                                String check2 = input.next();
                                if(check2.equals("yes"))
                                {
                                    v.setInstruction(in);
                                    out.println("Update Successful!");
                                }else if(check2.equals("no"))
                                {

                                }else
                                {
                                    out.println("Please choose yes or no only!");
                                }
                            }else if (check1.equals("4"))
                            {
                                out.print("Enter CourseName you want to update : ");
                                input.nextLine(); //fake input
                                String cn = input.nextLine();
                                out.print("Are you sure you want to update this? : ");
                                String check2 = input.next();
                                if(check2.equals("yes"))
                                {
                                    v.setCoursename(cn);
                                    out.println("Update Successful!");
                                }else if(check2.equals("no"))
                                {

                                }else
                                {
                                    out.println("Please choose yes or no only!");
                                }
                            }else if (check1.equals("5"))
                            {
                                out.print("Enter DueDate you want to update : ");
                                input.nextLine(); //fake input
                                String dd = input.nextLine();
                                out.print("Are you sure you want to update this? : ");
                                String check2 = input.next();
                                if(check2.equals("yes"))
                                {
                                    v.setDueDate(dd);
                                    out.println("Update Successful!");
                                }else if(check2.equals("no"))
                                {

                                }else
                                {
                                    out.println("Please choose yes or no only!");
                                }
                            }else if (check1.equals("6"))
                            {
                                out.print("Enter Point you want to update : ");
                                float po = input.nextFloat();
                                out.print("Are you sure you want to update this? : ");
                                String check2 = input.next();
                                if(check2.equals("yes"))
                                {
                                    v.setPoint(po);
                                    out.println("Update Successful!");
                                }else if(check2.equals("no"))
                                {

                                }else
                                {
                                    out.println("Please choose yes or no only!");
                                }
                            }else if (check1.equals("7"))
                            {
                                out.print("Enter Topic you want to update : ");
                                input.nextLine(); //fake input
                                String to = input.nextLine();
                                out.print("Are you sure you want to update this? : ");
                                String check2 = input.next();
                                if(check2.equals("yes"))
                                {
                                    v.setTopic(to);
                                    out.println("Update Successful!");
                                }else if(check2.equals("no"))
                                {

                                }else
                                {
                                    out.println("Please choose yes or no only!");
                                }
                            }else if(check1.equals("8"))
                            {
                                break;
                            }else
                            {
                                out.println("Invalid number!");
                            }
                        }
                    }
                }
            }else if(opt.equals("5"))
            {
                out.print("Enter ID you want to search : ");
                long num=input.nextLong();
                int n=0;
                for(Assignment j : arr)
                {
                   if(j.getId() == num)
                   {
                       j.display();
                       n++;
                   }
                }if(n==0)
                {
                    out.println("The ID is not exist!");
                }
            }else if(opt.equals("6"))
            {
                File filename = new File("database.txt");
                FileOutputStream fo = new FileOutputStream(filename);
                ObjectOutputStream output = new ObjectOutputStream(fo);

                for(Assignment b : arr)
                {
                    output.writeObject(b);
                }
                fo.close();
                output.close();
                out.println("Thank for using out System!");
                break;
            }else{
                out.println("Invalid! Please choose again!");
            }
        }
    }

}
