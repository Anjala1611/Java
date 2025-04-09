class CPU{
    int price;
    public CPU(int price){
        this.price=price;
    }
    public void display1(){
        System.out.println("price:"+price);
    }
    class processor{
        int cores;
        String manufacturer;
        public processor(int cores,String manufacturer){
            this.cores=cores;
            this.manufacturer=manufacturer;
        }
        public void display2(){
            System.out.println("cores:"+cores+"\nmanufacturer:"+manufacturer);
        }
    }
    static class RAM{
        String memory;
        String manufacturer;
        public RAM(String memory,String manufacturer){
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
        public void display3(){
            System.out.println("memroy size:"+memory+"\nmanufacturer:"+manufacturer);
        }

    }
}
public class CPUDemo{
    public static void main(String[]arg){
        CPU c=new CPU(5000);
        c.display1();
        CPU.processor p=c.new processor(4,"intel");
        p.display2();
        CPU.RAM r=new CPU.RAM("6GB","samsung");
        r.display3();
    }
}
