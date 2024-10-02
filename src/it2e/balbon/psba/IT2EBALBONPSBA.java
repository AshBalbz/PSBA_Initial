package it2e.balbon.psba;

import java.util.Scanner;

public class IT2EBALBONPSBA {
    
    public void addClient(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("ID: ");
        String id = sc.next();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Phone Number: ");
        String pnum = sc.next();

        String sql = "INSERT INTO tbl_client (c_id, c_name, c_email, c_pnum) VALUES (?, ?, ?, ?)";


        conf.addRecord(sql, id, name, email, pnum);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        
        
        System.out.print("Enter action: ");
        int action = sc.nextInt();
        
        switch(action){
            case 1:
                IT2EBALBONPSBA test = new IT2EBALBONPSBA();
                test.addClient();

                
            break;
                    
            
        }
        
        
        
        
        

              
        


    }
    
}
