public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Account> map = new HashMap<>();
        
        while(true){
            String line = sc.nextLine();
            
            if(line.equals("0")){
                break;
            }else{
                String[] arr = line.split(" ");
                String command = arr[0];
                
                if(command.equals("CREATE")){
                    String accountID = arr[1];
                    String accountname = arr[2];
                    Account ac = new Account(accountname,0);
                    map.put(accountID,ac);
                }
                
                else if(command.equals("DEPOSIT")){
                    String accountID = arr[1];
                    int amount = Integer.parseInt(arr[2]);
                    Account ac = map.get(accountID);
                    ac.balance += amount;
                }
                
                else if(command.equals("WITHDRAW")){
                    String accountID = arr[1];
                    int amount = Integer.parseInt(arr[2]);
                    Account ac = map.get(accountID);
                    ac.balance -= amount;
                }
                
                 else if(command.equals("BALANCE")){
                    String accountID = arr[1];
                    Account ac = map.get(accountID);
                    System.out.println(ac.name+ " " +ac.balance);
                }
            }
        }
    }
}
class Account{
    String name;
    int balance;
    
    Account(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
}
