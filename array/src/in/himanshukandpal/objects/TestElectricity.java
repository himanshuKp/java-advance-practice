package in.himanshukandpal.objects;

public class TestElectricity {
    public static void main(String[] args) {
        ElectricityBill electricityBill = new ElectricityBill(1,"himanshu","ghaziabad");
        ElectricityBill electricityBill1 = new ElectricityBill(1, "himanshu", "ghaziabad");

//        System.out.println(electricityBill);
//        System.out.println(electricityBill1);
//        System.out.println("First hashcode: "+electricityBill.hashCode());
//        System.out.println("Second case: "+electricityBill1.hashCode());
        if(electricityBill.equals(electricityBill1)){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are different");
        }
    }
}
