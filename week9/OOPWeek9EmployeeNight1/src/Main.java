public class Main {
    public static void main(String[] args) {

        Employee he = new HourlyEmployee("mike", "asdasd",121321, 10, 40);
        Employee se = new SalariedEmployee("soul", "goodman", 12124, 500);
        Employee ce = new CommisionEmployee("paul", "marker", 2131, 10000, 0.2f);
        Employee bpce = new BasePlusCommisionEmployee("jane", "crsis", 546454, 10000, 0.2f , 5000);

        Employee[] employees = {he, se,ce,bpce};

        for(Employee e : employees)
            System.out.println(e);

//        for(Employee e : employees)
//        {
//            //System.out.println(((CommisionEmployee)e).getExtra());
//            if (e instanceof  CommisionEmployee){
//                System.out.println(((CommisionEmployee)e).getExtra());
//                System.out.println(e.earning() +" -> "+ e.getClass().getName());
//            }
//        }


    }
}