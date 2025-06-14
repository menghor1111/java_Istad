package nestedClass;

public class Logistics {

    void showTransactionStatus(String Status){
        class Success {
            void display(){
                System.out.println("Goods are shipped");
            }
        }
        class Fail {
            void display(){
                System.out.println("Goods are unshipped");
            }
        }
        class Pending {
            void display(){
                System.out.println("Goods are on the way");
            }
        }
        switch (Status){
            case "success":{
                Success s = new Success();
                s.display();
                break;
            }
            case "Fail": {
                Fail f = new Fail();
                f.display();
                break;
            }
            case "pending": {
                Pending p = new Pending();
                p.display();
            }
        }
    }
}
