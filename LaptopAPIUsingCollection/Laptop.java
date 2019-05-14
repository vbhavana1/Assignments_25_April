import java.util.ArrayList;
class Laptop{
    private Integer ramSize, hddSize;
    private String brand;
 
    Laptop(int ramSize, int hddSize, String brand ){
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.brand = brand;
    }
 
    //Creating the getters
    public Integer getRamSize(){
        return this.ramSize;
    }
 
    public Integer getHddSize(){
        return this.hddSize;
    }
 
    public String getBrand(){
        return this.brand;
    }
    public Integer setRamSize(){
        return this.ramSize;
    }
    public Integer setHddSize(){
        return this.hddSize;
    }
    public String setBrand(){
        return this.brand;
    }
}
class APICollectionDemo{
     static ArrayList list;
    public static void main(String[] args) {
    
        list = new ArrayList();
 
        Laptop l = new Laptop(8, 600, "Lenovo");
 
        //Store a Laptop object in the list
        list.add(new Laptop(4, 500, "IBM"));
        list.add(new Laptop(8, 800, "IBM"));
        list.add(new Laptop(6, 500, "Sony"));
 
        list.add(l);
    
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("choice the operation to perform");
        System.out.println("1: Enter to Add");
        System.out.println("2: option to delete");
        System.out.println("3: select option to view");
        System.out.println("4: option to search");
        System.out.println("5: option to get updated list");
        int userInput = sc.nextInt();
        switch(userInput){
            case 1: adddetails();
            break;
            case 2: delete();
            break;
            case 3: view();
            break;
            case 4: search();
            break;
            case 5: update();
            break;

        }


 
    }
     public  static void adddetails(){
        int ramSize,  hddSize; 
        String brand;
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Enter ramsize");
        ramSize = s.nextInt();
        s.nextLine();
        System.out.println("Enter hddsize");
        hddSize = s.nextInt();
        s.nextLine();
        System.out.println("Enter brand");
        brand = s.nextLine(); 
        update();   
 }
 public static void update(){
    // for (object ob : list) {
    //     System.out.println("Laptop details:");
    //             System.out.println("Ram is" +((Laptop)ob).getRamSize());
    //             System.out.println("Hardisk is " + ((Laptop)ob).getHddSize());
    //                             System.out.println("Brand is" +((Laptop)ob).getBrand());
    // }

 }
        public static void delete(){
            int ramSize;
        java.util.Scanner ss = new java.util.Scanner(System.in);
        System.out.println("Enter ramsize to delete brand");
        ramSize = ss.nextInt();
         for ( Object ob: list) {
             if(((Laptop)ob).getRamSize().equals(ramSize)){
                    list.remove(ob);
                   view();
                    break;
                    // System.out.println("Ram is" +((Laptop)ob).getRamSize());
             }
         }

        }

        public static void search(){
            int ramSize;

        java.util.Scanner ss = new java.util.Scanner(System.in);
        System.out.println("Enter ramsize to display brand");
        ramSize = ss.nextInt();
        for ( Object ob: list) {
             if(((Laptop)ob).getRamSize().equals(ramSize)){
             System.out.println("Hardisk is " + ((Laptop)ob).getHddSize());
                                System.out.println("Brand is" +((Laptop)ob).getBrand());

        }
            
        }
       



        }
        public static void view()
        {
            for(Object ob : list){
                System.out.println("Laptop details:");
                System.out.println("Ram is" +((Laptop)ob).getRamSize());
                System.out.println("Hardisk is " + ((Laptop)ob).getHddSize());
                                System.out.println("Brand is" +((Laptop)ob).getBrand());
            }
        }
 }
