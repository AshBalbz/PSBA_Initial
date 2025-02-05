package it2e.balbon.psba;

import java.util.Scanner;

public class IT2EBALBONPSBA {
    
    public void addClient(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("\nID: ");
        int id = sc.nextInt();
       
        System.out.print("Name: ");
        String name = sc.next();
        
        System.out.print("Email: ");
        String email = sc.next();
        
        System.out.print("Phone Number: ");
        String pnum = sc.next();
        
            
        String sql = "INSERT INTO tbl_client (c_id, c_name, c_email, c_pnum) VALUES (?, ?, ?, ?)";


        conf.addRecord(sql, id, name, email, pnum);


    }
    
    private void viewClient() {
        config conf = new config();

        String qry = "SELECT * FROM tbl_client";
        String[] header = {"ID", "Name", "Email", "Phone Number"};
        String[] column = {"c_id", "c_name", "c_email", "c_pnum"};

        conf.viewRecords(qry, header, column);
        
    }
    
    public void updateClient() {
       Scanner s = new Scanner(System.in);
       
        System.out.print("Enter ID to Update: ");
        int cid = s.nextInt();
        
        System.out.print("Name: ");
        String cname = s.next();
        
        System.out.print("Email: ");
        String cemail = s.next();
        
        System.out.print("Phone Number: ");
        String cpnum = s.next();
        
        String qry = "UPDATE tbl_client SET c_name = ?, c_email = ?, c_pnum = ? WHERE c_id = ?";
        
        config conf = new config();
        conf.updateRecord(qry, cname, cemail, cpnum, cid );
        
    }
       
    public void deleteClient(){
        Scanner s = new Scanner(System.in);
       
        System.out.print("Enter ID to Delete: ");
        int cid = s.nextInt();
        
        String qry = "DELETE FROM tbl_client WHERE c_id = ?";
        
        config conf = new config();
        conf.deleteRecord(qry, cid);
                
    }
  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;

        do{
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        
        
        System.out.print("\nEnter action: ");
        int action = sc.nextInt();
        sc.nextLine();
        
        IT2EBALBONPSBA client = new IT2EBALBONPSBA();

        
        switch(action){
            case 1:
                client.addClient();
                break;
                
            case 2:
                client.viewClient();
                break;
            
            case 3:
                client.viewClient();
                client.updateClient();
                break;
                
            case 4:
                client.viewClient();
                client.deleteClient();
                client.viewClient();
                
            case 5:
                System.out.println("Exiting....");
                break;
                
            default:
                System.out.println("Invalid Action!");
               
        }
        
            System.out.print("Want to add another transactions? (yes/no): ");
            response = sc.nextLine();

        }while (response.equalsIgnoreCase("yes"));
        
        sc.close();
    }
}
        
        
            
        
        
        
        
        
        

              
        


    
    

