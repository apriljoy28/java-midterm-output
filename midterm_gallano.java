package midterm_gallano;
import java.util.*;
public class Midterm {

    static ArrayList<String>Names=new ArrayList<>();
        static ArrayList<String>Ages=new ArrayList<>();
    public static void main(String[] args) {
        
        Scanner main = new Scanner(System.in);
        System.out.println(" =======Options========");
        System.out.println(" 1. Add entry\n" +
                           " 2. Delete entry\n" +
                           " 3. View all entries\n" +
                           " 4. Update an entry\n" +
                           " 0. Exit");
        System.out.print(" Select an Option: ");
            int choice=main.nextInt();
            if(choice==1)
            {
                c1(Names,Ages);
               
            }
            
            if(choice==2)
            {
                c2(Names,Ages);
               
            }
            if(choice==3)
            {
               
                 c3(Names,Ages);
            }
            if(choice==4)
            {
               
                c4(Names,Ages);
            }
           if(choice==0)
            {
              System.exit(1);
            }
           
        }
    static void c1(ArrayList<String>forNames,ArrayList<String>forAges)//add
    {
        System.out.print("\n");
        System.out.print("Enter name: ");
                Scanner sca1 = new Scanner(System.in);
                String name1 = sca1.nextLine();
                Names.add(name1);
                System.out.print("Enter age: ");
                String age= sca1.nextLine();
                Ages.add(age);
                System.out.print("\n");
                
                System.out.println(name1.toUpperCase()+" is added on the list!");
                System.out.print("\n");
                System.out.println(" =======Options========");
        System.out.println(" 1. Add entry\n" +
                           " 2. Delete entry\n" +
                           " 3. View all entries\n" +
                           " 4. Update an entry\n" +
                           " 0. Exit");
        System.out.print(" Select an Option: ");
                int choice=sca1.nextInt();
            if(choice==1)
            {
                c1(Names,Ages);
               
            }
            
            if(choice==2)
            {
                c2(Names,Ages);
               
            }
            if(choice==3)
            {
               
                 c3(Names,Ages);
            }
            if(choice==4)
            {
               
                c4(Names,Ages);
            }
           if(choice==5)
            {
              System.exit(1);
            }
    }
    static void c2(ArrayList<String>forNames,ArrayList<String>forAges)//delete
    {
        System.out.println("Enter name to delete: ");
                Scanner sca2= new Scanner (System.in);
                String name2 = sca2.nextLine();
                forAges.remove(forNames.indexOf(name2));
                forNames.remove(name2);
                System.out.println(name2.toUpperCase()+" is deleted from the list! What do want to do next?\n");
                System.out.println(" =======Options========");
        System.out.println(" 1. Add entry\n" +
                           " 2. Delete entry\n" +
                           " 3. View all entries\n" +
                           " 4. Update an entry\n" +
                           " 0. Exit");
        System.out.print(" Select an Option: ");
            int choice=sca2.nextInt();
            if(choice==1)
            {
                c1(Names,Ages);
               
            }
            
            if(choice==2)
            {
                c2(Names,Ages);
               
            }
            if(choice==3)
            {
               
                 c3(Names,Ages);
            }
            if(choice==4)
            {
               
                c4(Names,Ages);
            }
           if(choice==5)
            {
              System.exit(1);
            }
    }
    
    static void c3(ArrayList<String>forNames,ArrayList<String>forAges)//view
    {
     
     System.out.println("============LIST OF ENTRIES:==============");
     for(int i=0;i<=forNames.size()-1;i++)
     {
            System.out.print("\n");
            System.out.print("NAME: "+ forNames.get(i)+ "  AGE: "+ forAges.get(i));
            System.out.print("\n");
                    
     }
      Scanner main = new Scanner(System.in);
        System.out.println("\n =======Options========");
        System.out.println(" 1. Add entry\n" +
                           " 2. Delete entry\n" +
                           " 3. View all entries\n" +
                           " 4. Update an entry\n" +
                           " 0. Exit");
        System.out.print(" Select an Option: ");
            int choice=main.nextInt();
            if(choice==1)
            {
                c1(Names,Ages);
               
            }
            
            if(choice==2)
            {
                c2(Names,Ages);
               
            }
            if(choice==3)
            {
               
                 c3(Names,Ages);
            }
            if(choice==4)
            {
               
                c4(Names,Ages);
            }
           if(choice==5)
            {
              System.exit(1);
            }
           System.out.print("\n");
          
    }
    static void c4(ArrayList<String>forNames,ArrayList<String>forAges)//update
    {           
                     
        System.out.print("Who among the entries has a new age?\n name: ");
        Scanner sca4 = new Scanner (System.in);
        String NameGet= sca4.nextLine();
        System.out.println("Type "+NameGet+"'s"+" new age");
        System.out.print("AGE:");
        String AgeGet=sca4.nextLine();
        forAges.set(forNames.indexOf(NameGet), AgeGet);
        System.out.println(NameGet+"'s"+" age "+" is now "+AgeGet+"!");
            Scanner main = new Scanner(System.in);
        System.out.println(" =======Options========");
        System.out.println(" 1. Add entry\n" +
                           " 2. Delete entry\n" +
                           " 3. View all entries\n" +
                           " 4. Update an entry\n" +
                           " 0. Exit");
        System.out.print(" Select an Option: ");
            int choice=main.nextInt();
            if(choice==1)
            {
                c1(Names,Ages);
               
            }
            
            if(choice==2)
            {
                c2(Names,Ages);
               
            }
            if(choice==3)
            {
               
                 c3(Names,Ages);
            }
            if(choice==4)
            {
               
                c4(Names,Ages);
            }
           if(choice==5)
            {
              System.exit(1);
            }System.out.print("\n");
                               
                           }
    static void c0(ArrayList<String>forNames,ArrayList<String>forAges)//exit
    {
                    System.exit(1);
        
    }
}